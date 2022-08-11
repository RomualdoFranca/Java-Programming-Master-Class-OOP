public class BankAccount {

/*  Create a new class for a bank account
*   Create fields for the acconut number, balance, customer name, email and phone number
*
*   Create getters and setters for each field
*   Create two additional methods
*   1. To allow (permitir) the costumer to deposit funds (this should increment the balance field)
*   2. To allow the costumer to withdraw (retirar) funds. This should deduct from the balance field,
*   but not allow the withdrawal (cancelamento) to complete if their are insufficient funds
*   You will want to create various code in the Main class to confirm your code working   */

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void deposit(double deposit) {
        balance += deposit;
    }
}
