public class Pet {

    //private data fields
    private String name;

    //public Constructor (s)
    public Pet() {
        setName("Pet Name");
    }

    //public get or accessor method for every private data field (except if it is a secret)
    public String getName() {
        return name;
    }

    //public set or mutator method for every private data field (except when the data field is read-only)
    public void setName(String newName) {
        name = newName;
    }

    //public toString method that prints out all of the object state
    public String toString() {
        String result = "Pet information:\n";
        result += "Name: " + name;
        return result;
    }

    public static void main(String[] args) {
        Pet p1 = new Pet();
        System.out.println(p1.toString());

        Pet p2 = new Pet();
        p2.setName("Buster");
        System.out.println(p2.toString());
    }
}