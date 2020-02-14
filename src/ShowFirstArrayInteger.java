import java.util.Scanner;
public class ShowFirstArrayInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter numbers to show: ");
        int number = input.nextInt();
        int count = 0;
        int i = 2;
        while (count < number){
            if(checkPrime(i)){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }

    public static boolean checkPrime(int number){
        if(number < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number);i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

}
