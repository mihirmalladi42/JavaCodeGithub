import java.util.Scanner;
class MathTester{
  static String InputOperationMethodGet;
public MathTester(String diffConstructor, String diffConstructor2, int num1, int num2, int sumAns, int differenceAns, int productAns, int divisor, int quotientAns, int dividend, String InputOperation) {
    if (InputOperation.equals("addition")) {
      MathTester add = new MathTester(num1, num2, sumAns, "");
    } else if (InputOperation.toLowerCase().equals("subtraction")) {
      MathTester subtract = new MathTester(num1, num2, differenceAns, "", "");
    } else if (InputOperation.toLowerCase().equals("multiplication")) {
      MathTester multiply = new MathTester(num1, num2, productAns, 0.1);
    } else if (InputOperation.toLowerCase().equals("division")) {
      MathTester divide = new MathTester(divisor, quotientAns, false, dividend);
    } else {
      System.out.println("Enter your response correctly.");
    }
}
    public MathTester(int addend1, int addend2, int sumAns, String diffConstructor) {
      System.out.println("");
      System.out.println("What is " + addend1 + " + " + addend2 + " ?");
  
      Scanner userInputAddition = new Scanner(System.in);
      System.out.println("");
      System.out.println("Enter the sum of these numbers: ");
    

      String sumInput = userInputAddition.nextLine();
      int sumInputInt = Integer.valueOf(sumInput);

      if (sumAns == sumInputInt) {
        System.out.println("");
        System.out.print("Correct!");
      } else {
        System.out.println("");
        System.out.print("Incorrect. The answer was " + sumAns + ".");
      }
    }
    public MathTester(int subtrahend, int minuend, int differenceAns, String diffConstructor, String diffConstructor2) {
      System.out.println("");
      System.out.println("What is " + subtrahend + " - " + minuend + " ?");
      Scanner userInputSubtraction = new Scanner(System.in);
      System.out.println("");
      System.out.println("Enter the difference of these numbers: ");
      String differenceInput = userInputSubtraction.nextLine();
      int differenceInputInt = Integer.valueOf(differenceInput);

      if (differenceAns == differenceInputInt) {
        System.out.println("");
        System.out.print("Correct!");
      } else {
        System.out.println("");
        System.out.print("Incorrect. The answer was " + differenceAns + ".");
}
    }
    public MathTester(int factor1, int factor2, int productAns, double diffConstructor) {
      System.out.println("");
    System.out.println("What is " + factor1 + " * " + factor2 + " ?");
  
    Scanner userInputMultiplication = new Scanner(System.in);
    System.out.println("");
    System.out.println("Enter the product of these numbers: ");

    String productInput = userInputMultiplication.nextLine();
    int productInputInt = Integer.valueOf(productInput);

    if (productAns == productInputInt) {
      System.out.println("");
      System.out.print("Correct!");
    } else {
      System.out.println("");
      System.out.print("Incorrect. The answer was " + productAns + ".");
      }
    }
    public MathTester(int divisor, int quotientAns, boolean diffConstructor, int dividend) {

      System.out.println("");
    System.out.println("What is " + dividend + " / " + divisor + " ?");
  
    Scanner userInputDivision = new Scanner(System.in);
    System.out.println("");
    System.out.println("Enter the quotient of these numbers: ");

    String quotientInput = userInputDivision.nextLine();
    int quotientInputInt = Integer.valueOf(quotientInput);

    if (quotientAns == quotientInputInt) {
      System.out.println("");
      System.out.print("Correct!");
    } else {
      System.out.println("");
      System.out.print("Incorrect. The answer was " + quotientAns + ".");
      }
    }
    public MathTester() {
      System.out.println("Please give a correct input.");
    }
    public MathTester(String diffConstructor) {
      Scanner userInputContinue = new Scanner(System.in);
      System.out.println("Do you wish to continue?: ");
      String repeat = userInputContinue.nextLine();
      if (repeat.toLowerCase().equals("yes")) {
        Scanner userInputOperationMethod = new Scanner(System.in);
        System.out.println("Enter your operation: ");
        String InputOperationMethod = userInputOperationMethod.nextLine();
        InputOperationMethodGet = InputOperationMethod;
      } else {

      }
    }
    public static void main(String args[]) {
    int num1 = (int)Math.round(Math.random()*100);
    int num2 = (int)Math.round(Math.random()*100);
    int divisor = (int)(Math.round(Math.random()*50)+1);
    int quotientAns = (int)(Math.round(Math.random()*30)+1);
    int dividend = divisor * quotientAns; 
    int sumAns = num1 + num2;
    int differenceAns = num1 - num2;
    int productAns = num1 * num2;
    Scanner userInputOperation = new Scanner(System.in);
    System.out.println("Enter your operation: ");
    String InputOperation = userInputOperation.nextLine().toLowerCase();
    
    if (InputOperation.toLowerCase().equals("addition")){ //for addition
      MathTester add1 = new MathTester(num1, num2, sumAns, "");
      MathTester repeat1 = new MathTester("");
      MathTester main1 = new MathTester("", "", num1, num2, sumAns, differenceAns, productAns, divisor, quotientAns, dividend, InputOperationMethodGet);
    } else if (InputOperation.toLowerCase().equals("subtraction")){  //For Subtraction
      MathTester subtract1 = new MathTester(num1, num2, differenceAns, "", "");
      MathTester repeat2 = new MathTester("");
      MathTester main2 = new MathTester("", "", num1, num2, sumAns, differenceAns, productAns, divisor, quotientAns, dividend, InputOperationMethodGet);
    } else if (InputOperation.toLowerCase().equals("multiplication")){
      MathTester multiply1 = new MathTester(num1, num2, productAns, 0.4);
      MathTester repeat3 = new MathTester("");
      MathTester main3 = new MathTester("", "", num1, num2, sumAns, differenceAns, productAns, divisor, quotientAns, dividend, InputOperationMethodGet);
    } else if (InputOperation.toLowerCase().equals("division")) {
      MathTester divide1 = new MathTester(divisor, quotientAns, false, dividend);
      MathTester repeat4 = new MathTester("");
      MathTester main4 = new MathTester("", "", num1, num2, sumAns, differenceAns, productAns, divisor, quotientAns, dividend, InputOperationMethodGet);
    } else {
        System.out.println("Please give a correct input.");
    }
  } 
}
