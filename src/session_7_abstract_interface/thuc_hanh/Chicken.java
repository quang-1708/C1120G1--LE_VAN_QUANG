package session_7_abstract_interface.thuc_hanh;

public class Chicken extends Animal implements Edible {
    @Override
    public String makesound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String HowToEat() {
        return "Chicken: cluck1-cluck1!";
    }
}
