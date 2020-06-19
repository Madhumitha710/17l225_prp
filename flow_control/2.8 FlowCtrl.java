import java.util.Scanner;
 
public class Exercise8{ 
      public static void main(String args[]){
          char color;
          Scanner sc=new Scanner(System.in);
           
          System.out.print("Enter a character");
          color=sc.next().charAt(0);
           
                switch(color){
                case 'R': 
                    System.out.println("REd");
                    break;
                case 'G': 
                    System.out.println("Green");
                    break;
                case 'B': 
                    System.out.println("Blue");
                    break;
                case 'O': 
                    System.out.println("Orange");
                    break;
                case 'Y': 
                    System.out.println("Yellow");
                    break;
                case 'W': 
                    System.out.println("White");
                    break;
                default:
                    System.out.println("Invalid color");
                    break;                  
          }
           
      }
}
