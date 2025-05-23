package services;

import java.util.*;
import models.Donor;

public class LeaderboardService {
    private DonationService donationService;

    public LeaderboardService(DonationService donationService) {
        this.donationService = donationService;
    }

    public void displayTopDonors() {
        Map<String, Double> totals = donationService.getDonorTotals();
        List<Map.Entry<String, Double>> list = new ArrayList<>(totals.entrySet());
        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("Top Donors:");
        for (Map.Entry<String, Double> entry : list) {
            Donor donor = donationService.getDonor(entry.getKey());
            System.out.println(donor.getName() + " - ₹" + entry.getValue());
        }
    }
}