import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int addNumber = numberOne + numberTwo;
        System.out.println(addNumber);
    }
}
