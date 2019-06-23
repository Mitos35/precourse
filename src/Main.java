import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputNumber inputNumber = new InputNumber();
        ArabicCal arabicCal = new ArabicCal();
        RomanCal romanCal = new RomanCal();

        System.out.println("Выберете канкулятор:");
        System.out.println("Введите: 1 - Арабский");
        System.out.println("Введите: 2 - Римский");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Вы выбрали Арабский");
            int number1 = inputNumber.getInt();
            char operation = inputNumber.getOperation();
            int number2 = inputNumber.getInt();
            arabicCal.calculator(number1, number2, operation);
        } else if (number == 2) {
            System.out.println("Вы выбрали Римский");
            String numberStr1 = inputNumber.getStr();
            char operation = inputNumber.getOperation();
            String numberStr2 = inputNumber.getStr();
            romanCal.calculator(numberStr1, numberStr2, operation);
        } else {
            System.out.println("Выбор неизвестный!");
        }

    }
}
