
public class Cargo extends SpaceShip {
    private int maxload;
    private int currentload;

    public Cargo(String name, String intergalacticRegistration, float aceleration, float velocityY,
                 float velocityX, float coordinateY, float coordinateX, float directionY, float directionX,int maxload, int currentload) {

        super(name, intergalacticRegistration, aceleration, velocityY, velocityX, coordinateY, coordinateX, directionY, directionX);
        this.maxload = maxload;
        this.currentload = currentload;
    }


}
