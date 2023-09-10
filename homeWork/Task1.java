package homeWork;

import java.util.Scanner;
import java.util.Scanner;
public class Task1 {


        public static void main(String[] args) {


            System.out.print("Введите количество строк: ");
            Scanner scanner = new Scanner(System.in);
            int countString = scanner.nextInt();
            String[] arr = new String[countString];
            System.out.println("Введите строки: ");
            for (int i = 0; i < countString; i++) {
                arr[i] = scanner.next();
            }
            scanner.close();



        }
    }


