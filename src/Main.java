public class Main {
    public static void main(String[] args) {

        Device reneLaptop = new Device(30, 4, 25, false, "René's Laptop");
        Device rebeccaLaptop = new Device("Rebecca's laptop");
        Device rebeccaPhone = new Device("Rebecca's phone");
        Device renePhone = new Device("René's phone");

        rebeccaPhone.setBatteryLife(264.6f);
        rebeccaPhone.setBatteryContent(80);

        System.out.println("Rebecca's device has " + rebeccaPhone.getBatteryContent() + "% of battery.");

        if (reneLaptop.isTouchScreen()) {
            System.out.println("René's laptop is touch screen.");
        } else {
            System.out.println("René's laptop is not touch screen.");
        }

        rebeccaPhone.pressPowerButton();
        rebeccaPhone.pressPowerButton();

        rebeccaPhone.charge();
        renePhone.charge(120);

        Device[] devices = {reneLaptop,rebeccaLaptop, rebeccaPhone,renePhone};
        for (Device d: devices) {
            System.out.println(d.getDeviceName() + " has " + d.getBatteryContent() + "% charge left");
        }

        Device[] deviceArray = new Device[2];
        deviceArray[0] = renePhone;
        deviceArray[1] = rebeccaPhone;
        for(int i = 0 ; i < deviceArray.length ; i++) {
            System.out.println(deviceArray[i]);
            System.out.println(i);
            System.out.println(deviceArray[i].toString());
        }
    }
}