package animal;

public class AnimalManage {

    public static void main(String[] args) {
        Animal animal = new Animal("happy");
        animal.sleep();
        System.out.println("이름은 " + animal.getName() + "입니다.");
    }
}
