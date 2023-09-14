// This is a unit converter program that convert from a unit to another  Cristian Gonzalez 9/12/2023
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello welcome to the Unit Converter Program!");
        System.out.println("Please enter your inches unit to convert to foot");
        Scanner sc = new Scanner(System.in);

        double ConvertUnit = sc.nextDouble();

        System.out.println("the feet unist is : "+String.format("%.2f",ConvertUnit/12));

        //this part of the program will convert grams to pounds.

        System.out.println("Hello welcome to the Unit Converter Program!");
        System.out.println("Please enter your grams unit to convert to pounds");

        double Convertgrams = sc.nextDouble();

        System.out.println("the pounds unist is : "+String.format("%.2f",Convertgrams*0.002205));

    }
}