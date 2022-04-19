import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        String intergalacticRegistration;
        float aceleration;
        int maxload;
        int currentload;
        SpaceShip spaceShipModel = new SpaceShip("Millenium Falcon","YT-1300 492727ZED",5);
        Cargo cargoModel = new Cargo("X-Wing","100MACH-TD",3,3,0);


        Scanner keyboard = new Scanner(System.in);
        boolean menu = true;

        while (menu) {
            System.out.println("-----------------------------------o0ºMenúº0o-----------------------------------------");
            System.out.println("|  1º- Create Spaceship                                                               |");
            System.out.println("|  2º- Create Cargo                                                                   |");
            System.out.println("|  3º- ASCII art  spaceship model                                                     |");
            System.out.println("|  4º- ASCII art  cargo model                                                         |");
            System.out.println("|  5º- Accelerate                                                                     |");
            System.out.println("|  6º- Brake                                                                          |");
            System.out.println("|  7º- Emergency stop                                                                 |");
            System.out.println("|  'Q'- Program exit                                                                  |");
            System.out.println("---------------------------------ooooo00000000ooooo-----------------------------------");

            String usseracces = keyboard.nextLine().toUpperCase();

            switch (usseracces) {
                case "1":
                    System.out.println("Enter a name: ");
                    name = keyboard.nextLine();
                    System.out.println("Enter a Intergalactic registration: ");
                    intergalacticRegistration = keyboard.nextLine();
                    System.out.println("Enter aceleration: ");
                    aceleration = Integer.parseInt(keyboard.nextLine());
                    System.out.println("If the spaceship isn't a cargo model please enter a 0 value in the loads fields");
                    System.out.println("Enter Maxload");
                    maxload = Integer.parseInt(keyboard.nextLine());
                    System.out.println("Enter current load: ");
                    currentload = Integer.parseInt(keyboard.nextLine());

                    break;

                case "2":
                    System.out.println(spaceShipModel.toString());
                    break;
                case "3":
                    System.out.println(spaceShipModel.toString());
                    break;

                case "4":
                    System.out.println(cargoModel.toString());
                    break;

                case "5":

                    break;

                case "6":
                    System.out.println("proceding to brake spaceship model, " + spaceShipModel.brake());
                    System.out.println("proceding to brake cargo model, " + cargoModel.brake());

                    break;

                case "7":
                    System.out.println("Spaceship model, " + spaceShipModel.emergencyStop());
                    System.out.println("Cargo model, " + cargoModel.emergencyStop());

                    break;
                case "Q":

                    System.out.println("Closing program");
                    menu = false;
                    break;




            }
        }
    }
}
