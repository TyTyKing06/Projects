//Name: Tyesia King
//Module 6 Assignment 1- Inheritence

public class Exam extends Assessment {
    private int numQuestions;  // Number of questions on the exam
    private int numMissed;     // Number of questions missed
    private double pointsEach;  // Points for each question

    
    public Exam(int numQuestions, int numMissed) //The constructor accepts the number of questions on the exam and the number of questions missed as arguments.
    {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;

        // Calculate the points for each question
        if (numQuestions > 0) {
            this.pointsEach = 100.0 / numQuestions;
        } else {
            this.pointsEach = 0.0; // Avoid division by zero
        }

        double score = 100.0 - (numMissed * this.pointsEach);
        setScore((int) score); // Set the score using the inherited method
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

    
    public double getPointsEach()  //The getPointsEach method returns the number of points each question is worth.
    {
        return this.pointsEach;
    }
}   