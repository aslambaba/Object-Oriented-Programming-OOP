// In This Code We will Cover Classes, Objects, and Methods


// Firstly Make Class of Animal
class Animal{

    // Varaible that is used later
    String name;

    // Method of class Animal
    public void run(){

        System.out.println("Your Animal is Animal");

    }

    // There We msut have a main method
    public static void main(string[] args){
        
        System.out.println("Hello From Main Method")

        // Initilize The Animal Class Object
        Animal Mao = new Animal();

        // Initilize Name of that animal
        Mao.name = 'Mao';
        
        // Implement That method on that Object
        Mao.run();

        
        // Initilize Object of Birds Class
        Birds Tota = new Birds("Chitta Tota");

        // Call Method Fly on Bird Object of Bird class
        Tota.fly();

    }

}

// Also Declare Another Class
class Birds(){

    // Variable that is used in constructor
    String Name;

    // Use Constructor 
    public void Birds(String a){
        Name = a;
    }

    // Initilize Fly Method for Bird Class
    public void fly(){
        System.out.println("Your Bird is flying");
    }
}
