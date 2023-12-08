package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        float b = 1000.5F; //4 байта
        char sym = 'a';
        long l = 3_000_000_000L;
        double c = 919.5; //8 байт
        boolean bool = true;

        System.out.println(a + " " + b + " " + c);
        System.out.println(sym + " " + l);
        System.out.println(bool);
        String str1 = "Число: ";
        int e = 300_000;
        System.out.println(str1 + e);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        if ((c > 900) || (a < 1000)) {
            System.out.println("The condition is fulfilled"); //инструмент "короткого замыкания" - не будет проверять
                                                              //второе условие, если первое выполняется, т.е. будет работать быстрее
        }
        if ((c > 900) | (a < 1000)) {
            System.out.println("The condition is fulfilled");
        }

        int nv = 10;
        int count = 0;
        while (nv > 5) {
            count++;
            nv--;
            System.out.println(count);
        }

        int val1 = 10;
        int val2 = 16;
        System.out.println(calculate(val1, val2));
        printAll(5, 5, 10);
    }
    public static int calculate(int a, int b){
        return (a+b)/2;
    }

    public static void printAll(int a, int b, int c){
        System.out.println(a + " " + b + " " + c);
    }
}