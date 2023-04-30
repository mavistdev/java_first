import java.util.Scanner;

public class newnew {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.print("Введите текст: ");
        String mav = scan.nextLine();
        System.out.println(mav);
         */
        System.out.print("Введите умножить число 1: ");
        int num = scan.nextInt();
        System.out.print("Введите умножить число 2: ");
        int num2 = scan.nextInt();
        //byte num2 = scan.nextByte();
        //boolean bool1 = scan.nextBoolean();
        //float num3 = scan.nextFloat();
        System.out.print(num * num2);

    }
}
