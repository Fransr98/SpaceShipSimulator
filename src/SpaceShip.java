public class SpaceShip {
    private String name;
    private String intergalacticRegistration;
    private float aceleration;
    private float velocityY;
    private float velocityX;
    private float coordinateY;
    private float coordinateX;
    private float directionY;
    private float directionX;

    public SpaceShip(String name, String intergalacticRegistration, float aceleration, float velocityY, float velocityX, float coordinateY, float coordinateX, float directionY, float directionX) {
        this.name = name;
        this.intergalacticRegistration = intergalacticRegistration;
        this.aceleration = aceleration;
        this.velocityY = 1;
        this.velocityX = 1;
        this.coordinateY = 0;
        this.coordinateX = 0;
        this.directionY = 1;
        this.directionX = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntergalacticRegistration() {
        return intergalacticRegistration;
    }

    public void setIntergalacticRegistration(String intergalacticRegistration) {
        this.intergalacticRegistration = intergalacticRegistration;
    }

    public float getAceleration() {
        return aceleration;
    }

    public void setAceleration(float aceleration) {
        this.aceleration = aceleration;
    }

    public float getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(float velocityY) {
        this.velocityY = velocityY;
    }

    public float getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(float velocityX) {
        this.velocityX = velocityX;
    }

    public float getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(float coordinateY) {
        this.coordinateY = coordinateY;
    }

    public float getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(float coordinateX) {
        this.coordinateX = coordinateX;
    }

    public float getDirectionY() {
        return directionY;
    }

    public void setDirectionY(float directionY) {
        this.directionY = directionY;
    }

    public float getDirectionX() {
        return directionX;
    }

    public void setDirectionX(float directionX) {
        this.directionX = directionX;
    }

    private float speedUp(float speed) {


        return speed;
    }
}

