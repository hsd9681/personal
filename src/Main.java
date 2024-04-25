import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 숫자를 입력하세요: ");
    int num1 = sc.nextInt();
    System.out.print("사칙연산을 입력하세요: ");
    sc.nextLine();
    String mid = sc.nextLine();
    System.out.print("두 번째 숫자를 입력하세요: ");
    int num2 = sc.nextInt();
    sc.nextLine();

  }
}
