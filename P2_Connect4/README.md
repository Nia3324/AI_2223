# Artificial Intelligence - 2022/2023

## Project 2 - Connect Four Game

### Overview

This project was developed within the scope of the course *Artificial Intelligence* during the academic year 2022/2023 at the Faculty of Sciences, University of Porto, by students António Cardoso, Bárbara Santos, and Isabel Brito.

Its main objective is the complete implementation of the [Connect Four Game](https://en.wikipedia.org/wiki/Connect_Four) and various search algorithms to determine the best move based on the current state of the game. For this purpose, the Java language was chosen due to its association with Object-Oriented Programming, being strongly-typed, its Garbage Collector, among other reasons.

The program was compiled on both *Ubuntu 20.04 LTS* with *javac 11.0.17* and *macOS Monterey version 12.2.1* with *javac 18.0.2.1*.

### Compilation and Execution Instructions

To execute each problem, it is first necessary to compile all Java files. Use the following instruction:

`javac *.java`

After compiling all files, it is finally possible to execute them. The following algorithms were developed:
- Minimax
- Minimax with Alpha-Beta pruning
- Monte Carlo Tree Search (MCTS)

For the execution of each one, use the following input format: `java Game type`, where "type" should be replaced with the name of the desired algorithm:
- `java Game MiniMax`
- `java Game AlphaBeta`
- `java Game MCTS`

The program will await the user's first move. The user should provide it with a number from 1 to 7, representing the column where they want to play.

Example:

`It is now X's turn.`  
`Make a move by choosing your coordinate to play (1 to 7):`

`2`

It is expected that, after the user's move, the current board will be printed, followed by the board with the opponent algorithm's move. This process repeats until one side wins or the board is filled, resulting in a draw.


## Contributors

- [António Cardoso](https://github.com/ToniCardosooo)
- [Antónia Brito](https://github.com/Nia3324)
- [Bárbara Santos](https://github.com/barbara-san)