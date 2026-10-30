# JOBSHEET 7 - LOOPS

**Student Information:**

* **Name:** Mohammad Wisnu
* **Student ID:** 264107020193
* **Class / Attendance No.:** TI 1I / 20

---

## 1: PRACTICAL OBJECTIVES

The objectives of this practical session are:

1. Students are able to understand the basic concepts of loops in Java.
2. Students are able to use `for` and `do-while` loops to process data repeatedly.
3. Students are able to use `break` to stop a loop and `continue` to skip the remaining statements in a particular iteration.
4. Students are able to analyze the execution flow of loop programs based on given conditions.

---

## 2: EXPERIMENT RESULTS AND ANALYSIS

### 2.1 Experiment 1: Using a `for` Loop

This experiment covers the use of a `for` loop and value processing to determine the highest and lowest values. A `for` loop uses initialization, a condition, and an update to the counter.

#### 2.1.1 Java Program Code

```java
package week9;
import java.util.Scanner;
public class SiakadFor20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Double score, highest = 0.0, lowest = 100.0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score for student " + i + ": ");
            score = sc.nextDouble();

            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);

        sc.close();
    }    
}

```

#### 2.1.2 Program Output / Screenshot

The following is the program output after execution:

![Output Percobaan 1](/week9/images/SC1.png)

#### 2.1.3 Answers to Questions / Reflection Questions

* **Question 1:** What are the functions of initialization, condition, and update in a `for` loop?
  * **Answer:** Initialization (`int i = 1`) sets the counter `i` to an initial value of 1. The condition (`i <= 10`) keeps the loop running while `i` is less than or equal to 10. The update (`i++`) increases `i` by 1 after each iteration.

* **Question 2:** Why are the `highest` and `lowest` variables initialized with those values?
  * **Answer:** `highest` starts at 0 so a valid value can replace it when that value is higher. `lowest` starts at 100 so a valid value can replace it when that value is lower. If the initial values were reversed, the highest value could remain 100 and the lowest value could remain 0 even when those values do not match the input data.

* **Question 3:** What is the purpose and workflow of the code used to determine the highest and lowest values?
  * **Answer:** The program compares each new value with `highest` and `lowest`. If the new value is greater than `highest`, the `highest` value is updated. If the new value is less than `lowest`, the `lowest` value is updated.

* **Question 4:** What should be done for the modified program?
  * **Answer:**

```java
package week9;
import java.util.Scanner;
public class SiakadFor20Modifed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double score, highest = 0.0, lowest = 100.0;
        int passCount = 0;
        int failCount = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score for student " + i + ": ");
            score = sc.nextDouble();
            
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
            
            if (score >= 60) {
                passCount++;
            } else {
                failCount++;
            }
        }
        
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Number of students who pass: " + passCount);
        System.out.println("Number of students who fail: " + failCount);
        
        sc.close();
    }
}
```

The following is the program output after execution:

![Output Question 4](/week9/images/questionSC1.png)

---

### 2.2 Experiment 2: Using `continue` in a Loop

This experiment covers value validation and the use of `continue`. If a value is outside the range of 0 to 100, the program skips the remaining statements in that iteration and continues to the next iteration.

#### 2.2.1 Java Program Code

```java
package week9;
import java.util.Scanner;
public class SiakadWhile20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int score, studentCount, i = 0;

        System.out.print("Input your student number :");
        studentCount = sc.nextInt();

        while (i < studentCount) {
            System.out.print("Enter score for student " + (i + 1) + " :" );
            score = sc.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a valid score!");
                continue;
            }
            if (score > 80 && score <= 100) {
                System.out.println("The grade of student " + (i + 1) + " is A");
                } else if (score > 73 && score <= 80) {
                    System.out.println("The grade of student " + (i + 1) + " is B+");
                } else if (score > 65 && score <= 73) {
                    System.out.println("The grade of student " + (i + 1) + " is B");
                } else if (score > 60 && score <= 65) {
                    System.out.println("The grade of student " + (i + 1) + " is C+");
                } else if (score > 50 && score <= 60) {
                    System.out.println("The grade of student " + (i + 1) + " is C");
                } else if (score > 39 && score <= 50) {
                    System.out.println("The grade of student " + (i + 1) + " is D");
                } else {
                    System.out.println("The grade of student " + (i + 1) + " is E");
            }
             i++;
        }
        sc.close();
    }
}

```

#### 2.2.2 Program Output / Screenshot

The following is the program output after execution:

![Output Percobaan 2](/week9/images/SC2.png)

#### 2.2.3 Output Parameter Test Table

| No. | Input Parameter | Expected Output | Status |
| :---: | :--- | :--- | :--- |
| 1 | A value between 0 and 100 | The value is processed by the program | Valid |
| 2 | A value below 0 | The iteration is skipped using `continue` | Invalid |
| 3 | A value above 100 | The iteration is skipped using `continue` | Invalid |

#### 2.2.4 Answers to Questions / Reflection Questions

* **Question 1:** What does the condition `score < 0 || score > 100` mean, and what is the purpose of `continue`?
  * **Answer:** This condition checks whether the score is outside the range of 0–100. The `continue` statement skips the remaining statements in the current iteration and moves to the next iteration.

* **Question 2:** Why is `i++` placed at the end? What might happen if it were placed at the beginning?
  * **Answer:** When placed at the end, the student counter is updated after the current student’s score is processed. If placed at the beginning, a student number could be skipped or become inconsistent with the data being processed.

* **Question 3:** How many times does the loop process data for 19 students?
  * **Answer:** The program is intended to process 19 valid student score entries. Invalid scores skipped by `continue` are not counted as fully processed student entries. The actual number of iterations still depends on the program’s code structure.

* **Question 4:** What should be done for the modified program?
  * **Answer:**

```java
package week9;
import java.util.Scanner;
public class SiakadWhile20Modifed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int score, studentCount, i = 0;
        
        System.out.print("Enter the number of students: ");
        studentCount = sc.nextInt();
        
        while (i < studentCount) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            score = sc.nextInt();
            
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a valid score!");
                continue;
            }
            
            if (score > 80 && score <= 100) {
                System.out.println("The grade of student " + (i + 1) + " is A");
                System.out.println("Well done, keep up the good work!");
            } else if (score > 73 && score <= 80) {
                System.out.println("The grade of student " + (i + 1) + " is B+");
            } else if (score > 65 && score <= 73) {
                System.out.println("The grade of student " + (i + 1) + " is B");
            } else if (score > 60 && score <= 65) {
                System.out.println("The grade of student " + (i + 1) + " is C+");
            } else if (score > 50 && score <= 60) {
                System.out.println("The grade of student " + (i + 1) + " is C");
            } else if (score > 39 && score <= 50) {
                System.out.println("The grade of student " + (i + 1) + " is D");
            } else {
                System.out.println("The grade of student " + (i + 1) + " is E");
            }
            
            i++;
        }
        
        sc.close();
    }
}

```

The following is the program output after execution:

![Output Question 4](/week9/images/questionSC2.png)

---

### 2.3 Experiment 3: Using `do-while` and `break`

This experiment covers a loop that accepts customer names and stops when the user enters `cancel`. The `break` statement is used to exit the loop.

#### 2.3.1 Java Program Code

```java
package week9;
import java.util.Scanner;
public class CafeDoWhile20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coffee, tea, bread, totalPrice;
        int coffeePrice = 12000, teaPrice = 7000, breadPrice = 20000;
        String customerName;

        do {
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            customerName = sc.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
                break;
            } 
            System.out.print("Coffee quantity: ");
            coffee = sc.nextInt();
            System.out.print("Tea quantity: ");
            tea = sc.nextInt();
            System.out.print("Bread quantity: ");
            bread = sc.nextInt();

            totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);
            System.out.println("Total amount to pay: Rp " + totalPrice);
            sc.nextLine();
        } while (true);
        System.out.println("All transactions completed.");

        sc.close();
    }
    
}

```

#### 2.3.2 Program Output / Screenshot

The following is the program output after execution:

![Output Percobaan 3](/week9/images/SC3.png)

#### 2.3.3 Answers to Questions / Reflection Questions

* **Question 1:** What happens when the input `cancel` is entered?
  * **Answer:** The program reads the input and checks the stopping condition. When the user enters `cancel`, the loop stops.

* **Question 2:** What condition stops the loop?
  * **Answer:** The condition is `customerName.equalsIgnoreCase("cancel")`. It recognizes the word `cancel` regardless of uppercase or lowercase letters, after which the program executes `break`.

* **Question 3:** What is the purpose of `true` in the loop condition?
  * **Answer:** The `true` condition makes the loop continue running until it is explicitly stopped, for example by using `break`.

* **Question 4:** Why can a loop run without initialization and update components like those in a `for` loop?
  * **Answer:** In a `do-while` loop, the program block runs before the condition is checked. The loop flow can be controlled from inside the block, including by using `break`.

---

## 3: INDEPENDENT ASSIGNMENTS

The following is the list of independent assignments for Jobsheet 7. Adjust the assignment titles and content according to the original jobsheet instructions.

**Assignment 1:** Cinema Ticket Sales Calculator.

**Assignment 2:** Parking Fee Calculator.

### 3.1 Assignment 1 Code Implementation

```java
package week9;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ticketPrice = 50000;
        int totalTicketSold = 0;
        double totalRevenue = 0;

        while (true) {
            System.out.print("Enter number ticket purchased (type 0 to finish) :");
            int quantity = sc.nextInt();

            if (quantity ==  0) {
                break;
            }
            if (quantity < 0) {
                System.out.println("Invalid input number");
            }

            double subtotal = quantity*ticketPrice;
            double discount = 0;

            if (quantity > 4 ) {
                discount = 0.1;    
            } else if (quantity > 10) {
                discount = 0.15;
            }

            double finalPrice = subtotal - (subtotal * discount);
            totalTicketSold += quantity;
            totalRevenue += finalPrice;

            System.out.println("Subtotal after discount: Rp " + finalPrice);
            System.out.println("----------------------------------------");
        }

        System.out.println("\n -- Today's Sales Report -- ");
        System.out.println("Total tickets sold : " + totalTicketSold);
        System.out.println("Total revenue      : Rp " + totalRevenue);
        
        sc.close();

    }
}

```

#### 3.1.1 Program Output / Screenshot

![Output Assignment 1](/week9/images/assignment1.png)

### 3.2 Assignment 2 Code Implementation

```java
package week9;
import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int type, duration;
        int total = 0;
        
        do {
            System.out.println("\n--- Parking Menu ---");
            System.out.println("1. Car (Rp 3,000 / hour)");
            System.out.println("2. Motorcycle (Rp 2,000 / hour)");
            System.out.println("0. Exit");
            System.out.print("Enter vehicle type (1/2/0): ");
            type = sc.nextInt();
            
            if (type == 0) {
                break;
            }
            
            if (type == 1 || type == 2) {
                System.out.print("Enter parking duration (hours): ");
                duration = sc.nextInt();
                
                if (type == 1) {
                    total += duration * 3000;
                } else {
                    total += duration * 2000;
                }
            } else {
                System.out.println("Invalid choice! Please choose 1, 2, or 0.");
            }
            
        } while (type != 0);
        
        System.out.println("\nTotal overall parking fee: Rp " + total);
        sc.close();
    }
}

```

#### 3.2.1 Program Output / Screenshot

![Output Assignment 2](/week9/images/assignment2.png)

---

## 4: CONCLUSION

This practical session covered the use of loops to process input repeatedly. A `for` loop uses initialization, a condition, and an update; `continue` skips the remaining statements in a particular iteration; and `break` stops a loop when the specified condition is met. Understanding these structures helps students control the flow of Java programs more effectively.
