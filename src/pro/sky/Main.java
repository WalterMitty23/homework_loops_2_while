package pro.sky;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3For();
        task3While();
        task4();
        task5();
        task6();
        task7MyVision();
        task7For();
        task7While();
        task8();

    }

    public static void task1() {
        System.out.println("Task 1");
        int savings = 15000;
        int start = 0;
        int month = 0;
        while (start < 2_459_000) {
            start = start + savings;
            month++;
        }
        System.out.println("Потребуется " + month + " месяца для накопления " + start + "рублей");

    }
    public static void task2() {
        System.out.println("Task 2");
        int numbers = 1;
        while (numbers <= 10) {
            System.out.print(numbers + " ");
            numbers++;
        }

        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

    }

    public static void task3For() {
        System.out.println("\nTask 3 for");
        int population = 23_000_000;
        int death = 8;
        int birt = 17;
        int total = birt - death;
        int growt = population * total / 1000;
        for (int year = 1; year <=10; year++) {
            population = population + growt;

            System.out.println("Год " + year + " , численность населения составляет " + population);
        /* while (year <= 10) {
            year++;
            population = population * total;

            System.out.println(population);
        */
        }
    }

    public static void task3While() {
        System.out.println("Task 3 while");
        int population = 23_000_000;
        int death = 8;
        int birt = 17;
        int total = birt - death;
        int growt = population * total / 1000;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + growt;
            System.out.println("Год " + year + " , численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Task 4");
        int savings = 15000;
        float percent = savings * 0.07f;
        int start = 0;
        int month = 0;
        while (start <= 12_00_000) {
            start += (savings + percent);
            month++;
            System.out.println("Потребуется " + month + " месяца для накопления " + start + "рублей");

        }
    }

    public static void task5() {
        System.out.println("Task 5");
        int savings = 15000;
        float percent = savings * 0.07f;
        int start = 0;
        int month = 0;
        while (start <= 12_00_000) {
            start += (savings + percent);
            month++;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяца будет накоплений " + start + "рублей");

            }
        }
    }
    public static void task6() {
        System.out.println("Task 6");
        int years = 9;
        int inMonts = years * 12;
        int savings = 15000;
        float percent = savings * 0.07f;
        int start = 0;
        int month = 0;
        while (month <= inMonts) {
            start += (savings + percent);
            month++;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяца будет накоплений " + start + "рублей");
            }
        }
    }
    public static void task7MyVision() {
        /*
        Это если принять, что месяц начинается прям с понедельника
         */
        System.out.println("Task 7 the way I got it");

        int anyday = 26;
        boolean friday = anyday % 7 == 5;
        if (friday) {
            System.out.println("Сегодня " + anyday + " число и этъ пятница :)");
        } else {
            System.out.println("Сегодня " + anyday + " число и эть не пятница :(");
        }

    }

    public static void task7For() {
        System.out.println("Task 7 when FOR");
        int month = 31;
        for (int day = 1; day <= month; day++) {
            if (day % 7 == 5) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task7While() {
        System.out.println("Task 7 when WHILE");
        int month = 31;
        int day = 1;

        while (day <= month) {
            if (day % 7 == 5) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
            day++;
        }
    }
    public static void task8() {
        System.out.println("Task 8");
        int currentYear = 2023;
        int lastYears = currentYear - 200;
        int nextYear = currentYear + 100;
        for (int year = lastYears; year <= nextYear; year++) {
            if ((year % 79) == 0) {
                System.out.println(year);
            }
        }
    }
}