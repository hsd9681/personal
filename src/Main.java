import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = "";
    int result = 0;
    int Array[] = new int[10];
    int arrayIndex = 0;
    int arraySize = 0;

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
          break;
        case "-":
          result = num1 - num2;
          System.out.println("결과: " + result);
          break;
        case "*":
          result = num1 * num2;
          System.out.println("결과: " + result);
          break;
        case "/":
          if (num2 != 0) {
            result = num1 / num2;
            System.out.println("결과: " + result);
          } else {
            System.out.println("0으로 나눌 수 없습니다.");
          }
          break;
      }


      if (arraySize < 10) {
        Array[arrayIndex] = result;
        arraySize++;
      } else {

        for (int i = 0; i < Array.length - 1; i++) {
          Array[i] = Array[i + 1];
        }
        Array[Array.length - 1] = result;
      }

      arrayIndex++;
      System.out.print("onemore?");
      text = sc.nextLine();
    }
    System.out.println("프로그램을 종료합니다.");
    for(int i = 0; i < Array.length; i++){
      System.out.print(Array[i] + " ");
    }
  }
}
