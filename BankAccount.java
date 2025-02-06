
/**
 * This class manages a bank account. Logic of the Bank application app.
 *
 * @author Dave Slemon, Abdul Muqeet Ahmed
 * @version v1.2
 */
public class BankAccount
{
    private double balance;
    private String customerName;

    /**
     *
     * The default constructor.
     *
     */
    public BankAccount () {

        this ("Unknown");
    }

    /**
     *
     * The constructor for creating an account belonging to
     * a specific person.
     *
     * @param name  the name of the owner of the account
     */
    public BankAccount (String name) {

        this.balance = 0.0;
        this.customerName = name;
    }

    /**
     *
     * Gets the balance of the account
     *
     * @return the balance of the account
     */
    public double getBalance() {

        return balance;
    }

    /**
     *
     * Gets the customer name who owns this account
     *
     * @return the customer name
     */
    public String getCustomerName() {

        return customerName;
    }

    /**
     *
     * Deposit money into the account
     *
     * @param amt  the deposit amount
     */
    public void deposit(double amt) {

        if (amt > 0.0) balance += amt;
    }

    /**
     *
     * Withdraw some money from the account
     *
     * @param amt  the amt to withdraw
     */
    public void withdraw(double amt) {

        if (balance >= amt) {
            balance -= amt;
        }else {
            System.out.println("Insufficient funds! cannot withdraw $" + amt);
        }
    }

    /**
     *
     * To display the balance of the account
     *
     * @return String the name and balance of the account.
     */
    public String toString() {

        return customerName + "\t" + String.format("$%.2f",balance);
    }
}
