
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account mattsAccount = new Account ("Matthews account", 1000);
        Account myAccount = new Account ("My account", 0);
        mattsAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(myAccount);
        System.out.println(mattsAccount);
}
}
