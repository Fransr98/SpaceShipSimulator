
public class Cargo extends SpaceShip {
    private int maxload;
    private int currentload;

    public Cargo(String name, String intergalacticRegistration, float aceleration, int maxload, int currentload) {

        super(name, intergalacticRegistration, aceleration);
        this.maxload = maxload;
        this.currentload = currentload;
    }

    public int getMaxload() {
        return maxload;
    }

    public void setMaxload(int maxload) {
        this.maxload = maxload;
    }

    public int getCurrentload() {
        return currentload;
    }

    public void setCurrentload(int currentload) {
        this.currentload = currentload;
    }

    private String load() {
        if (this.currentload >= maxload) {
            System.out.println("The current load doesn't admit more containers");
        } else {
            currentload++;
        }
        return "The current load is : " + currentload;
    }

    private String unload() {
        if (this.currentload >= 1) {
            currentload --;
            System.out.println("Proceding the container unload");
        } else {

            System.out.println("No more containers left");
        }
        return "The current load is : " + currentload;


    }
    @Override
    public String toString() {
        return "The spaceship ASCII art is: " + Cargo.super.getName() + "\n" + "Intergalactic registration: "+ Cargo.super.getIntergalacticRegistration()
                +"\n"   +"Max Load: " + Cargo.this.maxload +  "\n"+  "Current Load: "+ Cargo.this.currentload +"\n" +
                "          __\n" +
                "    .-.__      \\ .-.  ___  __\n" +
                "    |_|  '--.-.-(   \\/\\;;\\_\\.-._______.-.\n" +
                "    (-)___     \\ \\ .-\\ \\;;\\(   \\       \\ \\\n" +
                "     Y    '---._\\_((Q)) \\;;\\\\ .-\\     __(_)\n" +
                "    I           __'-' / .--.((Q))---'    \\,\n" +
                "    I     ___.-:    \\|  |   \\'-'_          \\\n" +
                "    A  .-'      \\ .-.\\   \\   \\ \\ '--.__     '\\\n" +
                "    |  |____.----((Q))\\   \\__|--\\_      \\     '\n" +
                "    ( )        '-'  \\_  :  \\-' '--.___\\\n" +
                "     Y                \\  \\  \\       \\(_)\n" +
                "     I                 \\  \\  \\         \\,\n" +
                "     I                  \\  \\  \\          \\\n" +
                "     A                   \\  \\  \\          '\\\n" +
                "     |              snd   \\  \\__|           '\n" +
                "                           \\_:.  \\\n" +
                "                             \\ \\  \\\n" +
                "                              \\ \\  \\\n" +
                "                               \\_\\_| \n";

    }


}
