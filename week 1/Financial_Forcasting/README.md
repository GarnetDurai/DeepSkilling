# Financial Forecasting Tool Using Recursive Algorithms

## Scenario

A financial forecasting system is designed to predict future values based on historical growth patterns. Such forecasting techniques are widely used in investment planning, revenue estimation, savings projections, and financial analysis. The objective of this project is to implement a recursive approach for predicting future values and analyze its efficiency.

---

# 1. Understand Recursive Algorithms

## What is Recursion?

Recursion is a programming technique in which a method solves a problem by calling itself with a smaller version of the same problem until a terminating condition is reached.

A recursive solution consists of:

### Base Case

The stopping condition that prevents infinite recursive calls.

### Recursive Case

The portion of the algorithm where the function calls itself with reduced input.

## Advantages of Recursion

* Simplifies complex problems by breaking them into smaller subproblems.
* Produces cleaner and more readable code for repetitive calculations.
* Closely resembles mathematical definitions and formulas.
* Useful for problems that can be naturally divided into smaller instances.

## Application in Financial Forecasting

Future financial values depend on previous values and growth rates. Since each year's value can be calculated from the previous year's value, recursion provides a natural way to model the forecasting process.

---

# 2. Setup

## Forecasting Model

The forecasting tool uses the following inputs:

* Initial Amount (Present Value)
* Annual Growth Rate
* Number of Forecast Years

The recursive method repeatedly applies the growth rate to the current value until the desired forecasting period is reached.

## Objective

To predict the future value of an investment or financial asset after a specified number of years using a recursive approach.

---

# 3. Implementation

## Recursive Forecasting Logic

The forecasting process follows these steps:

1. Start with the initial investment amount.
2. Calculate the growth for the current year.
3. Add the growth to the current amount.
4. Reduce the remaining forecast period by one year.
5. Repeat the process recursively until no years remain.
6. Return the final predicted value.

## Example

Initial Amount: 1000

Growth Rate: 10%

Forecast Period: 3 Years

Forecast Progression:

Year 1 → 1100

Year 2 → 1210

Year 3 → 1331

Predicted Future Value = 1331

This process demonstrates compound growth, where each year's increase is calculated based on the updated value from the previous year.

---

# 4. Analysis

## Time Complexity

For every year in the forecast period, one recursive call is performed.

Therefore:

Time Complexity = O(n)

Where:

* n = Number of forecast years

The execution time grows linearly with the number of years.

---

## Space Complexity

Each recursive call remains on the call stack until the base condition is reached.

Space Complexity = O(n)

Where:

* n = Number of forecast years

The memory usage increases proportionally to the recursion depth.

---

# 5. Optimization

Although recursion provides a simple and elegant solution, excessive recursive calls may lead to increased memory usage and stack overhead.

### Iterative Optimization

The recursive process can be replaced with a loop-based approach.

Benefits:

* Eliminates recursive call overhead.
* Reduces memory consumption.
* Maintains the same computational complexity.

Result:

* Time Complexity: O(n)
* Space Complexity: O(1)

### Mathematical Optimization

The forecasting calculation can be performed directly using the compound growth formula:

Future Value = Present Value × (1 + Growth Rate)^Years

Benefits:

* Avoids repeated calculations.
* Produces the result immediately.
* Suitable for large forecasting periods.

Result:

* Time Complexity: O(1)
* Space Complexity: O(1)

---

# Conclusion

This project demonstrates the use of recursion in financial forecasting by repeatedly applying growth rates to predict future values. Recursion simplifies the implementation by modeling the problem as a series of smaller forecasting steps. The recursive solution has a linear time complexity of O(n) and a space complexity of O(n). For larger forecasting periods, iterative approaches and direct mathematical formulas provide more efficient alternatives by reducing memory usage and computational overhead.
