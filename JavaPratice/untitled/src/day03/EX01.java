package day03;

public class EX01 {
    public static void main(String[] args) {

        Cow cow = new Cow();
        Chicken chicken = new Chicken();

        Farm farm = new Farm(cow, chicken);

        farm.getSound(cow);
        farm.getSound(chicken);
    }
}

class Farm{

    Cow cow;
    Chicken chicken;

    Farm(Cow cow, Chicken chicken){
        this.cow = cow;
        this.chicken = chicken;
    }

    void getSound(Animal animal){
        System.out.println(animal.cry());
    }
}

class Animal{
    String cry(){
        return null;
    };
}

class Cow extends Animal{
    @Override
    String cry() {
        return "음메";
    };
}

class Chicken extends Animal{
    @Override
    String cry() {
        return "꼭기오";
    };

}