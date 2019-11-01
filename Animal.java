import java.util.Scanner;
//supper class
public class Animal {
    public static  final double FAVNUMBER = 1.6180;
    //defaults methods
    private String name;
    private int weight;
    private  boolean hasOwner = false;
    private char favorateChar;
    private long uniqueID;  //this goes from 2^32 till 2^-32
    private double speed;
    private float height;


    protected static int numberOfAnimals = 0;
    static Scanner userinput = new Scanner(System.in);

    //creating the constructor
    public Animal(){
     numberOfAnimals= numberOfAnimals +1;

     int sumOfNumbers= 5+2;
     System.out.println("5 + 1 =" + sumOfNumbers);

        int diffOfNumbers= 5-2;
        System.out.println("5 - 1 =" + diffOfNumbers);
        int multOfNumbers= 5*2;
        System.out.println("5 * 1 =" + multOfNumbers);
        int divOfNumbers= 5/2;
        System.out.println("5 / 1 =" + divOfNumbers);

    }

    //main
    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}
