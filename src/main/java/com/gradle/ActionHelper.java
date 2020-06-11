package com.gradle;

import java.util.ArrayList;

public class ActionHelper {
    private Action action;

    public void setAction(Action action){
        this.action = action;
    }

    public void executeAction(ArrayList<Device> devices, Device device){
        this.action.execute(devices, device);
    }
}
