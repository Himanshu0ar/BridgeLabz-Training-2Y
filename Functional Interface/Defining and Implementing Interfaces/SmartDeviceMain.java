public class SmartDeviceMain {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();
        
        light.turnOn();
        light.turnOff();
        
        ac.turnOn();
        ac.turnOff();
        
        tv.turnOn();
        tv.turnOff();
    }
}