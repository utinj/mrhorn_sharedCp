package keyboardInputDemo;
import java.util.Scanner;

public class KeyboardInputDemo
{

    public static void main(String[] args)
    {
        Scanner fromKeyboard = new Scanner(System.in);
        
        System.out.print("What is your name?: ");
        String name = fromKeyboard.nextLine();
        
        System.out.print("What is your favorite color?: ");
        String color = fromKeyboard.nextLine();
        
        System.out.print("What is the airspeed velocity of an unladded swallow?: ");
        double airspeedVelocity = fromKeyboard.nextDouble();
        fromKeyboard.nextLine();
        
        System.out.print("What is your quest?: ");
        String quest = fromKeyboard.nextLine();
        
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Velocity: " + airspeedVelocity);
        System.out.println("Quest: " + quest);
    }

}
