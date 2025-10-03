# 🗄️ **OPERATING SYSTEMS**

This repository contains the development of the practical project for the **Operating Systems** course, part of the **Informatics degree (1st year, UMAIA)**.

The project implements the coordination of multiple processes (elves and Santa Claus) using semaphores in **Linux**. The solution ensures the entry of the elves into Santa Claus's house, the holding of a meeting, and the preparation of the sleigh, with proper synchronization between the threads.

---

## 📂 **Repository Structure**

- 📂 [SO_PROJECT](./SO_PROJECT)  
  - Main project code, implemented in **Linux**  
- 📂 [SO_EXERCISES](./SO_EXERCICIOS)  
  - Practical exercises and tutorials on semaphores and synchronization in **Linux**  
- 📄 [README.md](./README.md)  
  - This presentation file  

---

## 🎯 **Objectives**

The goal of this work was:

- To coordinate processes (elves and Santa Claus) using semaphores in **Linux**.
- To ensure correct synchronization so that all elves participate in the meeting and only the last elf prepares the sleigh.
- To use **process synchronization** techniques in operating systems, such as semaphores, locks, and mutual exclusion.

---

## 🧩 **Contents**

The project covers the following **Operating System** topics:

- **Synchronization with Semaphores in Linux**:
  - *doorbell*: Semaphore that controls when Santa Claus should wake up after all elves arrive.
  - *santaReady*: Semaphore indicating that Santa Claus is ready to receive an elf.
  - *gnomeReady*: Semaphore indicating that an elf is ready for the meeting.
  - *meetingOver*: Semaphore that signals the end of the meeting.
  - *mutex*: Ensures mutual exclusion for accessing shared resources (e.g., elf count and sleigh preparation).

- **Code Structure**:
  - **Main.java**: Entry point that creates and starts the processes (threads) for Santa Claus and the elves.
  - **Santa.java**: Implements the logic for Santa Claus, including waiting for the elves and holding the meeting.
  - **Gnome.java**: Represents an elf, simulating their arrival, participation in the meeting, and sleigh preparation.

- **Tests Conducted**:
  - Verify that the elves arrive in order.
  - Ensure that the last elf to arrive rings the bell.
  - Confirm that Santa Claus receives the elves one by one and that the meeting happens after all have entered.
  - Verify that only the last elf prepares the sleigh after the meeting.

---

## 🛠️ **Technologies and Tools**

- **Linux** (chosen distribution)
- **VMware**: Used to run the Linux operating system and ensure a controlled environment for the development and execution of the project.
- **Semaphores** and **Mutex** for process synchronization
- **Threads** (using `pthread` or native threads)
- **Compilation with GCC** and **Execution in Shell**

---

## 👤 **Author**

Repository developed by **[Pedro Venda](https://github.com/PedroVenda27)**

---

✨ *"Synchronizing processes and coordinating the magic of Christmas, one semaphore at a time in Linux."*
