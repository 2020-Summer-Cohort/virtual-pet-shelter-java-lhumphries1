package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {


    static void main(String[] args) {
        System.out.println("Welcome to the Pet Shelter");
        System.out.println("Would you like to visit a pet");

    }

    public static void whatToDo(String petName){
        System.out.println("Choose your interaction with you pet!");
        System.out.println("1. Play with " + petName + ". ");
        System.out.println("2. Give " + petName + " a drink.");
        System.out.println("3. Feed " + petName + "!");
        System.out.println("4. Adopt pet" + petName + ".");
    }

    public void gameLoop(Scanner input, String petName) {
        String choice;
        Scanner input = new Scanner(System.in);
        VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
        VirtualPet virtualPet = new VirtualPet("");


        while (true) {
            printPetStatus(virtualPetShelter);
            System.out.println("");

            System.out.println("Play with" + virtualPet.getName() + virtualPet.getBoredomNeed());
            System.out.println("Give water to" + virtualPet.getName() + virtualPet.getThirstNeed());
            System.out.println("Feed" + virtualPet.getName() + virtualPet.getHungerNeed());
            int userChoice = input.nextInt();

            if (userChoice == 1) {
                System.out.println("Play with pet friends.");
                printPetStatus(virtualPetShelter);
                choice = input.nextLine();
                if (virtualPetShelter.petShelter.containsKey(choice)) {
                    VirtualPet playWithPet = virtualPetShelter.petShelter.get(choice);
                    System.out.println("You picked " + playWithPet.getName());
                    playWithPet.play();
                } else {
                    System.out.println("Iam sorry there no pet with that name");
                    continue;
                }
            }

            if (userChoice == 2) {
                System.out.println("Would you like to give pets a drink");
                printPetStatus(virtualPetShelter);
                choice = input.nextLine();
                if (virtualPetShelter.petShelter.containsKey(choice)) {
                    VirtualPet waterPets = virtualPetShelter.petShelter.get(choice);
                    System.out.println("You have given them water!!");
                    waterPets.thirst();
                } else {
                    System.out.println("Iam sorry there no pet with that name");
                    continue;
                }
            }
            if (userChoice == 3) {
                System.out.println("Would you like to feed the pets?");
                printPetStatus(virtualPetShelter);
                choice = input.nextLine();
                if (virtualPetShelter.petShelter.containsKey(choice)) {
                    VirtualPet feedPets = virtualPetShelter.petShelter.get(choice);
                    System.out.println("Food makes the pets very happy!!");
                    feedPets.feed();
                } else {
                    System.out.println("Iam sorry there are not pet with that name.");
                    continue;
                }
            }
            if (userChoice == 4) {
                System.out.println("Would you like to adopt a pet.");
                printPetStatus(virtualPetShelter);
                choice = input.nextLine();
                if (virtualPetShelter.petShelter.containsKey(choice)) {
                    VirtualPet adoptPet = virtualPetShelter.petShelter.get(choice);
                    System.out.println("You picked " + adoptPet.getName());
                    virtualPetShelter.petShelter.remove(adoptPet);
                } else {
                    System.out.println("Iam sorry there no pet with that name");
                    break;
                }
            }
        }
    }


    public void printPetStatus(VirtualPetShelter virtualPetShelter) {
        for (VirtualPet pet : virtualPetShelter.petShelter.values()) {
            System.out.println("Name " + pet.getName());
            System.out.println("Hunger " + pet.getHungerNeed());
            System.out.println("Play " + pet.getBoredomNeed());
            System.out.println("Drink " + pet.getThirstNeed());
        }
    }
}

