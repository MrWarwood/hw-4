public class Main {
    public static void main(String[] args) {
        System.out.println("  Задача №1.");
        int are = 19;
        int are2 = 17;
        if ( are >= 18 ) {
            System.out.println("Если возраст человека равен " + are + " лет ,то он совершеннолетний. " );
        }else{
            System.out.println("Если возраст человека равен " + are + " лет ,то он не достиг совершеннолетия," +
                    " нужно немного подождать.");}
        if ( are2 >= 18 ) {
            System.out.println("Если возраст человека равен " + are2 + " лет ,то он совершеннолетний." );
        }else{
            System.out.println("Если возраст человека равен " + are2 + " лет ,то он не достиг совершеннолетия," +
                    " нужно немного подождать.");}


        System.out.println( );
        System.out.println("  Задача №2.");
        int temperature1 = 2;
        int temperature2 = 7;
        if ( temperature1 <= 5) {
            System.out.println("На улице " + temperature1 + " градусов ,то нужно надеть шапку.");
        }else {
            System.out.println("На улице " + temperature1 + " градусов ,то можно идти без шапки.");}
        if ( temperature2 <= 5) {
            System.out.println("На улице " + temperature2 + " градусов ,то нужно надеть шапку.");
        }else {
            System.out.println("На улице " + temperature2 + " градусов ,то можно идти без шапки.");}


        System.out.println( );
        System.out.println("  Задача 3.");
        int speed1 = 49;
        int speed2 = 67;
        if (speed1 >= 60){
            System.out.println("Если скорость " + speed1 + " км/ч ,то придется заплатить штраф."); }else {
            System.out.println("Если скорость " + speed1 + " км/ч ,то можно ездить спокойно.");}
        if (speed2 >= 60){
            System.out.println("Если скорость " + speed2 + " км/ч ,то придется заплатить штраф.");}else {
            System.out.println("Если скорость " + speed2 + " км/ч ,то можно ездить спокойно.");}

        System.out.println( );
        System.out.println("  Задача №4.");
        int fil = 3;
        int bil = 15;
        int robert = 21;
        int andrye = 27;
        boolean kindergarte = fil >=2 && fil <=6;
        boolean school = bil >=7 && bil <=17;
        boolean universiti = robert >=18 && robert <=24;
        if (kindergarte){
            System.out.println("Если возраст человека равен " + fil + " , то ему нужно ходить в детский сад.");}
        if (school){
            System.out.println("Если возраст человека равен " + bil + " , то ему нужно ходить в школу.");}
        if (universiti){
            System.out.println("Если возраст человека равен " + robert + " , то ему нужно ходить в университет.");}
        if (andrye >=24){
            System.out.println("Если возраст человека равен " + andrye + " , то ему нужно ходить на работу.");}

        System.out.println( );
        System.out.println("  Задача 5.");
        int ageOfTheChild1 = 4;
        int ageOfTheChild2 = 8;
        int ageOfTheChild3 = 15;
        if ( ageOfTheChild1 < 5 ){
            System.out.println("Если возраст ребенка равен " + ageOfTheChild1 +
                    " , то ему нельзя кататься на аттракционе.");}
        if ( ageOfTheChild2 > 5 && ageOfTheChild2 < 14 ){
            System.out.println("Если возраст ребенка равен " + ageOfTheChild2 +
                    " , то ему можно кататься на аттракционе в сопровождении.");}
        if ( ageOfTheChild3 > 14 ){
            System.out.println("Если возраст ребенка равен " + ageOfTheChild3 +
                    " , то ему можно кататься без сопровождения взрослого.");}else{
            System.out.println("Если возраст ребенка равен " + ageOfTheChild3 +
                    " ,но не младше 5, то ему можно кататься на аттракционе в сопровождении.");}

        System.out.println( );
        System.out.println("  Задача №6.");
        int trainCapacity = 102;
        int sitting = 60;
        int trainStop1 = 10;
        if (trainStop1 < 60){
            System.out.println("Если в вагоне на первой остановке "+ trainStop1 +
                    " человек ,то в нем остались и сидячие и сточие места."  );}
        boolean standingPlaces = (trainStop1 >=60&&trainStop1 <=102);
        if (standingPlaces){
            System.out.println("Если в вагоне на первой остановке "+ trainStop1+
                    " человек ,то в нем остались только стоячие места.");}
        else  if (trainStop1> 102){
            System.out.println("Если в вагоне на первой остановке "+ trainStop1 +
                    " человек ,то в нем не осталось мест. ");}

        System.out.println( );
        System.out.println("  Задание №7.");
        int one = 2;
        int two = 1;
        int three = 3;
        boolean oneIsBiggest = one>two && one>three;
        boolean twoIsBiggest = two>one && two>three;
        if (oneIsBiggest){
            System.out.println("Чисто один больше всех.");}else if (twoIsBiggest) {
            System.out.println("Число два болеше всех.");} else{
            System.out.println("Число три больше всех."); }


    }
}