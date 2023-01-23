public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }


    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.6;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var boxerWeight1=78.2;
        var boxerWeight2=82.7;
        var boxerTotalWeight= boxerWeight2+boxerWeight1;
        System.out.println("Общий вес боксеров "+boxerTotalWeight+" кг.");
        var diffBoxerWeight= boxerWeight2-boxerWeight1;
        System.out.println("Разница между весом бойцов " +diffBoxerWeight +" кг.");
    }
    public static void task7() {
        System.out.println("Задача 7");
        var boxerWeight1=78.2;
        var boxerWeight2=82.7;
        var diffBoxerWeight1= boxerWeight2-boxerWeight1;
        System.out.println("Вычитание -Разница между весом бойцов  " +diffBoxerWeight1 +" кг.");
        var diffBoxerWeight2=boxerWeight2%boxerWeight1;
        System.out.println("Остаток от деления- Разница между весом бойцов " +diffBoxerWeight2 +" кг.");

    }public static void task8() {
        System.out.println("Задача 8-1");
        var sumTime= 640;
        var eachTime =8;
        var totalWorkers= sumTime/eachTime;
        System.out.println("Всего работников в компании- "+totalWorkers+" человек.");
        System.out.println("Задача 8-2");
        totalWorkers=totalWorkers+94;
        sumTime=totalWorkers*eachTime;
        System.out.println(sumTime);
        System.out.println("Если в компании работает " +totalWorkers+" человек, то всего "+sumTime+" часов работы может быть поделено между сотрудниками");
    }


}