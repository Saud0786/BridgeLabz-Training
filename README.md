# Week 7 – Software Design Pettern Principles
## 📅 Day 1: Introduction to Design Principles
**Date:** 1 February 2026

## Section A

### 🔹 Topics Covered

**SOLID Principles**
1. Single Responsibility Principle (SRP)  
2. Open/Closed Principle (OCP)  
3. Liskov Substitution Principle (LSP)  
4. Interface Segregation Principle (ISP)  
5. Dependency Inversion Principle (DIP)  

**General Design Principles**
6. Don't Repeat Yourself (DRY)  
7. Keep It Simple, Stupid (KISS)  
8. You Aren't Gonna Need It (YAGNI)  


### 🔹 Overview
Design principles provide guidelines for writing clean, maintainable, scalable, and
extensible software. Following these principles reduces tight coupling, improves code
readability, and simplifies future enhancements.


### 🔹 Why Design Principles Matter
- Improve maintainability and scalability
- Reduce code duplication and complexity
- Encourage loose coupling and high cohesion
- Make systems easier to extend and test


---


## 📅 Day 2: Introduction to GoF Design Patterns & UML Designing
**Date:** 2 February 2026

### 🔹 Topics Covered

**Introduction to GoF Design Patterns**
- What are Design Patterns
- Gang of Four (GoF) Overview
- Purpose and Benefits of Design Patterns

**Categories of GoF Design Patterns**
- Creational Patterns
- Structural Patterns
- Behavioral Patterns



### 🔹 Design Patterns Studied

1. **Singleton Pattern**  
- Ensures only one instance of a class exists
- Provides a global point of access

2. **Factory Pattern**  
- Creates objects without exposing instantiation logic
- Promotes loose coupling

3. **Observer Pattern**  
- Defines one-to-many dependency between objects
- Automatically notifies observers on state change

4. **Builder Pattern**  
- Separates object construction from representation
- Useful for creating complex objects step by step



### 🔹 UML Designing
- Class Diagrams for design pattern representation
- Identifying relationships: association, inheritance, dependency
- Visualizing object interactions and responsibilities



### 🔹 Why Use Design Patterns?
- Reusable and proven solutions
- Improves code flexibility and maintainability
- Encourages best practices in software design
- Makes systems easier to understand and extend


### 🔹 Questions Practice

1. Smart University Library Management System
2. Library Management System (LMS) with GoF Patterns

**Code Link:** [Pattern design question](https://github.com/Saud0786/BridgeLabz-Training/tree/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/DesignPatternPractice/src/com/designpattern)

---



## 📅 Day 3: Introduction to Java Multithreading


### 🔹 Core Concepts

**Process**
- A process is an independent program execution with its own memory space.
- A process can contain multiple threads.
- It remains alive until all non-daemon threads finish execution.

**Thread**
- A thread is the smallest unit of execution.
- Threads share the process memory but have independent execution paths.
- A thread cannot exist without a process.

---

### 🔹 What is Multithreading?
- Java multithreading allows multiple threads to execute concurrently.
- Improves performance by parallel task execution.
- Enhances responsiveness, especially in GUI and server applications.

---

### 🔹 Pros and Cons of Multithreading

**Pros**
- Efficient CPU utilization
- Faster execution through parallelism
- Better performance on multi-core systems
- Improved application responsiveness
- Thread failures don’t crash the entire process

**Cons**
- Increased code complexity
- Difficult debugging and testing
- Risk of deadlock and starvation
- Synchronization overhead

---

### 🔹 Thread Lifecycle
- **New** – Thread object created, start() not called
- **Runnable** – Ready to run, waiting for CPU
- **Running** – Actively executing
- **Blocked / Non-Runnable** – Waiting or sleeping
- **Terminated** – Execution completed

---

### 🔹 Creating Threads in Java
1. Extending the `Thread` class  
2. Implementing the `Runnable` interface  

---

### 🔹 Thread Class Features
- Thread creation and execution: `start()`, `run()`
- Naming: `getName()`, `setName()`
- Control: `sleep()`, `join()`, `yield()`
- State & status: `isAlive()`, `getState()`
- Priority: `getPriority()`, `setPriority()`
- Interruption: `interrupt()`, `isInterrupted()`

---

### 🔹 Thread Types
- **User Threads** – Must finish before JVM exits
- **Daemon Threads** – Background services (GC, cleanup)

---

### 🔹 Key Takeaways
- Multithreading improves performance but requires careful design
- Proper synchronization is critical
- Prefer `Runnable` for better design flexibility
- Deprecated methods like `stop()`, `suspend()` should be avoided


### 🔹 Practice Problems – Java Multithreading

1. Download Manager  
2. Banking System with Multiple Transactions  
3. Restaurant Order Processing System  
4. Thread State Monitoring System  
5. Print Shop Job Scheduler  


**Code link:** [Multithreading-questions](https://github.com/Saud0786/BridgeLabz-Training/tree/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/DesignPatternPractice/src/com/multithreading)

---
