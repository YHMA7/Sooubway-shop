# Sooubway sandwich shop

### Approach 1: Subclass Explosion
* **Description**: A dedicated class for every sandwich + condiment combination.
* **Problem**: Adding one new condiment doubles the class count. Unmaintainable.

---

### Approach 2: Boolean Flags
* **Description**: The base Sandwich class holds a boolean field per condiment with getters/setters.
* **Problem**: Adding a new condiment requires editing Sandwich.java (violates Open/Closed Principle).
* **Limitations**: Want double chipotle? Can't do double portions, it's just true or false.

---

### Approach 3: Decorator Pattern
* **Description**: Each condiment wraps a Sandwich, delegating and adding its own cost/description.
* **Benefits**: Add condiments without touching existing code. Double portions works.
