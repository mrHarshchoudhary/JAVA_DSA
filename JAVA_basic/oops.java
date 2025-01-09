package JAVA_basic;
public class oops {
    public static void main(String[] args) {
        Student x = new Student("harsh",76,92.0);
        //x.setName("harsh");
        //x.setRoll(78);
        //x.setPercent(92.5);
       // System.out.println("harsh",76,92.0);
       System.out.println(x.name);
       System.out.println(x.roll);
       System.out.println(x.percent);


        System.out.println(x.getName());
        System.out.println(x.getRoll());
        System.out.println(x.getPercent() + 8);
    }
}

