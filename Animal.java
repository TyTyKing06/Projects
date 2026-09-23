//Name: Tyesia King
//Midterm Program 1

//Animal class
public class Animal {
    
    private String species;

    //Default Constructor
    public Animal()   {

    }  
    //Custom Constructor
    public Animal(String newSpecies) {
        this.species = newSpecies;
    }

    //Setter
    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
    }

    //Getter
    public String getSpecies() {
        return species;
    }

    //toString method
    public String toString() {
        String result = "Species: " + species + "\n";
        return result;
    }

    
}
