# Java Programs

This repository contains Java examples organized in folders such as `Stacks`, `OOPS`, and `BasicsOfJava`.

## Running Java programs

1. Open a Command Prompt in the repository root:
   ```bat
   cd C:\Users\SOHA\Desktop\Java
   ```

2. Run a program with the helper script:
   ```bat
   run-java.bat Stacks.copyStackReverseOrder
   ```

3. The script compiles all `.java` files into the `bin` folder and then runs the requested main class.

## Building only

To compile all Java source files without running a program:

```bat
build-java.bat
```

## Running Java files in VS Code

If a Java file uses a package declaration such as `package Stacks;`, you must run it with its fully qualified name from the repository root.

When you use Code Runner with `Ctrl+Alt+N`, this workspace includes a helper script and VS Code setting that will compile and run the current Java file correctly.

For example, open `Stacks\insertAtIndex.java` and press `Ctrl+Alt+N`.

## Notes

- The Java source files use package directories such as `Stacks`.
- Use the fully qualified class name when running the program from a command prompt, for example `Stacks.insertAtIndex`.
- If `java` or `javac` is not recognized, install the JDK and add it to your system `PATH`.
