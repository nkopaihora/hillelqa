import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 1: Программа, где надо ввести число на выбор: 1, 2 или 3");
        System.out.println("Способ 1: Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        if (i == 1) {
            System.out.println("Вы ввели число: 1");
        } else if (i == 2) {
            System.out.println("Вы ввели число: 2");
        } else if (i == 3) {
            System.out.println("Вы ввели число: 3");
        } else {
            System.out.println("Вы ввели другое число");
        }
        System.out.println("Способ 2: Введите еще раз число 1, 2 или 3: ");
        Scanner inputFigur = new Scanner(System.in);
        int a = inputFigur.nextInt();
        switch (a) {
            case 1:
                System.out.println("Вы ввели число 1"); break;
            case 2:
                System.out.println("Вы ввели число 2"); break;
            case 3:
                System.out.println("Вы ввели число 3"); break;
            default:
                System.out.println("Вы ввели другое число"); break;
        }

        System.out.println("ЗАДАЧА 2: вывести на экран числа от 5 до 1. На экране должно быть: 5 4 3 2 1");
        int number = 5;
        while (number>=0){
            System.out.println(number);
            number--;
        }

        System.out.println("ЗАДАЧА 3: Необходимо вывести на экран таблицу умножения на 3");
        for (int number1=1; number1<=10; number1++){
            int multiply=3;
            System.out.println("3*" + number1 + "=" + (multiply*number1));
        }
        System.out.println("ЗАДАЧА 4: Найти среднее значение суммы чисел от 1 до 100");
        double sum = 0;
        for (int s = 1; s <= 100; s++) {
            sum = sum + s;
        }
        System.out.println(sum / 100);
    }
}




