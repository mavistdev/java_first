import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int num1 = input.nextInt();
        System.out.println("Введите число 2: ");
        int num2 = input.nextInt();
        System.out.println("Введите действие: ");
        String docalc = input.nextLine();
        docalc = input.nextLine();
        switch (docalc){
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                if(num2 != 0) {
                    System.out.println(num1 / num2);
                }
                else {
                    System.out.println("На 0 не делим");
                }
                break;
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            default:
                System.out.println("Что-то не так");
                break;
        }

    }

}
