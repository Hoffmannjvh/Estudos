package br.com.javainsider.other.set;

import java.util.Set;
import java.util.TreeSet;

public class Rank {
    private Set<Player> player = new TreeSet<>(new PlayerComparator());

    public void addPlayer(String name, int score) {
        player.add(new Player(name, score));
    }

    public void printRanking() {
        int pos = 1;
        for(Player player : player) {
            System.out.format("%02d. %-10s -> %d\n",pos++, player.getName(), player.getScore());
        }

    }
}
