public class CommandPatternTest {
    public static void main(String[] args) {
        // Create the receiver
        Light livingRoomLight = new Light();

        // Create the concrete command objects
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Create the invoker
        RemoteControl remoteControl = new RemoteControl();

        // Turn the light on
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        // Turn the light off
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
    }
}
