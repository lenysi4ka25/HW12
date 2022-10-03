import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        leapYear(2024);
        System.out.println("Задача 2");
        Device(1, 2019);
        System.out.println("Задача 3");
        int deliveryDays = calculatedeliveryDays(60);
        System.out.println("Потребуется дней: " + deliveryDays);
    }
    public static void leapYear (int year) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным.");
        }
        else {
            System.out.println(year + " не является високосным.");
            }
}

    public static void Device(int deviceType, int deviceYear) {
        if (deviceType != 1 && deviceType != 0) {
            throw new IllegalArgumentException("Wrong device type");
        }
        int currentYear = LocalDate.now().getYear();
        if (deviceYear > currentYear) {
            throw new IllegalArgumentException("Wrong device year");
        }
        String osString = deviceType == 0 ? "IOS" : "Android";
        String versionString = deviceYear > 2015 ? "полную" : "облегченную";
        System.out.printf ("Установите %s версию для %s по ссылке%n", versionString, osString);
    }
    public static int calculatedeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) deliveryDistance / 40) + 1;
        }
    }
}