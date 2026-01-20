# Week 4 – Java Collections & Streams
## 📅Day 1: Introduction to Generics
**Date:** 9 January 2026

### 🔹 Topics Covered
- Introduction to Generics
- Type Parameters
- Generic Classes
- Generic Methods
- Bounded Type Parameters
- Wildcards

-focusing on **Java Generics**.  
-Generics help write **reusable, type-safe, and cleaner code**.

### Why Generics?
- Avoid `ClassCastException`
- No need for type casting
- Code reusability
- Better readability and maintainability

###  🔹Questions Practice
- Solved **multiple problems** based on Generics
 1. Smart Warehouse Management System
 2. Dynamic Online Marketplace
 3. Multi-Level University Course Management System
 4. Personalized Meal Plan Generator
 5. AI-Driven Resume Screening System

 **Code Link:** [Java Collections & Streams](https://github.com/Saud0786/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionFramework/src/com/generics)

---

## 📅Day 2: Collections Framework
**📆 Date:** 16 January 2026

### 🔹 Topics Covered
 - Overview of Collections Framework
 - What is the Collections Framework?
 - Hierarchy of Collections Framework
 - List Interface and Implementing Classes
 - Set Interface and Implementing Classes
 - Queue and Deque Interfaces
 - Map Interface and Its Implementations
 - Comparison of Different Implementations
 - Real-World Use Cases and Best Practices.


## Questions Implemented
### List Interface
 1. Reverse a List
 2. Find Frequency of Elements
 3. Rotate Elements in a List
 4. Remove Duplicates While Preserving Order
 5. Find Nth Element from End (LinkedList)

### Set Interface
 1. Check if Two Sets Are Equal
 2. Union and Intersection of Two Sets
 3. Symmetric Difference of Two Sets
 4. Convert Set to Sorted List
 5. Check Subset

### Queue Interface & Stack Programs
 1. Reverse a Queue
 2. Generate Binary Numbers Using Queue
 3. Implement Stack Using Queues
 4. Circular Buffer Simulation
 5. Hospital Triage System

 ### Map Interface
  1. Word Frequency Counter
  2. Invert a Map
  3. Find Key with Highest Value
  4. Merge Two Maps
  5. Group Objects by Property


 ## Mini Systems (Real-World Use Cases)

###  Voting System
- **HashMap** → vote counting  
- **LinkedHashMap** → vote order  
- **TreeMap** → sorted results  


###  Shopping Cart System
- **HashMap** → product prices  
- **LinkedHashMap** → insertion order  
- **TreeMap** → sorted by price  


###  Banking System
- **HashMap** → customer accounts  
- **TreeMap** → customers sorted by balance  
- **Queue** → withdrawal requests  


###  Hospital Triage System
- **PriorityQueue**
- Patients treated based on severity.

### Insurance Policy Management System
- **HashMap** → to store policies with policy numbers as keys and policy key values
- **LinkedHashMap** to maintain the insertion order of policies.
- **TreeMap** →  to store policies sorted by expiry date.  
    
**Code Link:** [Collections - Questions](https://github.com/Saud0786/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionFramework/src/com/collections)

---

## 📅Day 3: Java Streams
**📆 Date:** 19 January 2026

### 🔹 Topics Covered
 - Java I/O Streams
 - Types of Streams
 -- File Streams
 -- Object Streams
 - ByteArray Streams
 - Buffered Streams
 - Reader and Writer
 - Key Considerations
 - Best Practices

### 1. File Streams
File streams are used to read from and write to files.

- **Byte-based**
  - `FileInputStream`
  - `FileOutputStream`
- **Character-based**
  - `FileReader`
  - `FileWriter`

**Use case:** Reading or writing raw data (files, images, binary data).

### 2. Object Streams
Object streams are used to write and read Java objects.

- `ObjectOutputStream`
- `ObjectInputStream`

**Use case:** Saving and restoring object states (serialization and deserialization).

### 3. ByteArray Streams
These streams work with data stored in memory instead of files.

- `ByteArrayInputStream`
- `ByteArrayOutputStream`

**Use case:** Converting data to byte arrays, in-memory processing, image manipulation.

### 4. Buffered Streams
Buffered streams improve performance by reducing the number of I/O operations.

- `BufferedInputStream`
- `BufferedOutputStream`
- `BufferedReader`
- `BufferedWriter`

**Use case:** Efficient reading and writing of large files.

### 5. Reader and Writer Streams
These streams handle character-based data and support character encoding.

- `Reader` (abstract class)
- `Writer` (abstract class)
- Common implementations:
  - `FileReader`
  - `FileWriter`
  - `BufferedReader`
  - `BufferedWriter`
  - `InputStreamReader`
  - `OutputStreamWriter`

**Use case:** Reading and writing text data with proper encoding support.

## Questions Implemented
 1.  File Handling - Read and Write a Text File
 2.  Buffered Streams - Efficient File Copy
 3.  Read User Input from Console
 4.  Serialization - Save and Retrieve an Object
 5.  ByteArray Stream - Convert Image to ByteArray
 6.  Filter Streams - Convert Uppercase to Lowercase
 7.   Data Streams - Store and Retrieve Primitive Data
 8.   Piped Streams - Inter-Thread Communication
 9.   Read a Large File Line by Line
 10.   Count Words in a File

**Code Link:** [Java I/O & Streams](https://github.com/Saud0786/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionFramework/src/com/javastreams)
