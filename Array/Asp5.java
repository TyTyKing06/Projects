 import java.util.ArrayList;

public class Asp5 {
    public static void main(String[] args) {

        //Create two ArrayLists
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        //Add four items to the String ArrayList
        fruits.add("Apple");
        fruits.add("Peach");
        fruits.add("Cherry");
        fruits.add("Grape");


        //Add four items to the Integer ArrayList
        numbers.add(1);
        numbers.add(25);
        numbers.add(46);
        numbers.add(75);

        //Print the contents of the String ArrayList
        System.out.println("Original fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //Print the contents of the Integer ArrayList
        System.out.println("\nOriginal numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        //Remove the second item from the String ArrayList
        fruits.remove(1);

        //Print the contents of the String ArrayList after removal
        System.out.println("\nUpdated fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //Change the third item in the Integer ArrayList to 100
        numbers.set(2, 100);   

        //Print the contents of the Integer ArrayList after the change
        System.out.println("\nUpdated numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
