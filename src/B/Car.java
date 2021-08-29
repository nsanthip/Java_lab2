package B;

public class Car {
    private String name = "BMW Z4";
    private String model = "2021";
    private String color = "Grey";
    private int tyres = 2;

    void engine(){
        System.out.println("The car engine is very power");
    }

    void interior(){
        System.out.println("The car contains seats, steering, dashboard...");
    }

    void exterior(){
        System.out.println("The car is made up color, tyres");
    }



    public static void main(String[] args) {
        Car McLaren = new Car();

        McLaren.engine();
        McLaren.interior();
        McLaren.exterior();
    }
}