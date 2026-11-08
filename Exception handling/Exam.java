//Name: Tyesia King
//Module 6 Assignment 1- Inheritence

public class Exam extends Assessment {
    private int numQuestions;  // Number of questions on the exam
    private int numMissed;     // Number of questions missed
    private int pointsEach;  // Points for each question

    
    public Exam(int numQuestions, int numMissed) //The constructor accepts the number of questions on the exam and the number of questions missed as arguments.
    {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;

        // Calculate the points for each question
        try {
            this.pointsEach = 100 / numQuestions;
        } catch (ArithmeticException e) {
            this.pointsEach = 0; // Avoid division by zero
            System.out.println("Error: Cannot divide by zero.");
        }

        int score = 0;
        if(numQuestions > 0) {
            score =((numQuestions - numMissed) * 100) / numQuestions; // Calculate the score based on the number of questions and missed questions
        }
        setScore(score); // Set the score using the inherited method
    }

           
    public void  setNumQuestions(int n)  //The setNumQuestions method sets the numQuestions field.
    {
        this.numQuestions = n;
    }

        public void  setNumMissed(int m)  // The setNumMissed method sets the numMissed field.
    
    {
        this.numMissed = m;
    }

        public int getNumQuestions()  //The getNumQuestions method returns the number of questions on the exam. 
    
    {
        return this.numQuestions;
    }

       
    public int getNumMissed()   // The getNumMissed method returns the number of questions missed on the exam.
    {
        return this.numMissed;
    }

    
    public int getPointsEach()  //The getPointsEach method returns the number of points each question is worth.
    {
        return this.pointsEach;
    }
}  
