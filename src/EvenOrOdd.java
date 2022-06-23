import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter an Integer");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if(num%2 == 0)
            System.out.println("Entered Number Is Even");
        else
        System.out.println("Entered Number Is Odd");
    }
}
