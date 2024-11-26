public class Radio implements Device{
    
    private int volume = 0;

    @Override
    public void turnOn() {
        System.out.println("Rádio está ligada.");
    }

    @Override
    public void turnOff() {
        System.out.println("Rádio está desligada.");    
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
        System.out.println("Volume do Rádio ajustado para " + volume + "%.");
    }
    
}

