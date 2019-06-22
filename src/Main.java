import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFlag = false;
        int n1 = 0;
        int n2 = 0;
        String s1 = null;
        String s2 = null;

        char ch;

        System.out.println("Введить число один");
        if (scanner.hasNextInt()) {
            n1 = scanner.nextInt();
            System.out.println("Введить число два");
            n2 = scanner.nextInt();
            isFlag = true;
        } else if (scanner.hasNext()) {
            s1 = scanner.next();
            System.out.println("Введить число два");
            s2 = scanner.next();
        }
        System.out.println("Введить операцию");
        ch = scanner.next().charAt(0);

        ArabicCal cal = new ArabicCal();
        RomanCal rom = new RomanCal();

        if (isFlag) {
            cal.calculator(n1, n2, ch);
        } else {
            rom.calculator(s1, s2, ch);
        }


    }
}
