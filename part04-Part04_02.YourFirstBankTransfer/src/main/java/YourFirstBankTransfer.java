
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthewsaccount = new Account("matthew", 1000);
        Account myAccount = new Account("adam", 0);

        matthewsaccount.withdrawal(100.0);
        myAccount.deposit(100.0);

        System.out.println(matthewsaccount);
        System.out.println(myAccount);

    }
}
