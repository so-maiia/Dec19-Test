package DEC6Class;

public class TestPerson2{
    public static void main(String[] args) {
        Person person1 = new Person("ABC",45 );
//        person1.setName("ABC");
//        person1.setAge(45);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
    }
    // set method is used because the values are private
    // constructor is a method it will be executed The constructor is called when an object of a class is created.
    // ^ for values that will never change
    // Constructor is used for values ex: bank account, values that are required are: SSN, NAME, Bank balance.
}
