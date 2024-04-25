import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = "";
    int result = 0;
    int Array[] = new int[10];
    int arrayindex = 0;

    while (!text.equals("exit")) {
      System.out.print("첫 번째 숫자를 입력하세요: ");
      int num1 = sc.nextInt();
      System.out.print("사칙연산을 입력하세요: ");
      sc.nextLine();
      String mid = sc.nextLine();
      System.out.print("두 번째 숫자를 입력하세요: ");
      int num2 = sc.nextInt();
      sc.nextLine();

      switch (mid) {
        case "+":
          result = num1 + num2;
          System.out.println("결과: " + result);
          Array[arrayindex] = result;
          break;
        case "-":
          result = num1 - num2;
          System.out.println("결과: " + result);
          Array[arrayindex] = result;
          break;
        case "*":
          result = num1 * num2;
          System.out.println("결과: " + result);
          Array[arrayindex] = result;
          break;
        case "/":
          if (num2 != 0) {
            result = num1 / num2;
            System.out.println("결과: " + result);
            Array[arrayindex] = result;
          } else {
            System.out.println("0으로 나눌 수 없습니다.");
          }
          break;
      }
      arrayindex++;
      System.out.print("onemore?");
      text = sc.nextLine(); // 사용자 입력을 text 변수에 할당
    }
    System.out.println("프로그램을 종료합니다.");
    for(int i =0; i<Array.length; i++){
      System.out.println(Array[i]);
    }
  }
}
