public class Main {
    public static void main(String[] args) {

        Device reneLaptop = new Device(30, 4, 25, false, "René's Laptop");
        Device rebeccaLaptop = new Device("Rebecca's laptop");
        Device rebeccaPhone = new Device("Rebecca's phone");
        Device renePhone = new Device("René's phone");

        rebeccaPhone.setBatteryLife(264.6f);
        rebeccaPhone.setBatteryContent(100);

        System.out.println("Rebecca's device has " + rebeccaPhone.getBatteryContent() + "% of battery.");

        if (reneLaptop.isTouchScreen()) {
            System.out.println("René's laptop is touch screen.");
        } else {
            System.out.println("René's laptop is not touch screen.");
        }

        rebeccaPhone.pressPowerButton();
        rebeccaPhone.pressPowerButton();

    }
}