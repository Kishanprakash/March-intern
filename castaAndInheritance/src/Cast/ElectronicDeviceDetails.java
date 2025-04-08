package Cast;

public class ElectronicDeviceDetails extends ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("Overridden: powerOn in ElectronicDeviceDetails");
    }

    @Override
    public void powerOff() {
        System.out.println("Overridden: powerOff in ElectronicDeviceDetails");
    }

    @Override
    public void charge() {
        System.out.println("Overridden: charge in ElectronicDeviceDetails");
    }

    @Override
    public void updateSoftware() {
        System.out.println("Overridden: updateSoftware in ElectronicDeviceDetails");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Overridden: connectToWifi in ElectronicDeviceDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ElectronicDeviceDetails");
    }
}
