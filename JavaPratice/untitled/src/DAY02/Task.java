package DAY02;

import java.util.LinkedList;

public class Task {
    public static void main(String[] args) {
        PhoneShop phoneShop = new PhoneShop(5);

        Person sonny = new Person("쏘니");
        Person becoom = new Person("베컴");


        Phone sonnyPhone = new SamsungPhone(sonny);
        Phone becoomPhone = new ApplePhone(becoom);

        phoneShop.getClientList();

        phoneShop.sellPhone(sonnyPhone);
        phoneShop.sellPhone(becoomPhone);

        sonnyPhone.turnOn();
        becoomPhone.turnOn();
    }
}

class Person{
    String name;

    Person(String name){
        this.name = name;
    }
}

class Phone {
    private String owner;
    Phone(Person person) {
        this.owner = person.name;
    }

    public String getOwner() {
        return owner;
    }

    void turnOn() {
        System.out.println(owner + "이(가) 핸드폰을 켰습니다");
        turnOnSound();
    }

    void turnOnSound() {
    }
}

class SamsungPhone extends Phone{

    SamsungPhone(Person person) {
        super(person);
    }
    void turnOnSound() {
        System.out.println("삐비빅");
    }
}

class ApplePhone extends Phone{

    ApplePhone(Person person) {
        super(person);
    }
    void turnOnSound() {
        System.out.println("bbeep");
    }
}

class PhoneShop {
    private int inventory;

    PhoneShop(int inventory){
        this.inventory = inventory;
    }

    private LinkedList<String> clientList = new LinkedList<>();

    void sellPhone(Phone phone) {
        if (inventory > 0) {
            System.out.println(phone.getOwner() + "가 핸드폰을 샀습니다.");
            clientList.add(phone.getOwner());
            inventory--;

        } else {
            System.out.println("Inventory is empty!");
        }
    }

    void getClientList() {
        for (String client : clientList) {
            System.out.println(client);
        }
    }
}
