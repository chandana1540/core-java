package com.xworkz.printerapp;

import com.xworkz.printerapp.impl.DotMatrixPrinterImpl;
import com.xworkz.printerapp.impl.InkjetPrinterImpl;
import com.xworkz.printerapp.impl.LaserPrinterImpl;

public class PrinterRunner {
        public static void main(String[] args) {

            Switch printer1 = new InkjetPrinterImpl();
            printer1.on();
            printer1.off();

            Switch printer2 = new LaserPrinterImpl();
            printer2.on();
            printer2.off();

            Switch printer3 = new DotMatrixPrinterImpl();
            printer3.on();
            printer3.off();
        }
    }

