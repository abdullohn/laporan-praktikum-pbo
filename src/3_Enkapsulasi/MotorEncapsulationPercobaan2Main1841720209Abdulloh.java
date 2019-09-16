/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Abror
 */
public class MotorEncapsulationPercobaan2Main1841720209Abdulloh {
    public static void main(String[] args){
        MotorEncapsulationPercobaan21841720209Abdulloh motor = new MotorEncapsulationPercobaan21841720209Abdulloh();
        motor.printStatus();
        motor.tambahKecepatan();
        
        motor.nyalakanMesin();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.matikanMesin();
        motor.printStatus();
    }
}
