import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        String intergalacticRegistration;
        float aceleration;
        int maxload;
        int currentload;
        SpaceShip spaceShipModel = new SpaceShip("Millenium Falcon","YT-1300 492727ZED",4);
        Cargo cargoModel = new Cargo("X-Wing","100MACH-TD",4,5,5);


        Scanner keyboard = new Scanner(System.in);
        boolean menu = true;

        while (menu) {
            System.out.println("-----------------------------------o0ºMenúº0o-----------------------------------------");
            System.out.println("|  1º- Create Spaceship                                                               |");
            System.out.println("|  2º- Create Cargo                                                                   |");
            System.out.println("|  3º- Accelerate                                                                     |");
            System.out.println("|  4º- Brake                                                                          |");
            System.out.println("|  5º- Emergency stop                                                                 |");
            System.out.println("|  'Q'- Program exit                                                                  |");
            System.out.println("---------------------------------ooooo00000000ooooo-----------------------------------");

            String usseracces = keyboard.nextLine().toUpperCase();

            switch (usseracces) {
                case "1":
                    System.out.println(spaceShipModel);
                    break;

                case "2":
                    System.out.println(cargoModel);
                    break;

                case "3":
                    System.out.println(spaceShipModel.getCoordinateX());
                    System.out.println(spaceShipModel.getVelocityX());
                    break;

                case "4":
                    System.out.println("proceding to brake spaceship model, " + spaceShipModel.brake());
                    System.out.println("proceding to brake cargo model, " + cargoModel.brake());
                    break;

                case "5":
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
