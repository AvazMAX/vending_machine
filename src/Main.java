import receivers.CardReceiver;
import receivers.CoinReceiver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ оплаты");
        System.out.println("1 - card");
        System.out.println("2 - coin");

        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input == 1) {
                CardReceiver cardReceiver = new CardReceiver();
                AppRunner.run(cardReceiver);
            } else if (input == 2) {
                CoinReceiver coinReceiver = new CoinReceiver();
                AppRunner.run(coinReceiver);
            }
        }

        scanner.close();
    }
}