public class MainProgram {
    public static void main(String[] args) {
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("---" + annesCard.balance());
        annesCard.addMoney(-10);
        System.out.println("");

        unicafeExactum.addMoneyToCard(annesCard, -10);
        System.out
                .println("card balance is " + annesCard.balance() + "terminal balance is" + unicafeExactum.getMoney());
    }
}