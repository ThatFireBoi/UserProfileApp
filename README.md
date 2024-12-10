# User Profile Management App

This application is a user profile management app built using Kotlin and Jetpack Compose. It follows the principles of clean architecture, ensuring a well-structured and maintainable codebase.

## Features

User Profile Screen: Displays user information such as name and email. It includes an input field for entering a user ID and a button to load user data.

Background Image: The screen has a background image that covers the entire screen.

3D Effect for App Name: The app name is displayed with a shadow effect to create a 3D look.

Loading Indicator: A custom hourglass loading indicator is shown while user data is being fetched.

Error Handling: Displays error messages if there is an issue loading user data.

Dependency Injection: Uses Dagger Hilt for dependency injection to manage dependencies efficiently.

## Architecture

The project is divided into distinct layers, each with specific responsibilities:

Presentation Layer: Contains the UI components and handles user interactions. It includes UserProfileScreen.kt and HourglassLoadingIndicator.kt. It uses Jetpack Compose for UI and observes data from the ViewModel.

Domain Layer: Contains the business logic and use cases. It includes the GetUserUseCase class, which defines the operations that can be performed on the data.

Data Layer: Handles data retrieval and storage. It includes repositories and data sources that fetch data from APIs or databases.

Dependency Injection: Dagger Hilt is used for dependency injection, ensuring that dependencies are provided where needed without tightly coupling the components.

Each layer interacts with the one directly below it, ensuring separation of concerns and making the codebase more maintainable and testable.

## Getting Started

### Prerequisites

-Android Studio

-Kotlin

-Gradle

# Installation

-Clone the repository: git clone https://github.com/ThatFireBoi/UserProfileApp.git

-Open the project in Android Studio.

-Build the project to download all dependencies.

#Running the App

-Connect an Android device or start an emulator.

-Run the app from Android Studio.
