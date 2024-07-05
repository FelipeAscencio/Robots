# Robots

---

## Introduction

The game is a reinterpretation of the classic video game "Chase".

It is a single-player game in which we control "Felipe", a nice human who tries to escape from the feared "Robots" that are chasing him.

Your mission is to try to escape from them by making them collide with each other, but you must be cautious, since in each turn your enemies will do everything possible to capture you.

In particular, what was sought with the development of this game was to implement my first graphical interface, use object-oriented programming and generate levels of abstraction in the program (in this case it was used to divide the logical level from the visual level of the program).

Additionally, I have created the class and sequence diagrams corresponding to the program.

---

# Report

First of all, this was a project for the university, so the code is written in spanish.

With this clarified, we move on to the report.

## Introduction

Both the "logical" layer (model) and the "graphic" part (view + controllers) of the video game "Robots" were implemented.

The game was developed using "JAVA FX", "MAVEN" and all the code was worked in "INTELLIJ" (The Java version used was JAVA 21).

## How to play?

It is as simple as opening the project in our trusted development environment, going to the "APP" class and running the program.

All instructions for use, tutorials, intuitive menus and necessary guides are provided within the different scenarios of the game.

## "doc" folder

In the "doc" folder you will find all the relevant documentation for the project.

Material list:
- Models of all direction arrows used in the "GUI".
- Sprite models of the robots, the explosion and the player.
- UML diagram of classes (.png and .puml).
- UML sequence diagrams (.png and .puml).

## "src" folder

In the "src" folder are all the files relevant to the implementation of the game.

To analyze more clearly we are going to divide these files into 2 sections.

### Logical abstraction layer (model)

In this layer is the entire "logical" or "operational" implementation of the game.

In all the classes used, there is no method or attribute related to "JAVA FX", since as we work with the requested abstraction layers, the "graphic" part of the game does know the existence of the "logical" part, but not the other way around.

These classes are completely reusable for other games, or variations thereof, with a different "GUI".

Related files:
- Direccion.java
- Explosion.java
- Juego.java
- Jugador.java
- Robot1.java
- Robot2.java
- Tablero.java
- Personaje.java

### Graphic abstraction layer (view)

In this layer is the entire "graphic" or "visual" implementation of the game.

This layer mainly has the "App.java" class, which allows the execution of the program.

And it has 3 ".fxml" files, with their respective associated classes (views), for the implementation of each scenario.

Related files:
- App.java
- VistaMapa.java
- VistaMenu.java
- VistaTutorial.java
- mapa.fxml
- menu.fxml
- tutorial.fxml

---

## Graphical Interface (GUI)

The graphical interface developed is designed to be as intuitive and simple as possible, without losing that artistic touch that gives its own personality to the implementation of the game.

---

## Implementation details

### Polymorphism

The implementation has, as requested in the statement, the polymorphic behaviors related to robots and burning cells.

The 3 classes inherit from the same superclass, use inherited methods with different results (definition of polymorphism), and also have their particular behaviors and attributes that characterize them.

### Gameplay

The implementation of "ROBOTS" gives the user a wide range of tools to play with.

Therefore, the game can be enjoyed in its entirety with both the "mouse" and the "keyboard" (If you have questions about the commands you can always consult the "Tutorial").

### Map size

The map has an implementation that allows the user in the game to modify the number of rows and columns of their choice, between stipulated values.

These values were determined based on the average resolution of a conventional monitor, ensuring that the gameplay is not affected and all the elements of the game can be clearly seen.

However, the "model" of the game is not limited to specific values of "Rows" and "Columns", so with another graphical interface, or minimal modifications to the current one, the number of "Rows" could be increased or reduced. and "Columns" as much as desired.

Finally, depending on the size of the requested map and in relation to the greater number between "rows" and "columns", the size of the cells on the board varies, to obtain greater precision and clarity of animations on small maps, but also to have a Wide and clear vision on larger maps.

### Scoring system

The game's scoring system is simple. For each explosion the player earns "1" point and the score is cumulative between levels, that is, when advancing in level the points previously obtained continue to count. What will be the maximum you can reach?

### Difficulty

The game begins with "5" robots at level "1" and then, as the levels progress, they are increased by 2.

### Types of robots

The type of robots that are generated is completely random, which makes each new game a different challenge to test your skills.

### Animations

The chair provided a "sprite strip" with which we worked to represent the characters and "animate" them.

The "animation" that was implemented means that between turns, the sprites of all the living robots, and the player, change between about 4 possibilities automatically.

Finally, the player has a specific "Game Over" "sprite", with which to indicate in a more intuitive way (along with the messages provided by the "GUI") the end of the game to the user, so that he can restart it. .

### End of program

As requested by statement, the only way to end the program is by clicking the "X" in the "GUI".

So you can play as many games as you want without having to restart the application.
