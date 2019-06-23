import java.util.HashMap;
import java.util.Map;

public class RomanCal {

    private static String roman(int input) {

        String s = "";

        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }

    public void calculator(String number1, String number2, char operation) {

        Map<String, Integer> maps = new HashMap<>();
        maps.put("I", 1);
        maps.put("II", 2);
        maps.put("III", 3);
        maps.put("IV", 4);
        maps.put("V", 5);
        maps.put("VI", 6);
        maps.put("VII", 7);
        maps.put("VIII", 8);
        maps.put("IX", 9);
        maps.put("X", 10);

        int num1 = maps.get(number1);
        int num2 = maps.get(number2);

        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num1 > 0 && num2 > 0) {
                    result = num1 / num2;
                    break;
                } else {
                    result = 0;
                    break;
                }
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }

        System.out.println("Результат: " + roman(result));

    }

}
