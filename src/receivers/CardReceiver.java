package receivers;

import interfaces.PaymentReceiver;

import java.util.Scanner;

public class CardReceiver implements PaymentReceiver {
    private final Scanner scanner = new Scanner(System.in);


    @Override
    public boolean processPayment() {
        System.out.println("Введите номер карты: ");
        String cardNumber = scanner.nextLine();

        System.out.println("Введите одноразовый пароль (OTP): ");
        String otp = scanner.nextLine();

        if (cardNumber.length() == 16 && otp.equals("1234")) {
            System.out.println("Оплата по карте прошла успешно.");
            return true;
        } else {
            System.out.println("Ошибка оплаты картой.");
            return false;
        }
    }
}
