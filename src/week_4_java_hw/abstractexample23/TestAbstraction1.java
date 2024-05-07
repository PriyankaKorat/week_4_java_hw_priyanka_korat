package week_4_java_hw.abstractexample23;

public class TestAbstraction1 {
    public static void main(String[] args) {
        //In real scenario, method is called by programmer or user
        Shape s = new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method
        s.draw();
    }
}

