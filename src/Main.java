import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = "";
    int result = 0;
    List<Integer> resultList = new ArrayList<>();
    Calculator calculator = new Calculator();

    while (!text.equals("exit")) {
      System.out.println("어떤 작업을 수행하시겠습니까?");
      System.out.println("1. 사칙연산");
      System.out.println("2. 원의 넓이 구하기");
      System.out.print("작업을 선택하세요: ");
      int choice = Integer.parseInt(sc.nextLine());

      switch (choice) {
        case 1:
          System.out.print("첫 번째 숫자를 입력하세요: ");
          int num1 = Integer.parseInt(sc.nextLine());
          System.out.print("사칙연산을 입력하세요: ");
          String operator = sc.nextLine();
          System.out.print("두 번째 숫자를 입력하세요: ");
          int num2 = Integer.parseInt(sc.nextLine());

          result = calculator.calulate(operator,num1, num2);
          resultList = calculator.getResultList();
          System.out.println("결과: " + result);
          break;

        case 2:
          System.out.print("원의 반지름을 입력하세요: ");
          int radius = Integer.parseInt(sc.nextLine());
          double area = calculator.calculateCircleArea(radius);
          System.out.println("원의 넓이: " + area);
          break;

        default:
          System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
          break;
      }

      System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
      text = sc.nextLine();

      switch (text){
        case "remove":
          calculator.removeResult();
          break;
        case "inquery" :
          calculator.inquiryResults();
          break;
      }
    }
  }
}
