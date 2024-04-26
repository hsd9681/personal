import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static final Calculator calculator = new Calculator(); // Calculator 객체 생성

  // Calculator 클래스의 결과 리스트를 반환하는 게터 메서드
  public static List<Integer> getResultList() {
    return calculator.getResultList();
  }

  // Calculator 클래스의 결과 리스트를 설정하는 세터 메서드
  public static void setResultList(List<Integer> resultList) {
    calculator.setResultList(resultList);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = "";
    int result = 0;

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

          result = calculator.calulate(operator, num1, num2); // Calculator 객체의 메서드 호출
          System.out.println("결과: " + result);
          break;

        case 2:
          System.out.print("원의 반지름을 입력하세요: ");
          int radius = Integer.parseInt(sc.nextLine());
          double area = calculator.calculateCircleArea(radius); // Calculator 객체의 메서드 호출
          System.out.println("원의 넓이: " + area);
          break;

        default:
          System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
          break;
      }

      System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
      text = sc.nextLine();

      switch (text) {
        case "remove":
          calculator.removeResult();
          break;
        case "inquery":
          calculator.inquiryResults();
          break;
      }
    }

    // 최종 결과 출력
    System.out.println(getResultList().toString());
  }
}
