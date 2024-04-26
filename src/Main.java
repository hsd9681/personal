import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = "";
    int result = 0;
    List<Integer> resultList = new ArrayList<>();

    while (!text.equals("exit")) {
      System.out.print("첫 번째 숫자를 입력하세요: ");
      int num1 = sc.nextInt();
      System.out.print("사칙연산을 입력하세요: ");
      sc.nextLine();
      String operator = sc.nextLine();
      System.out.print("두 번째 숫자를 입력하세요: ");
      int num2 = sc.nextInt();
      sc.nextLine();

      switch (operator) {
        case "+":
          result = num1 + num2;
          System.out.println("결과: " + result);
          resultList.add(result);
          break;
        case "-":
          result = num1 - num2;
          System.out.println("결과: " + result);
          resultList.add(result);
          break;
        case "*":
          result = num1 * num2;
          System.out.println("결과: " + result);
          resultList.add(result);
          break;
        case "/":
          if (num2 != 0) {
            result = num1 / num2;
            System.out.println("결과: " + result);
            resultList.add(result);
          } else {
            System.out.println("0으로 나눌 수 없습니다.");
          }
          break;
        case "remove":
          if (!resultList.isEmpty()) {
            int removedResult = resultList.remove(0);
            System.out.println("가장 먼저 저장된 결과 " + removedResult + "가 삭제되었습니다.");
          } else {
            System.out.println("저장된 결과가 없습니다.");
          }
          break;
        default:
          System.out.println("잘못된 연산자입니다.");
          break;
      }

      System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
      text = sc.nextLine();
    }

    System.out.println("프로그램을 종료합니다.");
  }
}
