package Cast;

public class CameraRunner {
    public static void main(String[] args) {

        Camera camera1 = new Camera();
        camera1.capture();
        camera1.focus();
        camera1.zoom();
        camera1.store();
        camera1.transferPhotos();
        System.out.println("----------------------");

        Camera camera2 = new CameraDetails();
        camera2.capture();
        camera2.focus();
        camera2.zoom();
        camera2.store();
        camera2.transferPhotos();
        System.out.println("----------------------");

        CameraDetails camera3 = new CameraDetails();
        camera3.capture();
        camera3.focus();
        camera3.zoom();
        camera3.store();
        camera3.transferPhotos();
        camera3.extraMethod();
        System.out.println("----------------------");

        CameraCast caster = new CameraCast();
        caster.cast(camera2);
    }
}
