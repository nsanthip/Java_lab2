package A;

public class Car {

    private String name = "BMW Z4";
    private String model = "2021";
    private String color = "grey";
    private int tyres = 2;

    public static void main(String[] args) {
        Car BMW = new Car();

        System.out.println("BMW.name = " + BMW.name);
        System.out.println(BMW.model);
        System.out.println(BMW.color);
        System.out.println(BMW.tyres);
    }
}
