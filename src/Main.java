public class Main {
    public static void main(String[] args) {
        System.out.println("  Задача №1 исправлена.");
        int age = 9;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет ,то он совершеннолетний. ");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет ,то он не достиг совершеннолетия," +
                    " нужно немного подождать.");
        }

        System.out.println();
        System.out.println("  Задача №2 переделаная.");
        int temperature = 21;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов ,то нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов ,то можно идти без шапки.");
        }


        System.out.println();
        System.out.println("  Задача 3 переделаная.");
        int speed = 49;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч ,то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч ,то можно ездить спокойно.");
        }


        System.out.println();
        System.out.println("  Задача №4 переделаная.");
        int theAgePerson = 16;
        if (theAgePerson < 2) {
            System.out.println("Если возраст человека равен " + theAgePerson + " , то ему никуда не надо.");
        } else if (theAgePerson >= 2 && theAgePerson <= 6) {
            System.out.println("Если возраст человека равен " + theAgePerson + " , то ему нужно ходить в детский сад.");
        } else if (theAgePerson >= 7 && theAgePerson <= 17) {
            System.out.println("Если возраст человека равен " + theAgePerson + " , то ему нужно ходить в школу.");
        } else if (theAgePerson >= 18 && theAgePerson <= 24) {
            System.out.println("Если возраст человека равен " + theAgePerson + " , то ему нужно ходить в университет.");
        } else if (theAgePerson > 24) {
            System.out.println("Если возраст человека равен " + theAgePerson + " , то ему нужно ходить на работу.");
        }


        System.out.println();
        System.out.println("  Задача №5 переделаная.");
        int ageOfTheChild = 14;
        if (ageOfTheChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild +
                    " , то ему нельзя кататься на аттракционе.");
        } else if (ageOfTheChild >= 5 && ageOfTheChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild +
                    " , то ему можно кататься на аттракционе в сопровождении.");
        } else {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild +
                    " , то ему можно кататься без сопровождения взрослого.");
        }


        System.out.println();
        System.out.println("  Задача №6 переделанная.");
        int peopleInTheCarriage = 110;
        if (peopleInTheCarriage < 60) {
            System.out.println("Если в вагоне " + peopleInTheCarriage +
                    " человек ,то в нем остались и сидячие и сточие места.");
        } else if (peopleInTheCarriage >= 60 && peopleInTheCarriage <= 102) {
            System.out.println("Если в вагоне " + peopleInTheCarriage
                    + " человек ,то в нем остались только стоячие места.");
        } else {
            System.out.println("Если в вагоне " + peopleInTheCarriage +
                    " человек ,то в нем не осталось мест.");
        }


        System.out.println();
        System.out.println("  Задание №7.");
        int one = 2;
        int two = 1;
        int three = 3;
        boolean oneIsBiggest = one > two && one > three;
        boolean twoIsBiggest = two > one && two > three;
        if (oneIsBiggest) {
            System.out.println("Чисто один больше всех.");
        } else if (twoIsBiggest) {
            System.out.println("Число два болеше всех.");
        } else {
            System.out.println("Число три больше всех.");
        }


    }
}
