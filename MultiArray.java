
package multiarray;
import java.util.Scanner;

public class MultiArray {

   
    public static void main(String[] args) {
       double[][] myArray = new double[3][4];
        
        Scanner input = new Scanner(System.in);
        
        for (int row=0; row<3; row++)
        {
            for(int col=0; col<4; col++)
            {
                System.out.println("Enter the value " + " for row " + row  + " and col " + col + " : ");
                myArray[row][col] = input.nextDouble();
            }
        }
        System.out.println("Enter the row you wish to sum");
        int rowToSum = input.nextInt();
        
        double total = sumRow(myArray, rowToSum);
        
        System.out.println("The row's sum is " + total );
    }
    
    public static double sumRow(double[][] m, int rowIndex) 
    
    {
        double result = 0;
        
        for(int col=0; col<4; col++)
        {
            result = result + m[rowIndex][col];
        }
        return result;
    }
    
}
