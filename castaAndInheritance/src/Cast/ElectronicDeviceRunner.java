package Cast;

public class ElectronicDeviceRunner {
    public static void main(String[] args) {

        ElectronicDevice electronicDevice1 = new ElectronicDevice();
        electronicDevice1.powerOn();
        electronicDevice1.powerOff();
        electronicDevice1.charge();
        electronicDevice1.updateSoftware();
        electronicDevice1.connectToWifi();
        System.out.println("----------------------");

        ElectronicDevice electronicDevice2 = new ElectronicDeviceDetails();
        electronicDevice2.powerOn();
        electronicDevice2.powerOff();
        electronicDevice2.charge();
        electronicDevice2.updateSoftware();
        electronicDevice2.connectToWifi();
        System.out.println("----------------------");

        ElectronicDeviceDetails electronicDevice3 = new ElectronicDeviceDetails();
        electronicDevice3.powerOn();
        electronicDevice3.powerOff();
        electronicDevice3.charge();
        electronicDevice3.updateSoftware();
        electronicDevice3.connectToWifi();
        electronicDevice3.extraMethod();
        System.out.println("----------------------");

        ElectronicDeviceCast caster = new ElectronicDeviceCast();
        caster.cast(electronicDevice2);
    }
}
