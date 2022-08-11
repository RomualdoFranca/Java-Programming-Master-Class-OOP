public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(100);
        System.out.println("Account number = " + account.getAccountNumber());
        account.setBalance(500.0);
        System.out.println("Balance = " + account.getBalance());
        account.setCustomerName("Mamão");
        System.out.println("Name = " + account.getBalance());
        account.setEmail("mamao@gmail");
        System.out.println("email =  " + account.getEmail());
        account.setPhone("81-89887671");
        System.out.println("Phone = " + account.getPhone());
    }
}