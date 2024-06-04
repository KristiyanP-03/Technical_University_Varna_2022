package observer;

public class app {
    public static void main(String[] args) {
        Lizard lizard = new Lizard();
        Camera cam1 = new Camera("Cam1");
        Camera cam2 = new Camera("Cam2");
        lizard.register(cam1);
        lizard.register(cam2);
        lizard.setLocation("Rock");
        lizard.setLocation("Tree");
    }
}
