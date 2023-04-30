import java.util.Scanner;

public class uslovie2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String mav = scan.nextLine();
        if(mav.equals("MavmaV")){
            int x = 0;
            while (x != 5){
                x++;
                System.out.println("lol");
            }
        } else if(mav.equals("mav")){
            System.out.println("не тот мав");
        } else{
            System.out.println("Мимо");
        }


    }
}
