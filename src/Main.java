public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        int salaryI = 15_000;
        int totalBank = 0;
        int month = 1;
        while (totalBank < 2_459_000) {
            totalBank = totalBank + salaryI;
            totalBank = totalBank + totalBank / 100;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", month, totalBank);
            month++;
        }
        System.out.println();

        System.out.println("Task 2");

        int counter = 0;
        while (counter < 10) {
            counter++;
            System.out.print(counter + " ");
        }
        System.out.println();
        for (; counter >= 1; counter--) {
            System.out.print(counter + " ");
        }

        System.out.println();

        System.out.println("Task 3");

        int population = 12_000_000;
        int birthRate;
        int deathRate;
        for (int year = 1; year <= 10; year++) {
            birthRate = population / 1000 * 17;
            deathRate = population / 1000 * 8;
            population += birthRate - deathRate;
            System.out.printf("Год %s, численность населения составляет %s%n", year, population);
        }

        System.out.println();

        System.out.println("Task 4");
        double vasyaPercent = 1.07;
        double vasyaDeposit = 15_000;
        int vasyaMonth = 1;
        while (vasyaDeposit < 12_000_000) {
            vasyaDeposit *= vasyaPercent;
            System.out.printf("Month: %s, deposit: %.2f%n", vasyaMonth, vasyaDeposit);
            vasyaMonth++;
        }

        System.out.println();

        System.out.println("Task 5");
        double vasyaPercent1 = 1.07;
        double vasyaDeposit1 = 15_000;
        int vasyaMonth1 = 1;
        while (vasyaDeposit1 < 12_000_000) {
            vasyaDeposit1 *= vasyaPercent1;
            if (vasyaMonth1 % 6 == 0) {
                System.out.printf("Month: %s, deposit: %.2f%n", vasyaMonth1, vasyaDeposit1);
            }
            vasyaMonth1++;
        }

        System.out.println();

        System.out.println("Task 6");

        vasyaDeposit1 = 15_000;
        int targetMonthAmount = 9 * 12;
        for (int i = 1; i <= targetMonthAmount; i++) {
            vasyaDeposit1 *= vasyaPercent1;
            if (i % 6 == 0) {
                System.out.printf("Month: %s, deposit: %.2f%n", i, vasyaDeposit1);
            }
        }

        System.out.println();

        System.out.println("Task 7");

        int firstFriday = 2;
        for (int i = firstFriday; i < 31; i += 7) {
            System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет.%n", i);
        }

        System.out.println();

        System.out.println("Task 8");

        int period = 79;
        int currentYear = 2024;
        int lowerBorder = currentYear - 200;
        int upperBorder = currentYear + 100;
        for (int i = 0; i < upperBorder; i++) {
            if (i > lowerBorder && i % period == 0) {
                System.out.println(i);
            }
        }

    }
}