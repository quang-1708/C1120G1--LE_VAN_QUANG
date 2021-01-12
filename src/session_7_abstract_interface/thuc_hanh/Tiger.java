package session_7_abstract_interface.thuc_hanh;

public class Tiger extends Animal implements Edible {
    @Override
    public String makesound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String HowToEat() {
        return "Meet";
    }
}
