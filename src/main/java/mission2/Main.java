package mission2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("차를 얼만큼 이동하고 싶으세요?");
        int num = scanner.nextInt();

        Car.movement(num);
        Car.nowLocation();
    }
}
