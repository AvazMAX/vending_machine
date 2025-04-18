package receivers;

import interfaces.PaymentReceiver;

import java.util.Scanner;

public class CoinReceiver implements PaymentReceiver {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public boolean processPayment() {
        System.out.println("Вставьте монеты (введите сумму): ");
        double amount = scanner.nextDouble();
        if (amount >= 1.0) {
            System.out.println("Монеты приняты.");
            return true;
        } else {
            System.out.println("Недостаточно средств. Попробуйте снова.");
            return false;
        }
    }
}
