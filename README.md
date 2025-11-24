
# Marvellous Packer–Unpacker Project

## 📌 Overview
This project provides a **file packing and unpacking utility** with a **GUI-based login system**.  
Users must sign in or sign up before accessing the Packer/Unpacker interface.

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

### 1️⃣ Open terminal inside `src/` folder:
```
cd FullPackerUnpacker/src
```

### 2️⃣ Compile all Java files:
```
javac Mangesh/Login/*.java Mangesh/GUI/*.java Mangesh/Logic/*.java Mangesh/Main.java -d .
```

---

## ▶️ How to Run

```
java Mangesh.Starter
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
- Packs all files recursively into one `.packed` file

---

## 📤 Unpacking Files
GUI: `GUIU`  
Logic: `MarvellousUnpacker`

Features:
- Enter packed input file
- Extracts all files and directories correctly

---

## 🧠 Backend Logic

### MarvellousPacker
Reads all files and writes metadata + content to a packed file.

### MarvellousUnpacker
Reads packed file and reconstructs original structure.

---

## 👨‍💻 Author
**Mangesh Bedre**  

---

## ⭐ Future Ideas
- Add encryption to packed file  
- Save user credentials permanently  
- Add dark mode  
- Add file chooser dialog  

