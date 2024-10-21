import java.util.Scanner;

class AtmMachine {
    public static void main(String[] arg) {

        /** Declaraction Of Variables */
        int enteredPin;
        int activeOption;
        int accountPin = 0000;
        int transactionCode = 1;
        int accountBalance = 1000;
        boolean terminated = false;

        /** Initiating Of The Scanner */
        Scanner obj = new Scanner(System.in);

        /** Registering Member */
        System.out.println("Lets start with your name: ");
        String name = obj.nextLine();

        System.out.println("\nEnter new account pin: ");
        accountPin = obj.nextInt();

        System.out.println("\n> Conglatulations 🤩 " + name+ ", We have awarded you Kshs 1000/= for registering on our Bank.\n");

        /** Excecute Until The User Terminates */
        while (!terminated) {
            System.out.println("Welcome Back " + name + " 👋 to CodeXoft Bank.");
            System.out.print("1. Deposit amount\n2. Withdraw amount\n3. View account balance.\n4. Change account pin\n0. Exit\n\nEnter option: ");
            activeOption = obj.nextInt();
            switch (activeOption) {
                case 1:

                    /**Depositing Amount*/
                    System.out.print("Enter amount to deposit: ");
                    int deposit = obj.nextInt();
                    accountBalance += deposit;
                    System.out.println("\n> TRANS-" + transactionCode + " Confirmed. Amount of Kshs " + deposit+ "/= has been deposited. New Account balance is Kshs "+ accountBalance + "/=\n");
                    transactionCode++;
                    break;

                case 2:

                    /**Withdrawing Amount*/
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = obj.nextInt();
                    System.out.print("Enter your account pin: ");
                    enteredPin = obj.nextInt();
                    while (accountPin != enteredPin) {
                        System.out.println("Account pin do not match. Try again ?");
                        enteredPin = obj.nextInt();
                    }
                    if (withdraw > accountBalance) {
                        System.out.println("\n> You have insufficient amount on your account to initiate this withdraw .Account balance is Kshs "+ accountBalance+ "/=\n");
                    } else {
                        accountBalance -= withdraw;
                        System.out.println("\n> TRANS-" + transactionCode + " Confirmed. Congratulations. Amount of Kshs "+ withdraw+ "/= has been withdrawn. New Account balance is Kshs "+ accountBalance + "/=\n");
                    }
                    transactionCode++;
                    break;

                case 3:

                    /**Account Balance*/
                    System.out.println("\n> Your account balance is: Kshs " + accountBalance + "/=\n");
                    break;

                case 4:

                    /**Changing Account Pin*/
                    System.out.println("\nEnter old pin?");
                    enteredPin = obj.nextInt();
                    while (accountPin != enteredPin) {
                        System.out.println("> Account pin do not match. Try again ?");
                        enteredPin = obj.nextInt();
                    }
                    System.out.println("\nEnter new pin?");
                    accountPin = obj.nextInt();
                    System.out.println("\n> Success. You have changed you account pin successfully\n");
                    break;

                case 0:

                    /**Terminating Program*/
                    System.out.println("Are you sure you want to leave 🥺?\n1. Yes\n2. No");
                    activeOption = obj.nextInt();
                    switch (activeOption) {
                        case 1:
                            System.out.println("Good Bye !!!");
                            terminated = true;

                            break;
                        case 2:
                            System.out.println("\n🤭 Thought i would loose you there.\n");

                            break;

                        default:
                            System.out.println("\nInvalid Input");
                            break;
                    }
                    break;

                default:
                    System.out.println("\nInvalid input Entered\n");
                    break;
            }
        }
        obj.close();
    }
}
