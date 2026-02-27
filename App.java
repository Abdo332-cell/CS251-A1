import java.util.Scanner;
public class App {
    static double[] rates = {
        47.95,   
        1.0,    
        0.8468,
        3.75,  
        3.6725, 
        0.7418   
    };
    static String[] names = {
        "EGP", "USD", "EUR", "SAR", "AED", "GBP"
    };
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("\n=====================================");
            System.out.println("        WELCOME TO CONVERTER");
            System.out.println("=====================================");

            System.out.println("\nAvailable Currencies");
            System.out.println("-------------------------------------");
            System.out.println("| 1 | EGP |");
            System.out.println("| 2 | USD |");
            System.out.println("| 3 | EUR |");
            System.out.println("| 4 | SAR |");
            System.out.println("| 5 | AED |");
            System.out.println("| 6 | GBP |");
            System.out.println("-------------------------------------");

            System.out.print("\nChoose FROM currency number : ");
            int from = in.nextInt();

            System.out.print("Enter Amount : ");
            double amount = in.nextDouble();

            System.out.print("Convert TO currency number : ");
            int to = in.nextInt();
            int fromIndex = from - 1;
            int toIndex = to - 1;

            if (fromIndex < 0 || fromIndex >= rates.length || toIndex < 0 || toIndex >= rates.length) {
                System.out.println("\nPlease choose a number from 1 to 6");
                continue;
            }
            double usd = amount / rates[fromIndex];
            double result = usd * rates[toIndex];

            System.out.printf("\nResult = %.2f %s\n", result, names[toIndex]);

            System.out.println("\n1 Convert Again");
            System.out.println("2 Exit");
            System.out.print("Choose : ");

            int choice = in.nextInt();

            if (choice == 2) {
                System.out.println("Done");
                break;
            }
        }
        in.close();
    }

}
