import java.util.Scanner;

public class incomecalc
{
    public static void main(String[] args)
    {
         // declaration of variables for numbers
    double value;
    double interest;
    double year1, year2, year3;
    double x;

    //scanner to read input
    Scanner keyboard = new Scanner(System.in);
    

    // number input for calculations
    System.out.println("Enter your the amount in your bank account ");
        value = keyboard.nextDouble();
        
    System.out.println("Enter the interest rate ");
        interest = keyboard.nextDouble();
    
    // calculations for numbers
    x = (value * interest) + value;
    year1 = x;
    year2 = (x * interest) + x;
    year3 = (year2 * interest) + year2;


    // output 
    System.out.println("First Year: " + year1);
    System.out.println("Second Year: " + year2);
    System.out.println("Third Year: " + year3);



    }
}