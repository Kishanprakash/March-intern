package Cast;

public class CameraCast {
    public void cast(Camera camera) {
        System.out.println("Casting Camera");
        camera.capture();
        camera.focus();
        camera.zoom();
        camera.store();
        camera.transferPhotos();
        if(camera instanceof CameraDetails) {
            CameraDetails ref = (CameraDetails)camera;
            ref.extraMethod();
        }
    }
}
