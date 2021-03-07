/* There we will discuss different keywords that we use in Java OOP for datahiding, inheretence and 
 for other difference purposes 

- This
- Static
- Final
- Super

*/

Class Teacher{

    String Name = " Sir Sarfraz";

    // With the keyword of Final we tell the programe that this variable value cannot change ( Like constant )
    final Int SalaryofTeacher = 200000;

    static void Greetings(){
        System.out.println(" Assalam-o-Alaikum to EveryOne ");
    }
}

Class Student extends Human{

    String Name = " Aslam Sarfraz "

    public static void main(String[] args){

        // With the keyword of This we tell the proram to print the name of variable that is declare and initilize in this class 
        System.out.println(this.Name);
        // With the keyword of Super we tell the program to print the name of variable that is declare and initilize in the upper class Human
        System.out.println(super.Name);

        // With the use of Static Keyword we can access any variable or method of any class without making it's object
        Teacher.Greetings();
    }

}