package com.gradle;

import java.util.ArrayList;

public class AddDevice implements Action {

    @Override
    public void execute(ArrayList<Device> devices, Device device) {
        devices.add(device);
        System.out.println(device.getDevice_name()+" device added");
    }
}
