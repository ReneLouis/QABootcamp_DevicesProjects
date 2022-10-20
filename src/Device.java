public class Device {

    public Device (double deviceDepth, double deviceHeight, double deviceWidth, boolean isTouchScreen, String deviceName) {
        this.deviceDepth = (float) deviceDepth;
        this.deviceHeight = (float) deviceHeight;
        this.deviceWidth = (float) deviceWidth;
        this.isTouchScreen = isTouchScreen;
        this.deviceName = deviceName;
    }

    public Device(String deviceName) {
        deviceDepth = deviceHeight = deviceWidth = 0;
        isTouchScreen = true;
        this.deviceName = deviceName;
    }

    private float batteryLife;      // Total battery life.
    private byte batteryContent;    // Battery left in %.
    private boolean isTouchScreen;
    private float deviceHeight;
    private float deviceWidth;
    private float deviceDepth;
    private boolean isTurnedOn;
    private String deviceName;

    public float getBatteryLife() {
        return batteryLife;
    }

    public byte getBatteryContent() {
        return batteryContent;
    }

    public boolean isTouchScreen() {
        return isTouchScreen;
    }

    public float getDeviceHeight() {
        return deviceHeight;
    }

    public float getDeviceWidth() {
        return deviceWidth;
    }

    public float getDeviceDepth() {
        return deviceDepth;
    }

    public void setBatteryLife(float batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setBatteryContent(int batteryContent) {
        this.batteryContent = (byte) batteryContent;
    }

    public void pressPowerButton() {
        isTurnedOn = !isTurnedOn;
        if (isTurnedOn) {
            System.out.println(deviceName + " is booting up!");
        }   else {
            System.out.println(deviceName + " is shutting down.");
        }

    }
}
