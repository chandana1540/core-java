package com.xworkz.smartdoorapp;
import com.xworkz.smartdoorapp.impl.ElectronicLockImpl;
import com.xworkz.smartdoorapp.impl.FingerprintLockImpl;
import com.xworkz.smartdoorapp.impl.KeypadLockImpl;

public class SmartDoorRunner {
    public static void main(String[] args) {

        Switch lock1 = new ElectronicLockImpl();
        lock1.on();
        lock1.off();

        Switch lock2 = new FingerprintLockImpl();
        lock2.on();
        lock2.off();

        Switch lock3 = new KeypadLockImpl();
        lock3.on();
        lock3.off();
    }
}


