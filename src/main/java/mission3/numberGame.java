package mission3;

import java.util.Random;

public class numberGame {
    private int[] computerNumbers = new int[3];  // 3개의 숫자를 저장할 배열


    // 3개의 랜덤 숫자를 배열에 저장
    public void generateComputerNumbers() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            computerNumbers[i] = random.nextInt(9) + 1;
        }
    }

    //컴퓨터 숫자와 입력 받은 숫자 비교
    public String compareNumbers(int[] userNumbers){
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && userNumbers[i] == computerNumbers[j]) {
                    strike++;
                } else if (i != j && computerNumbers[j] == userNumbers[i]) {
                    ball++;
                }
            }
        }

        // 비교 리턴
        if (strike == 0 && ball == 0){
            return "낫싱";
        } return strike + "스트라이크 " + ball + "볼";
    }

    //멤버변수 private -> getter로 보호
    public int[] getComputerNumbers() {
        return computerNumbers;
    }

}
