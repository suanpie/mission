package mission1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대인가요?");
        int num1 = scanner.nextInt();

        System.out.println("시도할 횟수는 몇 회인가요?");
        int num2 = scanner.nextInt();

        System.out.println("자동차 대수는 총 " + num1 + "대 입니다.");
        System.out.println("시도할 횟수는 총 " + num2 + "회 입니다.");
    }
}