
# Marvellous Packer–Unpacker Project

## 📌 Overview
This project provides a **file packing and unpacking utility** with a **GUI-based login system**.  

• Implemented metadata preservation during packing/unpacking.<br>
• Designed GUI using Swing for user-friendly interaction. <br>
• Designed and implemented a secure login interface to authenticate users before      system access.<br>
• Built with scalability in mind, allowing future enhancements like role-based access and password recovery.<br>
• The system uses inbuilt byte-level encryption and decryption to protect file contents during storage and transfer. 

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
      │           ├── GUIPX.java
      │           ├── MarvellousPacker.java
      │           └── MarvellousUnpacker.java
      └── Starter.java
```      
---

## Work Flow Daigram
                  +----------------------------------+
                  |        LoginPageGUI              |
                  +----------------------------------+
                  | - frame : JFrame                 |
                  | - usernameField : JTextField     |
                  | - passwordField : JPasswordField |
                  | - loginButton : JButton          |
                  | - resultLabel : JLabel           |
                  +----------------------------------+
                  | + actionPerformed()              |
                  | + validateLogin() : boolean      |
                  +----------------------------------+
                              |
                              | success
                              v
                  +----------------------------------+
                  |   PackerUnpackerInterface        |
                  +----------------------------------+
                  | - frame : JFrame                 |
                  | - packButton : JButton           |
                  | - unpackButton : JButton         |
                  +----------------------------------+
                  | + actionPerformed()              |
                  +----------------------------------+
                        |                     |
                        |                     |
                  opens |                     | opens
                        v                     v
                  +--------------------+   +--------------------+
                  |       GUIPX        |   |        GUIU        |
                  | (Packer GUI)       |   | (Unpacker GUI)     |
                  +--------------------+   +--------------------+
                  | - fobj : JFrame    |   | - fobj : JFrame    |
                  | - packButton       |   | - unpackButton     |
                  | - backButton       |   | - backButton       |
                  | - ResultLabel      |   | - ResultLabel      |
                  | - TextFields       |   | - FileTextField    |
                  +--------------------+   +--------------------+
                  | + actionPerformed()|   | + actionPerformed()|
                  +--------------------+   +--------------------+
                        |                     |
                        |                     |------------------------------------------|
                        |                                                                |
                        |                                                                | uses
                        | uses                                                           | 
                        |                                                                |
                        v                                                                v   


                  +-------------------------------------------+   +-------------------------------------------+
                  |           MarvellousPacker                |   |           MarvellousUnpacker              |
                  +-------------------------------------------+   +-------------------------------------------+
                  | - packFile : String                       |   | - packFile : String                       |      
                  | - srcFolder : String                      |   +-------------------------------------------+       |
                  +-------------------------------------------+   | + UnpackingActivity()                     |
                  | + PackingActivity()                       |   +-------------------------------------------+
                  +-------------------------------------------+                     |
                        |                                                           |
                        | uses                                                      | uses 
                        v                                                           v 
                  +-------------------------------------------+   +-------------------------------------------+
                  |              CryptoUtil                   |   |              CryptoUtil                   |
                  +-------------------------------------------+   +-------------------------------------------+
                  | + encrypt(byte[]) : byte[]                |   | + encrypt(byte[]) : byte[]                |
                  | + decrypt(byte[]) : byte[]                |   | + decrypt(byte[]) : byte[]                |
                  +-------------------------------------------+   +-------------------------------------------+

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



