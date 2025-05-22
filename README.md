# Billing System for a Retail Shop

A simple and easy-to-use **console-based Billing System** built in Java. This application allows users to add products with quantities and prices, view the shopping cart, and checkout with automatic total calculation.

---

## Features

- Add products with name, quantity, and price per unit  
- View cart with detailed product list and subtotal  
- Checkout to finalize the bill and clear the cart  
- Simple menu-driven console interface

---

## Technologies Used

- Java (Core Java)  
- No external libraries or GUI — runs on the console

---

## Project Structure

BillingSystemJava/
├── src/
│ └── com/
│ └── billingsystem/
│ ├── BillingSystem.java
│ └── Product.java
└── README.md

yaml
Copy
Edit

---

## How to Run

1. **Download or clone the repository** and extract it if needed.

2. Open a terminal or command prompt and navigate to the `src` directory:

   ```bash
   cd path/to/BillingSystemJava/src
Compile the Java source files:

bash
Copy
Edit
javac com/billingsystem/*.java
Run the main program:

bash
Copy
Edit
java com.billingsystem.BillingSystem
Follow the interactive menu to add products, view cart, checkout, or exit.

Sample Interaction
mathematica
Copy
Edit
=== Billing System ===

1. Add Product
2. View Cart
3. Checkout
4. Exit
Choose an option: 1
Enter product name: Pen
Enter quantity: 3
Enter price per unit: 15
Product added.

--- Cart Items ---
Pen x 3 @ ₹15.0 = ₹45.0
Total: ₹45.00
Author
Priyanshu

License
This project is licensed under the MIT License.
