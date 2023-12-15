# Tic-Tac-Toe Game

A simple Java Swing-based Tic-Tac-Toe game created by RK. Play against a friend and see who can get three in a row first!

## Features

- **Interactive UI:** The game provides an intuitive interface with a 3x3 grid of buttons.
- **Player vs Player:** Play against a friend by taking turns to make moves.
- **Winner Declaration:** The game declares the winner when a player gets three in a row either horizontally, vertically, or diagonally.
- **Draw Recognition:** If the board is full and there is no winner, the game recognizes it as a draw.
- **Player Turn Indicator:** The current player is indicated by the color of the symbol (X or O).

## How to Play

1. **Run the Game:**
   - Execute the `Tictactoe` class to launch the Tic-Tac-Toe game.
   - The game window will appear with an empty 3x3 grid.

2. **Make a Move:**
   - Players take turns making moves by clicking on an empty cell in the grid.
   - The current player is indicated by the color of the symbol (X or O).

3. **Winning the Game:**
   - The game declares the player as the winner if they get three in a row horizontally, vertically, or diagonally.
   - A message dialog will appear announcing the winner.

4. **Draw:**
   - If the board is full and no player has won, the game recognizes it as a draw.
   - A message dialog will appear announcing the draw.

5. **Restart the Game:**
   - After a game concludes (either a win or a draw), the game board can be reset by running a new instance of the game.

## Implementation Details

- The game is implemented in Java using the Swing library for the graphical user interface.
- The `ButtonClickListener` class handles button clicks and determines the game logic.
- The game checks for a winner by examining rows, columns, and diagonals.
- The player turn is indicated by the color of the symbol (X in red, O in black).

## Known Issues

- The game does not include an AI opponent; it is designed for two human players.

## Author

Riya Khilari

Enjoy playing Tic-Tac-Toe!
