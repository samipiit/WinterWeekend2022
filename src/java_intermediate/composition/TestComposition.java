package java_intermediate.composition;

public class TestComposition {

    public static void main(String[] args) {
        Monitor samsungMonitor = new Monitor("Samsung", "4K", 27, true);
        Keyboard logitechKeyboard = new Keyboard("Logitech", "Black", true, true,
                false);
        Mouse logitechMouse = new Mouse("Logitech", true, true, false);
        Camera logitechCamera = new Camera("Logitech", "1080p", true);


        Computer lenovoComputer = new Computer(samsungMonitor, logitechKeyboard, logitechMouse, logitechCamera);

        lenovoComputer.monitor.increaseVol(50);
        lenovoComputer.camera.takePicture();
        lenovoComputer.mouse.scrollUp();
        lenovoComputer.keyboard.enableBacklights();
    }
}
