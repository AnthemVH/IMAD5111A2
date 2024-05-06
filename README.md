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
![IMAD5111A2_Var1](https://github.com/AnthemVH/IMAD5111A2/assets/113454977/1ad2237e-5e40-47a4-8c6d-b1492ae8f09a)

Initialize the status variables (Hunger, Clean, Happy) with default values.

### UI Setup
![IMAD5111A2_UI](https://github.com/AnthemVH/IMAD5111A2/assets/113454977/a8182aad-f8a4-46ad-8dfc-2d184995a8e2)

In the onCreate method, initialize UI elements and set initial status values.

### Button Actions
![IMAD5111A2_BTN](https://github.com/AnthemVH/IMAD5111A2/assets/113454977/609bde0b-bdeb-4183-880e-e2e76d338995)

Define actions for each button click. This updates the status values and changes the pet's image accordingly.

### Coroutines for Status Update
![IMAD5111A2_Counter](https://github.com/AnthemVH/IMAD5111A2/assets/113454977/3d5015d5-8aa8-43a7-8811-4cc4e299868b)


- 'startIncrement()': Starts a coroutine that updates the pet's status periodically. The coroutine runs until it's cancelled.
- 'onResume()', 'onPause()', 'onDestroy()': Manage the lifecycle of the coroutine to start, pause, and cancel accordingly.
## Usage
- Run the app on an Android device or emulator.
- Interact with the pet by clicking the Feed, Clean, and Play buttons.
- Observe how the pet's status changes over time.
- The app stops updating when the pet's status becomes critical ('Hunger < 0', 'Clean > 100', 'Happy > 100').

## Demostration Video

https://github.com/AnthemVH/IMAD5111A2/assets/113454977/dba19a80-c4e1-4251-92d4-82e37336c3f9

(https://youtu.be/w5AQJ60UlQ0)
