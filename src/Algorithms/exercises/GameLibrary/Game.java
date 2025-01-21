package Algorithms.exercises.GameLibrary;

/**
 * Represents a game with its title, genre, release year, play time, and completion status.
 */
public class Game {
    private String title;
    private String genre;
    private int releaseYear;
    private double playTime;
    private String completionStatus;

    public Game(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.playTime = 0.0;
        this.completionStatus = "Not Started";
    }

    // TODO: Add getters and setters
    
    @Override
    public String toString() {
        return String.format("%s (%d) - %s | %.1f hours - %s", 
            title, releaseYear, genre, playTime, completionStatus);
    }
}
