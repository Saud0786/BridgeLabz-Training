# Week 6 – Java Functional Programming
## 📅 Day 1: Lambda Expressions & Method References
**Date:** 27 January 2026

## Section A

### 🔹 Topics Covered
- Lambda Expressions
- Functional Interfaces
- Target Typing & Type Inference
- Closures & Effectively Final Variables
- Method References
- Types of Method References

- Focusing on **Java Functional Programming features (Java 8+)**  
- Lambdas and method references help write **concise, readable, and expressive code**


### Why Lambda Expressions?
- Reduce boilerplate code
- Improve code readability
- Enable functional-style programming
- Widely used with Streams API

### Why Method References?
- Cleaner alternative to simple lambdas
- Improves clarity when calling existing methods
- Encourages code reuse


### 🔹 Questions Practice
- Solved **multiple problems** using lambdas and method references
 1. Smart Home Lighting Automation
 2. Custom Sorting in E-Commerce
 3. Notification Filtering

- Method References    
 1. Invoice Object Creation
 2. Name Uppercasing
 3. Hospital Patient ID Printing

**Code Link:** [Java Lambda & Method References](https://github.com/Saud0786/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Features/src/com/lambdaexpressions)

---


## 📅 Day 2: Interfaces & Functional Interfaces
**Date:** 28 January 2026

### 🔹 Topics Covered
- Defining and Implementing Interfaces (Best Practices)
- Functional Interfaces
- Default Methods in Interfaces
- Static Methods in Interfaces
- Marker Interfaces

- Focusing on **Java interface design and functional programming concepts**  
- Interfaces help achieve **abstraction, loose coupling, and multiple inheritance**

---

### Best Practices for Interfaces
- Keep interfaces small and focused (Single Responsibility)
- Prefer functional interfaces for lambda compatibility
- Use default methods sparingly
- Avoid breaking changes in public interfaces

---

### Why Functional Interfaces?
- Exactly one abstract method
- Enable usage of lambda expressions
- Improve code flexibility and readability

---

### Default & Static Methods
- Default methods allow behavior addition without breaking implementations
- Static methods belong to the interface, not the implementing class

---

### Marker Interfaces
- Do not contain methods
- Used to mark a class with special behavior
- Example: `Serializable`, `Cloneable`

---

### 🔹 Questions Practice

**Defining and Implementing Interfaces**

1. Smart Device Control Interface  
2. Multi-Vehicle Rental System  
3. Digital Payment Interface  

**Functional Interfaces**

4. Temperature Alert System  
5. String Length Checker  
6. Background Job Execution  

**Static Methods in Interfaces**

7. Password Strength Validator  
8. Unit Conversion Tool  
9. Date Format Utility  

**Default Methods in Interfaces**

10. Payment Gateway Integration  
11. Data Export Feature  
12. Smart Vehicle Dashboard  

**Marker Interfaces**

13. Data Serialization for Backup  
14. Cloning Prototype Objects  
15. Sensitive Data Tagging  


**Code Link:** [Java Interfaces Practice](https://github.com/Saud0786/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Features/src/com/all_interfaces)

---

## 📅 Day 3: Stream Operations & Parallel Streams
**Date:** 29 January 2026


### 🔹 Topics Covered

**Intermediate Operations**
- filter
- map
- flatMap
- distinct
- sorted
- peek
- limit
- skip

**Terminal Operations**
- collect
- forEach
- reduce
- count
- anyMatch
- allMatch
- noneMatch

---

### Stateless vs Stateful Operations
- Stateless operations process each element independently (e.g., filter, map)
- Stateful operations depend on previously seen elements (e.g., sorted, distinct)

---

### Ordered vs Unordered Streams
- Ordered streams preserve encounter order
- Unordered streams allow optimization and improved performance

---

### Parallel Streams
- Enable parallel processing using multiple threads
- Improve performance for large data sets
- Order is not guaranteed unless explicitly preserved

---

### forEach(): Iterable vs Stream
- Iterable forEach executes sequentially and preserves order
- Stream forEach may execute in any order, especially with parallel streams


 ### 🔹 Questions Practice – Stream API

1. Top 5 Trending Movies  
2. Hospital Doctor Availability  
3. Insurance Claim Analysis  
4. Filtering Expiring Memberships  
5. Transforming Names for Display  
 

**Code Link:** [Stream Operations & Parallel Streams](https://github.com/Saud0786/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/Java8Features/src/com/streamapi)
