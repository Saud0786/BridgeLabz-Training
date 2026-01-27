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

---


## 📅 Day 4: Exception Handling in Java
**📆 Date:** 20 January 2026

### 🔹 Topics Covered
- Exceptions  
- Types of Exceptions  
- Checked Exceptions  
- Unchecked Exceptions  
- Custom Exceptions  
- Handling Exceptions  
- try-catch blocks  
- try-catch-finally blocks  
- try-with-resources statement  
- throws clause  
- throw statement  
- Creating Custom Exceptions  
- Extending Exception Class  
- Defining Constructors  


## 1. Exceptions
An exception is an event that disrupts the normal flow of program execution.

## 2. Types of Exceptions

### Checked Exceptions
- Compile-time checked  
- Must be handled or declared  

### Unchecked Exceptions
- Runtime exceptions  
- Extend `RuntimeException`  

## 3. Exception Handling Mechanisms
- try-catch  
- try-catch-finally  
- try-with-resources  
- throw  
- throws  

## 4. Custom Exceptions
User-defined exceptions created by extending the `Exception` class.

## Questions Implemented

1. Checked Exception (Compile-time Exception)  
2. Unchecked Exception (Runtime Exception)  
3. Custom Exception (User-defined Exception)  
4. Multiple Catch Blocks  
5. try-with-resources (Auto-closing Resources)  
6. throw vs. throws (Exception Propagation)  
7. finally Block Execution 
8. Exception Propagation in Methods  
9.  Nested try-catch Block  
10. Bank Transaction System  (Checked + Custom Exception)

**Code Link:**[Exception Handling in Java](https://github.com/Saud0786/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionFramework/src/com/exceptions)

---


## 📅 Day 5: Java Regex & JUnit Framework
**📆 Date:** 21 January 2026

## 🔹 Topics Covered

### Java Regular Expressions (Regex)
- Regex  
- MetaCharacters  
- Quantifiers  
- Common Regex Patterns  
- Email Validation  
- Password Strength Validation  
- Phone Number Format  

### Java Regex API
- Pattern Class  
- Matcher Class  
- Regex Methods  
  - find()  
  - matches()  
  - replaceAll()  

### JUnit Framework
- Introduction to JUnit Framework  
- JUnit Annotations  
- Writing Test Cases  
- Structure of a Test Class  
- Assertions  

---

## 1. Regular Expressions (Regex)

A **Regular Expression (Regex)** is a pattern used to **match, search, and manipulate text**.

### Uses of Regex:
- Input validation  
- Searching strings  
- Extracting data  
- Replacing text  

---

## 2. MetaCharacters

MetaCharacters have **special meaning** in regex.

| MetaCharacter | Description |
|---------------|------------|
| `.` | Matches any single character |
| `^` | Beginning of string |
| `$` | End of string |
| `[]` | Character set |
| `()` | Grouping |
| `|` | OR operator |
| `\` | Escape character |

---

## 3. Quantifiers

Quantifiers define **how many times** a character or group occurs.

| Quantifier | Meaning |
|-----------|--------|
| `*` | 0 or more times |
| `+` | 1 or more times |
| `?` | 0 or 1 time |
| `{n}` | Exactly n times |
| `{n,}` | At least n times |
| `{n,m}` | Between n and m times |

---

## 4. Common Regex Patterns

### Email Validation
```regex
^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$
```

## 📝 Regex Practice Questions

1. Validate a Username  
2. Validate a License Plate Number  
3. Validate a Hex Color Code  
4. Extract All Email Addresses from a Text  
5. Extract All Capitalized Words from a Sentence  
6. Extract Dates in dd/mm/yyyy Format  
7. Extract Links from a Web Page  
8. Replace Multiple Spaces with a Single Space  
9. Censor Bad Words in a Sentence  
10. Validate an IP Address  
11. Validate a Credit Card Number  
12. Extract Programming Language Names from a Text  
13. Extract Currency Values from a Text  
14. Find Repeating Words in a Sentence  
15. Validate a Social Security Number (SSN)


## 📝 JUnit Practice Questions

1. Basic JUnit Test: Testing a Calculator Class  
2. Testing String Utility Methods  
3. Testing List Operations  
4. Testing Exception Handling  
5. Testing @BeforeEach and @AfterEach Annotations  
6. Testing Parameterized Tests  
7. Performance Testing Using @Timeout  
8. Testing File Handling Methods  

## 📝 Advanced JUnit Practice Questions

9. Testing Banking Transactions  
10. Testing Password Strength Validator  
11. Testing Temperature Converter  
12. Testing Date Formatter  
13. Testing User Registration  


**Code Link:** [Java Regex](https://github.com/Saud0786/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionFramework/src/com/regex)

**Code Link:** [JUnit Framework](https://github.com/Saud0786/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionFramework/src/com/JUnit)


---



## 📅 Day 06: Annotations & Reflection in Java
**📆 Date:** 22 January 2026  

---

## 🔹 Topics Covered

### Annotations
- Introduction to Annotations  
- Common Built-in Annotations  
- Creating Custom Annotations  
- Advanced Custom Annotations  
- Real-World Use Cases  
- Annotation Processing Tools  

### Reflection
- Understanding Reflection  
- Using Reflection in Java  
- Annotations and Reflection  


## 1. Introduction to Annotations

**Annotations** are special metadata provided to Java code that give additional information to the compiler, runtime, or frameworks.

### Uses of Annotations:
- Code documentation  
- Compile-time checks  
- Runtime processing  
- Configuration in frameworks (Spring, Hibernate, JUnit)  


## 2. Common Built-in Annotations

Some commonly used built-in Java annotations:

| Annotation | Description |
|-----------|-------------|
| `@Override` | Ensures method overrides parent method |
| `@Deprecated` | Marks method or class as deprecated |
| `@SuppressWarnings` | Suppresses compiler warnings |
| `@FunctionalInterface` | Ensures interface has only one abstract method |
| `@SafeVarargs` | Suppresses warnings for varargs |


## 3. Creating Custom Annotations

Custom annotations are created using the `@interface` keyword.

### Key Points:
- Can contain elements (methods)
- Can have default values
- Used to add custom metadata


## 4. Advanced Custom Annotations

Advanced annotations involve:
- Retention policies  
- Target elements  
- Repeatable annotations  

### Retention Policies:
- `SOURCE` – Discarded during compilation  
- `CLASS` – Stored in bytecode, not available at runtime  
- `RUNTIME` – Available at runtime using reflection  

### Target Elements:
- `METHOD`
- `CLASS`
- `FIELD`
- `CONSTRUCTOR`
- `PARAMETER`



## 5. Real-World Use Cases of Annotations

Annotations are widely used in:
- Spring Framework (`@Component`, `@Autowired`)
- Hibernate (`@Entity`, `@Table`)
- JUnit (`@Test`, `@BeforeEach`)
- REST APIs (`@GetMapping`, `@PostMapping`)


## 6. Annotation Processing Tools

Annotation processing is used to:
- Analyze annotations at compile-time
- Generate source files
- Perform validations

Common tools:
- Java Annotation Processing API (APT)
- Lombok
- MapStruct


## 7. Reflection

**Reflection** allows Java programs to:
- Inspect classes, methods, fields at runtime
- Create objects dynamically
- Invoke methods dynamically


## 8. Understanding Reflection

Reflection is part of the `java.lang.reflect` package.

### Key Reflection Classes:
- `Class`
- `Method`
- `Field`
- `Constructor`


## 9. Using Reflection in Java

Reflection is used to:
- Access private members
- Load classes dynamically
- Build frameworks and libraries

⚠️ **Note:** Reflection can impact performance and security if misused.


## 10. Annotations and Reflection

Annotations are often accessed using reflection to:
- Read annotation values at runtime
- Apply logic based on metadata
- Build annotation-driven frameworks

Example use cases:
- Dependency Injection
- ORM mapping
- Test execution frameworks

## 📝 Practice Problems on Reflection in Java

### 🔹 Basic Level
1. Get Class Information Using Reflection  
2. Access Private Field Using Reflection  
3. Invoke Private Method Using Reflection  
4. Dynamically Create Objects Using Reflection  

### 🔹 Intermediate Level
5. Dynamic Method Invocation Using Reflection  
6. Retrieve Annotations at Runtime Using Reflection  
7. Access and Modify Static Fields Using Reflection  

### 🔹 Advanced Level
8. Create a Custom Object Mapper Using Reflection  
9. Generate JSON Representation Using Reflection  
10. Custom Logging Proxy Using Reflection  
11. Dependency Injection Using Reflection  
12. Method Execution Timing Using Reflection  


## 📝 Practice Problems for Custom Annotations

### 1️⃣ Use @Override Correctly  
Create a parent class and override a method in a child class using `@Override`.  
Verify correct method overriding by invoking the method from the child class.

### 2️⃣ Use @Deprecated to Mark an Old Method  
Mark an outdated method using `@Deprecated` and introduce a replacement method.  
Observe compiler warnings when the deprecated method is used.


### 3️⃣ Suppress Unchecked Warnings  
Create a non-generic collection and suppress compiler warnings using `@SuppressWarnings`.  
Ensure the code compiles without showing unchecked operation warnings.


### 4️⃣ Create a Custom Annotation and Use It  
Define a custom annotation with multiple attributes and apply it to a method.  
Retrieve annotation values at runtime using the Reflection API.


### 5️⃣ Create and Use a Repeatable Annotation  
Create a repeatable custom annotation and apply it multiple times on a method.  
Use reflection to retrieve and display all applied annotation instances.


**Code link:** [Annotation Concepts and question](https://github.com/Saud0786/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionFramework/src/com/annotation)

**Code link:** [Reflection in Java and question](https://github.com/Saud0786/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/JavaCollectionFramework/src/com/reflection)

---


