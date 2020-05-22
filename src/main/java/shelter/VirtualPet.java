package shelter;

public class VirtualPet {
    private int hungerNeed = 10;
    private int thirstNeed = 10;
    private int restNeed = 10;


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
    public void rest(){
        restNeed -= 2;
    }
    int getRestNeed(){
        return restNeed;
    }

    public void tick () {
        hungerNeed = hungerNeed + 2;
        thirstNeed = thirstNeed + 2;
        restNeed = restNeed + 4;
    }

}
