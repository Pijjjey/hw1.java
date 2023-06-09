import java.util.Scanner;

public class HW{
    public static void main(String args[]) {
        //triangle();
        //factorial();
        //nums();
        calculator();

    }
    //Вычислить n-ое треугольного число
        static void triangle (){
        int n = 9;
        int trian = 1;
        int x = 1;

        while(x < n){
            x++;
            trian = trian + x;
        }

        System.out.println(trian);
        }
    
    // n!
        static void factorial(){
            int n = 5;
            int fact = 1;
            int x = 1;

            while(x<n){
                x++;
                fact = fact * x;
            }

            System.out.println(fact);
        }

    // Вывести все простые числа от 1 до 1000
        static void nums(){
            int x = 0;
            int y = 1000;
            while(x < y){
                x++;
                System.out.print(x + " ");

            }

        }

    //Реализовать простой калькулятор
       
    public static void calculator()
    {
        int num1;
        int num2;
        String operation;


        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        num1 = sc.nextInt();

        System.out.println("Введите второе число: ");
        num2 = sc.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Введите операнд: ");
        operation = op.next();

        if ( (operation.equals("+")))
        {
            System.out.println((num1 + num2));
        }
        if  ( (operation.equals("-")))
        {
            System.out.println((num1 - num2));
        }

        if ( (operation.equals("/")))
        {
            System.out.println((num1 / num2));
        }
        if ( (operation.equals("*")))
        {
            System.out.println((num1 * num2));
        }
    }
}
        