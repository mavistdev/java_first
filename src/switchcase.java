import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int mav = scan.nextInt();
        switch (mav) {
            case 1:
                System.out.println("да, 1");
                break;

            case 2:
                System.out.println("да, 2");
                break;

                case 3:
                System.out.println("да, 3");
                break;

            default:
                System.out.println("не");
                // break; можно не ставить тк.к кода ниже нету, а можно и ставить
        }

    }
}
