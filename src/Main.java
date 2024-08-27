/*
* Kutenda Believe Samakande
* H230617G
* Assignment-1ISS1201-Secure-Coding
* */





// Main method
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Bank class
        Bank bank = new Bank("MA", 20240001);

        // Invoke display method
        bank.display();
    }
}



// Class Bank
 class Bank {
    String accountType;
    double accountBalance;

    // Parameterized constructor
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Method to deposit money
    public double deposit(double amount) {
        accountBalance += amount;
        return accountBalance;
    }

    // Method to withdraw money
    public double withdrawal(double amount) {
        accountBalance -= amount;
        return accountBalance;
    }

    // Method to display account information
    public void display() {
        System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
    }
}

// Class Insurance that inherits from Bank
class Insurance extends Bank {
    public Insurance(String accountType, double accountBalance) {
        super(accountType, accountBalance);
    }

    // Method to print insurance coverage
    public void cover() {
        System.out.println("You are covered");
    }
}

