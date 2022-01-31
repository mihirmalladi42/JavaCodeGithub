import java.util.Scanner;
public class Binary {
    //Sets text colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public Binary(int convertToBinary) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println(ANSI_GREEN + "Type your base 10 number (Number can't be greater than 1023): " + ANSI_RESET);
        String strinput = inputNum.nextLine();
        int intInputBinary = Integer.parseInt(strinput);
        int quotient = intInputBinary;
        int remainder;
        int binaryVal = 0;
        int multiplier = 1;
        
        while (quotient != 0) {
            remainder = quotient % 2;
            binaryVal += multiplier * remainder;
            quotient /= 2;
            multiplier*=10;
        }   
        System.out.println();
        System.out.println(ANSI_YELLOW + intInputBinary + " converted to binary is: " + binaryVal + ANSI_RESET);
        Binary newInput = new Binary();

    }

    public Binary(double convertToInt) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println(ANSI_GREEN + "Type your binary number (You can't enter a number with more than 10 digits): " + ANSI_RESET);
        String strInput = inputNum.nextLine();
        int intBinaryInput = Integer.parseInt(strInput);
        int binary = intBinaryInput;

        int decimal = 0, power = 0;


        while (binary > 0) {
            int getNum = binary % 10;
            decimal += getNum * Math.pow(2, power);
            binary /= 10;
            power++;
        }
        System.out.println(ANSI_YELLOW + intBinaryInput + " in base 10 is: " + decimal + ANSI_RESET);
        Binary newInput = new Binary();

    }
    public Binary() {
        Scanner userInput = new Scanner(System.in);
        System.out.println(ANSI_GREEN + "Do you wish to do more actions? : " + ANSI_RESET);
        String Input = userInput.nextLine();
        if (Input.equalsIgnoreCase("yes")) {
            Binary chooser = new Binary(false);
        } else if (Input.equalsIgnoreCase("no")) {
            System.out.println(ANSI_CYAN + "Thank you for converting numbers to and from binary!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Please enter a proper answer." + ANSI_RESET);
            Binary again = new Binary();
        }
    }
    public Binary(boolean diffConstructor) {
            Scanner type = new Scanner(System.in);
            System.out.println(ANSI_GREEN + "Do you wish to convert decimal to binary or binary to decimal? (1 for decimal to binary, 2 for binary to decimal): " + ANSI_RESET);
            String typeInput = type.nextLine();
            int intTypeInput = Integer.parseInt(typeInput);
            if (intTypeInput == 1) {
                Binary toBinary = new Binary(4);
            } else if (intTypeInput == 2) {
                Binary toDecimal = new Binary(4.5);
            }
    }
    public static void main(String[] args) {
       Binary starter = new Binary(false);
    }
}
