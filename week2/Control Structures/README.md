# Scenario 1: Interest Rate Discount for Senior Citizens

## Objective

The bank wants to provide a 1% discount on loan interest rates for customers above 60 years of age.

## Problem Statement

Write a PL/SQL block that:

- Retrieves all customers whose age is greater than 60.
- Updates their loan interest rates.
- Applies a 1% reduction to the existing interest rate.
- Commits the changes to the database.

## Concepts Used

- PL/SQL Block
- Cursor
- FOR Loop
- UPDATE Statement
- COMMIT
- Conditional Filtering

## Tables Used

### Customer

| Column | Data Type |
|----------|-----------|
| CustomerID | NUMBER |
| Name | VARCHAR2(50) |
| Age | NUMBER |
| Balance | NUMBER |
| IsVIP | VARCHAR2(50) |

### Loan

| Column | Data Type |
|----------|-----------|
| LoanID | NUMBER |
| CustomerID | NUMBER |
| InterestRate | NUMBER |
| DueDate | DATE |

## Expected Outcome

Customers above 60 years of age receive a 1% reduction in their loan interest rates.

## Learning Outcome

This exercise demonstrates how cursors and loops can be used to process records and perform updates based on business rules.
# Scenario 2: VIP Customer Promotion

## Objective

Promote customers to VIP status based on their account balance.

## Problem Statement

Write a PL/SQL block that:

- Iterates through all customer records.
- Identifies customers with a balance greater than 10,000.
- Updates the IsVIP field to TRUE.
- Saves the changes using COMMIT.

## Concepts Used

- PL/SQL Block
- Cursor
- FOR Loop
- UPDATE Statement
- Conditional Statements
- COMMIT

## Tables Used

### Customer

| Column | Data Type |
|----------|-----------|
| CustomerID | NUMBER |
| Name | VARCHAR2(50) |
| Age | NUMBER |
| Balance | NUMBER |
| IsVIP | VARCHAR2(50) |

## Expected Outcome

Customers with balances exceeding 10,000 are marked as VIP customers.

## Example

| Customer | Balance | VIP Status |
|-----------|----------|------------|
| John | 15000 | TRUE |
| Alice | 8000 | FALSE |
| Emma | 12000 | TRUE |

## Learning Outcome

This exercise demonstrates how business rules can be implemented using conditional logic and database updates in PL/SQL.
# Scenario 3: Loan Due Reminder System

## Objective

Generate reminders for customers whose loans are due within the next 30 days.

## Problem Statement

Write a PL/SQL block that:

- Retrieves customer and loan information.
- Finds loans with due dates between SYSDATE and SYSDATE + 30.
- Displays reminder messages using DBMS_OUTPUT.

## Concepts Used

- PL/SQL Block
- Cursor
- FOR Loop
- INNER JOIN
- Date Functions
- DBMS_OUTPUT

## Tables Used

### Customer

| Column | Data Type |
|----------|-----------|
| CustomerID | NUMBER |
| Name | VARCHAR2(50) |
| Age | NUMBER |
| Balance | NUMBER |
| IsVIP | VARCHAR2(50) |

### Loan

| Column | Data Type |
|----------|-----------|
| LoanID | NUMBER |
| CustomerID | NUMBER |
| InterestRate | NUMBER |
| DueDate | DATE |

## Expected Output

```text
Reminder:
Customer Name : John
Customer ID   : 1
Loan ID       : 101
Due Date      : 25-JUN-2026