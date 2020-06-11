package com.gradle;
import java.awt.Desktop;
import java.net.URI;
import java.util.ArrayList;
import java.util.Scanner;

public class BathRoom extends BasicRoomDecorator {
    public ArrayList<Device> devices_of_room = new ArrayList<>();
    public ActionHelper helper = new ActionHelper();

    public BathRoom(BasicRoomI room) {
        super(room);
    }

    @Override
    public void turn_on_light() {
        System.out.println("Light is turned on in bath");
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://i1.wp.com/business-ethics.com/wp-content/uploads/2011/09/EarthTalkBULB.jpg?resize=1061%2C640&ssl=1");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void turn_off_light() {
        System.out.println("Light is turn off in bath");
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://ak.picdn.net/shutterstock/videos/27813466/thumb/1.jpg");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close_door() {
        System.out.println("Door is closed in bath");
    }

    @Override
    public void open_door() {
        System.out.println("Door is opened in bath");
    }

    @Override
    public void open_window() {
        System.out.println("Window is opened in bath");
    }

    @Override
    public void close_window() {
        System.out.println("Window is closed in bath");
    }

    @Override
    public void clean_up() {
        System.out.println("Robo-cleaner is cleaning in bath");
    }

    @Override
    public void makeAction(int n) {
        if(n == 1){
            helper.setAction(new AddDevice());
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter device name: ");
            String s = scan.next();
            Device dev = new Device(s);
            helper.executeAction(devices_of_room, dev);
        }
        else if(n == 2){
            helper.setAction(new DeleteDevice());
            System.out.println("Enter device name to delete: ");
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int cnt = 0, flag=0, size = devices_of_room.size();
            while(cnt < size){
                String device_name = devices_of_room.get(cnt).getDevice_name();
                if(s.equalsIgnoreCase(device_name)){
                    flag = 1;
                }
                cnt ++;
            }
            if(flag == 1){
                helper.executeAction(devices_of_room, devices_of_room.get(cnt-1));
            }
            else if(flag == 0){
                System.out.println("Device with name "+s+" not found");
            }
        }
        else if(n == 3){
            helper.setAction(new displayAllDevices());
            helper.executeAction(devices_of_room, null);
        }
    }

    @Override
    public void play_juzz() {
        System.out.println("Juzz music playing in bath");
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://www.youtube.com/watch?v=PErqizZqLjI");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
