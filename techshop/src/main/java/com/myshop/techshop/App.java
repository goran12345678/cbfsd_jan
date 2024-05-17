package com.myshop.techshop;

import com.myshop.techshop.model.Device;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Device device = new Device("iPhone 55", 29999.99f, "The latest in iPhone tech");
        
        Device device2 = new Device("Samsung Note 22", 999.99f, "Latest 5G phone");
        
        Float total = device.getTotalPrice() + device2.getTotalPrice();
                
    }
}
