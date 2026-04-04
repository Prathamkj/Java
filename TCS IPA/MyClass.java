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
    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
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
        int min = Integer.MAX_VALUE;
        boolean found = false;

        for (Player p : arr) {
            if (p.getPlayerType().equalsIgnoreCase(playerType)) {
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

        return list.toArray(new Player[list.size()]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player[] arr = new Player[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();

            int runs = sc.nextInt();
            sc.nextLine();

            String playerType = sc.nextLine();
            String matchType = sc.nextLine();

            arr[i] = new Player(id, name, runs, playerType, matchType);
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