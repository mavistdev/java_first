import java.util.Scanner;

public class uslovie {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int mav = scan.nextInt();
        System.out.print("Введите число 2: ");
        int mav2 = scan.nextInt();

        if(mav2 == 0){
            System.out.println("Результат: " + mav/mav2);
        }
        else(){
            System.out.println("На 0 делить нельзя");
        }

    }
}
