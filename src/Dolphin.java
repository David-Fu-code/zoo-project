import java.io.Serializable;

public class Dolphin extends Animal implements Swim, Serializable{

    private String color;
    private double swimmingSpeed;

    public Dolphin() {
        super("Dolphin");
    }

    // Eating
    @Override
    public void eatingFood() {
        System.out.println(super.getNameOfAnimal() +": I am eating delicious fish..");
    }
    // Eating completed
    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish.");
    }
    // swimming
    @Override
    public void swimming() {
        System.out.println(super.getNameOfAnimal() + ": I am swimming at the speed of " + getSpeedD() + " nautical miles per hour.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeedD() {
        return swimmingSpeed;
    }

    public void setSpeedD(double speedD) {
        this.swimmingSpeed = speedD;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "color='" + color + '\'' +
                ", speedD=" + swimmingSpeed +
                '}';
    }

}
