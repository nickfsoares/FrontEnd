import java.util.Scanner;
//supper class
public class Animal {
    public static  final double FAVNUMBER = 1.6180;
    //defaults methods
    private String name;
    private int weight;
    private boolean hasOwner = false;
    private char favorateChar;
    private long uniqueID;  //this goes from 2^32 till 2^-32
    private double speed;
    private float height;


    protected static int numberOfAnimals = 0;
    //protected means that this value can be accessed only by other code in the package
    //static shares the same value for every single object
    static Scanner userInput = new Scanner(System.in); //data from the keyboard
//Getters
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public char getFavorateChar() {
        return favorateChar;
    }

    public long getUniqueID() {
        return uniqueID;
    }

    public double getSpeed() {
        return speed;
    }

    public float getHeight() {
        return height;
    }
//Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public void setFavorateChar(char favorateChar) {
        this.favorateChar = favorateChar;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //creating the constructor
    public Animal(){
     numberOfAnimals++;

     int sumOfNumbers= 5+2;
     System.out.println("5 + 1 =" + sumOfNumbers);

        int diffOfNumbers= 5-2;
        System.out.println("5 - 1 =" + diffOfNumbers);
        int multOfNumbers= 5*2;
        System.out.println("5 * 1 =" + multOfNumbers);
        int divOfNumbers= 5/2;
        System.out.println("5 / 1 =" + divOfNumbers);

        System.out.print("Enter the name: \n");
        if (userInput.hasNextLine()){
            this.setName(userInput.nextLine());

        }
    }

    //main
    public static void main(String[] args) {
        // creating object theAnimal w/ all the propeties of the class Animal()
        Animal theAnimal = new Animal();
    }
}

