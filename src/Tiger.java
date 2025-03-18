public class Tiger extends Animal implements Walk {

    private int numberOfStripes;
    private double speedT;
    private double soundLevel;

    public Tiger() {
        super("Tiger");
    }
    // Eating
    @Override
    public void eatingFood() {
        System.out.println(super.getNameOfAnimal() + ": I am eating delicious meat...");
    }

    // Eating complete
    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten meat.");
    }
    // Walk method
    @Override
    public void walking() {
        System.out.println(super.getNameOfAnimal() +":I am walking at the speed " + getSpeed() + " mph.");
    }

    public int getStripes() {
        return numberOfStripes;
    }

    public void setStripes(int stripes) {
        this.numberOfStripes = stripes;
    }

    public double getSpeed() {
        return speedT;
    }

    public void setSpeed(double speed) {
        this.speedT = speed;
    }

    public double getRoar() {
        return soundLevel;
    }

    public void setRoar(double roar) {
        this.soundLevel = roar;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "stripes=" + numberOfStripes +
                ", speed=" + speedT +
                ", roar=" + soundLevel +
                '}';
    }
}
