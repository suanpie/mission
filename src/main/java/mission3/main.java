package mission3;

import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numberGame game = new numberGame();

        // 컴퓨터 숫자 랜덤
        game.generateComputerNumbers();
        System.out.println("컴퓨터 숫자: " + Arrays.toString(game.getComputerNumbers()));

        // 사용자 숫자 입력
        System.out.println("랜덤 숫자 세개를 입력하세요");
        String str = scanner.nextLine();
        String[] arr = str.split("");

        // 매개변수로 전달할 string -> int 타입으로 변경
        int[] userNumbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            userNumbers[i] = Integer.parseInt(arr[i]); // 문자열을 정수로 변환
        }

        // result 값은 compareNumbers 메서드에 유저 넘버값 매개 변수로 전달해 받은 리턴값
        String result = game.compareNumbers(userNumbers);
        System.out.println("결과: " + result);
    }
}
