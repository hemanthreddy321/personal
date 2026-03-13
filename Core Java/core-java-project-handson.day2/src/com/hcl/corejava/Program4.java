package com.hcl.corejava;

public class Program4 {
    int roomNo;
    String roomType;
    float roomArea;
    boolean acMachine;

    public static void main(String[] args) {
        Room room1 = new Room();
        room1.setData(101, "Deluxe", 240.0f, true);
        room1.displayData();


    }

    void setData(int rno, String rt, float area, boolean ac) {
        roomNo = rno;
        roomType = rt;
        roomArea = area;
        acMachine = ac;
    }

    void displayData() {
        System.out.println("The room#.Is" + roomNo);
        System.out.println("The room Type is" + roomType);
        System.out.println("The room area is" + roomArea);
        String s = (acMachine) ? "yes" : "no";
        System.out.println("The A / c Machine needed" + s);
    }

}
