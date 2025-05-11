package CoreJava;

interface camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Photo taken with high resolution.");
    }

    public void playMusic() {
        System.out.println("Playing music through Spotify.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        s1.takePhoto();
        s1.playMusic();
    }
}