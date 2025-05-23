package models;

public class Donation {
    private String donorId;
    private double amount;
    private String category;
    private String receiptId;

    public Donation(String donorId, double amount, String category, String receiptId) {
        this.donorId = donorId;
        this.amount = amount;
        this.category = category;
        this.receiptId = receiptId;
    }

    public String getDonorId() {
        return donorId;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getReceiptId() {
        return receiptId;
    }

    @Override
    public String toString() {
        return "Amount: ₹" + amount + "\nCategory: " + category + "\nReceipt ID: " + receiptId;
    }
}