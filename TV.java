public class TV implements Device {

    private int volume = 0;

    @Override
    public void turnOn() {
        System.out.println("TV está ligada.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV está desligada.");    
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
        System.out.println("Volume da TV ajustado para " + volume + "%.");
    }
    
}
