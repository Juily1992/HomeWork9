import com.sun.jdi.connect.IllegalConnectorArgumentsException;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Collections;
import java.io.FileInputStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        // Task 1
        System.out.println("Задача 1");
        Scanner numberPayments = new Scanner(System.in);
        System.out.println("Введите количество трат за месяц ");
        int size = numberPayments.nextInt();
        int payment[] = new int[size];
        System.out.println("Введите суммы трат: ");
        int sum = 0;
        for (int i : payment) {
            i++;
            payment[i] = numberPayments.nextInt();
            sum += payment[i];
        }
        System.out.println("Cумма трат за месяц =  " + sum);


        // Task 2
        System.out.println("  ");
        System.out.println("Задача 2");
        Scanner minMaxWastes = new Scanner(System.in);
        System.out.println("Введите количество трат за месяц ");
        int numberWastes = minMaxWastes.nextInt();
        int wastes[] = new int[numberWastes];
        System.out.println("Введите суммы трат: ");
        int max = wastes[0];
        int min = wastes[0];
        for (int i : wastes) {
            wastes[i] = minMaxWastes.nextInt();
            if (wastes[i] > max) {
                max = wastes[i];

            }
            if (wastes[i] < max & wastes[i] != 0) {
                min = wastes[i];
            }
        }
        System.out.println("Максимальная выплата равна " + max);
        System.out.println("Минимальная выплата равна " + min);


        //Task 3
        System.out.println("  ");
        System.out.println("Задача 3");
        Scanner numberSum = new Scanner(System.in);
        System.out.println("Введите количество трат за месяц ");
        int number = numberSum.nextInt();
        int averageSum[] = new int[number];
        System.out.println("Введите суммы трат: ");
        int summ = 0;
        for (int i : averageSum) {
            averageSum[i] = numberSum.nextInt();
            summ += averageSum[i];
        }
        System.out.println("Среднее арифметическое выплат равно " + (double) summ / averageSum.length);


        //Task 4
        System.out.println("  ");
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.print("Имя сотрудника - ");
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }


}

