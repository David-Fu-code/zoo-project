import java.io.Serializable;

public class Penguin extends Animal implements Walk, Swim, Serializable{

    private boolean isSwimming;
    private double walkSpeed;
    private double swimSpeed;

    public Penguin() {
        super("Penguin");
    }

    // Eating
    @Override
    public void eatingFood() {
        System.out.println(super.getNameOfAnimal() + ": I am eating fish...");
    }
    // Eating complete
    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish.");
    }
    // Swimming
    @Override
    public void swimming() {
        System.out.println(super.getNameOfAnimal() + ": I am swimming at the speed of " + getSwimSpeed() + " nautical miles per hour.");
    }
    // Walking
    @Override
    public void walking() {
        System.out.println(super.getNameOfAnimal() +":I am walking at the speed " + getWalkSpeed() + " mph.");
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public double getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(double walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "isSwimming=" + isSwimming +
                ", walkSpeed=" + walkSpeed +
                ", swimSpeed=" + swimSpeed +
                '}';
    }
}
