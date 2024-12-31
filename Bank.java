import java.util.Scanner;
public class Bank {
    private float Balance;
    Scanner sc = new Scanner(System.in);
    public void deposit(float amount) {
        if(amount > 0){ Balance += amount;
            System.out.println(amount +" "+ "Rs deposited");}
        else {System.out.println("please provide an amount :");}}

    public void withdraw(){
        if(Balance<=0){
            System.out.println("!No Balance in your account Please Deposit Amount first ");
        }
        else {
            System.out.print("Enter Amount to withdraw :");
            float amount = sc.nextFloat();
            if (amount > 0 && amount <= Balance) {
                Balance -= amount;
                System.out.println(amount + " " + "Rs will be withdraw from your account");
            } else if (amount>Balance){
                System.out.println("Insufficient balance! You only have " + Balance + " Rs in your account.");
            } else {
                System.out.println("please provide a amount :");
            }
        }
    }
    public float getbalance(){
        return Balance;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO OUR BANK SERVICE");
        System.out.print("Please Enter Your Name :");
        String name = sc.nextLine();
        while ( true ) {
            System.out.print("1 --> Deposit\n2 --> Withdraw\n3 --> Check Balance \n4 --> Exit\nEnter your choice :");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: System.out.print("Enter Amount to Deposit :");
                    float amount = sc.nextFloat();
                    bank.deposit(amount);
                    break;
                case 2: bank.withdraw();break;
                case 3: System.out.println(name+" "+"your balance is :"+bank.getbalance());break;
                case 4: System.out.println("Thank you for using our services 😊");
                    System.out.println("And This Code writen by your Friend Manju 😁");
                    System.exit(0);
                default: System.out.println("Invalid choice, please try again.");
            }}}}