public class Pet {

    //private data fields
    private String name;
    private String type;
    private int age;

    //Default Constructor (s)
    public Pet() {
        this.name = "Pet Name";
        this.type = "Animal";
        this.age = 1;
    }

    //Custom Constructor
    public Pet(String newName, String newType, int newAge) {
        setName(newName);
        setType(newType);
        setAge(newAge);
    }
    
    //public get or accessor method for every private data field (except if it is a secret)
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getAge() {
        return age;
    }
    
    //public set or mutator method for every private data field (except when the data field is read-only)
    public void setName(String newName) {
        this.name = newName;
    }
    public void setType(String newType) {
        this.type = newType;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }

    //speak method
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        }
        else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        }
        else {
            return "Noise";
        }
    }

    //toString method
    public String toString() {
        String result = "Pet Information:\n";
        result += "Type: " + type + "\n";
        result += "Name: " + name + "\n";
        result += "Sound: " + speak() + "\n";
        result += "Age: " + age;

        return result;
    }
    
}
