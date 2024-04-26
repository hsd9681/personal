public class CircleCalculator extends Calculator {
  @Override
  public double calculate(String operator, double num1, double num2) {
    double result = 0;
    switch (operator) {
      case "원의넓이":
        result = Math.PI * num1 * num1;
        break;
      case "원의둘레":
        result = 2 * Math.PI * num1;
        break;
      default:
        System.out.println("잘못된 연산자입니다.");
        break;
    }
    resultList.add(result);
    return result;
  }
}
