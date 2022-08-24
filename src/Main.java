public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte a = 1;
        int b = 2;
        short c = 3;
        long d = 4;
        float e = 5.5f;
        double f = 6;
        System.out.println("Значение переменной a c типом byte равно " + a);
        System.out.println("Значение переменной b c типом int равно " + b);
        System.out.println("Значение переменной c c типом short равно " + c);
        System.out.println("Значение переменной d c типом long равно " + d);
        System.out.println("Значение переменной e c типом float равно " + e);
        System.out.println("Значение переменной f c типом double равно " + f);

        //Задание 2
        byte aa = 67;
        int bb = 569;
        short cc = -157;
        long dd = 27897L;
        double ee = 27.12;
        double ff = 2.786;
        float gg = 13.1925f;
        boolean hh = false;

        //Задание 3
        int ludmilaPavlovnaStudents = 23;
        int annaSergeevnaStudents = 27;
        int ekaterinaAndreevnaStudents = 30;
        short paperSheets = 480;
        int allStudents = ludmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents;
        int paperSheetsForStudent = paperSheets / allStudents;
        System.out.println("На каждого ученика рассчитано " + paperSheetsForStudent + " листов бумаги");

        //Задание 4
        int bottlesPerMinute = 8;
        int bottlesPer20Minute = 8 * 20;
        int bottlesPer1Day = 8 * 1440;
        int bottlesPer3Day = bottlesPer1Day * 3;
        int bottlesPerMonth = bottlesPer3Day * 10;
        System.out.println("За 1 минуту машина произвела " + bottlesPerMinute + " бутылок");
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minute + " бутылок");
        System.out.println("За 1 день машина произвела " + bottlesPer1Day + " бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Day + " бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " бутылок");

        //Задание 5
        int classNumber = 120 / 6;
        int whitePaint = classNumber * 2;
        int brownPaint = classNumber * 4;
        System.out.println("В школе, где " + classNumber + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        //Задание 6
        int banana = 5;
        int bananaWeight = banana * 80;
        int milk = 200 / 100;
        int milkWeight = milk * 105;
        System.out.println(milkWeight);
        int icecream = 2;
        int icecreamWeight = icecream * 100;
        int eggs = 4;
        int eggsWeight = eggs * 70;
        int breakfastWeightInGr = bananaWeight + milkWeight + icecreamWeight + eggsWeight;
        System.out.println("Вес завтрака в граммах " + breakfastWeightInGr);
        int grPerKg = 1000;
        float breakfastInKg = breakfastWeightInGr/(float)grPerKg;
        System.out.println("Вес спорт-завтрака " + breakfastInKg + " кг");

        //Задание 7
        int overweight = 7 * 1000;
        int weightLoss500 = overweight / 500;
        System.out.println("Теряя по 500 грамм в день, спортсмен похудеет за " + weightLoss500 + " дней");
        int weightLoss250 = overweight / 250;
        System.out.println("Теряя по 500 грамм в день, спортсмен похудеет за " + weightLoss250 + " дней");
        int average = (weightLoss250 + weightLoss500) / 2;
        System.out.println(average);

        //Задание 8
        double salaryMasha = 67_760;
        double salaryDenis = 83_690;
        double salaryChristina = 76_230;
        double awardMasha = (salaryMasha / 100) * 10;
        double awardDenis = (salaryDenis / 100) * 10;
        double awardChristina = (salaryChristina / 100) * 10;
        double salaryAfterAwardMasha = salaryMasha + awardMasha;
        double salaryAfterAwardDenis = salaryDenis + awardDenis;
        double salaryAfterAwardChristina = (float)salaryChristina + awardChristina;
        System.out.println("Маша теперь получает " + salaryAfterAwardMasha + " рублей. Годовой доход вырос на " + awardMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryAfterAwardDenis + " рублей. Годовой доход вырос на " + awardDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryAfterAwardChristina + " рублей. Годовой доход вырос на " + awardChristina + " рублей");



    }
}