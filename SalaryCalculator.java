package Learning_Java;
// import statements
import java.text.DecimalFormat;
import java.util.Scanner;

// class SalaryCalculator
public class SalaryCalculator {
   public static void main(String[] args) {
      // using scanner to get input
      Scanner input = new Scanner(System.in);

      // declaring variables
      double grossPay;
      double vac;
      double salary;

      try {
         // getting input from user
         System.out.println("Enter your hourly rate:");
         double rate = Double.parseDouble(input.next());
      
         System.out.println("Enter the number of hours worked:");
         double hours = Double.parseDouble(input.next());

         System.out.println("Enter your number of vacation days:");
         double vacation = Double.parseDouble(input.next());

         // calculating gross pay, vacation pay, then salary
         grossPay = rate * hours;
         vac = vacation * hours * 8;
         salary = (grossPay * 52) - vac;
         // formatting salary's decimal places
         DecimalFormat df = new DecimalFormat("#.##");

         /* giving an error if user enters a negative number
         and printing out the answer if valid, formatted data was given */
         if (salary < 0) {
            System.out.println("You have entered invalid data. Please try again.");
         } else {
            String sb = new StringBuilder()
               .append("Your salary is $")
               .append(df.format(salary))
               .append(" per year.")
               .toString();
            System.out.println(sb);
         }
      } catch (Exception e) {
         // catches errors and prints
         System.out.println("Error: " + e.getMessage());
      }
      // closes scanner
      input.close();
   }
}
