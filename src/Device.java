public class Device {

    public Device(double deviceDepth, double deviceHeight, double deviceWidth, boolean isTouchScreen, String deviceName) {
        this.deviceDepth = (float) deviceDepth;
        this.deviceHeight = (float) deviceHeight;
        this.deviceWidth = (float) deviceWidth;
        this.isTouchScreen = isTouchScreen;
        this.deviceName = deviceName;
    }

    public Device(String deviceName) {
        this(0, 0, 0, deviceName);
    }

    public Device(double deviceDepth, double deviceHeight, double deviceWidth, String deviceName) {
        this(deviceDepth, deviceHeight, deviceWidth, false, deviceName);
    }

    private float batteryLife;      // Total battery life.
    private byte batteryContent;    // Battery left in %.
    private boolean isTouchScreen;
    private float deviceHeight;
    private float deviceWidth;
    private float deviceDepth;
    private boolean isTurnedOn;
    private String deviceName;
    private int passCode;

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

    public String getDeviceName() {
        return deviceName;
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
        } else {
            System.out.println(deviceName + " is shutting down.");
        }
    }


    public void charge() {
        charge(10);
    }

    public void charge(int speed) {
        if (batteryContent < 100) {
            batteryContent += Math.min(100 - batteryContent, speed);
        }
        System.out.println(deviceName + " has " + batteryContent + "% charge");
    }

    public String toString() {
        return deviceName + " is a device of width " + deviceWidth;
    }
}
