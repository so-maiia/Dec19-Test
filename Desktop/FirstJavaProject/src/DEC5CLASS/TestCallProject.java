package DEC5CLASS;

public class TestCallProject {
    public static void main(String[] args) {
        TestProject car1 = new TestProject();
        car1.name = "Toyota";
        car1.model = "Highlander";
        car1.price = 55000;
        car1.color = "White";
        car1.startEngine();

        System.out.println(car1.price);


        TestProject car2 = new TestProject();
        car2.stopEngine();
        car2.startEngine();
    }
}
