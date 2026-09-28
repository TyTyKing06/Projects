public class Calc {
    //private data fields
    private double num1;
    private double num2;
 
    //setter methods
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //getter methods
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    //add method
    public double add() {
        return num1 + num2;
    }

   //subtract method
    public double subtract() {
        return num1 - num2;
    }
   
    //multiply method
    public double multiply() {
        return num1 * num2;
    }

    //division method
    public double divide() {
        return num1 / num2;
    }

   //Display private data fields
    @Override
    public String toString() {
        return "Displaying private data fields using toString():\n" +
                "Num1: " + num1 + "\n" +
                "Num2: " + num2;
    }
}