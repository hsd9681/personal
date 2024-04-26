public class Calculator {
  public double calulate(String operator, int num1, int num2){
    int result = 0;
    switch (operator) {
      case "+":
        result = num1 + num2;
        System.out.println("결과: " + result);
        //resultList.add(result);
        break;
      case "-":
        result = num1 - num2;
        System.out.println("결과: " + result);
       // resultList.add(result);
        break;
      case "*":
        result = num1 * num2;
        System.out.println("결과: " + result);
       // resultList.add(result);
        break;
      case "/":
        if (num2 != 0) {
          result = num1 / num2;
          System.out.println("결과: " + result);
          //resultList.add(result);
        } else {
          System.out.println("0으로 나눌 수 없습니다.");
        }
        break;
      default:
        System.out.println("잘못된 연산자입니다.");
        break;
    }
    return result;
  }
}
