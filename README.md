
# NoteTakingApp (Android)

## Overview

This is a simple Android NoteTakingApp that allows users to create and manage notes. The app demonstrates basic Android development using Java, including activities, layouts, and file handling to save notes locally.

## Prerequisites

Before running this project, ensure you have the following installed:

- **Android Studio**
- **Java JDK 8 or later**
- **Git**

## Project Structure

The project follows a typical Android project structure:

```
.
├── app
│   ├── src
│   │   └── main
│   │       ├── java
│   │       │   └── tan
│   │       │       └── jerry
│   │       │           └── notetakingapp
│   │       │               └── MainActivity.java
│   │       └── res
│   │           └── layout
│   │               └── activity_main.xml
│   └── test
│       └── java
│           └── tan
│               └── jerry
│                   └── notetakingapp
│                       └── MainActivityTest.java
└── build.gradle
```

## How to Run the Project

### Step 1: Clone the Repository

Clone the repository locally using the following command:

```bash
git clone https://github.com/the-real-jerry-tan/NoteTakingApp.git
cd NoteTakingApp
```

### Step 2: Open the Project in Android Studio

1. Launch **Android Studio**.
2. Select **File** > **Open** and navigate to the directory where you cloned the project.
3. Open the project.

### Step 3: Build and Run the Application

1. **Build** the project by clicking on **Build** > **Make Project**.
2. **Run** the application by clicking on **Run** > **Run 'app'**.
3. Select an emulator or physical device to run the application on.

### Step 4: Interact with the App

Once the app is running on the emulator or device:
- You can create, edit, and delete notes.
- The notes will be saved locally on the device.

## Running Tests

Unit tests for the app are located in the `test/java/tan/jerry/notetakingapp/MainActivityTest.java` file. You can run the tests using the following steps:

1. In Android Studio, open the **Test** tab on the right side.
2. Click on the **Run** icon next to the test class to execute the tests.

## Troubleshooting

- Ensure that **Android Studio** is fully updated, including the Android SDK and Gradle plugin.
- If the app crashes on launch, check the **Logcat** for detailed error messages.
- If the emulator is slow, try using a physical device to run the application.

## License

This project is © 2024 Jerry Tan. All Rights Reserved.
