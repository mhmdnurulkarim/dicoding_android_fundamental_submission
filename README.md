# GitHub User App 🚀

This Android application allows users to search for GitHub users, view their profiles, and manage their favorite users. It leverages modern Android development practices, including Kotlin, Coroutines, Flow, Koin for dependency injection, View Binding, and the Android Architecture Components. The app also supports dark and light themes.

## 🌟 Key Features

- **User Search:** Search for GitHub users by username. 🔍
- **Detailed User Profiles:** View detailed information about a user, including their avatar, username, name, company, location, and bio. ℹ️
- **Followers/Following Lists:** Browse a user's followers and following lists. 👥
- **Favorite User Management:** Add and remove users from a favorites list. ❤️
- **Dark/Light Theme Support:** Switch between dark and light themes. 🌙☀️
- **Splash Screen:** A visually appealing splash screen is displayed on app launch. ⏳

## 🛠️ Tech Stack

- **Programming Language:** Kotlin
- **UI Framework:** Android SDK
- **Asynchronous Programming:** Coroutines & Flow
- **Dependency Injection:** Koin
- **View Binding:** Android View Binding
- **Image Loading:** Glide
- **Architecture Components:** LiveData, ViewModel
- **Local Database:** Room (likely in the `:core` module)
- **Networking:** Retrofit (likely in the `:core` module)
- **Build Tool:** Gradle (Kotlin DSL)
- **Kotlin Symbol Processing (KSP):** For Room Compiler
- **Kotlin Parcelize:** For easier data passing between components

## 📦 Getting Started

Follow these instructions to get the project up and running on your local machine.

### Prerequisites

- Android Studio installed
- Android SDK configured
- Gradle installed (usually bundled with Android Studio)
- A device or emulator to run the application

### Installation

1.  **Clone the repository:**

    ```bash
    git clone https://github.com/mhmdnurulkarim/Github-User.git
    ```

2.  **Open the project in Android Studio:**

    - Launch Android Studio.
    - Select "Open an Existing Project" and navigate to the cloned repository.

3.  **Sync Gradle:**

    - Android Studio will prompt you to sync the Gradle files. Click "Sync Now."

### Running Locally

1.  **Build the project:**

    - In Android Studio, go to `Build > Make Project`.

2.  **Run the application:**

    - Connect your Android device or start an emulator.
    - Click the "Run" button in Android Studio (or `Run > Run app`).
    - Select your device/emulator.

## 📂 Project Structure

```
├── app/
│   ├── build.gradle.kts                  # Gradle build script for the app module
│   ├── src/main/
│   │   ├── AndroidManifest.xml           # Android manifest file
│   │   ├── java/com/mhmdnurulkarim/githubuser/
│   │   │   ├── di/                      # Koin DI modules
│   │   │   │   └── AppModule.kt
│   │   │   ├── darkTheme/               # Dark theme related files
│   │   │   │   ├── DarkThemeActivity.kt
│   │   │   │   └── DarkThemeViewModel.kt
│   │   │   ├── detailUserActivity/      # Detail user activity related files
│   │   │   │   ├── DetailUserActivity.kt
│   │   │   │   └── DetailUserViewModel.kt
│   │   │   ├── followersFragment/       # Followers fragment related files
│   │   │   │   ├── FollowersFragment.kt
│   │   │   │   └── FollowersViewModel.kt
│   │   │   ├── followingFragment/       # Following fragment related files
│   │   │   │   ├── FollowingFragment.kt
│   │   │   │   └── FollowingViewModel.kt
│   │   │   ├── mainActivity/            # Main activity related files
│   │   │   │   ├── MainActivity.kt
│   │   │   │   └── MainViewModel.kt
│   │   │   ├── splashActivity/          # Splash activity related files
│   │   │   │   ├── SplashActivity.kt
│   │   │   │   └── SplashViewModel.kt
│   │   │   ├── SectionPagerAdapter.kt   # ViewPager adapter for followers/following
│   │   │   ├── MyApplication.kt         # Application class (Koin initialization)
│   │   │   └── utils/                   # Utility classes
│   │   │       └── Const.kt
│   │   └── res/                        # Resources (layouts, drawables, etc.)
│   └── ...
├── core/                               # Core module (likely contains data layer, domain layer, etc.)
│   └── ...
├── favorite/                           # Dynamic feature module for favorites (optional)
│   └── ...
├── build.gradle.kts                      # Top-level Gradle build script
├── settings.gradle.kts                   # Settings file for Gradle
└── ...
```

## 📸 Screenshots

(Screenshots will be added here)

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1.  Fork the repository.
2.  Create a new branch for your feature or bug fix.
3.  Make your changes and commit them with descriptive messages.
4.  Push your changes to your fork.
5.  Submit a pull request.

## 📬 Contact

If you have any questions or suggestions, feel free to contact me at [mhmdnurulkarim@gmail.com](mailto:mhmdnurulkarim@gmail.com).

## 💖 Thanks Message

Thank you for checking out the Restaurant App! We hope you find it useful and enjoyable. Your feedback and contributions are greatly appreciated.
