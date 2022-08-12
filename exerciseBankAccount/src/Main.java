public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(
                100,
                500.0,
                "Mamão",
                "mamao@gmail",
                "81-89887671");
        System.out.println("Account number = " + account.getAccountNumber());
        System.out.println("Balance = " + account.getBalance());
        System.out.println("Name = " + account.getCustomerName());
        System.out.println("email =  " + account.getEmail());
        System.out.println("Phone = " + account.getPhone());
//        account.deposit(100.0);
//        System.out.println("Balance + deposit = " + account.getBalance());
        account.withdraw(400.0);

//        account.setAccountNumber(100);
//        account.setBalance(500.0);
//        account.setCustomerName("Mamão");
//        account.setEmail("mamao@gmail");
//        account.setPhone("81-89887671");
//        account.withdraw(700.0);
//        System.out.println("Balance - withdraw = " + account.getBalance());
    }
}