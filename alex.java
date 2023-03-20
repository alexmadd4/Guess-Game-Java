import java.util.Scanner;
public class alex {

    public static void main(String[] args){
    
    System.out.println("Welcome to the number guessing game!!");
    System.out.println("You have 3 guesses.");

    int luckynum = (int)(Math.random() * 100);

    Scanner sc = new Scanner(System.in);

         //Hints
        if(luckynum % 2 == 0){
            System.out.println("/!Hint!/-The number is even!");
        }else{
            System.out.println("/!Hint!/-The number is odd!");
        }if(luckynum <= 100 && luckynum >= 90 ){
            System.out.println("The lucky number is between 90-100!");
        }if (luckynum <= 89 && luckynum >= 80 ){
            System.out.println("The lucky number is between 80-89!");
        }if (luckynum <= 79 && luckynum >= 70 ){
            System.out.println("The lucky number is between 70-79!");
        }if (luckynum <= 69 && luckynum >= 60 ){
            System.out.println("The lucky number is between 60-69!");
        }if (luckynum <= 50 && luckynum >= 50 ){
            System.out.println("The lucky number is between 50-59!");
        }if (luckynum <= 49 && luckynum >=40 ){
            System.out.println("The lucky number is between 40-49!");
        }if (luckynum <=39 && luckynum >= 30){
            System.out.println("The number is between 30-39!");
        }if (luckynum <=29 && luckynum >= 20){
           System.out.println("The number is between 20-29!");
        }if (luckynum <=19 && luckynum >= 10){
          System.out.println("The number is between 10-19!");
        }if (luckynum <=9 && luckynum >= 0){
             System.out.println("The number is between 0-9!");
        }

         int userguess1 = sc.nextInt();

        if(userguess1 == luckynum){
            System.out.println("You found the lucky number!!");
            return;
        }
         int userguess2 = sc.nextInt();

        if(userguess2 == luckynum){
            System.out.println("You found the lucky number!!");
        return;
        }
            
        int userguess3 = sc.nextInt();

        if (userguess3 == luckynum){
            System.out.println("You found the lucky number!!");
            return;
        }  
            System.out.println("You ran out of guesses,this was the number: "+"["+luckynum+"].");
         
    }
  
}   
