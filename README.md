# ATM System - Java Implementation

![Java](https://img.shields.io/badge/Java-100%25-orange?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-green?style=flat-square)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=flat-square)

## Project Overview

This is a console-based **Automated Teller Machine (ATM) system** implemented in Java. The application simulates real-world ATM functionality, allowing users to perform essential banking operations through a secure, menu-driven interface. The system includes PIN authentication, balance inquiries, deposits, withdrawals, and transaction history tracking.

---

## Features

- ✅ **PIN Authentication** - Secure login with 3 failed attempt protection
- ✅ **Check Balance** - View current account balance instantly
- ✅ **Deposit Money** - Add funds to your account with transaction logging
- ✅ **Withdraw Money** - Withdraw funds with validation checks
- ✅ **Transaction History** - View complete account activity log
- ✅ **Receipt Generation** - Optional receipts for transactions
- ✅ **Input Validation** - Protection against invalid amounts and operations
- ✅ **User-Friendly Menu** - Intuitive text-based interface for easy navigation

---

## Technologies Used

| Category | Technology |
|----------|-----------|
| **Language** | Java (JDK 8+) |
| **I/O** | Java Scanner (Standard Library) |
| **Data Structures** | ArrayList (Transaction History) |
| **Build Tool** | Command-line Compiler (javac) |

---

## Project Structure

```
SWE-Assign.1/
├── ATM.java              # Main ATM system class with UI and menu logic
├── BankAccount.java      # Bank account model with balance and transaction management
└── README.md             # Project documentation (this file)
```

### File Descriptions

| File | Purpose |
|------|---------|
| **ATM.java** | Contains the main application logic, user interface, and menu-driven system. Manages user input and orchestrates banking operations. |
| **BankAccount.java** | Defines the BankAccount class with account balance, PIN verification, and transaction history tracking. |

---

## Installation

### Prerequisites

- **Java Development Kit (JDK)** version 8 or higher
- **Git** (for cloning the repository)
- **Command-line terminal** (Command Prompt, PowerShell, Terminal, etc.)

### Clone the Repository

```bash
git clone https://github.com/mariam-mohamed225/SWE-Assign.1.git
cd SWE-Assign.1
```

### Compile the Source Code

```bash
javac ATM.java BankAccount.java
```

---

## Usage

### Running the Application

```bash
java ATM
```

### User Workflow

1. **Enter PIN** - The system prompts for authentication (default PIN: `1228`)
   - You have 3 attempts before access is denied
2. **Select Operation** - Choose from the main menu:
   - `1` → View Account Balance
   - `2` → Deposit Money
   - `3` → Withdraw Money
   - `4` → View Transaction History
   - `5` → Exit

### Example Session

```
Enter Your PIN: 1228
Welcome To The ATM Menu 

 1.Balance 
 2.Deposit 
 3.Withdraw 
 4.History 
 5.Exit
Enter Your Choice: 
1
Your Current Balance: $ 500.00

Enter Your Choice: 
2
Deposit Amount: 150.00
Would You Like A Receipt?: y
Receipt For: Deposit Of $150.0 Successful
Current Balance is 650.0

Enter Your Choice: 
5
Thank you for using our ATM
```

---

## Configuration

### Default Account Settings

- **Initial Balance:** $500.00
- **PIN:** 1228
- **Maximum Login Attempts:** 3

### Customizing the Account

To modify initial settings, edit `ATM.java` (line 6):

```java
static BankAccount account = new BankAccount(500.0);  // Change initial balance
```

To change the PIN, edit `BankAccount.java` (line 7):

```java
private final int PIN = 1228;  // Change PIN here
```

---

## Architecture Overview

### System Components

**1. ATM Class (Main Application)**
- Handles user interface and menu navigation
- Manages user input via Scanner
- Orchestrates banking operations
- Generates receipts for transactions

**2. BankAccount Class (Data Model)**
- Maintains account balance
- Validates PIN during authentication
- Records all transactions in history
- Provides balance and history queries

### Flow Diagram

```
User Login (PIN Validation)
          ↓
    [PIN Correct?]
     /          \
   No           Yes
   ↓             ↓
Access      Main Menu
Denied      ↓
      [User Choice]
      /  |  |  \  \
     1   2  3  4  5
    [Balance] [Deposit] [Withdraw] [History] [Exit]
     ↓         ↓         ↓           ↓        ↓
    Show    Process  Process      Show    Exit
   Balance  Deposit  Withdraw    History  Program
```

---

## Development

### Code Structure Best Practices

- **Encapsulation** - BankAccount uses private fields with public accessors
- **Input Validation** - Withdrawal checks balance before processing
- **Error Handling** - Graceful handling of invalid inputs
- **History Tracking** - ArrayList maintains transaction audit trail
- **Static Resources** - Shared Scanner and BankAccount objects in ATM class

### Potential Improvements for Contributions

1. **Multiple Accounts** - Support for multiple customer accounts with account numbers
2. **Persistent Storage** - Save account data to files or database
3. **Enhanced Security** - Hash PIN values, implement account lockout mechanism
4. **Error Logging** - Comprehensive error logging system
5. **GUI Interface** - Migrate from console to Swing/JavaFX graphical interface
6. **Unit Testing** - JUnit test cases for business logic
7. **Transaction Limits** - Daily withdrawal and deposit limits
8. **Interest Calculation** - Automated interest accrual
9. **Overdraft Protection** - Configurable overdraft settings

### Testing Instructions

To test the application:

1. **Test successful login** - Enter PIN `1228`
2. **Test failed login** - Enter wrong PIN 3 times to verify access denial
3. **Test balance check** - Verify initial balance is $500.00
4. **Test deposit** - Add funds and verify balance updates
5. **Test withdrawal** - Withdraw funds and verify balance decreases
6. **Test invalid withdrawal** - Attempt to withdraw more than balance
7. **Test history** - Verify all transactions are recorded
8. **Test receipt** - Confirm receipt generation for transactions

---

## Future Improvements

### Roadmap

- [ ] Database integration (SQLite, MySQL) for persistent storage
- [ ] Multi-user account management system
- [ ] Graphical User Interface (Swing/JavaFX)
- [ ] Transaction date/time timestamps
- [ ] Account transfer between users
- [ ] Regular expression validation for inputs
- [ ] Logging framework integration (Log4j)
- [ ] Unit and integration test suite
- [ ] API for third-party integrations
- [ ] Mobile-friendly interface

### Research Opportunities

- Secure authentication mechanisms (OAuth, JWT)
- Financial cryptography standards
- Real-time transaction processing
- Load balancing for multiple ATM terminals

---

## Additional Resources

- [Java Documentation](https://docs.oracle.com/javase/8/docs/)
- [Scanner Class Reference](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
- [ArrayList Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
