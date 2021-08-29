package C;

public class Car {

    private String name = "BMW Z4";
    private String model = "2021";
    private String color = "Grey";
    private int tyres = 2;

    void method1() {
        System.out.println("This car drive method1");
    }
    void method2(){
        System.out.println("This car drive method2");
    }
    void method3(){
        System.out.println("This car drive method3");
    }

    public static void main(String[] args) {
        Car Hammer = new Car();
        Hammer.method1();
        Hammer.method2();
        Hammer.method3();

    }
}