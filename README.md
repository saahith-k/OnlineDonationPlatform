#  Online Donation Platform

A Java-based console application that enables donors to contribute funds, view top donors, and manage donation records efficiently. The system applies core OOP principles, Java Collections (Map, List), and custom Exception Handling to maintain transparency, integrity, and ease of use.

---

##  Objective

To develop a secure and transparent donation platform that:
- Registers donors
- Accepts validated donations
- Tracks and ranks contributors in a live leaderboard
- Organizes donation records with modular structure

---

##  Package Structure
online_donation_platform/
├── src/
│ ├── models/ # Core entities: Donor and Donation
│ │ ├── Donor.java
│ │ ├── Donation.java
│ ├── exceptions/ # Custom exception handling
│ │ ├── InvalidDonationAmountException.java
│ │ ├── DonorNotFoundException.java
│ ├── services/ # Business logic and processing
│ │ ├── DonationService.java
│ │ ├── LeaderboardService.java
│ ├── main/ # Application entry point
│ │ ├── DonationApp.java
├── README.md
├── .gitignore


---

##  Technologies Used

- Java 8+
- Java Collections Framework
- Custom Exception Handling
- OOP (Classes, Encapsulation, Abstraction)
- Console I/O

---

##  Features

✅ Donor Management  
✅ Secure Donation with Validation  
✅ Live Leaderboard System  
✅ Donation History and Receipts  
✅ Monthly Reports Generation  
✅ Optional Filtering by Category

---

##  How to Run

1. Clone or download the repository.
2. Open the project in any Java IDE (IntelliJ, Eclipse, VS Code).
3. Run `DonationApp.java` located in `src/main/`.

---

##  Functional Overview

### 1. Donor Management
- `Donor` class contains donorId, name, and email.
- Donors are stored in a `HashMap<String, Donor>` for quick access.

### 2. Donation Handling
- Donations are stored and processed via the `DonationService`.
- Categories like Education, Healthcare, Environment are supported.

### 3. Leaderboard System
- Total donations tracked using `Map<String, Double>`.
- Top donors are displayed in descending order using sorted lists.

### 4. Exception Handling
- `InvalidDonationAmountException`: Ensures minimum threshold.
- `DonorNotFoundException`: Prevents donations from unregistered users.

---

##  Sample Input/Output

**Input:**
Donor Name: Saahith
Donation Amount: ₹1000
Category: Education

**Output:**
Thank you for your donation, Priya Sharma!
Amount: ₹1000
Category: Education
Receipt ID: DON123456
You have been added to the top donor leaderboard.


---

##  Sample Classes

| Class                    | Responsibility                            |
|--------------------------|--------------------------------------------|
| `Donor`                  | Represents donor data                      |
| `Donation`               | Represents individual donation record      |
| `DonationService`        | Handles donation logic and validations     |
| `LeaderboardService`     | Sorts and displays top donors              |
| `DonationApp`            | Console interface for interacting users    |

---

## 🙋‍♂ Author

**Saahith**  
3rd Year B.Tech | Computer Science and Business Systems (CSBS)  
Aspiring software developer passionate about social impact 🌍

---

## 📄 License

This project is free and open-source. Feel free to use, modify, and share!
