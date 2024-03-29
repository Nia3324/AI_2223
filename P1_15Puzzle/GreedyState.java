public class GreedyState implements Comparable<GreedyState>{
    private Board cur;
    private int score;
    private int level;

    GreedyState(Board b,  int l) {
        cur = b;
        score = 0;
        level = l;
    }

    //getters
    public Board getBoardObject(){return cur;}
    public int getScore(){return score;}
    public int getLevel(){return level;}


    //setter
    public void setScore(int x){score = x;}

    //comparator
    public int compareTo(GreedyState other){
        int other_s = other.getScore();
        int cur_s = getScore();        
        if (cur_s != other_s) {
            return Integer.compare(cur_s, other_s);
        }

        Board other_board = other.getBoardObject();
        Board cur_board = cur;
        return cur_board.toString().compareTo(other_board.toString());
    }

    @Override
    public boolean equals(Object obj) {
        GreedyState other = (GreedyState) obj;
        if (this.compareTo(other) == 0) return true;
        return false;
    }

}