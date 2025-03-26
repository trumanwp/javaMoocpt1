
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthewsAccount = new Account("Matthew", 1000);
        Account myAccount = new Account("adam", 0);

        matthewsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);

        System.out.println(matthewsAccount.toString());
        System.out.println(myAccount.toString());
    }
}
