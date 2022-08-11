public class Main {
    public static void main(String[] args) {
        int balance = 10;
        int refillOfBalance = 1500;
        int bonus;
        if (refillOfBalance > 1000) {
            bonus = refillOfBalance / 100;
        } else {
            bonus = 0;
        }
        int totalBalance = balance + refillOfBalance + bonus;
        System.out.println("Начислено бонусов:" + bonus);
        System.out.println("Ваш баланс:" + totalBalance + " рублей.");
    }
}
