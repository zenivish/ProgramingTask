# JOBSHEET 8 - LOOPS 2

**Student Information:**

* **Name:** Mohammad Wisnu
* **Student ID:** 264107020193
* **Class / Attendance No.:** TI 1I / 20

---

## 1: PRACTICAL OBJECTIVES

The objectives of this practical session are:

1. Students are able to understand the concept of nested loops in algorithms.
2. Students are able to understand the flow of nested loops.
3. Students are able to recognize the syntax of nested loops.
4. Students are able to apply nested loops to solve simple case studies.

---

## 2: EXPERIMENT RESULTS AND ANALYSIS

### 2.1 Experiment 1: Review of Loops 1

This experiment reviews the use of a `for` loop to print characters horizontally. It also explores loop initialization, conditions, and updates.

#### 2.1.1 Java Program Code

```java
// Insert your Java program code here
```

#### 2.1.2 Program Output / Screenshot

The following is the program output after execution:

![Output Experiment 1](images/experiment1.png)

#### 2.1.3 Answers to Questions / Reflection Questions

* **Question 1:** If the initialization `i = 1` is changed to `i = 0` without changing the condition, how many `*` characters are printed when `n = 5`? Explain.
  * **Answer:** When `i` starts at `0` and the condition is `i <= 5`, the loop runs for `i = 0, 1, 2, 3, 4, 5`. Therefore, **6 `*` characters** are printed. Starting from `0` adds one iteration compared with starting from `1`.

* **Question 2:** If the condition `i <= n` is changed to `i < n`, how many times does the loop run when `n = 5`? Why is the result different?
  * **Answer:** The loop runs **5 times**, for `i = 1, 2, 3, 4, 5`. With `i < n`, the value `n` is excluded, so it prints one fewer character than `i <= n`.

* **Question 3:** Predict the output of the given code fragment when `n = 9`. Then modify it so that it prints odd positive numbers that do not exceed `n`.
  * **Answer:** For `n = 9`, the code prints `2 4 6 8 `. To print odd positive numbers not exceeding `n`, start at `i = 1` and increase by 2: `for (int i = 1; i <= n; i += 2) { System.out.print(i + " "); }`. The output is `1 3 5 7 9 `.

* **Question 4:** Explain why changing the increment `i++` to `i--` with the condition still `i <= n` makes the loop run endlessly.
  * **Answer:** With `i--`, `i` decreases from `1` while the condition `i <= n` remains true for positive `n`. The counter moves farther away from becoming greater than `n`, so the stopping condition is never reached and the loop continues indefinitely.

---

### 2.2 Experiment 2: Rectangle Star Pattern (Nested `for`)

This experiment uses nested `for` loops to print a rectangle of stars. The outer loop controls the rows, while the inner loop controls the columns.

#### 2.2.1 Java Program Code

```java
// Insert your Java program code here
```

#### 2.2.2 Program Output / Screenshot

The following is the program output after execution:

![Output Experiment 2](images/experiment2.png)

#### 2.2.3 Answers to Questions / Reflection Questions

* **Question 1:** Explain the function of the variables `i` and `j` in the program.
  * **Answer:** `i` is the outer-loop counter and controls the **rows**. `j` is the inner-loop counter and controls how many characters are printed in each **column/row**.

* **Question 2:** How many times are the outer loop, inner loop, and `print("*")` statement executed for `rows = 4` and `columns = 7`?
  * **Answer:** The outer loop executes **4 times**. The inner loop executes **7 times per outer iteration**, for **28 total executions**. Thus, `System.out.print("*")` executes **28 times**.

* **Question 3:** What happens if the bounds of the outer and inner loops are swapped? Explain using `rows = 3` and `columns = 6`.
  * **Answer:** Swapping the bounds makes the outer loop run 6 times and the inner loop run 3 times each. The result is a rectangle with **6 rows and 3 stars per row** instead of 3 rows and 6 stars per row.

* **Question 4:** Explain the effect of removing `System.out.println()` after the inner loop.
  * **Answer:** Without `System.out.println()` after the inner loop, the cursor does not move to a new line after each row. All `rows × columns` stars are printed on one continuous line.

* **Question 5:** Modify the program so that the printed character is `#`.
  * **Answer:** Replace `System.out.print("*");` with `System.out.print("#");` inside the inner loop. The row and column loop structure stays the same.

#### 2.2.4 Modified Program Code

```java
// Insert your modified Java program code here
```

#### 2.2.5 Modified Program Output / Screenshot

![Modified Output Experiment 2](images/experiment2_modified.png)

---

### 2.3 Experiment 3: Debugging a Star Triangle – Nested `while`

This experiment focuses on debugging a nested `while` loop to print a triangle pattern. The program is then modified to print an inverted triangle.

#### 2.3.1 Java Program Code

```java
// Insert your corrected Java program code here
```

#### 2.3.2 Program Output / Screenshot

The following is the program output after execution:

![Output Experiment 3](images/experiment3.png)

#### 2.3.3 Answers to Questions / Reflection Questions

* **Question 1:** Identify the mismatches in the initial output and at least two fixes needed to produce the nested triangle pattern.
  * **Answer:** The initial code prints the triangle stars without separating rows, so they appear as one continuous line; it also begins with `i = 0`, producing an empty first iteration. Fixes include: (1) initialize `i` to `1`, (2) keep the outer condition `i <= n`, and (3) add `System.out.println();` after the inner loop so each row starts on a new line.

* **Question 2:** Explain the roles of the variables `i` and `j`. Why must `j` be reset to `0` in every iteration of the outer loop? What happens if `j` is not reset?
  * **Answer:** `i` controls the current row and `j` counts stars within that row. Resetting `j = 0` each outer iteration lets the inner loop print the correct number of stars for the new row. If it is not reset, `j` retains its previous value; after the first row it may already fail the inner-loop condition, so later rows will not print the expected stars.

* **Question 3:** Explain the changes to the initialization, condition, and update of the outer loop that are needed to form the inverted triangle.
  * **Answer:** For an inverted triangle, initialize the outer counter at `i = n`, use the condition `i >= 1`, and update it with `i--`. This makes the row lengths decrease from `n` stars to 1 star.

#### 2.3.4 Modified Program Code (Normal and Inverted Triangle)

```java
// Insert your modified Java program code here
```

#### 2.3.5 Modified Program Output / Screenshot

![Modified Output Experiment 3](images/experiment3_modified.png)

---

### 2.4 Experiment 4: Case Study of Group Project Scores

This experiment uses nested loops to calculate each group's average score and determine the group with the highest average. It uses a `while` loop for groups, a `for` loop for graders, and a `do-while` loop for score validation.

#### 2.4.1 Java Program Code

```java
// Insert your Java program code here
```

#### 2.4.2 Program Output / Screenshot

The following is the program output after execution:

![Output Experiment 4](images/experiment4.png)

#### 2.4.3 Answers to Questions / Reflection Questions

* **Question 1:** Why must `totalScore` be reset inside the outer loop, but `highestAverage` must not be reset for each group?
  * **Answer:** `totalScore` must be reset to `0` for each group so one group’s scores do not carry over into the next group. `highestAverage` must persist across all groups so the program can compare each group’s average with the highest average found so far.

* **Question 2:** For 3 groups and 2 graders (without invalid input), how many times is the body of the `for` loop executed in total?
  * **Answer:** The body executes **6 times**: 2 graders for each of 3 groups, so `3 × 2 = 6`.

* **Question 3:** What happens if `totalScore` is declared as `int` and the average is calculated using integer division? Give an example.
  * **Answer:** If `totalScore` is an `int` and integer division is used, the fractional part is discarded. For example, `totalScore = 5` and `numGraders = 2` gives `5 / 2 = 2` rather than `2.5`. Use a `double` total or cast during division, such as `(double) totalScore / numGraders`.

* **Question 4:** Why is `highestAverage` initialized to `-1` rather than `0`? Give an example of input that produces a wrong result if it is initialized to `0`.
  * **Answer:** `highestAverage` starts at `-1` so the first group’s average is selected even if all scores are `0`. If it started at `0` and the first group average were `0`, the condition `averageScore > highestAverage` would be false, leaving `bestGroup` at `0` instead of recording an actual group.

* **Question 5:** This program has three levels of loops. Name each type of loop and its role.
  * **Answer:** The three loop levels are: **WHILE** (outer loop) processes each group; **FOR** (middle loop) processes each grader’s score for that group; **DO-WHILE** (inner loop) repeats score input until it is within the valid range of 0–100.

---

## 3: INDEPENDENT ASSIGNMENTS

The following assignments use nested loops and selection structures. Each assignment is implemented in a separate Java file.

### 3.1 Assignment 1: Nested Number Pattern

The program prints a number pattern from 1 up to the row number and displays the total number of numbers printed.

#### 3.1.1 Java Program Code

```java
// Insert your Java program code here
```

#### 3.1.2 Program Output / Screenshot

![Output Assignment 1](images/assignment1.png)

---

### 3.2 Assignment 2: Multiplication Table

The program displays an `n × n` multiplication table and calculates the sum of all numbers in the table.

#### 3.2.1 Java Program Code

```java
// Insert your Java program code here
```

#### 3.2.2 Program Output / Screenshot

![Output Assignment 2](images/assignment2.png)

---

### 3.3 Assignment 3: Sales Recap for Several Stores

The program calculates the number of customers and total items for each store, the total items across all stores, and the store with the most items.

#### 3.3.1 Java Program Code

```java
// Insert your Java program code here
```

#### 3.3.2 Program Output / Screenshot

![Output Assignment 3](images/assignment3.png)

---

## 4: CONCLUSION

In this jobsheet, I learned how to use nested loops in Java to create different patterns and solve problems involving repeated processes. I practiced using nested FOR loops and nested WHILE loops, where the outer loop controls the rows and the inner loop controls the number of characters printed in each row.

I also learned how to debug a program by checking loop initialization, conditions, and update statements. By modifying these components, I was able to create both normal and inverted triangle patterns. In addition, I learned how to combine WHILE, FOR, and DO-WHILE loops to process group scores, validate input, calculate averages, and determine the group with the highest average.

Overall, this jobsheet improved my understanding of nested loops, loop control, input validation, and problem-solving using Java.
