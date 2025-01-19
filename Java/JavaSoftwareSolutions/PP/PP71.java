public class PP71 {
    
    public static void main(String[] args) {
        Account account1 = new Account("Diogo", 4739472);
        account1.deposit(200);
        account1.withdraw(10, 5);
        System.out.println(account1.toString());
    }
}