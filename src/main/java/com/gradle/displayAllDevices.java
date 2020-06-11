package com.gradle;

import java.util.ArrayList;

public class displayAllDevices implements Action {
    @Override
    public void execute(ArrayList<Device> devices, Device device) {
        int cnt = 0;
        System.out.println("All devices list:");
        int size = devices.size();
        while(size > cnt ){
            System.out.println("Device: "+devices.get(cnt).getDevice_name());
            cnt ++;
        }
    }
}
