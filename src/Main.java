
import java.util.Scanner;

public class Main{
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        do {
            try {
                giveInfoToUsers();
                int first,second;
                do {
                    first = readNumber();
                    second = readNumber();
                    if(!validate(first, second)){
                        System.out.println("HATA");
                    }
                }while (!validate(first, second));
                long result= MathUtils.combine(first, second);
                System.out.println(result);
            }
            catch (Exception e){
                System.out.println("HATA");
            }
        }while (true);

    }
    private static void giveInfoToUsers(){
        System.out.println("hello");
    }
    private static int readNumber(){
        System.out.println("please enter your number");
        int number= scanner.nextInt();
        return number;
    }
    private static boolean validate(int num1, int num2){
        return num1>1 && num2>1 && num1>=num2;
    }
}
