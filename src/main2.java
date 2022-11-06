import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result = 0;
        String usb;

        System.out.println("введите первое число");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextDouble();

        System.out.println("Введите второе число");
        num2 = scanner.nextDouble();

        System.out.println("укажите операцию");
        Scanner scanner1 = new Scanner(System.in);
        usb = scanner1.next();

       if (usb.equals("+")) {
           result = num1 + num2;
       }  else if(usb.equals("*")) {
           result = num1 * num2;
       } else if(usb.equals("/")) {
           result = num1 / num2;
       } else if(usb.equals("-")) {
           result = num1 - num2;
       }
       System.out.println(result);

               }
           }



