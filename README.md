# User Profile Management App

This application is a user profile management app built using Kotlin and Jetpack Compose. It follows the principles of clean architecture, ensuring a maintainable, well-structured codebase.

## Features

1. User Profile Screen: Displays user information such as name and email. It includes an input field for entering a user ID and a button to load user data.

2. Background Image: The screen has a background image that covers the entire screen.

3. App title: The app name is displayed with a shadow effect to create a 3D look and stand out.

4. Loading Indicator: An hourglass loading indicator is shown while user data is being fetched.

5. Error Handling: Displays error messages if there is an issue loading user data or invalid data is entered.

6. Dependency Injection: Uses Dagger Hilt for dependency injection to manage dependencies efficiently.

## Architecture

The project is divided into distinct layers, each with specific responsibilities:

1. Presentation Layer: Contains the UI components and handles user interactions. It includes UserProfileScreen.kt and HourglassLoadingIndicator.kt. It uses Jetpack Compose for UI and observes data from the ViewModel.

2. Domain Layer: Contains the business logic and use cases. It includes the GetUserUseCase class, which defines the operations that can be performed on the data.

3. Data Layer: Handles data retrieval and storage. It includes repositories and data sources that fetch data.

4. Dependency Injection: Dagger Hilt is used for dependency injection, ensuring that dependencies are provided where needed without coupling the components.

Each layer interacts with the one directly below it, ensuring separation of concerns and making the codebase more maintainable and testable.

## Dagger-Hilt

Dagger-Hilt is integrated into the project to manage dependency injection efficiently.
1. The libs.versions.toml file includes the necessary Hilt dependencies.
2. The application class is annotated with @HiltAndroidApp to trigger Hilt's code generation.
3. The UserViewModel is annotated with @HiltViewModel and its dependencies are injected via the constructor.
4. Modules are created to provide dependencies, like the modules used to provide the GetUserUseCase.
5. The hiltViewModel() function is used to obtain the UserViewModel in composables.

## Future Enhancements

1. Adding further UI elements like images and animations
2. History of searched users
3. Improve performance for faster searching

## Images

![Screenshot 2024-12-09 224804](https://github.com/user-attachments/assets/8b50651e-b677-4183-88d1-ca091ff94e55) 

User Not Found

![Screenshot 2024-12-09 224737](https://github.com/user-attachments/assets/c05350fd-ef0b-4f64-8374-4f6f95352160) 

Searched user

![Screenshot 2024-12-09 224723](https://github.com/user-attachments/assets/5fc257dc-04f2-4cc7-8d5a-0dd980973939) 

Loading hourglass

![Screenshot 2024-12-09 224650](https://github.com/user-attachments/assets/5621fdaa-8c01-4349-8016-5162f1a4df9a) 

Main Screen


## Getting Started

### Prerequisites

-Android Studio

-Kotlin

-Gradle

# Installation

-Clone the repository: git clone https://github.com/ThatFireBoi/UserProfileApp.git

-Open the project in Android Studio.

-Build the project to download all dependencies.

# Running the App

-Connect an Android device or start an emulator.

-Run the app from Android Studio.
