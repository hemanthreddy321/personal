package com.hcl.corejava;

public abstract class Card {
    String holderName;
    String cardNumber;
    String expiryDate;

    public Card(String holderName, String cardNumber, String expiryDate) {
        super();
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }


}

class MembershipCard extends Card {
    int rating;


    public MembershipCard(String holderName, String cardNumber, String expiryDate, int rating, double c) {
        super(holderName, cardNumber, expiryDate);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

class PaybackCard extends Card {
    int pointsEarned;
    Double totalAmount;

    public PaybackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned,
                       Double totalAmount) {
        super(holderName, cardNumber, expiryDate);
        this.pointsEarned = pointsEarned;
        this.totalAmount = totalAmount;
    }

    public Integer getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(Integer pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int amount) {
        this.totalAmount = (double) amount;
    }
}