# Ecommerce Shipping Calculator (Visitor Pattern)

## Overview
This simple program implements a **Visitor Design Pattern** to calculate shipping costs for different types of furniture in an e-commerce platform. By using this pattern, we ensure flexibility in adding new furniture types without modifying existing classes, promoting **loose coupling** and **extensibility**.

## Problem Scenario
You are a software developer working on an e-commerce platform that sells various types of furniture, including **chairs, tables, and sofas**. The platform requires a **shipping cost calculator** that considers the type and size of the furniture.

Each furniture type has its own **unique shipping cost calculation logic**:
- **Chairs**: Lightweight and have a flat shipping rate.
- **Tables**: Medium-sized and incur a weight-based cost.
- **Sofas**: Bulky and require a distance-based shipping calculation.

Embedding the shipping logic within each furniture class would lead to **tight coupling**, making it difficult to add new furniture types in the future. Instead, we use the **Visitor Pattern** to separate the shipping cost logic from the furniture objects.

## Implementation Details
- The project demonstrates the **Visitor Design Pattern** by defining:
  - **Element Interface**: Represents different types of furniture.
  - **Concrete Elements**: Implements specific furniture types (Chair, Table, Sofa, etc.).
  - **Visitor Interface**: Defines the `visit()` method for handling different furniture types.
  - **Concrete Visitor**: Implements the shipping cost calculation logic for each furniture type.
  - **Client Code**: Demonstrates how to calculate shipping costs using the visitor pattern.

- **Important Constraints**:
  - **Do not use abstract classes**.
  - **Use meaningful interface and class names**.
  
## UML Diagram
![Image](https://github.com/user-attachments/assets/b01ffdae-b2b3-42e5-bf44-7c96c3947f7d)
