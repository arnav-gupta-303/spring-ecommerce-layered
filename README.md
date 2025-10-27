# 🛍️ Spring E-Commerce Layered

### 🩵 Short Description  
A Spring-based layered e-commerce application demonstrating dependency injection, modular design, and dynamic payment selection.

---

### 🧩 Detailed Description  
**Spring E-Commerce Layered** is a Java-based mini e-commerce system built using the **Spring Framework**, following a clean **layered architecture** — **Controller**, **Service**, **Repository**, and **Database** layers.  

It showcases key Spring concepts such as **Dependency Injection (IoC)**, **lifecycle management**, and **Map-based autowiring** to dynamically choose payment methods like **GPay** or **Credit Card** at runtime.  

The project simulates adding and listing products through a controller while maintaining **loose coupling**, **high cohesion**, and **clear separation of concerns**, making it an excellent example of how to structure scalable Spring applications.

---

### ⚙️ Layers Overview
EcommerceLayered/
├── Controller/ # Handles user requests (ProductController)
├── Service/ # Business logic (ProductService, PaymentService, GPay, CreditCard)
├── Repository/ # Data access (ProductRepo)
├── Database/ # Simulated in-memory database (ProductDatabase)
├── AppConfig.java # Spring configuration and bean setup
└── Main.java # Application entry point

---

### 🚀 Key Features
- Follows **Layered Architecture** for modular design  
- Uses **Spring IoC & DI** for loose coupling  
- Demonstrates **Map-based autowiring** for dynamic bean selection  
- Simulates product CRUD and payment options  
- Uses **Bean lifecycle methods** (`initMethod`, `destroyMethod`) for resource management  

---

### 🧠 Example Output
DB connected
Product Mobile Added
You have selected GPay for Payment
Product Laptop Added
You have selected CreditCard for Payment
Product Charger Added
Payment Option from cash not Available
Available option
[gpay, creditCard]
[Mobile, Laptop, Charger]
product Listed
---

### 🛠️ Tech Stack
- **Java 17+**
- **Spring Core / Context**
- **Spring Annotations:** `@Component`, `@Service`, `@Repository`, `@Controller`, `@Autowired`, `@Bean`
- **AnnotationConfigApplicationContext**
