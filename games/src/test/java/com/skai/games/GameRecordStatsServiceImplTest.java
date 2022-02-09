package com.skai.games;

import org.junit.Test;

import java.util.Collection;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameRecordStatsServiceImplTest {

    private final Collection<GameRecord> gameRecords = List.of(
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
            new GameRecord("Boston Bruins", "Marchan", 2, 1),
            new GameRecord("Boston Bruins", "Pastrniak", 5, 1)
    );

    private final GameStatsService gameStatsService = new GameStatsServiceImpl();

    @Test
    public void winner() {
        assertThat(gameStatsService.winner(gameRecords), is("Boston Bruins"));
    }

    @Test
    public void mvp() {
        assertThat(gameStatsService.mvp(gameRecords), is("Panarin"));
    }
}


//    private final Collection<GameRecord> gameRecords = List.of(
//            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
//            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
//            new GameRecord("Boston Bruins", "Zibanezhad", 5, 1),
//            new GameRecord("Boston Bruins", "Pastrniak", 5, 1)
//    );
//
//    private final Collection<GameRecord> gameRecords = List.of(
//            new GameRecord("New York Rangers", "Zibanezhad", 2, 1),
//            new GameRecord("Boston Bruins", "Marchan", 5, 1),
//            new GameRecord("Boston Bruins", "Pastrniak", 5, 1)
//    );