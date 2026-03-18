import java.util.Scanner;

public class divisivilityofseven {
public static boolean isDivisibleBy7(int num) {
        num = Math.abs(num);
        if (num == 0 || num == 7) {
            return true;
        }
        if (num < 10) {
            return false;
        }
        int a = num / 10;   
        int b = num % 10;   
        return isDivisibleBy7(a - 2 * b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isDivisibleBy7(num)) {
            System.out.println(num + " is divisible by 7.");
        } else {

 System.out.println(num + " is not divisible by 7.");
        }

        sc.close();
    }


}
