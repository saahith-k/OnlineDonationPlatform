package main;

import models.Donor;
import services.DonationService;
import services.LeaderboardService;
import java.util.Scanner;

public class DonationApp {
    public static void main(String[] args) {
        DonationService donationService = new DonationService();
        LeaderboardService leaderboardService = new LeaderboardService(donationService);
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Online Donation Platform ===");

        while (true) {
            System.out.println("\n1. Register Donor");
            System.out.println("2. Make Donation");
            System.out.println("3. View Leaderboard");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter Donor ID: ");
                    String donorId = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    donationService.registerDonor(new Donor(donorId, name, email));
                    System.out.println("Donor registered successfully!");
                    break;
                case 2:
                    try {
                        System.out.print("Enter Donor ID: ");
                        String dId = scanner.nextLine();
                        System.out.print("Enter Donation Amount: ₹");
                        double amount = Double.parseDouble(scanner.nextLine());
                        System.out.print("Enter Donation Category: ");
                        String category = scanner.nextLine();
                        donationService.makeDonation(dId, amount, category);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    leaderboardService.displayTopDonors();
                    break;
                case 4:
                    System.out.println("Thank you for using the platform!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}