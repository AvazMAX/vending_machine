package receivers;

import interfaces.PaymentReceiver;
import java.util.Scanner;

public class CoinReceiver implements PaymentReceiver {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public int processPayment() {
        System.out.println("Вставьте монеты (введите сумму): ");
        while (true) {
            try {
                int amount = Integer.parseInt(scanner.nextLine());
                if (amount >= 1) {
                    System.out.println("Монеты приняты.");
                    return (int) (amount);
                } else {
                    System.out.println("Минимальная сумма 1 сом. Попробуйте снова.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат суммы. Попробуйте снова.");
            }
        }
    }
}