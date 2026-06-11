# PL/SQL Stored Procedures – Banking System

## Overview

This exercise demonstrates the implementation of PL/SQL stored procedures for common banking operations. The procedures automate account maintenance, employee bonus processing, and fund transfers.

---

## Scenario 1: Process Monthly Interest

### Objective

Calculate and apply a monthly interest rate of 1% to all savings accounts.

### Procedure

`ProcessMonthlyInterest`

### Functionality

* Identifies all savings accounts.
* Calculates 1% interest on the current balance.
* Updates the balance with the calculated interest.
* Commits the changes to the database.

### Example

If a savings account balance is ₹10,000:

* Interest = ₹100
* Updated Balance = ₹10,100

---

## Scenario 2: Update Employee Bonus

### Objective

Provide salary bonuses to employees of a specific department.

### Procedure

`UpdateEmployeeBonus`

### Parameters

| Parameter        | Description                                  |
| ---------------- | -------------------------------------------- |
| Department       | Department whose employees receive the bonus |
| Bonus Percentage | Percentage increase to be applied            |

### Functionality

* Accepts department name and bonus percentage as input.
* Updates salaries of all employees in the specified department.
* Applies the bonus percentage to the existing salary.
* Commits the updated salary records.

### Example

For a salary of ₹50,000 and a bonus of 10%:

* Bonus Amount = ₹5,000
* Updated Salary = ₹55,000

---

## Scenario 3: Transfer Funds

### Objective

Transfer money securely between two bank accounts.

### Procedure

`TransferFunds`

### Parameters

| Parameter           | Description                          |
| ------------------- | ------------------------------------ |
| Source Account      | Account from which money is deducted |
| Destination Account | Account receiving the money          |
| Amount              | Amount to transfer                   |

### Functionality

* Deducts the specified amount from the source account.
* Verifies that the source account has sufficient balance.
* Credits the amount to the destination account.
* Completes the transfer as a single transaction.
* Commits the transaction only after successful completion.

### Example

Transfer ₹5,000 from Account 101 to Account 102:

* Account 101 Balance = Balance − ₹5,000
* Account 102 Balance = Balance + ₹5,000

---

## Concepts Used

* Stored Procedures
* Procedure Parameters
* UPDATE Statements
* Conditional Logic (`IF`)
* Transactions
* COMMIT
* SQL%ROWCOUNT
* Banking Operations Automation

## Technologies

* Oracle Database
* PL/SQL

## Learning Outcomes

After completing this exercise, the following concepts are understood:

* Creating stored procedures.
* Using input parameters.
* Performing bulk updates.
* Implementing business rules in PL/SQL.
* Handling database transactions.
* Automating banking and employee management tasks.
