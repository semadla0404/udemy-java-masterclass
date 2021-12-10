public class Lamp {
    private boolean isOn;

    public Lamp(boolean isOn) {
        this.isOn = isOn;
    }

    private void toggleLights(boolean isOn) {
        if(isOn) {
            System.out.println("Lights are currently on.  Turning lights off.");
            this.isOn = false;
        } else {
            System.out.println("Lights are currently off.  Turning lights on.");
            this.isOn = true;
        }
    }

    public void lightsCommand() {
        System.out.println("Checking the status of the lights...");
        this.toggleLights(isOn);
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
