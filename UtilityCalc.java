//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class UtilityCalc {
    public static void main(String[] args) {
        //Menu options
        System.out.println("Smart Utility Calculator:");
        System.out.println("1. Check if a number is Even or Odd");
        System.out.println("2. Find the largest of three numbers");
        System.out.println("3. Grade Calculator");
        System.out.println("4. Simple Calculator (+,-,*,/)");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");

        // Initializing Variables for each case
        int choice = 4 ;//Choosing a menu option
        int n = 3; // case 1 variable
        int a = 17, b = 14, c = 4;//case 2 variables
        int grade = 80;//case 3 variable
        double num1 = 10.0, num2 = 2.0;// case 4 variables
        char operator = '*';//case 4 operator

        switch (choice) {
            //Checking if n is Even or Odd
            case 1:
                if(n%2==0)
                System.out.println("Your number is even");
            else System.out.println("Your number is odd");break;

                //Checking for the largest number
            case 2:
                if(a>b) {
                if (a > c) {
                    System.out.println("The largest number is " + a);
                } else {
                    System.out.println("The largest number is " + c);}
            } else {
                if (b > c) {
                    System.out.println("The largest number is " + b);
                } else {
                    System.out.println("The largest number is " + c);
                }
                }break;

                //Checking for a grade
            case 3:
                if ((grade>=90)&&(grade<=100))
                System.out.println("Your grade is an A.");
            else if ((grade>=80)&&(grade<=89))
                System.out.println("Your grade is a B.");
            else if ((grade>=70)&&(grade<=79))
                System.out.println("Your grade is a C.");
            else if ((grade>=60)&&(grade<=69))
                System.out.println("Your grade is a D.");
            else
                System.out.println("Your grade is an F.");break;

                //Simple calculator
            case 4:
                switch (operator) {
                    case '+':
                        System.out.println("Results: " + (num1 + num2));
                        break;
                    case '-':
                        System.out.println("Results: " + (num1 - num2));
                        break;
                    case '*':
                        System.out.println("Results: " + (num1 * num2));
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("invalid input, cannot divide by zero");
                        } else {
                            System.out.println("Results: " + (num1 / num2));
                        }
                        break;
                    default:
                        System.out.println("Invalid operator. Please use +, _, *, /.");
                }break;
                //End of the menu options
            case 5: System.out.println("Goodbye!"); break;
            default: System.out.println("Invalid choice.");



        }
    }
}