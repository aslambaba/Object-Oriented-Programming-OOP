/* There we will use Interface 
Note: In Java before 8,9 verison we just use only abstract methods
in interface we cannot use concreete methods
- We also use multiple inheritence Using interfaces
*/


interface HeadofDepartment{

    // We can write abstract method using both signature
    public abstract void meetings();
    void lecture();

    // But in java 8,9 version or later we can also use concrete/static methods
    
    //Concrete Method
    default void CRMeeting(){
        System.out.println("This is the CR Meeting");
    }

    //Static Method
    public static void StudentAnnouncment(){
        System.out.println("This is Student Announcment");
    }

}

interface DeanofUniversity(){

    // Abstract Method
    void DeanSchedual()

    // In Java 9 version we can also use private methods in inteface

    private void principleMeeting(){
        System.out.println("This is Private Method for Principle Meeting");
    }
}

// Using Interface I inherit multiple Interface in same class or we can say we achive multi-Inheritence
Class IUB Implements HeadofDepartment, DeanofUniversity{

    // There we inherit Interface so now I have to make the body of abstract  methods

    void meetings(){
        System.out.println("This is Meeting Time");
    }

    void lecture(){
        System.out.println("This is Lecture Time");
    }

    void DeanSchedual(){
        System.out.println("This is Dean Schedual Time");
    }
}