# 🎓 Design Patterns Exercises I

**👨‍💻 Author**: Lucy Castro

**🧠 Learning Focus**: Design Patterns (Singleton, Abstract Factory, Command)  

**🛠️ IDE**: IntelliJ IDEA  

**💡 Java SDK**: 21  

## 📄 Description
This repository contains exercises focused on implementing core design patterns in Java.
Patterns covered:
- Singleton pattern
- Abstract Factory pattern
- Command pattern

Each pattern is implemented with practical use cases demonstrating their real-world applications.

## 💻 Technologies Used
- ☕ Java 21
- 🧠 IntelliJ IDEA
- 🗃️ Git & GitHub
- ⌨️ Command Line Tools

## 📋 Requirements
- ✅ Java JDK 21
- ✅ IntelliJ IDEA
- ✅ Git
- ✅ Internet connection

## 📚 Exercise Catalog

### 📂 Level 1: Singleton Pattern
<details>
<summary><strong>Exercise: Undo Command System</strong></summary>

Create an `Undo` class that:
1. Stores last entered commands (like Linux `history`)
2. Implements Singleton pattern
3. Provides methods to:
   - Add commands
   - Remove commands
   - List command history
   
**Main Class Demo**:
- Accept user input via console
- Show history listing
- Demonstrate singleton instance behavior
</details>

---

### 📂 Level 2: Abstract Factory Pattern
<details>
<summary><strong>Exercise: International Address Book</strong></summary>

Build an address book supporting:
1. Different formats for:
   - Addresses (street, city, postal code)
   - Phone numbers (country code, number format)
2. Abstract Factory implementation for:
   - `USAddressFactory`
   - `EUAddressFactory`
   
**Requirements**:
- Create 2+ country-specific factories
- Add entries to address book using factories
- Print formatted addresses/phones
</details>

---

### 📂 Level 3: Command Pattern
<details>
<summary><strong>Exercise: Vehicle Control System</strong></summary>

Implement a parking lot with:
1. Vehicles: Car, Bicycle, Plane, Boat
2. Command pattern operations:
   - `start()`
   - `accelerate()`
   - `brake()`
   
**Implementation**:
- Command interface with `execute()` method
- Concrete commands for each operation
- Invoker class to execute commands
- Demo showing command execution sequence
</details>

---

## 🎯 Learning Goals

✅ Singleton pattern implementation  

✅ Abstract Factory for object creation  

✅ Command pattern for operation encapsulation  

✅ Decoupling invokers from receivers  

✅ Practical pattern application scenarios  


## 🏆 Best Practices

✔️ Proper singleton instantiation  

✔️ Factory isolation of object creation  

✔️ Command encapsulation with undo support  

✔️ Clean separation of concerns  

✔️ Interface-driven implementations  


## 🤝 Contributions

1. ⭐ Star the repository  

2. 🍴 Fork the project  

3. 📥 Create a pull request  

## 🌐 Deployment

For educational purposes only.  

## 🚀 Thanks for Visiting = )
