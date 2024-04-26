import java.util.ArrayList;
import java.util.List;

public class Calculator {
  private List<Integer> resultList = new ArrayList<>();

  public void setResultList(List<Integer> resultList) {
    this.resultList = resultList;
  }

  public List<Integer> getResultList() {
    return resultList;
  }

  // 생성자를 통해 resultList 초기화? 이게 맞나?
  public Calculator() {
    resultList = new ArrayList<>();
  }


  public int calulate(String operator, int num1, int num2) {
    int result = 0;
    switch (operator) {
      case "+":
        result = num1 + num2;
        break;
      case "-":
        result = num1 - num2;
        break;
      case "*":
        result = num1 * num2;
        break;
      case "/":
        if (num2 != 0) {
          result = num1 / num2;
        } else {
          System.out.println("0으로 나눌 수 없습니다.");
        }
        break;
      default:
        System.out.println("잘못된 연산자입니다.");
        break;
    }
    resultList.add(result);
    return result;
  }
  public void removeResult() {
    if (!resultList.isEmpty()) {
      int removedResult = resultList.remove(0);
      System.out.println("가장 먼저 저장된 결과 " + removedResult + "가 삭제되었습니다.");
    } else {
      System.out.println("저장된 결과가 없습니다.");
    }
  }
  public void inquiryResults() {
    System.out.println(resultList.toString());
  }
  public double calculateCircleArea(int radius) {
    final double PI = 3.14159265359; // 원주율을 상수로 선언
    return PI * radius * radius;
  }
}
