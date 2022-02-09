package com.skai.games;

import org.junit.Test;

import java.util.Collection;
import java.util.List;

public class GameRecordStatsServiceImplTest {

    private final Collection<GameRecord> gameRecords = List.of(
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("Boston Bruins", "Marchan", 2, 1),
            new GameRecord("Boston Bruins", "Pastrniak", 5, 1)
    );

        private final Collection<GameRecord> gameRecords2 = List.of(
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("Boston Bruins", "Zibanezhad", 5, 1),
            new GameRecord("Boston Bruins", "Pastrniak", 5, 1)
    );

    private final Collection<GameRecord> gameRecords3 = List.of(
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("Boston Bruins", "Marchan", 5, 1),
            new GameRecord("Boston Bruins", "Pastrniak", 5, 1)
    );

    public void winner() {

    }

    public void mvp() {
    }
    
}


