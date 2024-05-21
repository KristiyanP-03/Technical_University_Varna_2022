package observer;


class Camera implements Observer {
    private String cameraId;
    public Camera(String id) {
        this.cameraId = id;
    }
    @Override
    public void update(String location) {
        System.out.println("Camera " + cameraId + " detected Lizard at: " + location);
    }
}
