package org.example;

import java.util.Scanner;

public class AppJava {
    public static void main(String[] args) {

        long s_num;
        double d;
        boolean Assert=false;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        d = in.nextDouble();
        System.out.print("Введите второе число число: ");
        s_num = in.nextByte();
        System.out.print("Введите оператор: ");
        //Следующая строка необходима для предотвращения ошибки ввода данных
        String operator1 = in.nextLine();
        //
        String operator = in.nextLine();
        double result = GetResult(d,s_num,operator);
        if (operator.equals("/")&&(s_num==0)){
            System.out.println("Результат: выражение недействительно");
        }else{
            System.out.println("Результат: " + result);
        }
        if (result>0){
            Assert=true;
        }else if (result<0){
            Assert=false;
        }

        if (Assert){
            System.out.println("Полученное число больше нуля");
        }else{
            System.out.println("Полученное равно нулю или меньше его");
        }



        int i_max,i_min;
        i_max = Integer.MAX_VALUE;
        i_min = Integer.MIN_VALUE;
        System.out.println("Максимальное значения типа данных Integer: " + i_max);
        System.out.println("Максимальное значения типа данных Integer: " + i_min);
        long l_max,l_min;
        l_max = Long.MAX_VALUE;
        l_min = Long.MIN_VALUE;
        System.out.println("Максимальное значения типа данных Long: " + l_max);
        System.out.println("Максимальное значения типа данных Long: " + l_min);
        short s_max,s_min;
        s_max = Short.MAX_VALUE;
        s_min = Short.MIN_VALUE;
        System.out.println("Максимальное значения типа данных Short: " + s_max);
        System.out.println("Максимальное значения типа данных Short: " + s_min);
        byte b_max,b_min;
        b_max = Byte.MAX_VALUE;
        b_min = Byte.MIN_VALUE;
        System.out.println("Максимальное значения типа данных Byte: " + b_max);
        System.out.println("Максимальное значения типа данных Byte: " + b_min);
        double d_max,d_min;
        d_max = Double.MAX_VALUE;
        d_min = Double.MIN_VALUE;
        System.out.println("Максимальное значения типа данных Double: " + d_max);
        System.out.println("Максимальное значения типа данных Double: " + d_min);
        float fl_max, fl_min;
        fl_max = Float.MAX_VALUE;
        fl_min = Float.MIN_VALUE;
        System.out.println("Максимальное значения типа данных float: " + fl_max);
        System.out.println("Максимальное значения типа данных float: " + fl_min);



    }

        static double GetResult(double first_num, long second_num,String operator ){
        double res;
            switch (operator) {
                case "+" -> {
                    res = first_num + second_num;
                    return res;
                }
                case "-" -> {
                    res = first_num - second_num;
                    return res;
                }
                case "*" -> {
                    res = first_num * second_num;
                    return res;
                }
                case "/" -> {
                    if (second_num == 0) {
                        System.out.println("Деление на ноль невозможно!");
                    }
                    res = first_num / second_num;
                    return res;
                }
                default -> System.out.println("Введен неверный оператор");
            }
            return res=0;
        }



    }

