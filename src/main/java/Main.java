import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.StreamSupport;

import static java.lang.Math.log;
import static java.lang.Math.pow;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String args[]) {
        while (true) {
            try {
                System.out.println("Enter your choice for calculation \n 1. Square Root \n 2. Factorial Function \n 3.Natural Log (Base e) \n 4. Power Function \n 5. exit\n");
                Scanner sc = new Scanner(System.in);
                Integer n = sc.nextInt();

                switch (n) {
                    case 1:///calculate root
                        Integer x;
                        System.out.println("Enter a number whose root is to be calculated");
                        x = sc.nextInt();
                        Double op = calcsqroot(x);
                        System.out.println("Output is :" + op);
                        break;
                    case 2:////Calculate Factorial
                        Integer x1;
                        System.out.println("Enter a number whose factorial is to be calculated");
                        x1 = sc.nextInt();
                        Integer fact = calcfact(x1);
                        System.out.println("Output is :" + fact);
                        break;
                    case 3:////calculate natural log
                        Double x2;
                        System.out.println("Enter a number whose natural log is to be calculated");
                        x2 = sc.nextDouble();
                        Double nl = calcnatlog(x2);
                        System.out.println("Output is :" + nl);
                        break;
                    case 4://///calculate power
                        Integer n1, n2;
                        System.out.println("Enter a number whose power is to be calculated");
                        n1 = sc.nextInt();
                        System.out.println("Enter power to be calculated");
                        n2 = sc.nextInt();
                        Double power = calcpower(n1, n2);
                        System.out.println("Output is :" + power);
                        break;
                }
            } catch (InputMismatchException e) {
                logger.error("Invalid input, Entered input is not a number/Double");
                System.out.println("Wrong Input");
            } catch (IllegalArgumentException e) {
                logger.error("Input can't be negative");
                System.out.println("Input can't be negative");
            }
        }
    }

    static Double calcpower(Integer x, Integer b) {
        logger.info("[Power] - " + x + ", " + b);
        logger.info("[RESULT - Power] - " + pow(x,b));

        return pow(x,b);
    }

    static Double calcnatlog(Double x) {
        if(x<0){
            logger.info("[EXCEPTION - Natural Log] - Natural Log of negative number is not possible!");
            throw new IllegalArgumentException();
        }
        Double op = 0.0;
        logger.info("[Natural Log] - " + x);
        logger.info("[RESULT - Natural Log] - " + log(x));
        return log(x);

    }

    static Integer calcfact(Integer x) {
        if(x<0){
            logger.info("[Throws exception - Factorial] - Factorial of negative number is not possible");
            throw new IllegalArgumentException();
        }
        Integer fac = 1;
        for(Integer i = x; i>=1; i--)
            fac*= i;
        logger.info("[Factorial] - " + x);
        logger.info("[RESULT - Factorial] - " + fac);
        return fac;

    }

    static Double calcsqroot(Integer x) {
        if(x<0){
            logger.info("[Throws exception - Square Root] - Square Root of negative number is not possible");
            throw new IllegalArgumentException();
        }
        logger.info("[Square Root] - " + x);
        logger.info("[RESULT - Square Root] - " + pow(x,1/2.0));
       return pow(x,1/2.0);
    }
}
