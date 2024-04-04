package DAY02;

//상속
public class EX04 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        System.out.println(car.getWheel());

        Bus bus = new Bus();
        bus.drive();
        System.out.println(bus.getWheel());

        Taxi taxi = new Taxi();
        taxi.drive();
        System.out.println(taxi.getWheel());
    }
}

class Car {
    int wheel = 4;

    void drive() {
        System.out.println("부릉부릉");
    }

    public int getWheel() {
        return wheel;
    }
}

class Bus extends Car {
    Bus() {
        super(); // 부모생성자를 호출한다!!
        wheel = 8; // Set wheel count for Bus
    }
    void bellRing(){
        System.out.println("삐이이");
    }
    void drive() {
        System.out.println("부왕부왕");
    }
}

class Taxi extends Car {
    void drive() {
        System.out.println("빵빵");
    }
}
