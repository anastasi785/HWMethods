public class Main {
    public static void main(String[] args) {
        int year = 2022;
        messageIsLeapYear(isLeapYear(year), year);
        int clientOS = 1;
        getClientOS(clientOS, year);
        int deliveryDistance = 95;
        deliveryTime(int deliveryDistance);

    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void messageIsLeapYear(boolean isLeapYear, int year) {
        if (isLeapYear) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }

    public static int getClientOS(int clientOS, int year) {
        if (clientOS != 0 || clientOS != 1 || year < 2000) {
            System.out.println("Переданы неверные параметры");

        }
        if (clientOS == 1 && year < 2022) {
            System.out.println("Установите облегчённую версию Android");
        }
        if (clientOS == 1 && year == 2022) {
            System.out.println("Установите обычную версию Android");
        }
        if (clientOS == 0 && year < 2022) {
            System.out.println("Установите облегченную версию IOS");
        }
        if (clientOS == 0 && year == 2022) {
            System.out.println("Установите обычную версию IOS");
        }
        return clientOS;


    }

    public static int deliveryTime(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуются 1 сутки");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 суток");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 суток");
        }
        return deliveryDistance;
    }
}







