package Cast;

public class CameraDetails extends Camera {
    @Override
    public void capture() {
        System.out.println("Overridden: capture in CameraDetails");
    }

    @Override
    public void focus() {
        System.out.println("Overridden: focus in CameraDetails");
    }

    @Override
    public void zoom() {
        System.out.println("Overridden: zoom in CameraDetails");
    }

    @Override
    public void store() {
        System.out.println("Overridden: store in CameraDetails");
    }

    @Override
    public void transferPhotos() {
        System.out.println("Overridden: transferPhotos in CameraDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in CameraDetails");
    }
}
