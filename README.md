# Tower of Hanoi Solver (Java)

A Java program that solves the **Tower of Hanoi** puzzle with recursion. Enter the number of disks and it prints every move needed to solve the puzzle.

## The Puzzle

There are three towers (A, B and C) and a stack of disks on tower A, from largest at the bottom to smallest at the top. The goal is to move the whole stack to tower B, with C as the spare tower. The rules are:

1. Move only one disk at a time.
2. Only the top disk of a stack can be moved.
3. A larger disk can never go on top of a smaller one.

## How It Works

The program uses recursion:

1. Move the top `n − 1` disks from A to C (using B as the spare).
2. Move the largest disk from A to B.
3. Move the `n − 1` disks from C to B (using A as the spare).

The base case is a single disk, which is moved directly.

Solving the puzzle with `n` disks takes **2ⁿ − 1** moves.

## Requirements

- Java 8 or later (JDK)

## How to Run

```bash
git clone https://github.com/SadikHyseni/solution_Tower-of-Hanoi.java.git
cd solution_Tower-of-Hanoi.java
javac TowerOfHanoi.java
java TowerOfHanoi
```

## Example

```
enter number of disks:  3
the moves are:
move disks 1 from A to B
move disk 2 from A to C
move disks 1 from B to C
move disk 3 from A to B
move disks 1 from C to A
move disk 2 from C to B
move disks 1 from A to B
```

3 disks are solved in 7 moves (2³ − 1).

## License

MIT License. See [LICENSE](LICENSE).
