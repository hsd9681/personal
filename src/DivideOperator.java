public class DivideOperator {
  public double operate(double num1, double num2) {
    if (num2 != 0) {
      return num1 / num2;
    } else {
      throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
    }
  }
}
