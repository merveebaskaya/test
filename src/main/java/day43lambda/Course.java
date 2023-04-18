package day43lambda;

/*
     Icinde
      i)Private variabler'lar
     ii)Parametreli ve parametresiz constructor'lar
    iii)getter'lar
     iv)setter'lar
      v)toString() method'u
    barindiran class'lara "POJO" class denir.
    POJO: Plain Old Java Object
 */

public class Course {

    private  String courseName;
    private int numOfStudent;
    private String season;
    private double averageScore;

    public Course(String courseName, int numOfStudent, String season, double averageScore) {
        this.courseName = courseName;
        this.numOfStudent = numOfStudent;
        this.season = season;
        this.averageScore = averageScore;
    }

    public Course() {

    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    public String getSeason() {
        return season;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setNumOfStudent(int numOfStudent) {
        this.numOfStudent = numOfStudent;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", numOfStudent=" + numOfStudent +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
