// This is a unit converter program that convert from a unit to another  Cristian Gonzalez 9/12/2023
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // PP 2.1
        System.out.println("Hello welcome to the Unit Converter Program!");
        System.out.println("Please enter your inches unit to convert to foot");
        Scanner sc = new Scanner(System.in);

        float ConvertUnit = sc.nextFloat();

        System.out.println("the feet unist is : "+String.format("%.2f",ConvertUnit/12));

        //this part of the program will convert grams to pounds.
        // PP 2.2
        System.out.println();
        System.out.println("Hello welcome to the Unit Converter Program!");
        System.out.println("Please enter your grams unit to convert to pounds");

        float Convertgrams = sc.nextFloat();

        System.out.println("the pounds unist is : "+String.format("%.2f",Convertgrams*0.002205));

        // PP 2.3
        System.out.println();
        System.out.println("Hello welcome to the Unit Converter Program!");
        float kilogramsValue = 1;
        float gramsValue = 50;
        float milligramsValue = 42;

        System.out.println("--The equivalent weight in milligrams--  of: \n" +kilogramsValue +" kg \n" +gramsValue +" g \n" +milligramsValue +" mg");

        float totalValue = (kilogramsValue*1000000)+(gramsValue*1000)+milligramsValue;
        System.out.println("The equivalent total weight in milligrams is: " +totalValue +" mg");

        // PP 2.4
        System.out.println();
        System.out.println("Hello welcome to the Unit Converter Program!");

        float  newValueInMg = 9070056;

        // KG value, and its version in mg
        float KgEquivalent = newValueInMg/1000000;
        int newKgRound = Math.round(KgEquivalent);

        // subtract newKG equivalent with the original value.
        float newKgEquivalent = (newKgRound * 1000000);

        float G_Equivalent = newValueInMg - newKgEquivalent;
        int newGRound = Math.round(G_Equivalent/1000);

        // subtract newG with the G_equivalent
        float newGEquivalent = (newGRound* 1000);
        float filaMGValue = G_Equivalent - newGEquivalent;


        System.out.println("The equivalent total kg is: "+newKgRound +" kg, " +newGRound +" g, " +filaMGValue +" mg" );
    }
}