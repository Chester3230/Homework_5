public class Main {
    public static void main(String[] args) {

        // Задание 1

        int[] randomArray = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < randomArray.length; ++i) {
            sum = sum + randomArray[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + declinationOfRubles(sum));


        // Задание 2
        int[] payday = generateRandomArray();
        int max = 0;
        int min = payday[0];
        for (int i = 0; i < payday.length; ++i){
            if (max < payday[i]){
                max = payday[i];
            }
            if (min > payday[i]) {
                min = payday[i];
            }
        }


        System.out.println("Минимальная сумма трат за день составила "  + min + declinationOfRubles(min));
        System.out.println("Максимальная сумма трат за день составила " + max + declinationOfRubles(max));


        // Задание 3

        int day = 0;

        for (int i = 0; i < payday.length; ++i) {
            day = day + payday[i];
        }

        System.out.println("Cредняя сумма трат за месяц составила " + (double) day / payday.length );


        // Задание 4


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; --i){
            System.out.print(reverseFullName[i]);
        }

    }


    public static Object declinationOfRubles(int money){
        if (money % 10 == 1){
            return " рубль";
        }
        if (money % 10 >= 2 && money % 10 < 5){
            return " рубля";
        }
        return " рублей";
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
}