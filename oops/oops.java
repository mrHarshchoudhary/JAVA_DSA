package oops;


    class student {
        int rno;
        String name;
        float marks;
       //we need a way to add  the values of the above preperties object by object 
    // student(){
    //   this.rno=21;
    //   this.name="vandnaa";
    //   this.marks=90.30f;
    // }
    student(int rno,String name,float marks){
      this.rno=rno;
      this.name=name;
      this.marks=marks;
    }
    student(student other){
      this.name=other.name;
      this.rno=other.rno;
      this.marks=other.marks;
    }
    student(){
      this(13,"mansha",100.0f);
    }
    void greeting(){
      System.out.println("hello my  ame is :" +name);
    }
//this what object you are refreing to
    public static void main(String[] args) {
        //oops outer = new oops(); // Create an instance of the outer class
        student harsh = new student(); // Create an instance of the inner class
       
        // System.out.println(harsh);
        // System.out.println(harsh.rno);
        // System.out.println(harsh.name);
        // harsh.greeting();
        student random =new student();
        student random2=new student();
        System.out.println(random.name);
        System.out.println(random2.name);
    }
}
