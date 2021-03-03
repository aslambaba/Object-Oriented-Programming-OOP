/* There We Will Cover Polymorphism with there Both Types
- Compile Time Polymorphism ( Method Overloading )
- Runtime Polymorphism ( Method Overriding )
*/

// Method Overloading

Class Student{

    // First Method with different parameters type
    void run(String Name){
        System.out.println(Name+" is a student and he is Running !");
    }
    // Second Method with different parameters type
    void run(Int Age){
        System.out.println("Student is Running and he is " + Age + " Years old");
    }
    // This Method with different parameters
    void run(String Name,Int Age){
        System.out.println(Name + " is a student and he is Running and his age is " + Age );
    }

    public static void main(String[] args){

        Student Rehan = new Student();
        Rehan.run("Rehan");
        Rehan.run(20);
        Rehan.run("Rehan",20);

    }

    // So there we will use same name Method with different Parameters so we get different Result    

}

// Method Overriding

Class Teacher extends Student{

    void run(String Name){
        System.out.println(Name+" is a teacher and he is Running !");
    }
    // Second Method with different parameters type
    void run(Int Age){
        System.out.println("Teacher is Running and he is " + Age );
    }
    // This Method with different parameters
    void run(String Name,Int Age){
        System.out.println(Name + " is a teacher and he is Running and his age is " + Age + " Years old");
    }

    Teacher Sir_Sami = new Teacher();
    Sir_Sami.run("Sir Sami");
    Sir_Sami.run(40);
    Sir_Sami.run("Sir Sami",40);

    Student Shayyan = new Student();
    Shayyan.run("Ahmad Shayan");
    Shayyan.run(19);
    Shayyan.run("Ahmad Shayan",19);

    /* So there we see we have same name, same parameter based methods but have different  class but we 
    extends those but stil the method is run according to the object in which it is created
    */

}