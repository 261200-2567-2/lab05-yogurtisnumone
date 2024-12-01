// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
interface Character {
    void attack();
    void defense();
    void getBounty();
    void useAccessory(Accessory accessory);
}

class Luffy implements Character {
    private String name;
    private long bounty;

    public Luffy(String name, long bounty) {
        this.name = name;
        this.bounty = bounty;
    }

    public void attack() {
        System.out.println(name + " attacks with Gum-Gum Pistol!" );
    }

    public void defense() {
        System.out.println(name +  " defends with Observation Haki!");
    }

    public void getBounty() {
        System.out.println(name + "'s bounty is " + bounty + " berries");
    }

    public void useAccessory(Accessory accessory) {
        System.out.print(name + " is using: ");
        accessory.useThis();
    }

}

class Zoro implements Character {
    private String name;
    private long bounty;

    public Zoro(String name, int bounty) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + "attacks with Three-Sword Style!" );
    }

    public void defense() {
        System.out.println(name +  " blocks with his swords!");
    }

    public void getBounty() {
        System.out.println(name + "'s bounty is " + bounty + " berries");
    }

    public void useAccessory(Accessory accessory) {
        System.out.print(name + " is using: ");
        accessory.useThis();
    }

}

interface Accessory{
    void useThis();
}

class TransponderSnail implements Accessory {
    public void useThis() {
        System.out.println("the transponder snail");
    }
}

class Haki implements Accessory {
    public void useThis() {
        System.out.println("Haki to the enemies!");
    }
}