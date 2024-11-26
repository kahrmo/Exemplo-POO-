public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl tvRemote = new RemoteControl(tv);
        AdvancedRemoteControl radioRemote = new AdvancedRemoteControl(radio);

        tvRemote.turnOn();
        tvRemote.setVolume(30);

        radioRemote.turnOn();
        radioRemote.setVolume(50);
        radioRemote.mute();
    }
}
