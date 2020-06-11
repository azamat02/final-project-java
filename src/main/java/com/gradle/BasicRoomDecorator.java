package com.gradle;

import java.util.ArrayList;

public abstract class BasicRoomDecorator implements BasicRoomI {
    protected BasicRoomI Room;


    public BasicRoomDecorator(BasicRoomI room) {
        this.Room = room;
    }
}
