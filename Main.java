import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 

    int quit = 0; //var to break from loop
    while (quit != 1)// runs till neg number is inserted
      {
    
        System.out.println("Enter a Fun Number: "); //input
        int input = scan.nextInt();

        if (input >= 0)//checks for neg
        {
          FunNumber input1 = new FunNumber(input); //creates object
          System.out.println("\n");// following prints out all numbers
          System.out.println("Number of Digits: " + input1.numDigits()+"\n");
          System.out.println("Sum of Digits: " + input1.sumDigits()+"\n");
          System.out.println("Perfect Number: " + input1.isPerfect()+"\n");
          System.out.println("Prime Number: " + input1.isPrime()+"\n");
          System.out.println("Reversed Number: " + input1.reverseNum().toString()+"\n");
          System.out.println("\n");

        }
        else //neg num instance
        {
          quit=1;
          System.out.println("End");
        }
      }
    
   
    
    scan.close();
  }
}

