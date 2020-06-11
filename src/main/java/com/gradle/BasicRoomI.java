package com.gradle;

import java.util.ArrayList;

public interface BasicRoomI extends RoomI{
    void turn_on_light();
    void turn_off_light();
    void close_door();
    void open_door();
    void open_window();
    void close_window();
    void clean_up();
    void makeAction(int n);
}
