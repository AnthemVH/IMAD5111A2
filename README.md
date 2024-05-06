# Virtual Pet App
This is a simple virtual pet app where you can take care of a dog by feeding, cleaning, and playing with it. The app updates the pet's status (Hunger, Cleanliness, and Happiness) based on the actions you take.

## Overview
The app uses Kotlin with Android's AppCompatActivity and kotlinx.coroutines for handling asynchronous tasks. Here's a breakdown of the key components:

## Features
- Buttons: Three buttons (Feed, Clean, Play) allow you to interact with the virtual pet.
- Status Display: Shows the current levels of Hunger, Cleanliness, and Happiness using TextView elements.
- Image Display: An ImageView displays the pet's state (e.g., regular, eating, cleaned, being played with) based on the actions taken.

## Code Explanation
### Initialization
# Picture
Initialize the status variables (Hunger, Clean, Happy) with default values.

### UI Setup

# picture
In the onCreate method, initialize UI elements and set initial status values.

### Button Actions
# Picture
Define actions for each button click. This updates the status values and changes the pet's image accordingly.

### Coroutines for Status Update
# Picture

- 'startIncrement()': Starts a coroutine that updates the pet's status periodically. The coroutine runs until it's cancelled.
- 'onResume()', 'onPause()', 'onDestroy()': Manage the lifecycle of the coroutine to start, pause, and cancel accordingly.
## Usage
- Run the app on an Android device or emulator.
- Interact with the pet by clicking the Feed, Clean, and Play buttons.
- Observe how the pet's status changes over time.
- The app stops updating when the pet's status becomes critical ('Hunger < 0', 'Clean > 100', 'Happy > 100').