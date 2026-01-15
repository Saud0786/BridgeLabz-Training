## 📅 Week 3 – Day 1: Data Structures (Linked Lists)  
**📆 Date:** 2 January 2026  

---

### 🔹 Topics Covered

- Introduction of Data Structures  
- Key Features of Data Structures in Java  
- Types of Data Structures in Java  
### Singly Linked List
- Each node contains data and a reference to the next node.
- Traversal is possible only in one direction.
- Efficient insertion and deletion compared to arrays.
  
### Doubly Linked List 
- Each node contains data, previous, and next references.
- Traversal is possible in both forward and backward directions.
- Requires extra memory due to additional pointer.
  
### Circular Linked List  
- Last node points back to the first node.
- No NULL references in the list.
- Useful in applications like circular queues and scheduling.

### ✅ Practice Summary
- Solved **multiple problems** based on Linked List concepts  
- Practiced operations such as:
  - Insertion and deletion
  - Traversal techniques
  - Understanding node structure and pointers  
- Strengthened understanding of linear data structures  
- Focused on problem-solving and logical implementation  

**Code Link:** [LinkedList and its types](https://github.com/Saud0786/BridgeLabz-Training/tree/java-dsa-practice/java-dsa-practice/gcr-codebase/JavaDsaPractice/src/com/linkedlist)

---

## Day 2: Stack, Queue & Hashing  
**📆 Date:** 4 January 2026  

### 🔹 Topics Covered

- **Stack**
  - Linear data structure following LIFO (Last In First Out)
  - Operations: push, pop, peek
  - Used in function calls, expression evaluation, and undo operations

- **Queue**
  - Linear data structure following FIFO (First In First Out)
  - Operations: enqueue, dequeue, front
  - Used in scheduling, buffering, and resource management

- **HashMap & Hashing Function**
  - HashMap stores data in key–value pairs
  - Hashing function converts keys into hash codes
  - Enables fast insertion, deletion, and searching
  - Handles collisions using techniques like chaining

### ✅ Practice Summary
- Solved **multiple problems** based on Stack and Queue operations  
- Practiced usage of HashMap for efficient data storage and retrieval  
- Understood working of hashing functions and collision handling  
- Focused on time complexity and performance optimization  

**Code Link:** [Hashmap, Stack & Queue](https://github.com/Saud0786/BridgeLabz-Training/tree/java-dsa-practice/java-dsa-practice/gcr-codebase/JavaDsaPractice/src/com)

---

## Day 3: Sorting Algorithms  
**📆 Date:** 5 January 2026  

### 🔹 Topic Overview
Sorting is a fundamental operation in computer science used to arrange elements in a specific order (ascending or descending).  
Different sorting algorithms are used based on data size, performance needs, and memory constraints.

### 🔹 Sorting Algorithms Covered

- **Bubble Sort**
  - Simple comparison-based sorting algorithm
  - Repeatedly swaps adjacent elements if they are in the wrong order
  - Suitable for small datasets and learning basics

- **Insertion Sort**
  - Builds the sorted list one element at a time
  - Efficient for small or nearly sorted datasets

- **Selection Sort**
  - Repeatedly selects the minimum element and places it at the correct position
  - Simple but inefficient for large datasets

- **Merge Sort**
  - Divide and Conquer algorithm
  - Recursively divides the array and merges sorted subarrays
  - Efficient and stable sorting technique

- **Quick Sort**
  - Divide and Conquer algorithm using a pivot element
  - Very fast in average cases
  - Widely used in real-world applications

- **Heap Sort**
  - Based on Binary Heap data structure
  - Converts array into a heap and sorts elements
  - Efficient and does not require extra memory

- **Counting Sort**
  - Non-comparison based sorting algorithm
  - Works efficiently for small range integer values

- **Radix Sort**
  - Non-comparison based sorting technique
  - Sorts numbers digit by digit
  - Used for large datasets with fixed digit length

- **Bucket Sort**
  - Distributes elements into buckets and sorts them individually
  - Effective when input is uniformly distributed

### ✅ Practice Summary
- Studied multiple sorting algorithms and their working principles  
- Compared sorting techniques based on time and space complexity  
- Understood use-cases for comparison and non-comparison based sorting  
- Strengthened algorithmic thinking and problem-solving skills  

**Code Link :** [Sorting algorithms](https://github.com/Saud0786/BridgeLabz-Training/tree/java-dsa-practice/java-dsa-practice/gcr-codebase/JavaDsaPractice/src/com/sorts)

---

## 📅 Day 4: String Handling & File I/O in Java  
**📆 Date:** 6 January 2026  

### 🔹 Topics Covered

#### 1️⃣ StringBuilder
- Mutable sequence of characters
- Faster than StringBuffer
- Not thread-safe
- Used when performance is important in single-threaded applications

#### 2️⃣ StringBuffer
- Mutable sequence of characters
- Thread-safe (synchronized)
- Slower than StringBuilder due to synchronization
- Used in multi-threaded environments

#### 3️⃣ FileReader
- Used to read character data from files
- Works with text files
- Reads data character by character
- Suitable for simple file reading tasks

#### 4️⃣ InputStreamReader
- Converts byte streams into character streams
- Used to read data from InputStream sources
- Supports character encoding
- Commonly used with FileInputStream and System.in

### ✅ Practice Summary
- Compared StringBuilder and StringBuffer based on performance and thread safety  
- Practiced reading text data from files using FileReader  
- Understood byte-to-character stream conversion using InputStreamReader  
- Focused on efficient string manipulation and file handling concepts  

**Code Link :** [String Handling & File I/O in Java ](https://github.com/Saud0786/BridgeLabz-Training/tree/java-dsa-practice/java-dsa-practice/gcr-codebase/JavaDsaPractice/src/com)

---

## 📅 Day 5: Linear Search & Binary Search  
**📆 Date: 7 January 2026**  

### 📌 Overview
This day focuses on understanding **Linear Search** and **Binary Search** in Java.

### 🔹 Topics Covered
- Linear Search (O(N)) – works on sorted & unsorted data  
- Binary Search (O(log N)) – works only on sorted data  
- Binary Search variations (first/last occurrence, peak element, rotated array, 2D matrix)

### ⚙️ Comparison
- Linear Search is simple but inefficient for large datasets  
- Binary Search is faster and preferred for large, sorted data  

### ✅ Practice Summary
- Implemented Linear and Binary Search with user input  
- Compared time complexity and performance  
- Solved standard Binary Search problems  


**Code Link :** [Linear Search & Binary Search  ](https://github.com/Saud0786/BridgeLabz-Training/tree/java-dsa-practice/java-dsa-practice/gcr-codebase/JavaDsaPractice/src/com/searching/)

---


## 📅 Day 6: General Algorithm Best Practices  
**📆 Date: 8 January 2026**  

### 📌 Overview
This day focuses on **writing efficient algorithms** by optimizing **time and space complexity**.  
The goal is to understand how better algorithmic choices improve performance, especially for large datasets.

### 🔹 Topics Covered
- Understanding **Time Complexity (Big-O)**
- Understanding **Space Complexity**
- Choosing optimal algorithms and data structures
- Avoiding unnecessary loops and redundant computations
- Importance of scalability and performance

### ⚙️ Best Practices
- Prefer **O(log N)** or **O(N)** solutions over **O(N²)**  
- Avoid nested loops when possible  
- Use appropriate data structures (HashSet, HashMap, etc.)  
- Optimize space without compromising readability  
- Always analyze worst-case complexity  

### ✅ Practice Summary
- Compared inefficient vs optimized approaches  
- Analyzed algorithm performance using Big-O notation  
- Improved existing solutions for better time and space usage  
- Focused on interview-oriented optimization techniques  

**Code Link :** [General Algorithm Best Practices](https://github.com/Saud0786/BridgeLabz-Training/tree/java-dsa-practice/java-dsa-practice/gcr-codebase/JavaDsaPractice/src/com/runtimeanalysis/)

---

# Section B
##  Dsa Scenario Based Question solved  
1. BookShelf – Library Organizer
2. BrowserBuddy – Tab History Manager
3. AmbulanceRoute – Emergency Patient Navigation
4. CallCenter – Customer Queue Manager
5. TrainCompanion – Compartment Navigation System
6. TextEditor – Undo/Redo Functionality

**Concepts:** Linkedlist, Stack, Queue, StringBuffer & StringBuilder
**Loops:** for, while  
**Input:** Scanner  
**Output:** Console  
**Status:** Completed & pushed to GitHub  

**Code link:** [Dsa Scenario Based Question](https://github.com/Saud0786/BridgeLabz-Training/tree/java-dsa-practice/java-dsa-practice/scenario-based/DsaScenarioCodebase/src/com)



