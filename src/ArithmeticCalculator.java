public class ArithmeticCalculator extends Calculator {

  private final AddOperator addOperation;
  private final SubtractOperator substractOperation;
  private final MultiplyOperator multiplyOperation;
  private final DivideOperator divideOperation;

  public ArithmeticCalculator(AddOperator addOperation, SubtractOperator substractOperation,
                    MultiplyOperator multiplyOperation, DivideOperator divideOperation) {
    this.addOperation = addOperation;
    this.substractOperation = substractOperation;
    this.multiplyOperation = multiplyOperation;
    this.divideOperation = divideOperation;
  }


  @Override
  public double calculate(String operator, double num1, double num2) {
    double result = 0;
    switch (operator) {
      case "+":
        result = addOperation.operate(num1, num2);
        break;
      case "-":
        result = substractOperation.operate(num1, num2);
        break;
      case "*":
        result = multiplyOperation.operate(num1, num2);
        break;
      case "/":
        if (num2 != 0) {
          result = divideOperation.operate(num1, num2);
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
