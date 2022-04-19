public class Main {

    public static void main(String[] args) {
        SpaceShip millenniumfalcon = new SpaceShip("Millenium Falcon || ","YT-1300 492727ZED",1,
                1,1,0,0,1,1);

        Cargo xWing = new Cargo("X-Wing","100MGLT",1,1,1,0,0,
                1,1,5,0);


        System.out.println(millenniumfalcon.toString());

        System.out.println(millenniumfalcon.emergencyStop());
        System.out.println(millenniumfalcon.brake());
        System.out.println(xWing.unload());



    }
}
