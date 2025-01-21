# 🎮 Game Library Manager Project

A Java project for managing and analyzing your video game collection using ArrayList operations.

## Project Overview

Design and implement a system to manage a video game library. This project will help you practice ArrayList operations, object-oriented programming, and algorithm development while creating something fun and practical!

### Core Classes

1. `Game` - Represents a video game with properties:
   - Title
   - Genre
   - Release Year
   - Play Time (in hours)
   - Completion Status

2. `GameLibrary` - Manages the collection of games using an ArrayList

## Requirements

### Base Requirements 

1. Complete the `Game` class:
   - Implement all getters and setters
   - Add input validation where appropriate
   - Ensure the toString() method works correctly

2. Implement all TODO methods in `GameLibrary`:
   - `addGame(Game game)`
   - `removeGame(String title)`
   - `findGamesByGenre(String genre)`
   - `getAveragePlayTime()`
   - `getUnfinishedGames()`

### Creative Extensions 

Choose and implement at least TWO of the following features:

1. **Game Recommendations**
   - Create an algorithm to suggest games based on play history
   - Consider factors like genre preferences, play time patterns

2. **Statistics Generator**
   - Track and calculate interesting statistics about the game library
   - Examples: favorite genres, completion rates, playing habits

3. **Custom Categories**
   - Allow users to create and assign custom tags to games
   - Implement searching/filtering by these categories

4. **Game Challenge System**
   - Create and track gaming challenges
   - Example: "Complete 3 RPGs this month"

5. **Priority Queue**
   - Maintain a "Want to Play Next" list
   - Include methods to prioritize and reorder games

### Code Quality 
- Clear and consistent code style
- Appropriate comments and documentation
- Efficient algorithm implementations
- Good object-oriented design principles

### Documentation 
- Clear explanation of implemented features
- Usage examples
- Design decisions and rationale

## Getting Started

1. Complete the TODO items in each class
2. Add your creative extensions
3. Test your implementation
4. Document your work

## Example Usage

```java
GameLibrary library = new GameLibrary();
// Create and add games
Game zelda = new Game("The Legend of Zelda", "Adventure", 1986);
zelda.setPlayTime(10.5);
zelda.setCompletionStatus("Completed");
library.addGame(zelda);
// Find games by genre
ArrayList<Game> adventureGames = library.findGamesByGenre("Adventure");
// Get statistics
double avgPlayTime = library.getAveragePlayTime();
```

## Submission Requirements

1. Complete source code
2. Documentation of features implemented
3. Example usage demonstrations
4. Brief write-up of design decisions

## Tips for Success

- Start with the base requirements before adding creative features
- Test your code thoroughly
- Consider edge cases in your implementation
- Be creative with your extensions!
- Comment your code appropriately

## Optional Challenges

- Implement file I/O to save/load the game library
- Create a text-based user interface
- Add unit tests
- Implement sorting capabilities

Good luck and have fun! 🎮