package com.gradle;

import java.util.ArrayList;

public class DeleteDevice implements Action {
    @Override
    public void execute(ArrayList<Device> devices, Device device) {
        devices.remove(device);
        System.out.println(device.getDevice_name()+" device is removed");
    }
}
