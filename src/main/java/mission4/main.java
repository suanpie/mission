package mission4;

import org.apache.commons.jexl3.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //사용자 입력
        Scanner scanner = new Scanner(System.in);

        System.out.print("계산식을 입력하세요 (예: 2 * 3 + 4 / 2): ");
        String userExpression = scanner.nextLine();

        //JEXL 라이브러리
        JexlEngine jexl = new JexlBuilder().create();

        JexlExpression expression = jexl.createExpression(userExpression);

        Object result = expression.evaluate(null);
        System.out.println("결과: " + result);
    }
}


