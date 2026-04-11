import java.util.*;

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    // Constructor
    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    // Getters
    // A getter method is used to get (read) the value of a private variable.
    public int getPlayerId() {
        // this is getters methods 
        return playerId;
    }

    public String getPlayerName() {
        // this is getters methods 
        return playerName;
    }

    public int getRuns() {
        return runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }

    // Setters
    // we use setter for update and modify the values
    // 
    // this is setters method
    // it should have no return type
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
}

public class MyClass {

    public static int findPlayerWithLowestRuns(Player[] arr, String playerType) {
    // Array of objects
        int min = Integer.MAX_VALUE;
        boolean found = false;
        // Player is a class (user-defined data type)
        for (Player p : arr) {
            if (p.getPlayerType().equalsIgnoreCase(playerType)) {
                // if the player type is equal to the search player type
                // then check the runs
                found = true;
                if (p.getRuns() < min) {
                    min = p.getRuns();
                }
            }
        }

        if (found) {
            return min;
        } else {
            return 0;
        }
    }

    public static Player[] findPlayerByMatchType(Player[] arr, String matchType) {
        ArrayList<Player> list = new ArrayList<>();
        // here we use dynamic array called arraylist

        for (Player p : arr) {
            if (p.getMatchType().equalsIgnoreCase(matchType)) {
                list.add(p);
            }
        }

        if (list.size() == 0) {
            return null;
        }

        // sort descending by playerId
        Collections.sort(list, (a, b) -> b.getPlayerId() - a.getPlayerId());
        // Descending order because we are subtracting b from a
        // For Ascending order sorting
        // Collection.sort(list, (a,b) -> a.getPlayerId() - b.getPlayerId());
        // // Ascending order because we are subtracting a from b

        return list.toArray(new Player[list.size()]);
        // toArray() is a method that convert list to Array
        // new Player[list.size()] - creates an empty array with same size of list
        // and we are finally returning it
        // final meaning --> Convert this list into an array of type Player[] with same size 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player[] arr = new Player[4];
        // You are creating an array that can store 4 Player objects
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();

            int runs = sc.nextInt();
            sc.nextLine();

            String playerType = sc.nextLine();
            String matchType = sc.nextLine();

            arr[i] = new Player(id, name, runs, playerType, matchType);
            // THIS IS THE OBJECT CREATION PART 
            // Passes values to constructor
            /*
            arr[0] → Player(101, "Virat", 80, "Batsman", "ODI")
            arr[1] → Player(102, "Rohit", 50, "Batsman", "T20")
            arr[2] → Player(103, "Bumrah", 10, "Bowler", "Test")
            arr[3] → Player(104, "Hardik", 40, "AllRounder", "ODI")
            */
        }

        String searchPlayerType = sc.nextLine();
        String searchMatchType = sc.nextLine();

        int result1 = findPlayerWithLowestRuns(arr, searchPlayerType);

        if (result1 > 0) {
            System.out.println(result1);
        } else {
            System.out.println("No such player");
        }

        Player[] result2 = findPlayerByMatchType(arr, searchMatchType);

        if (result2 != null) {
            for (Player p : result2) {
                System.out.println(p.getPlayerId());
            }
        } else {
            System.out.println("No Player with given matchType");
        }
    }
}