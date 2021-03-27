1.Provide an interface Measurable with a method double getMeasure() that measures an object in some way.
Make Employee implement Measurable. Provide a method double average(Measurable[] objects) that computes
the average measure. Use it to compute the average salary of an array of employees.

2. Continue with the preceding exercise and provide a method Measurable largest(Measurable[] objects).
Use it to find the name of the employee with the largest salary. Why do you need a cast?
------------------------------------------------------------
3.What are all the supertypes of String? Of Scanner? Of ImageOutputStream?
Note that each type is its own supertype. A class or interface without declared supertype has supertype Object.
------------------------------------------------------------
4.Implement a static "of" method of the IntSequence class that yields a sequence with the arguments.
For example, IntSequence.of (3, 1, 4, 1, 5, 9) yields a sequence with six values.
Extra credit if you return an instance of an anonymous inner class.
------------------------------------------------------------
5.Implement a static constant method of the IntSequence class that yields an infinite constant sequence.
For example, IntSequence.constant(1) yields values 1 1 1 . . . , ad infinitum.
Extra credit if you do this with a lambda expression.
------------------------------------------------------------
6. In this exercise, you will try out what happens when a method is added to an interface.
In Java 7, implement a class DigitSequence that implements Iterator<Integer>, not IntSequence.
Provide methods hasNext, next, and a do-nothing remove.
Write a program that prints the elements of an instance.
In Java 8, the Iterator class gained another method, forEachRemaining.
Does your code still compile when you switch to Java 8?
If you put your Java 7 class in a JAR file and don’t recompile, does it work in Java 8?
What if you call the forEachRemaining method? Also, the remove method has become a default method in Java 8,
throwing an UnsupportedOperationException.

What happens when remove is called on an instance of your class?
Implement the method void luckySort(ArrayList<String> strings, Comparator<String> comp) that keeps calling
 Collections.shuffle on the array list until the elements are in increasing order, as determined by the comparator.

Implement a class Greeter that implements Runnable and whose run method prints n copies
of "Hello, " + target, where n and target are set in the constructor.
Construct two instances with different messages and execute them concurrently in two threads.
Implement methods

public static void runTogether(Runnable... tasks)
public static void runInOrder(Runnable... tasks)
The first method should run each task in a separate thread and then return.

The second method should run all methods in the current thread and return when the last one has completed.

Using the listFiles(FileFilter) and isDirectory methods of the java.io.File class,
write a method that returns all subdirectories of a given directory.
Use a lambda expression instead of a FileFilter object. Repeat with a method expression and an anonymous inner class.
Using the list(FilenameFilter) method of the java.io.File class,
write a method that returns all files in a given directory with a given extension.

Use a lambda expression, not a FilenameFilter. Which variable from the enclosing scope does it capture?
Given an array of File objects, sort it so that directories come before files, and within each group,
elements are sorted by path name. Use a lambda expression to specify the Comparator.

Write a method that takes an array of Runnable instances and returns a Runnable whose run method executes them in order.
Return a lambda expression.

Write a call to Arrays.sort that sorts employees by salary, breaking ties by name.
Use Comparator.thenComparing. Then do this in reverse order.

Implement the RandomSequence in Section 3.9.1, “Local Classes,” on p. 122 as a nested class,
    outside the randomInts method.