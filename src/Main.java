public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10 ; i++){
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int t = 10; t >0; t--){
            System.out.println(t);
        }
        System.out.println("Задача 3");
        for (int y = 0 + 2; y <= 17 ; y += 2 ){
            System.out.println(y);
        }
        System.out.println("Задача 4");
        for (int q = 10; q >= -10; q--){
            System.out.println(q);
        }
        System.out.println("задача 5");
        for (int h = 1904; h <= 2096; h += 4){
            System.out.println(h + " год является високосным");
        }
        System.out.println("Задача 6");
        for (int x =7; x <= 98; x +=7){
            System.out.println(x);
        }
        System.out.println("Задача 7");
        for (int k = 1; k <= 512; k *=2){
            System.out.println(k);
        }
        System.out.println("задача 8");
        int accumulationMonth = 29000;
        int accumulationTotal = 0;
        for (int c = 1; c <=12; c ++) {
            accumulationTotal = accumulationTotal + accumulationMonth;
            System.out.println("Месяц " + c + " , сумма накоплений равна "
                    + accumulationTotal + " рублей.");
        }
        System.out.println("Сумма годовых накоплений равна " + accumulationTotal + " рублей");
        System.out.println("Задача 9");
        int accumulationMonthSalary = 29000;
        int accumulationTotalSalary = 0;
        for (int c = 1; c <=12; c = c + 1) {
            accumulationTotalSalary = accumulationMonthSalary/100;
            System.out.println("Месяц " + c + " , сумма накоплений равна " + accumulationTotalSalary
                    + " рублей.");
            }
        int resultSalary = accumulationTotal + accumulationTotalSalary*12;

        System.out.println("Сумма годовых накоплений отложенных под 12% равна "
                + resultSalary + " рублей.");
        System.out.println("задача 10");
        int two = 2;
        int result = 0;
        for (int s = 1; s <= 10; s  ++){
            result = two * s;
            System.out.println(" 2 * " + s + " = " + result);
        }
    }
}