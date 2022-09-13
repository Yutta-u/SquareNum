import java.util.Scanner;

public class SquareNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long a = 1;
        while (a*a<= n) {
            System.out.println(a*a);
            a++;
        }
        if (a==1){
            System.out.println(1);
        }
    }
}
