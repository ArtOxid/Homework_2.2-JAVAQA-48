public class Main {
    public static void main(String[] args) {
        int addAccount = 1000;        // сумма пополнения счета
        int startAccount = 100;       // изначальная сумма на счету
        int bonus = addAccount / 100; // бонус за пополнение счета
        if (addAccount < 1000) {
            bonus = 0;
        }
        int result = startAccount + addAccount + bonus;

        System.out.println(result);
    }
}