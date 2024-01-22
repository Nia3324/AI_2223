# Artificial Intelligence - 2022/2023

## Project 1 - Fifteen Puzzle Game

### Overview

This project was developed within the scope of the course *Artificial Intelligence* during the academic year 2022/2023 at the Faculty of Sciences, University of Porto, by students António Cardoso, Bárbara Santos, and Isabel Brito.

Its main objective is the complete implementation of the [Fifteen Puzzle](https://en.wikipedia.org/wiki/15_puzzle "Fifteen Puzzle - Wikipedia") and various search algorithms to find the solution based on the given input. For this purpose, the Java language was chosen due to its association with Object-Oriented Programming, being strongly-typed, its Garbage Collector, among other reasons.

The program was compiled on both *Ubuntu 20.04 LTS* with *javac 11.0.17* and *macOS Monterey version 12.2.1* with *javac 18.0.2.1*.

### Compilation and Execution Instructions

To execute each problem, it is first necessary to compile all Java files. Use the following instruction:

`javac *.java`

After compiling all files, it is finally possible to execute them. The following algorithms were developed:
- BFS
- DFS
- IDFS
- Greedy-misplaced
- Greedy-Manhattan
- A*-misplaced
- A*-Manhattan

For the execution of each one, use the following input format:
`java Game strategy < input.txt`, where "strategy" should be replaced with the desired algorithm's name, and "input.txt" with the name of the text file containing the initial and final configurations. It is also possible, however, to omit this last part and enter the input via the terminal.

The program will await input, which should be provided in the order of the initial board, followed by the final board.

Example:

1 2 3 4 5 7 8 0 9 13 12 6 14 11 10 15

1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 0

It is expected that, after solving the problem, the program will print the maximum number of states stored in memory, the level of the found solution, the time it took for the algorithm to find it, and the steps needed to reach the final board.

## Contributors

- [António Cardoso](https://github.com/ToniCardosooo)
- [Antónia Brito](https://github.com/Nia3324)
- [Bárbara Santos](https://github.com/barbara-san)