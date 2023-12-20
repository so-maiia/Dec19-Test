package Interphase;

public interface InterfaceA {
    // we can declare variables
    // its itallic because the variable is static
    // by default it is public, static, final (you cant change the value anymore)
    // interface can also have implemented methods
    // we cannot create an object

    int num = 55;
    public void printMessage(String message);
    //^ abstract method because it has no body and is not implemented

    //v to write a method and implement, you have to make it default
    default void eatFood(String food){ System.out.println("Eating " + food);
    }
}
