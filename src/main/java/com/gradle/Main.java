package com.gradle;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;

public class Main {
    public static void main(String[] args){

        User user = User.getInstance("Ainura","Kursabayeva","project","123");
        System.out.println(user.toString());

        Connection conn;
        ResultSet rs;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/java?user=root&password=&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
            rs = conn.createStatement().executeQuery("select * from USER ");
            int i = 0;
            String name = user.getName()+" "+user.getSurname();
            String login = user.getLogin();
            String pass = user.getPassword();
            Statement st = conn.createStatement();

            String sql = "INSERT INTO user (id,name,login,password) VALUES(NULL, '"+name+"', '"+login+"', '"+pass+"')";
            st.executeUpdate(sql);


            conn.close();

        } catch (SQLException ex){
            System.out.println("Error: ");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        System.out.println("Hello, Welcome to SmartHomeBot.");


        String current_login = user.getLogin();
        String current_password = user.getPassword();
        int flag = 0;

        while(flag != 1) {
            System.out.println("Please enter login:");
            Scanner scanner = new Scanner(System.in);
            String login = scanner.next();
            System.out.println("\nPlease enter password:");
            Scanner scanner2 = new Scanner(System.in);
            String pass = scanner.next();

            if (!login.equalsIgnoreCase(current_login)) {
                System.out.println("\nEntered incorrect login");
            } else {
                if (!pass.equalsIgnoreCase(current_password)) {
                    System.out.println("\nEntered incorrect password");
                } else {
                    flag = 1;
                }
            }
        }

        if(flag == 1){
            RoomI bath = new BathRoom(new BasicRoom());
            RoomI bedroom = new BedRoom(new BasicRoom());
            RoomI hall = new HallRoom(new BasicRoom());
            RoomI kitchen = new KitchenRoom(new BasicRoom());
            int n = 0;
            while(n != 5){
                Scanner scan = new Scanner(System.in);
                System.out.println("-------------------");
                System.out.println("ALL AVAILABLE ROOMS");
                System.out.println("1 - to open bath");
                System.out.println("2 - to open bedroom");
                System.out.println("3 - to open hall");
                System.out.println("4 - to open kitchen");
                System.out.println("5 - to quit program");
                n = scan.nextInt();
                System.out.println(n);
                switch (n){
                    case 1:
                        System.out.println("-------------------");
                        System.out.println("ALL AVAILABLE FUNCTIONS OF bath");
                        System.out.println("1 - to turn on light in bath");
                        System.out.println("2 - to turn off light in bath");
                        System.out.println("3 - to open door in bath");
                        System.out.println("4 - to close door in bath");
                        System.out.println("5 - to open window in bath");
                        System.out.println("6 - to close window in bath");
                        System.out.println("7 - to clean-up in bath");
                        System.out.println("8 - to turn on juzz music in bath");
                        System.out.println("9 - to add device to bath");
                        System.out.println("10 - to delete device from bath");
                        System.out.println("11 - to show all devices of bath");
                        System.out.println("12 - go back");
                        Scanner sc = new Scanner(System.in);
                        int b = sc.nextInt();
                        switch (b){
                            case 1:
                                bath.turn_on_light();
                                break;
                            case 2:
                                bath.turn_off_light();
                                break;
                            case 3:
                                bath.open_door();
                                break;
                            case 4:
                                bath.close_door();
                                break;
                            case 5:
                                bath.open_window();
                                break;
                            case 6:
                                bath.close_door();
                                break;
                            case 7:
                                bath.clean_up();
                                break;
                            case 8:
                                bath.play_juzz();
                                break;
                            case 9:
                                bath.makeAction(1);
                                break;
                            case 10:
                                bath.makeAction(2);
                                break;
                            case 11:
                                bath.makeAction(3);
                                break;
                            }
                        break;
                    case 2:
                        System.out.println("-------------------");
                        System.out.println("ALL AVAILABLE FUNCTIONS OF bedroom");
                        System.out.println("1 - to turn on light in bedroom");
                        System.out.println("2 - to turn off light in bedroom");
                        System.out.println("3 - to open door in bedroom");
                        System.out.println("4 - to close door in bedroom");
                        System.out.println("5 - to open window in bedroom");
                        System.out.println("6 - to close window in bedroom");
                        System.out.println("7 - to clean-up in bedroom");
                        System.out.println("8 - to turn on juzz music in bedroom");
                        System.out.println("9 - to add device to bedroom");
                        System.out.println("10 - to delete device from bedroom");
                        System.out.println("11 - to show all devices of bedroom");
                        System.out.println("12 - go back");
                        Scanner sc1 = new Scanner(System.in);
                        int b1 = sc1.nextInt();
                        switch (b1){
                            case 1:
                                bedroom.turn_on_light();
                                break;
                            case 2:
                                bedroom.turn_off_light();
                                break;
                            case 3:
                                bedroom.open_door();
                                break;
                            case 4:
                                bedroom.close_door();
                                break;
                            case 5:
                                bedroom.open_window();
                                break;
                            case 6:
                                bedroom.close_door();
                                break;
                            case 7:
                                bedroom.clean_up();
                                break;
                            case 8:
                                bedroom.play_juzz();
                                break;
                            case 9:
                                bedroom.makeAction(1);
                                break;
                            case 10:
                                bedroom.makeAction(2);
                                break;
                            case 11:
                                bedroom.makeAction(3);
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("-------------------");
                        System.out.println("ALL AVAILABLE FUNCTIONS OF hall");
                        System.out.println("1 - to turn on light in hall");
                        System.out.println("2 - to turn off light in hall");
                        System.out.println("3 - to open door in hall");
                        System.out.println("4 - to close door in hall");
                        System.out.println("5 - to open window in hall");
                        System.out.println("6 - to close window in hall");
                        System.out.println("7 - to clean-up in hall");
                        System.out.println("8 - to turn on juzz music in hall");
                        System.out.println("9 - to add device to hall");
                        System.out.println("10 - to delete device from hall");
                        System.out.println("11 - to show all devices of hall");
                        System.out.println("12 - go back");
                        Scanner sc2 = new Scanner(System.in);
                        int b2 = sc2.nextInt();
                        switch (b2){
                            case 1:
                                hall.turn_on_light();
                                break;
                            case 2:
                                hall.turn_off_light();
                                break;
                            case 3:
                                hall.open_door();
                                break;
                            case 4:
                                hall.close_door();
                                break;
                            case 5:
                                hall.open_window();
                                break;
                            case 6:
                                hall.close_door();
                                break;
                            case 7:
                                hall.clean_up();
                                break;
                            case 8:
                                hall.play_juzz();
                                break;
                            case 9:
                                hall.makeAction(1);
                                break;
                            case 10:
                                hall.makeAction(2);
                                break;
                            case 11:
                                hall.makeAction(3);
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("-------------------");
                        System.out.println("ALL AVAILABLE FUNCTIONS OF kitchen");
                        System.out.println("1 - to turn on light in kitchen");
                        System.out.println("2 - to turn off light in kitchen");
                        System.out.println("3 - to open door in kitchen");
                        System.out.println("4 - to close door in kitchen");
                        System.out.println("5 - to open window in kitchen");
                        System.out.println("6 - to close window in kitchen");
                        System.out.println("7 - to clean-up in kitchen");
                        System.out.println("8 - to turn on juzz music in kitchen");
                        System.out.println("9 - to add device to kitchen");
                        System.out.println("10 - to delete device from kitchen");
                        System.out.println("11 - to show all devices of kitchen");
                        System.out.println("12 - go back");
                        Scanner sc3 = new Scanner(System.in);
                        int b3 = sc3.nextInt();
                        switch (b3){
                            case 1:
                                kitchen.turn_on_light();
                                break;
                            case 2:
                                kitchen.turn_off_light();
                                break;
                            case 3:
                                kitchen.open_door();
                                break;
                            case 4:
                                kitchen.close_door();
                                break;
                            case 5:
                                kitchen.open_window();
                                break;
                            case 6:
                                kitchen.close_door();
                                break;
                            case 7:
                                kitchen.clean_up();
                                break;
                            case 8:
                                kitchen.play_juzz();
                                break;
                            case 9:
                                kitchen.makeAction(1);
                                break;
                            case 10:
                                kitchen.makeAction(2);
                                break;
                            case 11:
                                kitchen.makeAction(3);
                                break;
                        }
                        break;

                }
            }
        }

    }
}
