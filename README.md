# 🍽️ Dining Philosophers Problem — Java Concurrency

A Java implementation of the classic **Dining Philosophers** problem, demonstrating thread synchronization, mutual exclusion, and deadlock-avoidance strategies.
Includes a visual GUI showing philosopher states in real time.


---

## 🚀 Features

### ✔️ Mutual Exclusion (Base Version)

* Each philosopher must acquire both adjacent chopsticks to eat
* Implemented using Java’s `wait()` / `notifyAll()` for safe resource sharing
* Prevents race conditions when multiple philosophers try using the same chopstick

### ✔️ Deadlock Avoidance Strategies

This project includes **three different solutions** to improve system behavior:

1. **Semaphore Strategy**

   * Limits the number of philosophers who may attempt to eat at the same time (max 4)
   * Reduces chances of circular wait

2. **Limited Wait Strategy**

   * Philosophers wait only *X milliseconds* for a chopstick
   * If unsuccessful, they release resources and try again later

3. **Odd/Even Strategy**

   * Odd-indexed philosophers pick up the **left** chopstick first
   * Even-indexed philosophers pick up the **right** chopstick first
   * Breaks circular dependency → prevents deadlock

---

## 🖥️ GUI Visualization

The program includes a graphical interface that displays:

* Five philosophers around a table
* Color-coded chopsticks and philosopher states
* Real-time updates as philosophers think, wait, or eat

(Visualization based on the simulation described in the lab manual.)


---

## 📁 Project Structure



  ├── Chopstick.java
  ├── Philosopher.java
  ├── DiningPhilosophers.java
  ├── Graphic2D.java
  ├── GraphicChopstick.java
  ├── GraphicPlate.java
  └──GraphicPlate.java
 


---
## ▶️ Running the Project

 **Compile:**
 
javac *.java
**Run:**
java DiningPhilosophers


The GUI will launch and animate the philosophers in real time.


**📚 Concepts Demonstrated**
Mutual Exclusion
Thread Synchronization
wait/notify
Semaphores
Resource Ordering
Deadlock Avoidance
Concurrency in Java


**🧩 Why This Project Matters**
The Dining Philosophers problem is a foundational example in operating systems and concurrency.
This repository demonstrates how different synchronization techniques affect fairness, starvation, and deadlock prevention — all essential skills for real-world multithreaded software.

