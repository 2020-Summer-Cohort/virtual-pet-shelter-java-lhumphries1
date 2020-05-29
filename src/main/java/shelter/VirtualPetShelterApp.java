package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Pet Shelter");
        gameLoop(input);
    }

    public static void whatToDo() {
        System.out.println("Choose your interaction with you pet!");
        System.out.println("1. Play with pet. ");
        System.out.println("2. Play with all pets.");
        System.out.println("3. Give pets a drink.");
        System.out.println("4. Feed pets");
        System.out.println("5. Adopt a pet");
        System.out.println("6. Add pet to shelter.");
        System.out.println("7. Do nothing.");
    }

    public static void gameLoop(Scanner input) {
        VirtualPetShelter virtualPetShelter = new VirtualPetShelter();


        while (true) {
            printPetStatus(virtualPetShelter);
            whatToDo();
            virtualPetShelter.tickPets();

            int userChoice = input.nextInt();

            if (userChoice == 1) {
                System.out.println("Play with pet friend.");
                printPetStatus(virtualPetShelter);
                String choice = input.nextLine();
                if (virtualPetShelter.petShelter.containsKey(choice)) {
                    VirtualPet playWithPet = virtualPetShelter.petShelter.get(choice);
                    System.out.println("You picked " + playWithPet.getName());
                    playWithPet.play();
                } else {
                    System.out.println("Iam sorry there no pet with that name");
                    continue;
                }
            }
            if (userChoice == 2){
                virtualPetShelter.playWithPets();
            }

            if (userChoice == 3) {
                virtualPetShelter.waterPets();

            }
            if (userChoice == 4) {
                virtualPetShelter.feedPets();
            }
            if (userChoice == 5) {
                System.out.println("Would you like to adopt a pet.");
                printPetStatus(virtualPetShelter);
                String choice = input.nextLine();
                if (virtualPetShelter.petShelter.containsKey(choice)) {
                    VirtualPet adoptPet = virtualPetShelter.petShelter.get(choice);
                    System.out.println("You picked " + adoptPet.getName());
                    virtualPetShelter.petShelter.remove(adoptPet);
                } else {
                    System.out.println("Iam sorry there no pet with that name");
                    break;
                }
            }
            if (userChoice == 6) {
                System.out.println("Admit a pet to the shelter.");
                System.out.println("What is your pets name?");
                String newPetName = input.nextLine();
                VirtualPet newPet = new VirtualPet(newPetName);
                virtualPetShelter.petShelter.put(newPet.getName(), newPet);
                printPetStatus(virtualPetShelter);
            }
            if (userChoice == 7) {
                System.out.println("Exit");
                break;

            }

        }
    }


    public static void printPetStatus(VirtualPetShelter virtualPetShelter) {
        for (VirtualPet pet : virtualPetShelter.petShelter.values()) {
            System.out.println("Name " + pet.getName());
            System.out.println("Hunger " + pet.getHungerNeed());
            System.out.println("Play " + pet.getBoredomNeed());
            System.out.println("Drink " + pet.getThirstNeed());
        }
    }
}

