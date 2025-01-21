# ArrayList Algorithms
***

ArrayList algorithms involve common patterns for processing and manipulating lists of data. One fundamental pattern is analyzing the frequency (count) of elements in a list.

## Frequency Analyzer Mini-Lab

### Overview
In this lab, you'll create a program that counts how many times each unique number appears in an ArrayList of integers. This is a common task in data analysis and processing.

### Problem Statement
Write a method `getFrequencies` that:
- Takes an ArrayList<Integer> as input
- Counts how many times each unique number appears
- Returns an ArrayList<String> with formatted strings showing each number and its count

### Example
```java
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 2, 3, 3, 3, 3));
ArrayList<String> result = getFrequencies(numbers);
// result should be: ["Number: 1, Frequency: 2", "Number: 2, Frequency: 3", "Number: 3, Frequency: 4"]
```

### Key Concepts
1. **Traversing ArrayLists**: You'll need to loop through the input list
2. **Counting Occurrences**: Keep track of how many times each number appears
3. **Avoiding Duplicates**: Each number should only appear once in the output
4. **String Formatting**: Format the output in a consistent, readable way

### Tips
- Consider using a second ArrayList to keep track of which numbers you've already counted
- The `indexOf()` method can help you check if you've seen a number before
- Use a nested loop structure: outer loop for unique numbers, inner loop for counting

### Challenge Extension
1. Sort the output by frequency (highest to lowest)
2. Add percentage of total for each number
3. Handle an empty input ArrayList appropriately

### Real-World Applications
Frequency analysis is used in many fields:
- Data analysis and statistics
- Text processing (word frequency)
- Pattern recognition
- Network traffic analysis
- Stock market analysis