public class washMachine {
    public static boolean havePet = false;
    public static int waterlevel = 0;
    public static int shampoolevel = 0;

    public static void addWater() {
        waterlevel = 20;
        System.out.println("Water level: " + waterlevel);
    }

    public static void addShampoo() {
        shampoolevel = 10;
        System.out.println("Shampoo level: " + shampoolevel);
    }

    public static void verifyMachineLevels() {
        System.out.println("Water level: " + waterlevel);
        System.out.println("Shampoo level: " + shampoolevel);
    }

    public static void clearMachine() {
        waterlevel -= 2;
        shampoolevel -= 1;
        System.out.println("Machine cleared. Water level: " + waterlevel + ", Shampoo level: " + shampoolevel);
    }

    public static void loadPet(Cadastro pet) {
        if (pet.sujo) {
            havePet = true;
            System.out.println("Pet " + pet.nome + " loaded into the machine.");
        } else {
            System.out.println("Pet " + pet.nome + " is not dirty and does not need to be washed.");
        }
    }

    public static void washPet() {
        if (havePet == true) {
            if (waterlevel > 2 && shampoolevel > 1) {
                System.out.println("Washing pet...");
                waterlevel -= 2;
                shampoolevel -= 1;

                System.out.println("Pet washed successfully.");
                havePet = false;
                System.out.println("Removing pet from the machine...");
            } else {
                System.out.println("The water or shampoo level is insufficient to wash the pet, water level: " + waterlevel + ", shampoo level: " + shampoolevel);
            }
        } else {
            System.out.println("There is no pet to wash.");
        }

    }
}

