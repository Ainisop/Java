
public class YourFirstAccount {

    public static void main(String[] args) {
        Account ainisAccount = new Account("Ainis Account", 100.00);
        ainisAccount.deposit(20.00);
        System.out.println(ainisAccount);
    }
}
