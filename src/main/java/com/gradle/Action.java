package com.gradle;

import java.util.ArrayList;

public interface Action {
    public void execute(ArrayList<Device> devices, Device device);
}
