package JAVA_basic;
public class Student {
     String name;
   int roll;
    double percent;

    // Getter for name
    public String getName() {
        return name;
    }
public Student(String name,int roll,double percent){
this.name=name;
this.roll=roll;
this.percent=percent;


}
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for roll
    public int getRoll() {
        return roll;
    }

   // Setter for roll
    public void setRoll(int roll) {
        this.roll = roll;
    }

    // Getter for percent
    public double getPercent() {
        return percent;
    }

    // Setter for percent
    public void setPercent(double percent) {
        this.percent = percent;
    }
    
}
