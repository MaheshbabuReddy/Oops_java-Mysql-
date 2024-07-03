import java.util.*;

class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
}

class BankAccount {
    private double balance;
    private List<String> transactions;
    private String otp;

    public BankAccount() {
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            this.transactions.add("Deposit: " + amount);
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            this.transactions.add("Withdrawal: " + amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void generateOTP() {
        this.otp = String.valueOf((int) (Math.random() * 10000));
        System.out.println("OTP generated: " + otp);
    }
    public boolean verifyOTP(String inputOtp) {
        return this.otp.equals(inputOtp);
    }

    public void displayTransactions() {
        System.out.println("Transaction History:");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public void displayBalance(String inputOtp) {
        if (verifyOTP(inputOtp)) {
            System.out.println("Your balance is: " + balance);
        } else {
            System.out.println("Invalid OTP");
        }
    }


public class BankApplication {
    private static User user;

    public static boolean login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        if (user.getName().equals(username) && user.authenticate(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password");
            return false;
        }
    }

    public static void main(String[] args) {
        user = new User("Mahesh", "123Mahesh"); // Example user credentials
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Application");

        while (true) {
            if (login(scanner)) {
                break;
            }
        }

        BankAccount account = new BankAccount();

        while (true) {
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. View Balance");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.generateOTP();
                    System.out.print("Enter OTP: ");
                    String otp = scanner.next();
                    account.displayBalance(otp);
                    break;
                case 4:
                    account.displayTransactions();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
}
