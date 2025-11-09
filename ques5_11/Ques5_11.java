package ques5_11;
interface Device
{
    void powerOn();
}
interface SmartDevice extends Device
{
    void connectWiFi();
}
class SmartPhone implements SmartDevice
{
    @Override
    public void powerOn()
    {
        System.out.println("power is ON...");
    }
    @Override
    public void connectWiFi()
    {
        System.out.println("connecting wifi...");
    }
}
public class Ques5_11 
{
    public static void main(String[] args) 
    {
        SmartPhone s1 = new SmartPhone();
        s1.powerOn();
        s1.connectWiFi();
    }
}
