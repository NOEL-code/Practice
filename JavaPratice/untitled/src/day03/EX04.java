//package day03;
//
//public class EX04 {
//    public static void main(String[] args) {
//        Person cooker = new Person("cooker");
//        pasterRecipe pasterRecipe = new pasterRecipe(cooker);
//        SteakRecipe steakRecipe = new SteakRecipe(cooker);
//
//        pasterRecipe.getInfo();
//        pasterRecipe.makeSource();
//
//        steakRecipe.getInfo();
//        steakRecipe.grillMeat();
//    }
//}
//
//class Person {
//    String name;
//
//    Person(String name){
//        this.name = name;
//    }
//}
//
//abstract class Receipt{
//    String owner;
//    Receipt(Person person){
//        owner = person.name;
//    }
//
//    abstract void getInfo();
//}
//
//class pasterRecipe extends Receipt{
//
//    pasterRecipe(Person person) {
//        super(person);
//    }
//
//    @Override
//    void getInfo() {
//        System.out.println("이 레시피는 " + owner + " 의 레시피 입니다.");
//    }
//
//    void makeSource(){
//        System.out.println("making source...");
//    }
//}
//
//class SteakRecipe extends Receipt{
//
//    SteakRecipe(Person person) {
//        super(person);
//    }
//
//    @Override
//    void getInfo() {
//        System.out.println("이 레시피는 " + owner + "의 레시피 입니다.");
//    }
//
//    void grillMeat(){
//        System.out.println("grilling...");
//    }
//}