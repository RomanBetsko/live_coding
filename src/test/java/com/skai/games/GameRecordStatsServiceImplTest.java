package com.skai.games;

//import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GameRecordStatsServiceImplTest {

    private final Collection<GameRecord> gameRecords = Arrays.asList(
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("Boston Bruins", "Marchan", 2, 1),
            new GameRecord("Boston Bruins", "Pastrniak", 5, 1)
    );

        private final Collection<GameRecord> gameRecords2 = Arrays.asList(
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("Boston Bruins", "Zibanezhad", 5, 1),
            new GameRecord("Boston Bruins", "Pastrniak", 6, 1)
    );

    private final Collection<GameRecord> gameRecords3 = Arrays.asList(
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("Boston Bruins", "Marchan", 5, 1),
            new GameRecord("Boston Bruins", "Pastrniak", 5, 2)
    );

    public void winner() {
        //gameRecords  -> Boston Bruins
        //gameRecords2 -> Boston Bruins
        //gameRecords3 -> Boston Bruins
    }

    public void mvp() {
        //gameRecords  -> Zibanezhad
        //gameRecords2 -> Pastrniak
        //gameRecords3 -> Pastrniak
    }
    
}


