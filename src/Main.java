public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1();

        //task2
        float var1 = 27.12f;
        long var2 = 987678965549L;
        float var3 = 2.786f;
        short var4 = 569;
        short var5 = -159;
        int var6 = 27897;
        byte var7 = 67;
        System.out.println();
        System.out.println("Задание 3");
        task3();
        System.out.println();
        System.out.println("Задание 4");
        task4();
        System.out.println();
        System.out.println("Задание 5");
        task5();
        System.out.println();
        System.out.println("Задание 6");
        task6();
        System.out.println();
        System.out.println("Задание 7");
        task7();
        System.out.println();
        System.out.println("Задание 8");
        task8();
    }

    public static void task1(){
        int iVar = 1;
        byte bVar = 1;
        short shVar = 1;
        long lVar = 123L;
        float fVar = 1.35f;
        double dVar = 1.37d;

        System.out.println("Значение переменной iVar с типом int равно "+iVar);
        System.out.println("Значение переменной bVar с типом byte равно "+bVar);
        System.out.println("Значение переменной shVar с типом short равно "+shVar);
        System.out.println("Значение переменной lVar с типом long равно "+lVar);
        System.out.println("Значение переменной fVar с типом float равно "+fVar);
        System.out.println("Значение переменной dVar с типом double равно "+dVar);
    }

    public static void task3(){
        byte classLudPav = 23;
        byte classAnnSer = 27;
        byte classEkAnd = 30;
        int res =  480 / (classLudPav + classAnnSer + classEkAnd);
        System.out.println("На каждого ученика рассчитано "+res+" листов бумаги");
    }

    public static void task4(){
        byte countBotl = 16;
        byte time = 2;
        int bottlePerMin = countBotl/time;
        int bottleIn20Mins = bottlePerMin*20;
        int bottlePerDay = bottlePerMin*60*24;
        int bottleIn3Day = bottlePerDay*3;
        int bottlePerMonth = bottlePerDay*30;
        System.out.println("За 20 минут машина произвела "+bottleIn20Mins+" штук бутылок");
        System.out.println("За сутки машина произвела "+bottleIn20Mins+" штук бутылок");
        System.out.println("За 3 суток машина произвела "+bottleIn3Day+" штук бутылок");
        System.out.println("За месяц машина произвела "+bottlePerMonth+" штук бутылок");
    }

    public static void task5(){
        byte dyeCan = 120;
        byte whiteForClass = 2;
        byte brownForClass = 4;
        int countClass = dyeCan / (whiteForClass+brownForClass);
        int whiteColorCan = whiteForClass*countClass;
        int brownColorCan = brownForClass*countClass;

        System.out.println("В школе, где "+countClass+" классов, нужно "+whiteColorCan+
                " банок белой краски и "+brownColorCan+" банок коричневой краски");
    }

    public static void task6(){
        byte bananaCount = 5;
        byte bananaWeight = 80;
        short milkMl = 200;
        byte milkWeight = 105;
        byte iceCreamCount = 2;
        byte iceCreamWeight = 100;
        byte eggCount = 2;
        byte eggWeight = 100;

        int recipeWeightGr = bananaCount*bananaWeight+milkMl*milkWeight+
                iceCreamCount*iceCreamWeight+eggCount*eggWeight;

        float recipeWeightKg = (float) recipeWeightGr / 1000;

        System.out.println("Вес рецепта в граммах "+recipeWeightGr);
        System.out.println("Вес рецепта в килограммах "+recipeWeightKg);
    }

    public static void task7(){
        byte decrWeightKg = 7;
        short minLoose = 250;
        short maxLoose = 500;
        int maxDays = decrWeightKg*1000/minLoose;
        int minDays = decrWeightKg*1000/maxLoose;
        float averDays = (float) (minDays+maxDays)/2;

        System.out.println("При минимальных потерях "+maxDays+" дней");
        System.out.println("При максимальных потерях "+minDays+" дней");
        System.out.println("В среднем "+averDays+" дней");
    }

    public static void task8(){
        int mashaSal = 67760;
        int denisSal = 83690;
        int krisSal = 76230;
        float incr = 0.1f;

        int mashaSalYear = mashaSal*12;
        int denisSalYear = denisSal*12;
        int krisSalYear = krisSal*12;

        int newMashaSalYear = (int) (mashaSalYear+mashaSalYear*incr);
        int newDenisSalYear = (int) (denisSalYear+denisSalYear*incr);
        int newKrisSalYear = (int) (krisSalYear+krisSalYear*incr);

        int diffMashaSalYear = newMashaSalYear-mashaSalYear;
        int diffDenisSalYear = newDenisSalYear-denisSalYear;
        int diffKrisSalYear = newKrisSalYear-krisSalYear;

        System.out.println("Маша теперь получает "+newMashaSalYear+
                " рублей. Годовой доход вырос на "+diffMashaSalYear+" рублей");
        System.out.println("Маша теперь получает "+newDenisSalYear+
                " рублей. Годовой доход вырос на "+diffDenisSalYear+" рублей");
        System.out.println("Маша теперь получает "+newKrisSalYear+
                " рублей. Годовой доход вырос на "+diffKrisSalYear+" рублей");
    }
}