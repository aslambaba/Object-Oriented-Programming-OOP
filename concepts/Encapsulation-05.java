/* There we will learn Encapsulation and we can achieve Encapsulation in 2 steps
- Use private keyword on variables of a class
- Apply Crud Operation on that private variable using methods

In this way we can hide variable name who containing important Data
*/

Class Principle{

    // There I use private keyword so noone can access that variable outside the class
    private Int PrincipleSalary; 

    public void setSalary(Int a){
        this.PrincipleSalary = a;
    }
    public Int getSalary(){
        return PrincipleSalary;
    }

}

Class UniversityControlRoom(){
    public static void main(String[] args){
        Principle AslamSarfraz = new Principle();
        AslamSarfraz.setSalary(10000);
        const Int result = AslamSarfraz.getSalary();
        System.out.println("The Salary of our Principle is " + result );
    }
}