import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class Motor2 
{

    public static void main(String[] args) 
    {
        LCD.drawString("Program 2", 0, 0);
        Button.waitForAnyPress();
        Motor.B.setSpeed(720);
        Motor.C.setSpeed(720);
        Motor.B.forward();
        Motor.C.forward();

        LCD.clear();
        Delay.msDelay(2000);

        LCD.drawInt(Motor.B.getTachoCount(),0,0);
        LCD.drawInt(Motor.C.getTachoCount(),0,0);
        Motor.B.stop();
        Motor.C.stop();

        LCD.drawInt(Motor.B.getTachoCount(),0,1);
        LCD.drawInt(Motor.C.getTachoCount(),0,1);
        Motor.B.backward();
        Motor.C.backward();

        while (Motor.B.getTachoCount()>0);
        while (Motor.C.getTachoCount()>0);
            LCD.drawInt(Motor.B.getTachoCount(),0,2);
            LCD.drawInt(Motor.C.getTachoCount(),0,2);
            Motor.B.stop();
            Motor.C.stop();
            LCD.drawInt(Motor.B.getTachoCount(),0,3);
            LCD.drawInt(Motor.C.getTachoCount(),0,3);
            Button.waitForAnyPress();
        
    }

}