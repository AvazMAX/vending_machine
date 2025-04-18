package receivers;

import interfaces.PaymentReceiver;
import java.util.Scanner;

public class CardReceiver implements PaymentReceiver {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public int processPayment() {
        String cardNumber;
        while (true) {
            System.out.print("Введите номер карты (16 цифр): ");
            cardNumber = scanner.nextLine().trim();
            if (cardNumber.length() == 16 && cardNumber.matches("\\d+")) {
                break;
            } else {
                System.out.println("Некорректный номер карты. Попробуйте снова.");
            }
        }

        int otp;
        while (true) {
            System.out.print("Введите одноразовый пароль (OTP): ");
            String input = scanner.nextLine();
            try {
                otp = Integer.parseInt(input);
                if (otp == 1234) {
                    System.out.println("Оплата по карте прошла успешно.");
                    return 100;
                } else {
                    System.out.println("Неверный OTP.");
                }
            } catch (NumberFormatException e) {
                System.out.println("OTP должен быть числом.");
            }
        }
    }
}