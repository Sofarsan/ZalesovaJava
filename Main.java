import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc1.nextInt();
        if (a > 7){
            System.out.println("Привет");
        }

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String str = sc2.nextLine();
        if(str.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");
        }

        System.out.println("Введите размер массива: ");
        int size = sc1.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc1.nextInt();
        }
        System.out.println("Вывод элементов кратных 3: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }

        //[((())()(())]] - не является правильной, [[((())()(()))]] - правильная скобочная последовательность
    }
}