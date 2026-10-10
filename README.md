# Java Programming

Beginner Java examples for conditionals, loops, a number-guessing game, and a small graphical interface.

## Requirements

Install a JDK on your MacBook. In Terminal, check that Java is available:

```sh
java -version
javac -version
```

Run these commands from the folder containing the `.java` files. Compile each program with `javac`, then run it with `java` using the class name (without `.java`).

## Compile and run a program

| Program | Compile | Run |
| --- | --- | --- |
| Hello World | `javac Main.java` | `java Main` |
| If/else example | `javac If.java` | `java If` |
| While-loop example | `javac While.java` | `java While` |
| Number-guessing game | `javac GuessNumber.java` | `java GuessNumber` |
| Swing graphical window | `javac JavaGUI.java` | `java JavaGUI` |

For example, after opening Terminal in this folder, run:

```sh
javac While.java
java While
```

The GUI example opens a window, so run it from the Mac desktop rather than a headless terminal or remote server.

## Check that all examples compile

Run the included check script from this folder:

```sh
bash scripts/check-java.sh
```

It compiles the examples into a temporary folder and removes the generated `.class` files when it finishes.
