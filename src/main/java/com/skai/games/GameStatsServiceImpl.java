package com.skai.games;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class GameStatsServiceImpl implements GameStatsService {

    @Override
    public String mvp(Collection<GameRecord> gameRecords) {
        return gameRecords.stream()
                .collect(Collectors.groupingBy(i -> i.getPlayer() + "/" + i.getTeam(), Collectors.summingInt(value -> value.getScores() + value.getPasses())))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(1).findFirst()
                .orElseThrow(() -> new RuntimeException("Unable to find mvp")).getKey().split("/")[0];
    }

    @Override
    public String winner(Collection<GameRecord> gameRecords) {
        return gameRecords.stream().collect(Collectors.groupingBy(GameRecord::getTeam, Collectors.summingInt(GameRecord::getScores)))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(1).findFirst()
                .orElseThrow(() -> new RuntimeException("Unable to find winner")).getKey();
    }

}
