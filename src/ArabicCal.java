public class ArabicCal {

    public void calculator(int number1, int number2, char operation) {

        int result = 0;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number1 > 0 && number2 > 0) {
                    result = number1 / number2;
                    break;
                } else {
                    result = 0;
                    break;
                }
            default:
                System.out.println("Операция не распознана. Повторите ввод.");

        }

        System.out.println("Результат: " + result);

    }

}
