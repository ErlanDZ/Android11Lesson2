package com.company;

public class Main {
    public static void main(String[] args) {
        int number = 6;

        if (number == 10){
            System.out.println("десять");
        }
        else if (number == 9){
            System.out.println("девять");
        }
        else if (number == 8){
            System.out.println("восемь");
        }
        else if (number == 7){
            System.out.println("семь");
        }
        else if (number == 6){
            System.out.println("шесть");
        }

       else if (number == 5){
            System.out.println("пять");
        }
        else if (number == 4){
            System.out.println("черыре");
        }
        else {
            System.out.println("числа нету");
        }

        switch (number){
            case 10:
                System.out.println("десять 1000");
                break;

            case 9:
                System.out.println("девять 9999");
                break;
            case 8:
                System.out.println("восемь");
                break;
            case 7:
                System.out.println("семь");
                break;
            case 6:
                System.out.println("шесть");
                break;
            case 5:
                System.out.println("пять");
                break;
            case 4:
                System.out.println("черыре");
                break;
            default:System.out.println("числа нету");

               boolean mama = false;
               boolean papa = false;

//               if (mama || papa){
//                   System.out.println("можно домой");
//               }

               boolean A = false;
               boolean B = true;
//               if (!A  &   B  ||   papa ) {
//                   System.out.println("свадьба");
//               }
//        System.out.println("Утром");
//       tea();
//
//        System.out.println("Обед");
//        tea();
//
//        System.out.println("Вечер");
//        tea();

        //System.out.println(getSquare());
//        System.out.println("Площадь прямоугольника " + getSquares(10, 20));
//        System.out.println("Площадь прямоугольника " + getSquares(225, 65));

       // swapFunction(10, 5);


    }

    public static void tea(){
        System.out.println("Наливаем воду в чайник");
        System.out.println("Включаем чайник");
        System.out.println("Насыпаем заварку");
        System.out.println("Наливаем кипяток в заварку");
        System.out.println("Наливаем чай");
        System.out.println("Добавляем сахар");
        System.out.println("Пьем чай");
        jump();

    }

    //Метод возвращающий без параметров
    public static int getSquare(){
        return 3 * 5;
    }

    ////Метод возвращающий с параметрами
    public static int getSquares(int a, int b){

        return a * b;

    }
    public static   void jump() {
        System.out.println("Прыг-скок!");
    }


    public static void swapFunction(int d, int s) {
        System.out.println("До замены: a = " + d + " b = " + s);
        int c = d;
        d = s;
        s = c;
        System.out.println("После замены: a = " + d + " b = " + s);
    }
}
