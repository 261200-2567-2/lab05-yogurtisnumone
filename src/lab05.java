public class lab05 {
    public static void main(String[] args) {

        Character Luffy1 = new Luffy("fakesLuffy", 30000000);
        Character zoro1 = new Zoro("realZoro", 1111000000);

        Accessory transponderSnail = new TransponderSnail();
        Accessory haki = new Haki();

        Luffy1.attack();
        Luffy1.defense();
        Luffy1.getBounty();
        Luffy1.useAccessory(transponderSnail);

        System.out.println();

        zoro1.attack();
        zoro1.defense();
        zoro1.getBounty();
        zoro1.useAccessory(haki);

    }
}
