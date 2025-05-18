//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Home work while-for 2.");
        System.out.println("Задача 1. ");
        double totalSumPr = 0;
        int countMonth = 0;
        while (totalSumPr < 2459000) {
            countMonth = countMonth + 1;
            totalSumPr += 29000;
            totalSumPr += totalSumPr * 0.01;
        }
        System.out.println("Месяц " + countMonth + ", сумма накоплений равна " + totalSumPr + " рублей.");
        System.out.println("Задача 2. ");
        int i = 0;
        while (i < 10) {
            i += 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задача 3. ");
        int population = 12000000;
        for (i = 1; i <= 10; i++) {
            population += population / 1000 * 9;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        System.out.println("Задача 4. ");
        double totalSum = 15000;
        countMonth = 0;
        while (totalSum < 12000000) {
            countMonth += 1;
            totalSum += totalSum * 0.07;
            System.out.println("Месяц " + countMonth + ", сумма накоплений равна " + totalSum + " рублей.");
        }
        System.out.println("Итого потребуется " + countMonth + " месяцев");
        System.out.println("Задача 5. ");
        totalSum = 15000;
        countMonth = 0;
        while (totalSum < 12000000) {
            countMonth += 1;
            totalSum += totalSum * 0.07;
            if (countMonth % 6 == 0) {
                System.out.println("Месяц " + countMonth + ", сумма накоплений равна " + totalSum + " рублей.");
            }
        }
        System.out.println("Задача 6. ");
        totalSum = 15000;
        countMonth = 0;
        int totalMonth = 12*9;
        while (countMonth <= totalMonth) {
            countMonth += 1;
            totalSum += totalSum * 0.07;
            if (countMonth % 6 == 0) {
                System.out.println("Месяц " + countMonth + ", сумма накоплений равна " + totalSum + " рублей.");
            }
        }
        System.out.println("Задача 7. ");
        int dayFriday = 3;
        for (i = dayFriday; i <= 31; ) {
            System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет. ");
            i += 7;
        }
        System.out.println("Задача 8. ");
        int currentYear = 2025;
        int last200Year = currentYear-200;
        int next100Year = currentYear+100;
        int yearComet = (last200Year/79) * 79 ;
        if (yearComet < last200Year){
            yearComet+=79;
        }
        while (yearComet <= next100Year ) {
            System.out.println(yearComet);
            yearComet += 79;
        }
    }
}