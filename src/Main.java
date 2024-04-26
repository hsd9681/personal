import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double radius = 0;
    ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
    CircleCalculator circleCalculator = new CircleCalculator();

    while (true) {
      System.out.println("어떤 작업을 수행하시겠습니까?");
      System.out.println("1. 사칙연산");
      System.out.println("2. 원의 넓이 또는 둘레 구하기");
      System.out.print("작업을 선택하세요: ");
      int choice = scanner.nextInt();
      scanner.nextLine(); // 개행문자 제거

      switch (choice) {
        case 1:
          System.out.print("첫 번째 숫자를 입력하세요: ");
          double num1 = scanner.nextDouble();
          System.out.print("사칙연산을 입력하세요: ");
          String operator = scanner.next();
          System.out.print("두 번째 숫자를 입력하세요: ");
          double num2 = scanner.nextDouble();
          double result = arithmeticCalculator.calculate(operator, num1, num2);
          System.out.println("결과: " + result);
          break;

        case 2:
          System.out.print("구하고 싶은 값(원의넓이 or 원의둘레)을 입력하세요: ");
          String operation = scanner.nextLine();
          double circleResult = 0;

          if (operation.equals("원의넓이")) {
            circleResult = circleCalculator.calculate("원의넓이", radius, 0);
          } else if (operation.equals("원의둘레")) {
            circleResult = circleCalculator.calculate("원의둘레", radius, 0);
          } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            continue;
          }

          System.out.println("결과: " + circleResult);
          break;

        default:
          System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
          break;
      }

      System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
      String text = scanner.next();
      if (text.equals("exit")) {
        break;
      }
    }

  }
}
