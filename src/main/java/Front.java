import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.stream.StreamSupport;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class Front {

    public static void main(String args[])
    {
        System.out.println("Enter your choice for calculation \n 1. Square Root \n 2. Factorial Function \n 3.Natural Log (Base e \n 4. Power Function \n");

        Scanner sc = new Scanner(System.in);
        Integer n= sc.nextInt();
        switch (n)
        {
            case 1: calcsqroot();
                break;
            case 2: calcfact();
                break;
            case 3: calcnatlog();

                break;
            case 4: calcpower();
                break;
        }
    }

    private static void calcpower() {
        Integer x, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number whose power is to be calculated");
        x=sc.nextInt();

        System.out.println("Enter power to be calculated");
        b=sc.nextInt();
        Double op = pow(x,b);
        System.out.println("Output is :" + op);
    }

    private static void calcnatlog() {
        Double x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number whose power is to be calculated");
        x=sc.nextDouble();

        Double op = log(x);
        System.out.println("Output is :" + op);
    }

    private static void calcfact() {
        Integer x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number whose power is to be calculated");
        x=sc.nextInt();
        Integer op = 1;

        for(Integer i = x; i>=1; i--)
        {
            op*= i;
        }

        System.out.println("Output is :" + op);

    }

    private static void calcsqroot() {
        Double x, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number whose power is to be calculated");
        x=sc.nextDouble();

        System.out.println("Enter power to be calculated");
        b=sc.nextDouble();
        Double op = pow(x,1/b);
        System.out.println("Output is :" + op);

    }
}
