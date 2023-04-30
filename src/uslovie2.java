import java.util.Scanner;

public class uslovie2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String mav = scan.nextLine();
        if(mav.equals("MavmaV")){
            while (mav != "mav"){
                System.out.println("lol");
            }
        } else if(mav.equals("mav")){
            System.out.println("не тот мав");
        } else{
            System.out.println("Мимо");
        }


    }
}
