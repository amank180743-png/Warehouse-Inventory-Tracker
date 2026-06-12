# Warehouse Inventory Tracker

## Design and Implementation of a Warehouse Inventory Tracking System using Object-Oriented Programming (OOP)

### Project Overview

The Warehouse Inventory Tracker is a Java-based application developed using Object-Oriented Programming (OOP) concepts. The system helps manage warehouse inventory by storing product details and automatically detecting products that are running low on stock.

This project demonstrates the practical implementation of OOP concepts such as Encapsulation, Classes and Objects, Constructors, the `this` keyword, Arrays of Objects, Iteration, and Conditional Logic.

---

## Features

* Store product information including name, quantity, and threshold level.
* Manage multiple products using an Inventory Manager.
* Detect low-stock products automatically.
* Display inventory details and stock status.
* Generate low-stock alerts.
* Demonstrate real-world warehouse inventory management logic.

---

## OOP Concepts Used

### 1. Encapsulation

Product attributes are declared as private and accessed through public methods.

### 2. Classes and Objects

The project uses Product and InventoryManager classes to represent real-world entities.

### 3. Constructor and this Keyword

Constructors initialize object data and use the `this` keyword to assign values correctly.

### 4. Arrays of Objects

Multiple Product objects are stored and managed using an array.

### 5. Iteration and Conditional Logic

Loops and conditions are used to check inventory levels and generate alerts.

---

## Classes Used

### Product Class

Stores:

* Product Name
* Quantity
* Threshold Level

Methods:

* getProductName()
* getQuantity()
* getThreshold()
* isLowStock()

### InventoryManager Class

Responsible for:

* Managing product records
* Displaying inventory details
* Checking low-stock products

Methods:

* displayInventory()
* checkLowStock()

---

## Sample Output

Checking Inventory...

===== INVENTORY DETAILS =====

Product: Laptop
Status: STOCK OK

Product: Mouse
Status: LOW STOCK ALERT!

Product: Keyboard
Status: STOCK OK

Product: Monitor
Status: LOW STOCK ALERT!

===== LOW STOCK REPORT =====

ALERT: Mouse is low on stock!

ALERT: Monitor is low on stock!

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* GitHub

---



## Author

**Name:** Aman Kumar

**ERP:** RU-25-10155

---


