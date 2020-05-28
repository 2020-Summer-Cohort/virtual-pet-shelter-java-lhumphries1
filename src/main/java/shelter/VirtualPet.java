package shelter;

public class VirtualPet {
    private int hungerNeed = 10;
    private int thirstNeed = 10;
    private int boredomNeed = 10;
    private String name;

    public VirtualPet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void feed() {
        hungerNeed -= 2;
    }

    int getHungerNeed() {
        return hungerNeed;
    }

    public void thirst() {
        thirstNeed -= 2;
    }

    int getThirstNeed() {
        return thirstNeed;
    }

    public void play() {
        boredomNeed -= 2;
    }

    int getBoredomNeed() {
        return boredomNeed;
    }

    public void tick() {
        hungerNeed = hungerNeed + 2;
        thirstNeed = thirstNeed + 2;
        boredomNeed = boredomNeed + 4;
    }

}
