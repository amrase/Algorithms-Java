package sorting;

public class Checker extends Comparator<Player> {
    public Checker(String name, int score) {
        super(name, score);
    }

    public int compare(Player a, Player b) {
        // If 2 Players have the same score
        if(a.score == b.score){
            // Order alphabetically by name
            return a.name.compareTo(b.name);
        }

        // Otherwise, order higher score first
        return ((Integer) b.score).compareTo(a.score);
    }
}
