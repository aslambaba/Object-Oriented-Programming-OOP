// We Will See How to Use Atractions in Classes and Method for security purposes

abstract Class Police {

    // If we use abstract method in any class wo we have to make our class abstract also
    abstract PerformanceStar();
}

Class Public extends Police{
    public static void main(String [] args){

        Police BahawalpurPolice = new Police();
        // There is use abstract method of another class so i have to define body where i use that method
        BahawalpurPolice.PerformanceStar(){
            System.out.println(" Bahawalpur Police is very hard workinga and corporative")
        }

    }
}
