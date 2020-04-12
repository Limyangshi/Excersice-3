import java.util.Scanner;
   public class Excersice3{
      static Scanner scan = new Scanner(System.in);
      
      public static void main(String [] args){
      
         //Question 1
        String word1 ="1st way to create new object";
        String word2 ="2nd way to create new object";
        
        //Question 2
        String phr = new String("Big,blue sky");
        System.out.println(phr.substring(phr.indexOf(","),7)); 
        
        //Question 3
        Random rd = new Random();
        System.out.println(rd.nextInt(41)+10);
        //rd will initialized an integer variable which between 0 and 41. Then, rd will add with 10.
        
        //Question 4
        Random rand = new Random();
        
        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);
        System.out.println("Num 1:" +num1);
        System.out.println("Num 2:" +num2);
        System.out.println(Math.max(num1,num2));
        
        //Question 5
        String test = "abc";
        test = test + test;
        System.out.println(test);
        
        //Question 5.1
        Random random = new Random();
        double d = Math.round(2.5 + random.nextInt(1));
        System.out.println("The value is" +d);
        
        //Question 6
        //a.
        Scanner input = new Scanner(System.in);
        
        //b.
        System.out.println("Enter 2 integer:");
        int x=input.nextInt();
        int y=input.nextInt();
        
        //c.
        System.out.println("Product of" +x + "and" +y + ":" +Math.multiplyExact(x,y));
        
        //Question 7
        String text1 = "School of Computing";
        String text2 = "College of Arts and Sciences";
        String text3 = "UUM Sintok";
        //a.
        System.out.println("Total length:" +(text1.length()+text2.length()+text3.length()));
        //b.
        System.out.println(text2.substring(0,20) + text1.substring(10,19));
        }//end main 
       }//end class