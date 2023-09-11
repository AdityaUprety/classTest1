import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);

        System.out.println("Username");
        String username = login.nextLine();

        System.out.println("Password");
        String password = login.nextLine();


        if (username.equals("Username") && password.equals("Password")) {
            System.out.println("These are the choices u get");
            System.out.println("Calculator");
            System.out.println("Guessing game");
            System.out.println("SI calculator");
            System.out.println("vowel or consonant");

            System.out.println("Choose your choice");
            String choice = login.nextLine();

            if (choice.equals("Calculator")) {
                System.out.print("Enter the first number: ");
                double num_1 = login.nextDouble();

                System.out.print("Enter an operator (+, -, *, /): ");
                String operator = login.next();

                System.out.print("Enter the second number: ");
                double num_2 = login.nextDouble();

                switch (operator) {
                    case "+":
                        double result = num_1 + num_2;
                        System.out.println(result);
                        break;
                    case "-":
                        result = num_1 - num_2;
                        System.out.println(result);
                        break;
                    case "*":
                        result = num_1 * num_2;
                        System.out.println(result);
                        break;
                    case "/":
                        result = num_1 / num_2;
                        System.out.println(result);
                        break;
                    default:
                        System.out.println("error");
                }
            } else if (choice.equals("SI calculator")) {
                System.out.println("inter principle: ");
                double principle = login.nextDouble();

                System.out.println("enter time");
                double time = login.nextDouble();

                System.out.println("enter time");
                double rate = login.nextDouble();

                double result = (principle * time * rate) / 100;

                System.out.println("Simple Interest is " + result);

            } else if (choice.equals("vowel or consonant")) {
                System.out.println("Enter a letter");
                String letter = login.nextLine();

                switch (letter) {
                    case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U":
                        System.out.println("vowel");
                        break;
                    default:
                        System.out.println("consonant");

                }
            } else if (choice.equals("Guessing game")) {
                System.out.println("Enter a number from 0 to 50");
                int number = login.nextInt();

                int r_num = (int) (Math.random() * 51);

                if (number == r_num) {
                    System.out.println("You guessed right");
                }else{
                    System.out.println("You guessed it wrong");
                }
            } else {
                System.out.println("error");
            }
        }
    }
}