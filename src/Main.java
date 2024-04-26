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

      Calculator calculator  = new Calculator();
      System.out.println(calculator.calulate(operator, num1, num2));
      System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
      text = sc.nextLine();

      switch (text){
        case "remove":
          if (!resultList.isEmpty()) {
            int removedResult = resultList.remove(0);
            System.out.println("가장 먼저 저장된 결과 " + removedResult + "가 삭제되었습니다.");
          } else {
            System.out.println("저장된 결과가 없습니다.");
          }
          break;

        case "inquery" :
            System.out.println(resultList.toString());
      }
    }

    System.out.println("프로그램을 종료합니다.");
  }
}
