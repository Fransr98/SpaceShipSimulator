
public class Cargo extends SpaceShip {
    private int maxload;
    private int currentload;

    public Cargo(String name, String intergalacticRegistration, float aceleration, float velocityY,
                 float velocityX, float coordinateY, float coordinateX, float directionY, float directionX, int maxload, int currentload) {

        super(name, intergalacticRegistration, aceleration, velocityY, velocityX, coordinateY, coordinateX, directionY, directionX);
        this.maxload = maxload;
        this.currentload = currentload;
    }

    public String load() {
        if (this.currentload >= maxload) {
            System.out.println("The current load doesn't admit more containers");
        } else {
            currentload++;
        }
        return "The current load is : " + currentload;
    }

    public String unload() {
        if (this.currentload >= 1) {
            currentload --;
            System.out.println("Proceding the container unload");
        } else {

            System.out.println("No more containers left");
        }
        return "The current load is : " + currentload;


    }
}
