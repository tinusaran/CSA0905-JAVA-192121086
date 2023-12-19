import java.util.Scanner;
public class BankInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            
            System.out.println("Enter user details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.println("\nSelect the bank for interest calculation:");
            displayBankOptions();

            System.out.print("Enter the corresponding number for the selected bank: ");
            int bankChoice = scanner.nextInt();

            if (bankChoice < 1 || bankChoice > 20) {
                System.out.println("Invalid bank choice.");
                return;
            }

            String bankName = getBankNameByChoice(bankChoice);

            scanner.nextLine(); // Consume newline character
            System.out.print("Total amount in the bank account: ");
            double totalAmount = scanner.nextDouble();
            System.out.print("Credit score: ");
            int creditScore = scanner.nextInt();

            double[] interestRates = getInterestRates(bankName, age);

            double minimumInterest = totalAmount * interestRates[0] / 100.0;
            double maximumInterest = totalAmount * interestRates[1] / 100.0;

	    if(age<60 && age>1){
            System.out.println("\nFor General Citizen:");
            System.out.println("Minimum Interest Amount Per Month(Tenure 7 days): " + minimumInterest);
            System.out.println("Maximum Interest Amount Per Month(Tenure 10 Years): " + maximumInterest);}

            if (age >= 60) {
                System.out.println("\nFor Senior Citizen:");
                System.out.println("Minimum Interest Amount Per Month(Tenure 7 days): " + minimumInterest);
                System.out.println("Maximum Interest Amount Per Month(Tenure 10 Years) " + maximumInterest);
            }

            if (creditScore >= 700 && creditScore <= 800) {
                System.out.println("As Your Credit Score is greater Than 700, You've got high chances of Loan Approval.");
            } else if (creditScore >= 300) {
                System.out.println("As Your Credit Score is higher Than 300, Loan might be approved.");
            } else {
                System.out.println("As Your Credit Score is Lesser Than 300, Loan might not be approved.");
            }

            // Ask the user if they want to exit
            System.out.print("Do you want to check interest for another bank Account? (yes/no): ");
            scanner.nextLine(); // Consume newline character
            String exitChoice = scanner.nextLine().toLowerCase();
            exit = exitChoice.equals("no");
        }
    }

    private static void displayBankOptions() {
        System.out.println("+----------------------------------------+");
        System.out.println("|Select a bank for interest calculation  |");
        System.out.println("+----------------------------------------+");
        System.out.println("| 1. Axis                                |");
        System.out.println("| 2. Bandhan Bank                        |");
        System.out.println("| 2. Bank Of Baroda                      |");
        System.out.println("| 3. Canara Bank                         |");
        System.out.println("| 4. Central Bank of India               |");
	System.out.println("| 5. Federal Bank                        |");
        System.out.println("| 6. HDFC Bank                           |");
        System.out.println("| 7. ICICI Bank                          |");
        System.out.println("| 8. IDBI Bank                           |");
	System.out.println("| 9. IDFC FIRST Bank                     |");
        System.out.println("| 10.IndusInd Bank                       |");
        System.out.println("| 11.Karnataka Bank                      |");
        System.out.println("| 12.Kotak Mahindra Bank                 |");
	System.out.println("| 13.Punjab National Bank                |");
	System.out.println("| 14.RBL Bank                            |");
	System.out.println("| 15.South Indian Bank                   |");
	System.out.println("| 16.State bank of India                 |");
	System.out.println("| 17.Tamilnad Mercantile Bank            |");
	System.out.println("| 18.UCO Bank                            |");
	System.out.println("| 19.Union Bank of India                 |");
	System.out.println("| 20.YES Bank                            |");
        System.out.println("+----------------------------------------+");
    }

    private static String getBankNameByChoice(int choice) {
        switch (choice) {
            case 1:
                return "axis";
            case 2:
                return "Bandhan";
            case 3:
                return "BankOfBaroda";
            case 4:
                return "Canara";
            case 5:
                return "Central";
            case 6:
                return "HDFC";
            case 7:
                return "ICICI";
            case 8:
                return "IDBI";
            case 9:
                return "IDFC";
            case 10:
                return "Indusind";
            case 11:
                return "Karnataka";
	    case 12:
		return "Kotak";
	    case 13:
		return "Punjab";
	    case 14:
		return "RBL";
	    case 15:
		return "South";
	    case 16:
		return "SBI";
	    case 17:
		return "TMB";
	    case 18:
		return "UCO";
	    case 19:
		return "Union";
	    case 20:
		return "YES";
            default:
                return "Invalid Choice";
        }
    }

    private static double[] getInterestRates(String bankName, int age) {
        double[] interestRates = new double[2]; // 0: Minimum, 1: Maximum

        switch (bankName) {
            case "axis":
                interestRates = (age >= 60) ? new double[]{3.50, 7.75} : new double[]{3.00, 7.10};
                break;
	    case "Bandhan":
                interestRates = (age >= 60) ? new double[]{3.75, 8.35} : new double[]{3.00, 7.85};
                break;
	    case "BankOfBaroda":
                interestRates = (age >= 60) ? new double[]{3.50, 7.75} : new double[]{3.00, 7.25};
                break;
	    case "Canara":
                interestRates = (age >= 60) ? new double[]{4.00, 7.75} : new double[]{4.00, 7.25};
                break;
	    case "Central":
                interestRates = (age >= 60) ? new double[]{4.00, 7.25} : new double[]{3.50, 6.75};
                break;
	    case "HDFC":
                interestRates = (age >= 60) ? new double[]{3.50, 7.75} : new double[]{3.00, 7.20};
                break;
            case "ICICI":
                interestRates = (age >= 60) ? new double[]{3.50, 7.65} : new double[]{3.00, 7.10};
                break;
            case "IDBI":
                interestRates = (age >= 60) ? new double[]{3.50, 7.30} : new double[]{3.00, 6.80};
                break;
	    case "IDFC":
                interestRates = (age >= 60) ? new double[]{3.50, 8.25} : new double[]{3.00, 7.75};
                break;
            case "Indusind":
                interestRates = (age >= 60) ? new double[]{4.25, 8.25} : new double[]{3.50, 7.85};
                break;
	    case "Karnataka":
                interestRates = (age >= 60) ? new double[]{3.50, 7.75} : new double[]{3.50, 7.25};
                break;
	    case "Kotak":
                interestRates = (age >= 60) ? new double[]{3.25, 7.75} : new double[]{2.75, 7.25};
                break;
            case "Punjab":
                interestRates = (age >= 60) ? new double[]{4.00, 7.75} : new double[]{3.50, 7.25};
                break;
	    case "RBL":
                interestRates = (age >= 60) ? new double[]{4.00, 8.50} : new double[]{3.50, 8.00};
                break;
	    case "South":
                interestRates = (age >= 60) ? new double[]{3.40, 7.50} : new double[]{2.90, 7.30};
                break;
            case "SBI":
                interestRates = (age >= 60) ? new double[]{3.50, 7.60} : new double[]{3.00, 7.10};
                break;
	    case "TMB":
                interestRates = (age >= 60) ? new double[]{5.25, 7.50} : new double[]{5.25, 7.00};
                break;
	    case "UCO":
                interestRates = (age >= 60) ? new double[]{3.15, 7.00} : new double[]{2.90, 6.50};
                break;
            case "Union":
                interestRates = (age >= 60) ? new double[]{3.50, 7.50} : new double[]{3.00, 7.00};
                break;
            case "Yes":
                interestRates = (age >= 60) ? new double[]{3.75, 8.25} : new double[]{3.25, 7.75};
                break;
            default:
                System.out.println("Invalid bank name.");
        }

        return interestRates;
    }
}
