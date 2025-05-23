package services;

import models.Donor;
import models.Donation;
import exceptions.*;

import java.util.*;

public class DonationService {
    private HashMap<String, Donor> donors = new HashMap<>();
    private List<Donation> donations = new ArrayList<>();
    private Map<String, Double> donorTotals = new HashMap<>();
    private static final double MIN_DONATION = 100.0;

    public void registerDonor(Donor donor) {
        donors.put(donor.getDonorId(), donor);
    }

    public void makeDonation(String donorId, double amount, String category) throws DonorNotFoundException, InvalidDonationAmountException {
        if (!donors.containsKey(donorId)) {
            throw new DonorNotFoundException("Donor not found.");
        }
        if (amount < MIN_DONATION) {
            throw new InvalidDonationAmountException("Minimum donation amount is ₹" + MIN_DONATION);
        }
        String receiptId = "DON" + new Random().nextInt(999999);
        Donation donation = new Donation(donorId, amount, category, receiptId);
        donations.add(donation);
        donorTotals.put(donorId, donorTotals.getOrDefault(donorId, 0.0) + amount);
        System.out.println("Thank you for your donation, " + donors.get(donorId).getName() + "!");
        System.out.println(donation);
        System.out.println("You have been added to the top donor leaderboard.\n");
    }

    public Map<String, Double> getDonorTotals() {
        return donorTotals;
    }

    public Donor getDonor(String donorId) {
        return donors.get(donorId);
    }
}