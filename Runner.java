import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Pet pet1 = new Pet();
        System.out.println(pet1);
        System.out.println();

        Pet pet2 = new Pet("Buster", "Dog", 3);
        System.out.println(pet2);   
        System.out.println();

        Pet pet3 = new Pet();
        System.out.print("Enter your pet's name: ");
        String name = scnr.nextLine();
        System.out.print("Enter your pet's type: ");
        String type = scnr.nextLine();
        System.out.print("Enter your pet's age: ");
        int age = scnr.nextInt();

        pet3.setName(name);
        pet3.setType(type);
        pet3.setAge(age);

        System.out.println();
        System.out.println(pet3);

        scnr.close();
    }
}