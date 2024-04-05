package day03;

public class EX03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        Garden garden = new Garden(cat, dog);

        garden.getSound(cat);
        garden.getSound(dog);
    }
}

class Garden{
    Cat cat;
    Dog dog;

    Garden(Cat cat, Dog dog){
        this.cat = cat;
        this.dog = dog;
    }

    void getSound(Pet pet){
        System.out.println(pet.cry());
    }
}

abstract class Pet{
     abstract String cry();
}

class Cat extends Pet{
    @Override
    String cry(){
        return "냐옹";
    }

}

class Dog extends Pet{
    @Override
    String cry(){
        return "멍멍";
    }
}


