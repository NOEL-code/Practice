package DAY02;

import java.util.LinkedList;

public class Task {
    public static void main(String[] args) {
        PhoneShop phoneShop = new PhoneShop(5);

        Person sonny = new Person("쏘니");
        Person becoom = new Person("베컴");

        ApplePhone becoomPhone = phoneShop.sellApplePhone(becoom);
        SamsungPhone sonnyPhone = phoneShop.sellSamsungPhone(sonny);

        phoneShop.getClientList();

        sonnyPhone.turnOn();
        becoomPhone.turnOn();
    }
}

class Person{
    private String name;

    Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Phone {
    private String owner;
    Phone(String owner) {
        this.owner = owner;
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

    SamsungPhone(String owner) {
        super(owner);
    }
    void turnOnSound() {
        System.out.println("삐비빅");
    }
}

class ApplePhone extends Phone{

    ApplePhone(String owner) {
        super(owner);
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

    ApplePhone sellApplePhone(Person person) {
        if (inventory > 0) {
            System.out.println(person.getName() + "가 핸드폰을 샀습니다.");
            System.out.println("남은 재고량: " + inventory);
            String ownerName;
            ownerName = person.getName();
            clientList.add(ownerName);
            inventory--;

            return new ApplePhone(ownerName);
        } else {
            System.out.println("Inventory is empty!");
            return null;
        }
    }

    SamsungPhone sellSamsungPhone(Person person) {
        if (inventory > 0) {
            System.out.println(person.getName() + "가 핸드폰을 샀습니다.");
            System.out.println("남은 재고량: " + inventory);
            String ownerName;
            ownerName = person.getName();
            clientList.add(ownerName);
            inventory--;

            return new SamsungPhone(ownerName);
        } else {
            System.out.println("Inventory is empty!");
            return null;
        }
    }

    void getClientList() {

        System.out.println("핸드폰 구매자 명단: ");
        for (String client : clientList) {
            System.out.println(client);
        }
        System.out.println("명단 끝");
    }

}
