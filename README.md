# Kyosuke Browser

A complete, highly optimized, privacy-focused Android Web Browser built with modern Android technologies.

## Tech Stack
- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM + Clean Architecture
- **Dependency Injection**: Hilt
- **Local Database**: Room (History, Bookmarks)
- **Preferences**: DataStore (Settings)
- **WebView**: Android System WebView
- **Concurrency**: Coroutines & Flow

## Architecture Overview
The project follows Clean Architecture principles:
- **Presentation**: UI components (Compose), ViewModels, and State.
- **Domain**: Business logic, Use Cases, and Repository interfaces.
- **Data**: Repository implementations, Room Database, DataStore, and Mappers.
- **DI**: Hilt modules for providing dependencies.

## Features
- Fast and lightweight browsing.
- Privacy-focused (Ad-blocking, No-track, Private mode).
- Bookmarks and History management.
- Modern Material 3 UI.

## License
MIT License
