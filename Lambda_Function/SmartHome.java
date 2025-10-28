interface LightAction {
    void activate();
}

public class SmartHome {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Lights ON due to motion");
        LightAction night = () -> System.out.println("Soft lights ON at night");
        LightAction voice = () -> System.out.println("Voice command activated lights");

        motion.activate();
        night.activate();
        voice.activate();
    }
}
