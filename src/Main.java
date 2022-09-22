public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int vklad1 = 29000;
        int sum1 = 0;
        for (int i = 1; i <= 12; i++ ){
            sum1 = sum1 + vklad1;
            System.out.printf ("Месяц %d, сумма накоплений равна %d рублей\n", i, sum1);
        }
        //Задание 2
        System.out.println("Задание 2");
        int vklad2 = 29000;
        int sum2 = 0;
        for (int i = 1; i <= 12; i++ ){
            sum2=sum2 +sum2/100 +vklad2;
            System.out.printf ("Месяц %d, сумма накоплений равна %d рублей\n", i, sum2);
        }
    }
}