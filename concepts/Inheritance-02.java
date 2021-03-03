/* There We Will Cover Three Types of Inheritance
- Single Inheritance
- MultiLevel Inheritnce
- Hierarchical Inheritance
*/

Class Humans{
    void Eat(){
        System.out.println("I'm Eating");
    }
}
/*
 Single Inheritance
 There I Inherit Humans Class in Student Class
*/
Class Student extends Humans{

    // Now if I create object of Student Class so I implement Eat class on that Object
    Student Aslam = new Student();
    Aslam.Eat();

}
/*
 MultiLevel Inheritance
 If I Inhereit Student Class in Tacher Class so It's called MultiLevel Inheritance
*/
Class Teacher extends Student{

    // Our Eat Method of Human Class Can Also Used in Teacher class using MultiLevel Inheritance
    Teacher Sir_Sami = new Teacher();
    Sir_Sami.Eat();

}
/*
Hierarchical Inheritance
Where I extends Single Class into multiple Classes in Know as Hierarchical Inheritance
*/
Class BoardOfDirectors extends Humans{

    // We Use Eat Method of Human Class  in BoardOfDirectors class
    BoardOfDirectors ImranSarverBajwa = new BoardOfDirectors();
    ImranSarverBajwa.Eat();

}