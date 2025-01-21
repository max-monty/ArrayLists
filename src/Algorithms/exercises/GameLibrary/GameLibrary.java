package Algorithms.exercises.GameLibrary;

import java.util.ArrayList;

/**
 * Represents a library of games with methods to manage and analyze them.
 */
public class GameLibrary {
    private ArrayList<Game> games;
    
    public GameLibrary() {
        games = new ArrayList<>();
    }
    
    /**
     * Add a new game to the library
     */
    public void addGame(Game game) {
        // TODO: Implement this method
    }
    
    /**
     * Remove a game from the library by its title
     */
    public void removeGame(String title) {
        // TODO: Implement this method
    }
    
    /**
     * Find all games of a specific genre
     */
    public ArrayList<Game> findGamesByGenre(String genre) {
        // TODO: Implement this method
        return new ArrayList<>();
    }
    
    /**
     * Calculate the average play time of all games
     */
    public double getAveragePlayTime() {
        // TODO: Implement this method
        return 0.0;
    }
    
    /**
     * Get all games that aren't marked as "Completed"
     */
    public ArrayList<Game> getUnfinishedGames() {
        // TODO: Implement this method
        return new ArrayList<>();
    }
    
    // TODO: Add your creative extension methods here
}