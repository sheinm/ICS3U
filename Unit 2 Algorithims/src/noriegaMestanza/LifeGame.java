package noriegaMestanza;

/**
 * This is the "The Game of Life" program 
 * @author SHEILA NORIEGA
 * April 28th, 2017
 */

import java.util.Scanner;
public class LifeGame {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean[][] Day1 = new boolean[20][20]; // where the cells will be stored in the game 
        

        String input = "";//main form of input 

        System.out.println("How many cells would you like there to be alive?");
        int numberOfCells = sc.nextInt();

        //Takes in location and stores into the first array
        for(int i = 0; i < numberOfCells; i++){
            System.out.println("Please input your coordinates and seperate them using spaces");
            int a = sc.nextInt();
            int b = sc.nextInt();
            Day1[b - 1][a - 1] = true;
        }

        //will show location of all current living cells
        while(true){

            //prints out the grid
            System.out.println("these are the coordinates with living cells");
            for(int i = 0; i < Day1.length; i++){
                for(int j = 0; j < Day1[i].length; j++){
                    if(Day1[i][j]){
                        System.out.print("x ");
                    } else {
                        System.out.print("o ");
                    }
                }
                System.out.println("");
            }
            
            //cancels out if all cells are dead (terminates program)
            if(areAllCellsDead(Day1)){
                System.out.println("All of the cells are dead");
                break;
            }

            //Lets user play again
            System.out.println("Do you want to play again?");
            input = userChoice ("Yes", "No");
            if(input.equalsIgnoreCase("yes")){
                continue;
            } else {
                break;
            }
        }
        
        System.out.println("This program has ended");

    }
    
    
    
    /**
     * This method determines if there are no more cells alive
     * @param an array array2 (the day of cells)
     * @return a boolean whether they are dead or not
     */
    public static boolean areAllCellsDead(boolean[][] array2){
        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2[i].length; j++){
                if(array2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    
    /**
     * Kills cells or makes cells under true  conditions
     * @param 2D boolean array called "finalDay"
     * @return 2D boolean array that represents the next day called "nextDay"
     */
    public static boolean[][] changedDay(boolean[][] finalDay){
        boolean[][] nextDay = finalDay;
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                if(nextDay[i][j]){
                    if(!(neighbourCells(finalDay, i, j) == 2 || neighbourCells(finalDay, i, j) == 3)){
                        nextDay[i][j] = false;
                    }
                }
                if(neighbourCells(finalDay, i, j) == 3){
                    nextDay[i][j] = true;
                }
            }
        }

        return nextDay;
    }
    
        /**
         * determines how many neighbour cells one single cell has 
         * @param the cell grid called "grid"
         * @param x coordinate : "x"
         * @param y coordinate : "y"
         * @return how many neighbour cells the cell has
         */
        public static int neighbourCells(boolean[][] grid, int x, int y){
            int total = 0;

            //checks right
            if(x < 19){
                if(grid[y][x+1]){
                    total++;
                }
            }

            //checks left
            if(x > 0){
                if(grid[y][x-1]){
                    total++;
                }
            }

            //checks above
            if(y > 0){
                if(grid[y - 1][x]){
                    total++;
                }
            }

            //checks below
            if(y < 19){
                if(grid[y + 1][x]){
                    total++;
                }
            }

            //checks top right
            if(!((y < 19) && (x < 19))){
                if(grid[y + 1][x + 1]){
                    total++;
                }
            }

            //checks bottom left
            if(!((y > 0) && (x > 0))){
                if(grid[y - 1][x - 1]){
                    total++;
                }
            }

            //checks bottom right
            if(!((y > 0) && (x < 19))){
                if(grid[y - 1][x + 1]){
                    total++;
                }
            }

            //checks top left
            if(!((y < 19) && (x > 0))){
                if(grid[y + 1][x - 1]){
                    total++;
                }
            }

            return total;
        }
    
        /**
         * This method check if an input is valid or not
         * @param firstopt for the first possible option
         * @param secondopt for the second possible option
         * @return a valid input
         */
        public static String userChoice(String firstopt, String secondopt){
            String input = "";
            while(true){
                input = sc.nextLine();
                if(input.equalsIgnoreCase(firstopt) || input.equalsIgnoreCase(secondopt)){
                    break;
                } else {
                    System.out.println("That is not a valid input, please insert a valid input");
                }
            }
            return input;
        }
}
    