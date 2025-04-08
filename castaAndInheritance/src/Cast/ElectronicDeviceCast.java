package Cast;

public class ElectronicDeviceCast {
    public void cast(ElectronicDevice electronicDevice) {
        System.out.println("Casting ElectronicDevice");
        electronicDevice.powerOn();
        electronicDevice.powerOff();
        electronicDevice.charge();
        electronicDevice.updateSoftware();
        electronicDevice.connectToWifi();
        if(electronicDevice instanceof ElectronicDeviceDetails) {
            ElectronicDeviceDetails ref = (ElectronicDeviceDetails)electronicDevice;
            ref.extraMethod();
        }
    }
}
