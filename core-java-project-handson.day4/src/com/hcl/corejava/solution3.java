package com.hcl.corejava;

import java.util.*;


public class solution3 {


    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        System.out.println(" Select the Card\r\n" +
                " 1.Payback Card\r\n" +
                " 2.Membership Card\r\n" +
                "");
        System.out.println("Enter number 1 or 2 or 3: ");
        int c = s.nextInt();
        if (c == 1) {
            PaybackCard p = new PaybackCard(null, null, null, c, (double) c);
            System.out.println(" Enter the Card Details:(Name|Number|Date)");
            String carddetails = s.next();
            String[] newstring = carddetails.split("\\|");
            for (int i = 0; i < newstring.length; i++) {
                System.out.print(newstring[i]);
            }
            System.out.println("");

            p.setCardNumber(newstring[1]);
            System.out.println("");
            System.out.println("Enter points in card:");
            int points = s.nextInt();
            p.setPointsEarned(points);

            System.out.println("");
            System.out.println("Enter Amount:");
            int amount = s.nextInt();
            p.setTotalAmount(amount);

            String NAME1 = newstring[0];
            System.out.println("");
            System.out.println(NAME1 + " Payback card details:");
            System.out.println("Card Number :" + p.getCardNumber());
            System.out.println("points Earned:" + p.getPointsEarned());
            System.out.println("Total Amount:" + p.getTotalAmount());
        }


        if (c == 2) {
            MembershipCard m = new MembershipCard(null, null, null, c, c);
            System.out.println("Enter card details(Name|Number|Date|Rating)");
            String card_details = s.next();
            String[] newstring = card_details.split("\\|");
            m.setCardNumber(newstring[1]);
            m.setRating(Integer.parseInt(newstring[3]));
            System.out.println(newstring[0] + " Membership card details:");
            System.out.println("Card number :" + m.getCardNumber());
            System.out.println("Total Rating:" + m.getRating());
        }
        if (c == 3) {
            System.exit(0);
        }


    }


    // TODO Auto-generated method stub


}