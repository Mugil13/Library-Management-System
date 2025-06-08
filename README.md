# Library Management System

A Java-based Library Management System built using **Apache NetBeans IDE** and **SQLPlus**, designed to manage important library functions like book lending, reservations for the books, member tracking and handling the inventory.

## Overview

This project supports:

- Book and member management
- Borrowing, returning, and reservation functionalities
- Inventory tracking across multiple branches
- E-book access and delivery logistics
- Payment and fine management

The backend logic and data integrity are ensured through SQL queries executed using Oracle SQLPlus, while the frontend UI is developed in Java using the NetBeans IDE.

---

## Entity Tables & Attributes

The system consists of 10 core entities:

1. **Book**
2. **Member Info**
3. **Worker Info**
4. **Payment**
5. **Order**
6. **Inventory**
7. **Branch**
8. **Delivery**
9. **Reservation**
10. **E-Book Access**

Each entity is associated with relevant attributes such as IDs, names, dates, and types. The relationships between these are mentioned in the ER diagrams and the functional dependencies. For more detailed information, please go to the documents folder, under which the full report for this project is attached.

---

## Functional Dependencies & Normalization

Each relation was analyzed for:

- **Functional Dependencies (FDs)**
- **Prime Attributes**
- **Minimal Covers**
- **Normalization up to BCNF**

Highlights:

- Removal of transitive and partial dependencies
- Decomposition of relations to satisfy **3NF/BCNF**
- Validation using closure and irreducibility methods

> Full normalization breakdown and minimal FD sets can be found in the project report.

---

## Tech Stack

| Component       | Technology            |
|----------------|------------------------|
| Frontend       | Java (NetBeans IDE)    |
| Backend        | Oracle SQLPlus         |
| Database       | Oracle Database        |
| Language       | Java, SQL              |

---

## Setup & Usage

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Library-Management-System.git

2. Open the project in NetBeans IDE.

3. Set up Oracle Database and execute the SQL scripts provided.

4. Run the Java files to launch the frontend.

## Project Scope
This project is part of UCS2404 - Database Management Systems coursework at:

Department of Computer Science and Engineering
Sri Sivasubramaniya Nadar College of Engineering
Kalavakkam – 603 110

## License
This project is for academic and educational use only - MIT License

## Authors

- **Mugilkrishna D U**
- **Nikilesh Jayaguptha** 
- **Niranjan B** 

