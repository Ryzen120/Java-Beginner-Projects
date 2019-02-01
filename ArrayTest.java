import java.util.Scanner;
/**
 * Takes a integer value from the user to supply a number of integers to read.
 * Takes read ineteger and reads in the same amount dictated by the user, adding the to an array
 * Produces the out of the array in order and in reverse, also along with the maximum and minimum values. 
 * 
 * @author Robert Lenko
 * @version 4/11/2018
 */
public class ArrayTest
{
  /**
  * The main method for this class. This method implements the tests for the
  * ArrayTest class
  * 
  * @param args not used in this program.
  */  
    public static void main(String[] args)
    {
    Scanner in = new Scanner (System.in);
     
    System.out.println("---Integer Array Test---");
    System.out.println();
    System.out.print("Enter the number of integers to read:  ");
    
    int length = in.nextInt();
    int[] data = new int[length];
    
    System.out.println();
    System.out.print("Enter a list of " + length + " integers: ");
    
    //Loop to read in integers.
    for(int i = 0; i < data.length; i++)
    {
    
         data[i] = in.nextInt();
         
    }
     
    System.out.println();
    System.out.println("Your integers are : ");
    System.out.println();
     
    //Loop to print out list.
    for(int i = 0; i < length; i++)
    {
        
         System.out.print(i + ". ");
         System.out.println(data[i]);
             
    }
     
    System.out.println();
    System.out.println("Your integers in reverse are: ");
    System.out.println();
     
    //Loop to print out reverse list.
    for(int i = length - 1; i >= 0; i--)
    {
        
         System.out.print(i + ". ");
         System.out.println(data[i]);
             
    }
     
    System.out.println(); 
    
    int smallest = data[0];
    
    //Loop with statement to determine the smallest value in the array.
    for(int i = 0; i < data.length; i++)
     {
         
         if (data[i] < smallest)
         {
             
             smallest = data[i];
   
         }
     
    }
    
    System.out.print("The minimum of these " + length + " numbers is: ");
    System.out.println(smallest);
    System.out.println();
    
    int largest = data[0];
    
    //Loop with statement to determine the largest value in the array.
    for (int i = 0; i < data.length; i++)
    {
        
         if (data[i] > largest)
         {
             
             largest = data[i];
                
         }
         
    }
    
    System.out.print("The maximum of these " + length + " numbers is: ");
    System.out.println(largest);     
    
   }
}