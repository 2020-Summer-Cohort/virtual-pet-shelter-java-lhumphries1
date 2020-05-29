package shelter;

import java.util.HashMap;

public class VirtualPetShelter {

    HashMap<String, VirtualPet> petShelter = new HashMap<>();


    public VirtualPetShelter() {
        VirtualPet virtualPet = new VirtualPet("Spot");
        VirtualPet virtualPet1 = new VirtualPet("Chuck");
        VirtualPet virtualPet2 = new VirtualPet("Bingo");

        petShelter.put(virtualPet.getName(), virtualPet);
        petShelter.put(virtualPet1.getName(), virtualPet1);
        petShelter.put(virtualPet2.getName(), virtualPet2);

    }

    public void feedPets() {
        for (VirtualPet pet : petShelter.values()) {
            pet.feed();
        }
    }

    public void waterPets() {
        for (VirtualPet pet : petShelter.values()) {
            pet.thirst();
        }
    }

    public void playWithPets() {
        for (VirtualPet pet : petShelter.values()) {
            pet.play();
        }
    }

    public void adoptPet (String petName) {
        petShelter.remove(petName);
    }

    public void tickPets() {
        for (VirtualPet pet : petShelter.values()) {
            pet.tick();
        }
    }

}