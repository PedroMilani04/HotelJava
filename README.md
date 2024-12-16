# Hotel Management System

## Overview

The **Hotel Management System** is a Java-based application designed to manage a hotel's core functionalities. It includes features for guest reservations, payments (online and in-person), employee management, room management, and additional services. The system ensures a seamless experience for both guests and hotel staff.

To ensure maintainability and scalability, the system incorporates **design patterns**:

- **Singleton**: Ensures that certain classes (e.g., `PagamentoFactory`) have only one instance to centralize payment management.  
- **Proxy**: Provides controlled access to sensitive or restricted operations, enhancing security and modularity.  
- **Strategy**: Allows dynamic selection of different payment or service strategies, such as **online payment** and **in-person payment** methods.  
- **Factory**: Simplifies the creation of payment objects using the `PagamentoFactory` class, adhering to the principle of abstraction.  

These patterns contribute to cleaner, more maintainable code while promoting good object-oriented design practices.

---

## Features

1. **Guest and Employee Management**
   - Create and manage **guests** and **hotel employees**.
   - Support for guest check-in and check-out.

2. **Room Reservation**
   - Manage room reservations, including online and in-person options.
   - Ensure room availability for incoming guests.

3. **Payment Processing**
   - Handle different payment methods:
     - **Online payments**.
     - **In-person payments**.
   - Generate receipts for reservations.

4. **Additional Services**
   - Offer extra services (e.g., room service, amenities) for guests.

5. **Utility Classes**
   - Provide helper utilities for operations such as logging and service tracking.

---

## Class Structure

| **Class**                        | **Description**                                                                 |
|----------------------------------|---------------------------------------------------------------------------------|
| `Cadastro.java`                  | Handles guest and employee registration.                                        |
| `CheckIn.java`                   | Manages the check-in process for hotel guests.                                 |
| `CheckOut.java`                  | Handles the check-out process, including final billing.                        |
| `Cliente.java`                   | Represents a hotel guest.                                                      |
| `FuncionarioHotel.java`          | Represents hotel staff members.                                                |
| `Login.java`                     | Manages user authentication and login functionality.                           |
| `Main.java`                      | Main class to execute and initialize the hotel system.                         |
| `PagamentoFactory.java`          | Factory class to create payment instances.                                     |
| `PagamentoReserva.java`          | Abstract class for payment processing.                                         |
| `PagamentoReservaOnline.java`    | Implements online payment processing.                                          |
| `PagamentoReservaPresencial.java`| Implements in-person payment processing.                                       |
| `Proxy.java`                     | Controls access to restricted operations, such as sensitive payment details.   |
| `Quarto.java`                    | Represents hotel rooms with attributes like availability and type.             |
| `Reserva.java`                   | Manages room reservations.                                                     |
| `Servico.java`                   | Represents basic hotel services.                                               |
| `ServicoAdicional.java`          | Handles additional services requested by guests (e.g., amenities, room service).|
| `Strategy.java`                  | Interface for payment or service strategies.                                   |
| `StrategyHosp.java`              | Implements strategies for hospitality services.                                |
| `StrategyStandard.java`          | Implements standard strategies for basic hotel operations.                     |
| `Usuario.java`                   | Base class representing system users.                                          |

---

## How to Run

1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd hotel-management-system
1. **Compile the Code**
   ```bash
   javac *.java
1. **Run the Application**
   ```bash
   java Main

