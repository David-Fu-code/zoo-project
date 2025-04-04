import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    // Method to write objects to files
    public static void writeObjectsToFile(Tiger tiger, Penguin penguin, Dolphin dolphin) {
        saveObject(tiger, "tiger.txt");
        saveObject(penguin, "penguin.txt");
        saveObject(dolphin, "dolphin.txt");
    }

    private static void saveObject(Object obj, String fileName) {
        
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName))){
            os.writeObject(obj);
            System.out.println("Saved " + obj.getClass().getSimpleName() + " to " + fileName);

        }catch (IOException e){
            e.getStackTrace();
        }
    }

    // Method to read objects from files
    public static void readObjectsFromFile() {
        readObjectsFromFile("tiger.txt");
        readObjectsFromFile("penguin.txt");
        readObjectsFromFile("dolphin.txt");
    }


    private static void readObjectsFromFile(String fileName) {
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
            Object obj = in.readObject();
            System.out.println("Read " + fileName + ": " + obj);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading object from file: " + fileName);
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1  ;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        // for penguin choice
        int performance = 1;
        penguinObject.setSwimming(false);

        do {
            switch (animalChoiceMenu(keyboard)) {
                // Tiger
                case 1:
                    do {
                        System.out.println("The animal which is chosen is: " + tigerObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter age (yrs): ");
                                tigerObject.setAge(keyboard.nextInt());
                                System.out.println("Enter Height (inch): ");
                                tigerObject.setHeight(keyboard.nextDouble());
                                System.out.println("Enter Weight (lb): ");
                                tigerObject.setWeight(keyboard.nextDouble());
                                System.out.println("Enter speed (mph): ");
                                tigerObject.setSpeed(keyboard.nextDouble());
                                System.out.println("Enter number of stripes: ");
                                tigerObject.setStripes(keyboard.nextInt());
                                System.out.println("Enter the level of roar (dB): ");
                                tigerObject.setRoar(keyboard.nextDouble());
                                break;
                            case 2:
                                System.out.println("Type of animal: " + tigerObject.getNameOfAnimal());
                                System.out.println("Age: " + tigerObject.getAge() + " yrs");
                                System.out.println("Height: " + tigerObject.getHeight() + " inch");
                                System.out.println("Weight: " + tigerObject.getWeight() + " lb");
                                System.out.println("Speed: " + tigerObject.getSpeed() + " mph");
                                System.out.println("Level of Roar: " + tigerObject.getRoar() + " dB");
                                System.out.println("Number of Stripes: " + tigerObject.getStripes());
                                break;
                            case 3:
                                tigerObject.walking();
                                break;
                            case 4:
                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                // Dolphin
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : " + dolphinObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter age (yrs): ");
                                dolphinObject.setAge(keyboard.nextInt());
                                System.out.println("Enter Height (inch): ");
                                dolphinObject.setHeight(keyboard.nextDouble());
                                System.out.println("Enter Weight (lb): ");
                                dolphinObject.setWeight(keyboard.nextDouble());
                                System.out.println("Enter color: ");
                                dolphinObject.setColor(keyboard.next());
                                System.out.println("Enter speed (mph): ");
                                dolphinObject.setSpeedD(keyboard.nextDouble());
                                break;
                            case 2:
                                System.out.println("Type of animal: " + dolphinObject.getNameOfAnimal());
                                System.out.println("Age: " + dolphinObject.getAge() + " yrs");
                                System.out.println("Height: " + dolphinObject.getHeight() + " inch");
                                System.out.println("Weight: " + dolphinObject.getWeight() + " lb");
                                System.out.println("Speed: " + dolphinObject.getSpeedD() + " mph");
                                System.out.println("Color: " + dolphinObject.getColor());
                                break;
                            case 3:
                                dolphinObject.swimming();
                                break;
                            case 4:
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;
                // Penguin
                case 3:
                    do {
                        System.out.println("The animal which is chosen is : " + penguinObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Is the " + penguinObject.getNameOfAnimal() + " swimming (1.true/2.false): ");
                                performance = keyboard.nextInt();
                                if (performance == 1){
                                    penguinObject.setSwimming(true);
                                }
                                System.out.println("Enter age (yrs): ");
                                penguinObject.setAge(keyboard.nextInt());
                                System.out.println("Enter Height (inch): ");
                                penguinObject.setHeight(keyboard.nextDouble());
                                System.out.println("Enter Weight (lb): ");
                                penguinObject.setWeight(keyboard.nextDouble());
                                System.out.println("Enter walk speed (mph): ");
                                penguinObject.setSwimSpeed(keyboard.nextDouble());
                                System.out.println("Enter swim speed (mph): ");
                                penguinObject.setWalkSpeed(keyboard.nextDouble());
                                break;
                            case 2:
                                System.out.println("Type of animal: " + penguinObject.getNameOfAnimal());
                                System.out.println("Age: " + penguinObject.getAge() + " yrs");
                                System.out.println("Height: " + penguinObject.getHeight()+ " inch");
                                System.out.println("Weight: " + penguinObject.getWeight() + " lb");
                                System.out.println("walking Speed: " + penguinObject.getWalkSpeed() + " mph");
                                System.out.println("swimming Speed: " + penguinObject.getSwimSpeed() + " mph");
                                System.out.println("swimming: " + penguinObject.isSwimming());
                                break;
                            case 3:
                                if (penguinObject.isSwimming() == false){
                                    penguinObject.walking();
                                }
                                else {
                                    penguinObject.swimming();
                                }
                                break;
                            case 4:
                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;

                case 4:
                    System.out.println("Saving animals to file...");
                    writeObjectsToFile(tigerObject, penguinObject, dolphinObject);
                    break;

                case 5:
                    System.out.println("Reading animals from file...");
                    readObjectsFromFile();
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);
        System.out.println("Thanks for visiting our zoo!!");

    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.println("4. Save animals to file");
        System.out.println("5. Display saved animals from file");
        System.out.println("Enter choice of animal (1-5): ");

        System.out.println("Enter choice of animal: ");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}



