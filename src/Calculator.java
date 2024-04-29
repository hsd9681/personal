import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {

  protected List<Double> resultList = new ArrayList<>(); // 결과를 저장하는 리스트

  public List<Double> getResultList() {
    return resultList;
  }

  // 사칙연산을 수행하는 메서드
  public abstract double calculate(String operator, double num1, double num2);

  // 결과를 제거하는 메서드
  public void removeResult() {
    if (!resultList.isEmpty()) {
      double removedResult = resultList.remove(0);
      System.out.println("가장 먼저 저장된 결과 " + removedResult + "가 삭제되었습니다.");
    } else {
      System.out.println("저장된 결과가 없습니다.");
    }
  }

  // 결과를 조회하는 메서드
  public void inquiryResults() {
    System.out.println(resultList.toString());
  }
}
