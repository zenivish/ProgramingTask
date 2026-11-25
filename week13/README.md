# JOBSHEET 11 - 2-DIMENSIONAL ARRAYS

**Student Information:**

* **Name:** Mohammad Wisnu
* **Student ID:** 264107020193
* **Class / Attendance No.:** TI 1I / 20

---

## 1: PRACTICAL OBJECTIVES

The objectives of this practical session are:

1. Students are able to declare, instantiate, and initialize 2-dimensional arrays in Java.
2. Students are able to access and fill array elements using row and column indices.
3. Students are able to process 2-dimensional arrays using nested `for` loops and `foreach` loops.
4. Students are able to create jagged arrays with different lengths for each row.
5. Students are able to calculate row averages and column averages using a 2-dimensional array.

---

## 2: EXPERIMENT RESULTS AND ANALYSIS

### 2.1 Experiment 1: Declaration, Initialization, and Displaying a 2-Dimensional Array

This experiment uses a 2-dimensional `String` array to store audience names in a mini cinema. The array has 4 rows and 2 columns. It also explores array length, row and column indices, and the differences between `for` and `foreach` loops.

#### 2.1.1 Java Program Code

```java
package week13;

public class Cinema20 {
    public static void main(String[] args) {
        String[][] audience = new String[4][2];

        audience[0][0] = "Amin";
        audience[0][1] = "Bena";
        audience[1][0] = "Candra";
        audience[1][1] = "Dela";
        audience[2][0] = "Eka";
        audience[2][1] = "Farhan";
        audience[3][0] = "Gisel";
        audience[3][1] = "Hana";

        System.out.println(audience.length);
        System.out.printf("%s \t %s\n", audience[0][0], audience[0][1]);
        System.out.printf("%s \t %s\n", audience[1][0], audience[1][1]);
        System.out.printf("%s \t %s\n", audience[2][0], audience[2][1]);
        System.out.printf("%s \t %s\n", audience[3][0], audience[3][1]);
    }
}
```

#### 2.1.2 Program Output / Screenshot

The following is the program output after execution:

**[Insert Experiment 1 Output Screenshot Here]**

#### 2.1.3 Answers to Questions / Reflection Questions

* **Question 1:** Must the elements of an array be filled in order, starting from index 0? Explain!
  * **Answer:** No. Array elements can be filled in any order as long as the index is valid. For example, `audience[2][1]` can be filled before `audience[0][0]`. Java accesses each element using its index, not the order in which it is filled.

* **Question 2:** Temporarily comment out `audience[3][1] = "Hana";`, then compile and run again. What is printed for row 4 now? Explain using the default values of arrays.
  * **Answer:** Row 4 displays `Gisel` followed by `null`. The default value of an element in a `String` array is `null`. Because the element at index `[3][1]` is not assigned a value, Java keeps its default value.

* **Question 3:** Why is it important to fill every element before the array is displayed?
  * **Answer:** It is important to assign values to every element so the displayed data is complete and meaningful. If an element is not assigned, Java displays its default value, which is `null` for a `String` array.

* **Question 4:** Explain the purpose of `audience.length` and `audience[0].length`!
  * **Answer:** `audience.length` returns the number of rows in the array, which is 4. Meanwhile, `audience[0].length` returns the number of elements in the first row, which is 2. The length of each row can be accessed using its own index, such as `audience[1].length`.

* **Question 5:** Do `audience[0].length`, `audience[1].length`, `audience[2].length`, and `audience[3].length` have the same value? Why?
  * **Answer:** Yes. They all have the value 2 because the array was created with 4 rows and 2 columns. Every row contains two elements.

* **Question 6:** Modify the code to display the length of every row using a `for` loop.
  * **Answer:** The following code displays the length of every row:

```java
for (int i = 0; i < audience.length; i++) {
    System.out.println("Length of row " + (i + 1) + ": "
            + audience[i].length);
}
```

  * The output shows that each row has 2 elements.

* **Question 7:** Modify the code to display the length of every row using a `foreach` loop.
  * **Answer:** The following code uses a `foreach` loop:

```java
for (String[] rowAudience : audience) {
    System.out.println("Row length: " + rowAudience.length);
}
```

  * The loop takes each row from `audience` and displays its length. Each row has 2 elements.

* **Question 8:** Add code to display the names in row 3 (index 2) using a `for` loop.
  * **Answer:** The code below displays the names in the third row:

```java
System.out.println("Audience in row 3: ");

for (int i = 0; i < audience[2].length; i++) {
    System.out.println(audience[2][i]);
}
```

  * The output is `Eka` and `Farhan`.

* **Question 9:** Modify the code in Question 8 to use a `foreach` loop.
  * **Answer:** The code can be written as follows:

```java
System.out.println("Audience in row 3: ");

for (String name : audience[2]) {
    System.out.println(name);
}
```

  * The result is the same as the previous question. The `foreach` loop directly takes each name from the third row.

* **Question 10:** Modify the code in Question 9 to display the audience of every row. Use `String.join()`.
  * **Answer:** The following code displays all audience names by row:

```java
for (int i = 0; i < audience.length; i++) {
    System.out.println("Audience in row " + (i + 1) + ": "
            + String.join(", ", audience[i]));
}
```

  * `String.join()` combines the names in one row into a single string separated by a comma and a space.

* **Question 11:** What are the advantages and disadvantages of a `foreach` loop compared to a `for` loop?
  * **Answer:** A `foreach` loop has simpler syntax and makes it easier to read when every element needs to be accessed. However, it does not directly provide the index of an element and is less suitable when the program needs to change elements using their indices. A normal `for` loop provides more control over the index.

* **Question 12:** What is the maximum row index of the array `audience`? Where does this value come from?
  * **Answer:** The maximum row index is 3. The array has 4 rows, and Java array indices start from 0. Therefore, the maximum index is `audience.length - 1`, or `4 - 1 = 3`.

* **Question 13:** What is the maximum column index of the array `audience`? Is it the same for every row?
  * **Answer:** The maximum column index is 1 because each row has 2 columns. It is the same for every row in this array because all rows have the same length. In a jagged array, the maximum column index can be different for each row.

* **Question 14:** What does `String.join()` do? Explain the parameters it receives.
  * **Answer:** `String.join()` combines several strings into one string. Its first parameter is the delimiter or separator, while the next parameter contains the strings to be combined. In this program, `", "` is used as the separator and `audience[i]` provides the names in a row.

#### 2.1.4 Discussion Questions

* **Question 1:** What happens if `audience[1] = null;` is executed and then `audience[1].length` is called? Compare it with `audience[1][0] = null;`.
  * **Answer:** If `audience[1] = null` is executed, the second row no longer refers to an array. Calling `audience[1].length` causes a `NullPointerException`. In contrast, `audience[1][0] = null` only assigns `null` to the first element of the second row. The row itself still exists and its length can still be accessed.

* **Question 2:** Can `audience.length` change after the array has been created? What if a new row is needed?
  * **Answer:** No. The length of an array cannot be changed after it has been created. If a new row is needed, a new larger array must be created and the old elements must be copied, or a collection such as `ArrayList` can be used.

* **Question 3:** Discuss the limitations of arrays in Java.
  * **Answer:** Arrays have a fixed size after creation, store elements of one declared data type, and require valid indices when accessing elements. Inserting or removing elements can also require copying data. However, arrays are useful when the number of elements is known and fast index-based access is needed.

#### 2.1.5 Modified Program Code

The following is the modified program that displays the length of each row and the audience names in every row using `String.join()`.

```java
package week13;

public class Cinema20Modif4 {
    public static void main(String[] args) {
        String[][] audience = new String[4][2];

        audience[0][0] = "Amin";
        audience[0][1] = "Bena";
        audience[1][0] = "Candra";
        audience[1][1] = "Dela";
        audience[2][0] = "Eka";
        audience[2][1] = "Farhan";
        audience[3][0] = "Gisel";
        audience[3][1] = "Hana";

        System.out.println(audience.length);

        for (String[] rowAudience : audience) {
            System.out.println("Row length: " + rowAudience.length);
        }

        System.out.printf("%s \t %s\n", audience[0][0], audience[0][1]);
        System.out.printf("%s \t %s\n", audience[1][0], audience[1][1]);
        System.out.printf("%s \t %s\n", audience[2][0], audience[2][1]);
        System.out.printf("%s \t %s\n", audience[3][0], audience[3][1]);

        for (int i = 0; i < audience.length; i++) {
            System.out.println("Audience in row " + (i + 1) + ": "
                    + String.join(", ", audience[i]));
        }
    }
}
```

#### 2.1.6 Modified Program Output / Screenshot

**[Insert Modified Experiment 1 Output Screenshot Here]**

---

### 2.2 Experiment 2: Scanner and Loops for Input and Output of a 2-Dimensional Array

This experiment uses `Scanner` to enter audience names and their seat positions. The program stores the data in a 2-dimensional array. The modified version adds a menu, validates seat positions, checks whether a seat is already occupied, and displays empty seats as `***`.

#### 2.2.1 Java Program Code

```java
package week13;

import java.util.Scanner;

public class CinemaWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        String name, choice;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.print("Enter name: ");
            name = sc.nextLine();

            System.out.print("Enter row: ");
            row = sc.nextInt();

            System.out.print("Enter column: ");
            col = sc.nextInt();
            sc.nextLine();

            audience[row - 1][col - 1] = name;

            System.out.print("Add another audience member? (y/n): ");
            choice = sc.nextLine();

            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }

        sc.close();
    }
}
```

#### 2.2.2 Program Output / Screenshot

**[Insert Experiment 2 Output Screenshot Here]**

#### 2.2.3 Answers to Questions / Reflection Questions

* **Question 1:** Must the elements of an array be filled from `Scanner` in order, starting from index 0? Explain!
  * **Answer:** No. The user can enter data for any valid seat because the program uses the row and column values as indices. The program subtracts 1 from each input because the seat numbers start from 1, while Java array indices start from 0.

* **Question 2:** Modify the program so that it shows a menu with three options: enter audience data, show the audience list, and exit.
  * **Answer:** The program can use a `while` loop and a `switch` statement to display and process the menu. The complete modified program is provided in Section 2.2.4.

* **Question 3:** Modify the program to handle a row or column number that does not exist.
  * **Answer:** Before accessing the array, the program must check whether the row is between 1 and `audience.length`. It must also check whether the column is between 1 and `audience[row - 1].length`. If the input is outside the valid range, the program displays a warning and asks for the input again.

* **Question 4:** In menu 1, display a warning if the chosen seat is already taken, then ask for the row and column again.
  * **Answer:** A seat is already taken when `audience[row - 1][col - 1] != null`. The program must check this condition after validating the row and column. If the seat is occupied, it displays a warning and repeats the seat input.

* **Question 5:** In menu 2, if a seat is empty (`null`), display `***` instead of `null`.
  * **Answer:** The program can use a conditional expression. If an element is `null`, it displays `***`; otherwise, it displays the audience member's name.

#### 2.2.4 Modified Program Code

```java
package week13;

import java.util.Scanner;

public class CinemaWithScanner20Modif1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];
        int menu;

        do {
            System.out.println("\n=== MINI CINEMA MENU ===");
            System.out.println("1. Enter audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    int row, col;

                    while (true) {
                        System.out.print("Enter row (1-4): ");
                        row = sc.nextInt();

                        if (row < 1 || row > audience.length) {
                            System.out.println("Invalid row number!");
                            continue;
                        }

                        System.out.print("Enter column (1-2): ");
                        col = sc.nextInt();

                        if (col < 1 || col > audience[row - 1].length) {
                            System.out.println("Invalid column number!");
                            continue;
                        }

                        if (audience[row - 1][col - 1] != null) {
                            System.out.println("This seat is already occupied!");
                            continue;
                        }

                        audience[row - 1][col - 1] = name;
                        System.out.println("Audience data saved.");
                        break;
                    }

                    sc.nextLine();
                    break;

                case 2:
                    System.out.println("\n=== AUDIENCE LIST ===");

                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            String seat = audience[i][j] == null
                                    ? "***" : audience[i][j];
                            System.out.print(seat + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid menu choice!");
            }

        } while (menu != 3);

        sc.close();
    }
}
```

#### 2.2.5 Modified Program Output / Screenshot

**[Insert Modified Experiment 2 Output Screenshot Here]**

#### 2.2.6 Discussion Questions

* **Question 1:** If the user types letters at the row prompt, `nextInt()` throws an `InputMismatchException`. How should the program handle this input error?
  * **Answer:** The program should catch the exception using a `try-catch` statement or check the input using `hasNextInt()`. It should display an error message, clear the invalid input from the Scanner, and ask the user to enter a number again. This prevents the program from stopping unexpectedly.

* **Question 2:** If the user decides the number of rows and columns at run time, which part of the code must change?
  * **Answer:** The array declaration must use values entered by the user, for example `new String[numRows][numColumns]`. The menu's validation limits and the loops should use `audience.length` and `audience[i].length` instead of fixed values.

* **Question 3:** Why can a 2-dimensional array not change its size after it is created?
  * **Answer:** Java arrays have a fixed length when they are instantiated. To use a different size, the program must create a new array and copy the existing data, or use a dynamic collection.

---

### 2.3 Experiment 3: 2-Dimensional Array with Rows of Different Lengths

This experiment introduces a jagged array. A jagged array is a 2-dimensional array in which each row can have a different number of elements. The program creates three rows with lengths of 5, 3, and 1.

#### 2.3.1 Java Program Code

```java
package week13;

import java.util.Arrays;

public class Numbers20 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];

        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": "
                    + myNumbers[i].length);
        }
    }
}
```

#### 2.3.2 Program Output / Screenshot

The default value of every `int` element is 0. Therefore, the rows are displayed as `[0, 0, 0, 0, 0]`, `[0, 0, 0]`, and `[0]`.

**[Insert Experiment 3 Output Screenshot Here]**

#### 2.3.3 Answers to Questions / Reflection Questions

* **Question 1:** What does `Arrays.toString()` do?
  * **Answer:** `Arrays.toString()` converts the elements of a one-dimensional array into a readable string. It displays the elements inside square brackets and separates them with commas.

* **Question 2:** In Code 16, `Arrays.toString()` is called on `myNumbers[i]`. Change the call to `Arrays.toString(myNumbers)`. What is displayed? Explain.
  * **Answer:** It displays the type and identity information of the inner arrays instead of their elements, for example values similar to `[[I@...`. This happens because `myNumbers` is a two-dimensional array, so each element is another array. `Arrays.toString()` does not recursively display the contents of those inner arrays.

* **Question 3:** Run `System.out.println(Arrays.deepToString(myNumbers));`. Compare the result with Code 16. Why is `deepToString()` needed for a 2-dimensional array?
  * **Answer:** `Arrays.deepToString()` displays the contents of all rows and their elements in one readable string, for example `[[0, 0, 0, 0, 0], [0, 0, 0], [0]]`. It is needed because a 2-dimensional array contains other arrays, and `deepToString()` can display nested array contents recursively.

* **Question 4:** What is the default value of an array element of type `int`?
  * **Answer:** The default value is `0`. Java automatically initializes elements of an `int` array to zero when the array is created.

* **Question 5:** Add code to display the length of each row.
  * **Answer:** The code is:

```java
for (int i = 0; i < myNumbers.length; i++) {
    System.out.println("Length of row " + (i + 1) + ": "
            + myNumbers[i].length);
}
```

  * The output shows row 1 has 5 elements, row 2 has 3 elements, and row 3 has 1 element.

* **Question 6:** The array `myNumbers` has a different length for each row. Can the length of an array be changed after it has been instantiated? Explain.
  * **Answer:** No. The length of an array cannot be changed after instantiation. However, because a 2-dimensional array is an array of row arrays, a row can be replaced with a new array that has a different length. This does not change the number of rows in the outer array.

* **Question 7:** After instantiation, run `myNumbers[0] = new int[7];`, then print `myNumbers.length` and `myNumbers[0].length`. Which value changes? Why?
  * **Answer:** `myNumbers.length` remains 3, while `myNumbers[0].length` changes from 5 to 7. This happens because only the first row is replaced with a new array containing 7 elements. The outer array still has 3 rows.

#### 2.3.4 Discussion Questions

* **Question 1:** Why does `myNumbers[0][0]` change after running `int[][] copy = myNumbers; copy[0][0] = 99;`?
  * **Answer:** The assignment `copy = myNumbers` copies the reference, not the array contents. Both variables point to the same outer array and the same inner arrays. Therefore, changing an element through `copy` also changes the value accessed through `myNumbers`.

* **Question 2:** What is the difference from copying the values one by one with a loop?
  * **Answer:** Copying with `copy = myNumbers` only creates another reference to the same array. Copying the values one by one into newly created arrays creates independent row arrays, so changes to one copy do not affect the other.

* **Question 3:** If you want to copy a 2-dimensional array correctly, what would the copying code look like? Is `clone()` enough?
  * **Answer:** A deep copy can be made by creating a new outer array and a new array for every row, then copying each element:

```java
int[][] copy = new int[myNumbers.length][];

for (int i = 0; i < myNumbers.length; i++) {
    copy[i] = new int[myNumbers[i].length];

    for (int j = 0; j < myNumbers[i].length; j++) {
        copy[i][j] = myNumbers[i][j];
    }
}
```

  * Calling `myNumbers.clone()` is not enough for a deep copy. It only copies the outer array, while the inner row arrays are still shared. A deep copy must also copy every row.

#### 2.3.5 Additional Program Output / Screenshot

**[Insert Additional Experiment 3 Output Screenshot Here]**

---

### 2.4 Experiment 4: SIAKAD Case Study

This experiment applies a 2-dimensional array to an academic information system. The program stores the scores of students in several courses, calculates the average score for each student, and calculates the average score for each course.

#### 2.4.1 Java Program Code

```java
package week13;

import java.util.Scanner;

public class SIAKAD20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[4][3];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter scores student no. " + (i + 1));
            double totalPerStudent = 0;

            for (int j = 0; j < scores[i].length; j++) {
                System.out.print("Score for course " + (j + 1) + ": ");
                scores[i][j] = sc.nextInt();
                totalPerStudent += scores[i][j];
            }

            System.out.println("Average score: "
                    + totalPerStudent / scores[i].length);
        }

        System.out.println("\n========================================");
        System.out.println("Average score of each course:");

        for (int j = 0; j < scores[0].length; j++) {
            double totalPerCourse = 0;

            for (int i = 0; i < scores.length; i++) {
                totalPerCourse += scores[i][j];
            }

            System.out.println("Course " + (j + 1) + ": "
                    + totalPerCourse / scores.length);
        }

        sc.close();
    }
}
```

#### 2.4.2 Program Output / Screenshot

**[Insert Experiment 4 Output Screenshot Here]**

#### 2.4.3 Answers to Questions / Reflection Questions

* **Question 1:** What if the number of students and the number of courses change? Modify the SIAKAD program so that both numbers can be decided while the program runs.
  * **Answer:** The program can ask the user to enter the number of students and courses using `Scanner`. These values are then used to create the array dynamically with `new int[numStudent][numCourse]`. All loops should use the array's `length` properties instead of fixed numbers.

#### 2.4.4 Modified Program Code

```java
package week13;

import java.util.Scanner;

public class SIAKAD20Modif1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudent, numCourse;

        System.out.print("Enter the number of students: ");
        numStudent = sc.nextInt();

        System.out.print("Enter the number of courses: ");
        numCourse = sc.nextInt();

        if (numStudent <= 0 || numCourse <= 0) {
            System.out.println("The number of students and courses must be greater than 0.");
        } else {
            int[][] scores = new int[numStudent][numCourse];

            for (int i = 0; i < scores.length; i++) {
                System.out.println("Enter scores student no. " + (i + 1));
                double totalPerStudent = 0;

                for (int j = 0; j < scores[i].length; j++) {
                    System.out.print("Score for course " + (j + 1) + ": ");
                    scores[i][j] = sc.nextInt();
                    totalPerStudent += scores[i][j];
                }

                System.out.println("Average score: "
                        + totalPerStudent / scores[i].length);
            }

            System.out.println("\n========================================");
            System.out.println("Average score of each course:");

            for (int j = 0; j < scores[0].length; j++) {
                double totalPerCourse = 0;

                for (int i = 0; i < scores.length; i++) {
                    totalPerCourse += scores[i][j];
                }

                System.out.println("Course " + (j + 1) + ": "
                        + totalPerCourse / scores.length);
            }
        }

        sc.close();
    }
}
```

#### 2.4.5 Modified Program Output / Screenshot

**[Insert Modified Experiment 4 Output Screenshot Here]**

#### 2.4.6 Discussion Questions

* **Question 1:** In Code 20, `totalPerStudent` is declared inside the outer loop. What happens if you move the declaration outside the loop? Explain with an example of scores.
  * **Answer:** If `totalPerStudent` is declared outside the outer loop and is not reset for every student, the total score from the previous student will be included in the next student's total. For example, if student 1 has a total score of 240 and student 2 has a total score of 180, student 2 could incorrectly use a total of 420. Therefore, the variable must be reset to 0 for every student.

* **Question 2:** If some scores have not been entered yet (they hold the default value 0), how does this affect the average? Should the program distinguish "not entered" from a score of 0?
  * **Answer:** A score that has not been entered is treated as 0 and lowers the calculated average. The program should distinguish between a score that has not been entered and a real score of 0 when incomplete data is possible. For example, it can use a separate marker or track how many scores have actually been entered before calculating the average.

---

## 3: INDEPENDENT ASSIGNMENT

### 3.1 Assignment 1: Survey Data and Average Scores

This assignment implements a survey program with 10 respondents and 6 questions. Each respondent gives an answer from 1 to 5. The program stores all answers in a 2-dimensional array and calculates the average score for each respondent, each question, and the entire survey.

#### 3.1.1 Java Program Code

```java
package week13;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUM_RESPONDENTS = 10;
        final int NUM_QUESTIONS = 6;

        int[][] surveyData = new int[NUM_RESPONDENTS][NUM_QUESTIONS];
        double totalSurvey = 0;

        for (int i = 0; i < surveyData.length; i++) {
            System.out.println("Enter data for respondent " + (i + 1));

            for (int j = 0; j < surveyData[i].length; j++) {
                do {
                    System.out.print("Enter the answer for question "
                            + (j + 1) + " (1-5): ");
                    surveyData[i][j] = sc.nextInt();

                    if (surveyData[i][j] < 1 || surveyData[i][j] > 5) {
                        System.out.println("Invalid input! Please enter 1-5.");
                    }
                } while (surveyData[i][j] < 1 || surveyData[i][j] > 5);

                totalSurvey += surveyData[i][j];
            }
        }

        System.out.println("\n=== AVERAGE SCORE PER RESPONDENT ===");

        for (int i = 0; i < surveyData.length; i++) {
            int sum = 0;

            for (int j = 0; j < surveyData[i].length; j++) {
                sum += surveyData[i][j];
            }

            double average = (double) sum / surveyData[i].length;
            System.out.printf("Respondent %d: %.2f%n", i + 1, average);
        }

        System.out.println("\n=== AVERAGE SCORE PER QUESTION ===");

        for (int j = 0; j < surveyData[0].length; j++) {
            int sum = 0;

            for (int i = 0; i < surveyData.length; i++) {
                sum += surveyData[i][j];
            }

            double average = (double) sum / surveyData.length;
            System.out.printf("Question %d: %.2f%n", j + 1, average);
        }

        double overallAverage = totalSurvey
                / (NUM_RESPONDENTS * NUM_QUESTIONS);

        System.out.println("\n=== OVERALL AVERAGE SCORE ===");
        System.out.printf("Overall Average: %.2f%n", overallAverage);

        sc.close();
    }
}
```

#### 3.1.2 Program Output / Screenshot

**[Insert Assignment 1 Output Screenshot Here]**

#### 3.1.3 Program Analysis

1. The array `surveyData` stores 10 respondents in rows and 6 questions in columns.
2. The nested loops are used to receive each respondent's answers.
3. The `do-while` loop validates every answer so that only values from 1 to 5 are accepted.
4. The first calculation loop adds the six answers from each respondent and divides the total by the number of questions.
5. The second calculation loop adds the answers for each question from all respondents and divides the total by the number of respondents.
6. The overall average is calculated by dividing the sum of all answers by 60.

---

## 4: CONCLUSION

In this jobsheet, I learned how to use 2-dimensional arrays in Java to store and process data in rows and columns. I practiced declaring and initializing arrays, accessing elements using row and column indices, and displaying data using nested loops.

I also learned the differences between `for` and `foreach` loops, how to use `String.join()`, and how to handle empty elements with the default value `null`. In Experiment 2, I practiced receiving array data using `Scanner`, validating seat positions, and checking whether a seat was already occupied.

In Experiment 3, I learned about jagged arrays, where each row can have a different length. I also learned the differences between `Arrays.toString()` and `Arrays.deepToString()`, as well as the difference between copying an array reference and making a deep copy.

In Experiment 4, I applied 2-dimensional arrays to calculate student and course averages. Finally, the independent assignment helped me apply nested loops, input validation, and average calculations to survey data.

Overall, this jobsheet improved my understanding of 2-dimensional arrays and how they can be used to solve practical problems in Java.

---

## 5: REFLECTION

* **Question 1:** Name two real-world situations that can be modeled with a 2-dimensional array, and explain what the rows and columns represent.
  * **Answer:** The first example is a cinema seating system. The rows represent seat rows, while the columns represent seat positions in each row. The second example is a student score system. The rows represent students, while the columns represent courses and their scores.

* **Question 2:** What is the main difference between a square 2-dimensional array and a jagged array? Give one example use case for each.
  * **Answer:** A square 2-dimensional array has the same number of columns in every row and has an equal number of rows and columns. An example is a 3 × 3 matrix used in mathematical calculations. A jagged array has rows with different lengths. An example is storing the number of students in classes where each class has a different number of students.

* **Question 3:** In which part of this jobsheet did you make index mistakes most often? How can you prevent them?
  * **Answer:** Index mistakes can happen when accessing array elements, especially when converting seat numbers entered by the user into Java indices. I can prevent them by remembering that Java indices start from 0, checking the valid range before accessing an element, and using `array.length` in loop conditions instead of fixed numbers.
