
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {

        this.money = 1000;
    }

    public double getMoney() {
        return money;
    }

    public double eatAffordably(double payment) {
        if (payment < 2.50) {
            return payment;
        } else {
            money = money + 2.50;
            affordableMeals++;
            return payment - 2.50;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.50) {
            card.takeMoney(2.50);
            affordableMeals++;
            return true;
        } else
            return false;
    }

    public double eatHeartily(double payment) {
        if (payment < 4.30) {
            return payment;
        } else {
            money = money + 4.30;
            heartyMeals++;
            return payment - 4.30;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.30) {
            card.takeMoney(4.30);
            heartyMeals++;
            return true;
        } else
            return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            money = money + sum;
        }

    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
