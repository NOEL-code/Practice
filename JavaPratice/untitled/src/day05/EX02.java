package day05;

public class EX02 {
    public static void main(String[] args) {


    }
}

abstract class Bluetooth{
    int serialNum;

    Bluetooth(int serialNum){
        this.serialNum = serialNum;
    }
    void connect() {}
    void disConnect() {}
}

class BluetoothDevice extends Bluetooth{

    BluetoothDevice(int serialNum) {
        super(serialNum);
    }
    @Override
    public void connect() {

    }

    @Override
    public void disConnect() {

    }
}

interface Speaker {
    void play();
    void OutputVolumeUp();
    void OutputVolumeDown();
}

interface Microphone {
    void inputSound();
}

class BluetoothMicrophone extends BluetoothDevice implements Speaker, Microphone {
    int serialNum;

    int maxVolume;
    int volume = maxVolume;

    BluetoothMicrophone(int serialNum, int maxVolume) {
        super(serialNum);
        this.maxVolume = maxVolume;
    }

    @Override
    public void play() {

    }

    @Override
    public void OutputVolumeUp() {

    }

    @Override
    public void OutputVolumeDown() {

    }

    @Override
    public void inputSound() {

    }
}

