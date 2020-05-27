package sorting;

public class Comparator<P> extends Player {
    public Comparator(String name, int score) {
        super(name, score);
    }

    public static void main(String[] args) {

    }

    public int compare(Player a, Player b) {
            if(a.score == b.score){
                return a.name.compareTo(b.name);
            }
            else{
                return b.score - a.score;
            }
    }
}
