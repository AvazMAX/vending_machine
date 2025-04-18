package receivers;

import interfaces.PaymentReceiver;

import java.util.Scanner;

public class CardReceiver implements PaymentReceiver {
    private final Scanner scanner = new Scanner(System.in);


    @Override
    public boolean processPayment() {
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
            if (scanner.hasNextInt()) {
                otp = scanner.nextInt();
                if (otp == 1234) {
                    break;
                } else {
                    System.out.println("Неверный OTP.");
                }
            } else {
                System.out.println("OTP должен быть числом.");
                scanner.next();
            }
        }

        System.out.println("Оплата по карте прошла успешно.");
        return true;
    }
}
