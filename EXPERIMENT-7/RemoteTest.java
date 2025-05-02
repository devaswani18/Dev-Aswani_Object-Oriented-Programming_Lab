interface Remote 
{
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
}

class Television implements Remote {
    private boolean isOn;
    private int currentChannel;

    @Override
    public void powerOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("TV is now ON.");
        } else {
            System.out.println("TV is already ON.");
        }
    }

    @Override
    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println("TV is now OFF.");
        } else {
            System.out.println("TV is already OFF.");
        }
    }

    @Override
    public void changeChannel(int channel) {
        if (isOn) {
            currentChannel = channel;
            System.out.println("Channel changed to " + currentChannel);
        } else {
            System.out.println("Cannot change channel. The TV is OFF.");
        }
    }
}
public class RemoteTest {
    public static void main(String[] args) {
        Remote myRemote = new Television();
        myRemote.powerOn();          
        myRemote.changeChannel(5);   
        myRemote.changeChannel(10);  
        myRemote.powerOff();       
        myRemote.changeChannel(2);   
    }
}