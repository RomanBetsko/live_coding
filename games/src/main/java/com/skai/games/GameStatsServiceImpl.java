package com.skai.games;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class GameStatsServiceImpl implements GameStatsService {


    @Override
    public String mvp(Collection<GameRecord> gameRecords) {
        return gameRecords
                .stream()
                .sorted()
                .collect(Collectors.groupingBy(gameRecord -> gameRecord.player, Collectors.summarizingInt(gameRecord -> gameRecord.scores)))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(e -> e.getValue().getSum()))
                .map(Map.Entry::getKey)
                .orElseGet(null);


    }

    @Override
    public String winner(Collection<GameRecord> gameRecords) {
        return gameRecords
                .stream()
                .collect(Collectors.groupingBy(gameRecord -> gameRecord.team, Collectors.summarizingInt(gameRecord -> gameRecord.scores)))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(e -> e.getValue().getSum()))
                .map(Map.Entry::getKey)
                .orElseGet(null);
    }
}
