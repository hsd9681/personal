public class ArithmeticCalculator extends Calculator {
  @Override
  public double calculate(String operator, double num1, double num2) {
    double result = 0;
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
}
