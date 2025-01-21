# ArrayList Algorithms Practice
***

This lab provides comprehensive practice with fundamental ArrayList algorithms through a series of challenges.

## Part 1: Frequency Analysis

### Basic Frequency Counter
Write a method `getFrequencies` that:
- Takes an ArrayList<Integer> as input
- Counts how many times each unique number appears
- Returns an ArrayList<String> with formatted strings showing each number and its count

Example:
```java
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 2, 3, 3, 3, 3));
ArrayList<String> result = getFrequencies(numbers);
// result: ["Number: 1, Frequency: 2", "Number: 2, Frequency: 3", "Number: 3, Frequency: 4"]
```

## Part 2: ArrayList Algorithm Challenges

### Challenge 1: Statistics Operations
1. `findMinMax`: Find both minimum and maximum values in one traversal
2. `computeStats`: Calculate sum, average, and count of elements above average

### Challenge 2: Element Properties
1. `hasProperty`: Check if at least one element meets a condition
2. `allHaveProperty`: Verify if all elements meet a condition
3. `countMatches`: Count elements meeting specific criteria

### Challenge 3: Array Manipulations
1. `rotateRight`: Rotate elements right by N positions
2. `rotateLeft`: Rotate elements left by N positions
3. `reverseList`: Reverse the order of elements

### Challenge 4: Advanced Operations
1. `mergeSorted`: Merge two sorted ArrayLists while maintaining order
2. `removeIfFollowedBy`: Remove elements that are followed by a specific value
3. `insertInOrder`: Insert elements while maintaining sorted order

## Example Implementation Template

### Real-World Applications
These ArrayList algorithms are fundamental to many applications:
- Data analysis and statistics
- Financial market analysis
- Game development (managing inventories, scores, etc.)
- Social media (feed algorithms)
- Search engine results processing
- Network packet processing

### Testing Your Implementation
Create comprehensive tests for each algorithm. Do this in your main method. Here is an example:
```java
public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    rotateRight(numbers, 2);
    System.out.println(numbers);
}
```

### Challenge Extensions
1. Implement all operations with optimal time complexity
2. Handle edge cases (empty lists, null values, etc.)
3. Add support for generic types where appropriate
4. Implement parallel processing versions for large lists