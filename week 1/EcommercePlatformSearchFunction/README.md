# E-commerce Product Search System using Linear Search and Binary Search

## Overview

This project demonstrates the implementation and analysis of two fundamental searching algorithms: **Linear Search** and **Binary Search**. The system models a simple e-commerce platform where products can be searched based on their unique product identifiers.

The objective of the project is to compare the efficiency of both search techniques and understand their practical applications in real-world software systems.

---

## Objectives

* Understand the concept of asymptotic analysis and Big O notation.
* Implement and compare Linear Search and Binary Search algorithms.
* Analyze the best-case, average-case, and worst-case performance of search operations.
* Demonstrate the importance of choosing appropriate algorithms for large datasets.
* Explore how data organization affects search efficiency.

---

## Project Structure

The project consists of the following components:

### Product Class

Represents a product in the e-commerce platform with attributes such as:

* Product ID
* Product Name
* Category

### Linear Search Module

Performs sequential searching through the product collection until the target product is found or all products have been examined.

### Binary Search Module

Performs efficient searching by repeatedly dividing a sorted product collection into smaller search spaces.

### Analysis Module

Compares the performance characteristics of both algorithms and discusses their suitability for different scenarios.

---

## Asymptotic Notation

### Big O Notation

Big O notation is used to describe the growth rate of an algorithm's execution time as the input size increases. It provides a machine-independent way to evaluate algorithm efficiency.

Common complexity classes include:

| Complexity | Description      |
| ---------- | ---------------- |
| O(1)       | Constant Time    |
| O(log n)   | Logarithmic Time |
| O(n)       | Linear Time      |
| O(n²)      | Quadratic Time   |

Big O notation helps developers predict how an algorithm will perform when handling large amounts of data.

---

## Search Algorithms

### Linear Search

Linear Search examines each product one by one until the desired product is found.

#### Characteristics

* Works with both sorted and unsorted data.
* Simple to implement.
* Suitable for small datasets.

#### Performance

| Case         | Complexity |
| ------------ | ---------- |
| Best Case    | O(1)       |
| Average Case | O(n)       |
| Worst Case   | O(n)       |

---

### Binary Search

Binary Search repeatedly divides a sorted collection into halves to locate the desired product.

#### Characteristics

* Requires sorted data.
* Significantly faster for large datasets.
* Reduces the search space in every iteration.

#### Performance

| Case         | Complexity |
| ------------ | ---------- |
| Best Case    | O(1)       |
| Average Case | O(log n)   |
| Worst Case   | O(log n)   |

---

## Comparative Analysis

| Feature                     | Linear Search      | Binary Search |
| --------------------------- | ------------------ | ------------- |
| Data Requirement            | Sorted or Unsorted | Sorted Only   |
| Best Case                   | O(1)               | O(1)          |
| Average Case                | O(n)               | O(log n)      |
| Worst Case                  | O(n)               | O(log n)      |
| Implementation Complexity   | Simple             | Moderate      |
| Suitable for Large Datasets | No                 | Yes           |

---

## Results and Discussion

The comparison demonstrates that Binary Search is significantly more efficient than Linear Search when working with large, sorted datasets. While Linear Search is easier to implement and works on unsorted collections, its performance degrades as the number of products increases.

Binary Search reduces the number of comparisons required by repeatedly eliminating half of the remaining search space, making it highly suitable for large-scale applications such as e-commerce platforms.

---

## Use Cases

### Linear Search

Recommended when:

* The dataset is small.
* Data is frequently modified.
* The collection is unsorted.

### Binary Search

Recommended when:

* The dataset is large.
* Fast search operations are required.
* Data can be maintained in sorted order.

---

## Conclusion

This project highlights the importance of algorithm selection in software development. Both Linear Search and Binary Search successfully locate products within a collection; however, Binary Search offers significantly better performance for large datasets due to its logarithmic time complexity.

For modern e-commerce platforms that manage thousands or millions of products, Binary Search is generally the preferred choice because it provides faster search operations and better scalability.
