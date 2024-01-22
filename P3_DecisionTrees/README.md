# Artificial Intelligence - 2022/2023

## Project 3 - Decision Trees

### Overview

This project was developed within the scope of the course [Artificial Intelligence](https://sigarra.up.pt/fcup/pt/ucurr_geral.ficha_uc_view?pv_ocorrencia_id=508303) during the academic year 2022/2023 at the Faculty of Sciences, University of Porto, by students André Sousa, Isabel Brito, and Paulo Silva.

The project aims to implement the ID3 algorithm for creating Decision Trees, as well as using the model created from the Connect4 dataset in the rollout phase of the MCTS algorithm in the game Connect Four.

The program was compiled on both *Ubuntu 20.04 LTS* with *javac 11.0.17* and *macOS Monterey version 12.2.1* with *javac 18.0.2.1*.

### Compilation and Execution Instructions

To execute each problem, it is first necessary to compile all Java files. Use the following instruction:

`javac *.java`

After compiling all files, it is finally possible to execute them. The following datasets were used:
- Iris dataset
- Restaurant dataset
- Weather dataset
- Connect 4 dataset

For the use of each one, use the following input format: `java DecisionTree <dataset>`, where `<dataset>` should be replaced with the name of the desired dataset:
- `java DecisionTree iris`
- `java DecisionTree restaurant`
- `java DecisionTree weather`
- `java DecisionTree connect4`

In the first three cases, it prints the decision tree corresponding to the chosen dataset and predicts the cases provided in a file named **test.csv**. If it is not intended to make predictions on new input, the **test.csv** file should be left empty. (see Example 1)

Regarding the last case, the Connect4 dataset, the algorithm will generate the decision tree, although it will not print it due to its size. In addition to this, a Connect 4 game will be initiated where it is possible to see the algorithm in action against the player. (see Example 2)

#### Example 1

**Input:**

    java DecisionTree restaurant

**File test.csv:**

    Yes,No,Yes,Yes,Full,$,No,No,Burger,10-30
    Yes,No,Yes,No,None,$,No,No,French,>60
    No,Yes,Yes,Yes,Some,$$$,Yes,Yes,Italian,0-10

**Final Output:**

    <Pat>
      Some: Yes (4)         
        Full: 
          <Alt>
            Yes: 
              <Type>
                French: No (1)         
                Thai:
                  <Fri>
                    No: No (1)         
                    Yes: Yes (1)         
                Burger: Yes (1)         
                Italian: No (1)         
            No: No (1)         
        None: No (2)

    Yes 
    No 
    Yes

#### Example 2

**Input:**

    java DecisionTree connect4

**Output:**

    -------------------------------
    Player : 2
    | - | - | - | - | - | - | - |
    | - | - | - | - | - | - | - |
    | - | - | - | - | - | - | - |
    | - | - | - | - | - | - | - |
    | - | - | - | - | - | - | - |
    | - | - | - | - | - | - | - |
      1   2   3   4   5   6   7
    -------------------------------
          
## Contributors

- [Andre Sousa](https://github.com/anfisou)
- [Antónia Brito](https://github.com/Nia3324)
- [Paulo Silva](https://github.com/WrekingPanda)