
# Marvellous Packer–Unpacker Project

## 📌 Overview
This project provides a **file packing and unpacking utility** with a **GUI-based login system**.  

• Implemented metadata preservation during packing/unpacking.
• Designed GUI using Swing for user-friendly interaction. 
• Designed and implemented a secure login interface to authenticate users before      system access.
• Built with scalability in mind, allowing future enhancements like role-based access and password recovery.

---

## 📂 Project Structure

```
PackerUnpacker/
      └── Mangesh/
      │     ├── Login/
      │     │     ├── UsernamePasswordGUI.java
      │     │     └── LoginPageX.java
      │     │
      │     ├── GUI/
      │     │     ├── GUIPX.java
      │     │     ├── GUIU.java
      │     │     └── PackerUnpackerInterface.java
      │     │
      │     └── Logic/
      │           ├── MarvellousPacker.java
      │           └── MarvellousUnpacker.java
      └── Starter.java
```      
---

## 🚀 How to Compile

### 1️⃣ Open terminal inside `PackerUnpacker/` folder:
```
cd PackerUnpacker
```

### 2️⃣ Compile all Java files:
```
javac Mangesh/Login/*.java Mangesh/GUI/*.java Mangesh/Logic/*.java Starter.java 
```

---

## ▶️ How to Run

```
java Starter
```

This opens the Login Page GUI.

---

## 🔐 Login System
- **Sign In** → checks username & password using `LoginPageX`
- **Sign Up** → stores new user in HashMap
- **After login success** → opens `PackerUnpackerInterface`

---

## 📦 Packing Files
GUI: `GUIPX`  
Logic: `MarvellousPacker`

Features:
- Select folder to pack
- Enter output packed filename
- Validations
- Packs all files into one `.packed or .txt` file

---

## 📤 Unpacking Files
GUI: `GUIU`  
Logic: `MarvellousUnpacker`

Features:
- Enter packed input file
- Extracts all files correctly

---

## 🧠 Backend Logic

### MarvellousPacker
Reads all files and writes metadata + content to a packed file.

### MarvellousUnpacker
Reads packed file and reconstructs original structure.

---
## ⭐ Future Ideas
- Add encryption to packed file  
- Save user credentials permanently  
- Add dark mode  
- Add file chooser dialog
---

## 👨‍💻 Author
**Mangesh Bedre**  

---



