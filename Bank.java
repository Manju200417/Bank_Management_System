import java.util.Scanner;

public class Bank {
    private float balance;
    private Scanner sc;

    public Bank() {
        this.balance = 0;
        this.sc = new Scanner(System.in);
    }

    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " Rs deposited.");
        } else {
            System.out.println("Please provide a valid amount to deposit.");
        }
    }

    public void withdraw() {
        if (balance <= 0) {
            System.out.println("No balance in your account. Please deposit money first.");
            return;
        }

        System.out.print("Enter amount to withdraw: ");
        float amount = sc.nextFloat();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " Rs withdrawn from your account.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! You only have " + balance + " Rs in your account.");
        } else {
            System.out.println("Please provide a valid amount to withdraw.");
        }
    }

    public float getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO OUR BANK SERVICE");
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        while (true) {
            System.out.println("\n1 --> Deposit");
            System.out.println("2 --> Withdraw");
            System.out.println("3 --> Check Balance");
            System.out.println("4 --> Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        float depositAmount = sc.nextFloat();
                        bank.deposit(depositAmount);
                        break;
                    case 2:
                        bank.withdraw();
                        break;
                    case 3:
                        System.out.println(name + ", your balance is: " + bank.getBalance() + " Rs.");
                        break;
                    case 4:
                        System.out.println("Thank you for using our services!");
                        System.out.println("Code written by your friend Manju.");
                        sc.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        }
    }
}
