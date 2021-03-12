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
            case 1:///calculate root
                Integer x;
                System.out.println("Enter a number whose root is to be calculated");
                x=sc.nextInt();
                Double op = calcsqroot(x);
                System.out.println("Output is :" + op);
                break;
            case 2:////Calculate Factorial
                Integer x1;
                System.out.println("Enter a number whose factorial is to be calculated");
                x1=sc.nextInt();
                Integer fact = calcfact(x1);
                System.out.println("Output is :" + fact);
                break;
            case 3:////calculate natural log
                Double x2;
                System.out.println("Enter a number whose natural log is to be calculated");
                x2=sc.nextDouble();
                Double nl =calcnatlog(x2);
                System.out.println("Output is :" + nl);
                break;
            case 4://///calculate power
                Integer n1, n2;
                System.out.println("Enter a number whose power is to be calculated");
                n1=sc.nextInt();
                System.out.println("Enter power to be calculated");
                n2=sc.nextInt();
                Double power = calcpower(n1,n2);
                System.out.println("Output is :" + power);
                break;
        }
    }

    static Double calcpower(Integer x, Integer b) {
        return pow(x,b);
    }

    static Double calcnatlog(Double x) {
        return log(x);
    }

    static Integer calcfact(Integer x) {
        Integer op = 1;
        for(Integer i = x; i>=1; i--)
            op*= i;
        return op;
    }

    static Double calcsqroot(Integer x) {
       return pow(x,1/2.0);
    }
}
