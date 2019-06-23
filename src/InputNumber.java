import java.util.Arrays;
import java.util.Scanner;

public class InputNumber {

    static Scanner scanner = new Scanner(System.in);

    public int getInt() {
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public String getStr() {
        Scanner scanner = new Scanner(System.in);
        String[] roma = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII","IX", "X"};

        System.out.println("Введите число:");

        String num;
        if(scanner.hasNext()){
            num = scanner.next();
            if (!Arrays.asList(roma).contains(num)) {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                num = getStr();
            }

        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            num = getStr();
        }
        return num;
    }

    public char getOperation(){

        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            operation = getOperation();
        }
        return operation;
    }
}
