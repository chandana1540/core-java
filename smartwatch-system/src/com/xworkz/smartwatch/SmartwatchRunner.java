package com.xworkz.smartwatch;

import com.xworkz.smartwatch.impl.AppleWatchImpl;
import com.xworkz.smartwatch.impl.FitbitImpl;
import com.xworkz.smartwatch.impl.SamsungWatchImpl;

public class SmartwatchRunner {
    public static void main(String[] args) {

        Smartwatch appleWatch = new AppleWatchImpl();
        appleWatch.on();
        appleWatch.off();

        Smartwatch samsungWatch = new SamsungWatchImpl();
        samsungWatch.on();
        samsungWatch.off();

        Smartwatch fitbit = new FitbitImpl();
        fitbit.on();
        fitbit.off();
    }
}

