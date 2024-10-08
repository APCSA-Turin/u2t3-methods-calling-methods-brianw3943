package U2T6_Strings;

public class Student {

    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;
  
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        accumulatedTestScores = 0.0;
        testScoreCount = 0;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }
 
    public void addTestScore(double newTestScore) {
        accumulatedTestScores += newTestScore;
        testScoreCount++;
    }
 
    public boolean isPassing() {
        if (averageTestScore() >= 65) {
            return true;
        } else {
            return false;
        }
    }
 
    public double averageTestScore() {
        double average = accumulatedTestScores / testScoreCount;
        return average;
    }
 
    public void printStudentInfo() {
        System.out.println("Student Full Name: " + firstName + " " + lastName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Number of tests: " + testScoreCount);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println("Is passing: " + isPassing());
    }
 
    // add a new getStudentInfo() method here
    public String getStudentInfo() {
        return "Student Full Name: " + firstName + " " + lastName +"\n"+"Graduation Year: " + gradYear+"\n"+"Number of tests: " + testScoreCount+"\n"+"Average Test Score: " + averageTestScore()+"\n"+"Is passing: " + isPassing();
    }
 }
 
