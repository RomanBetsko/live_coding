package com.skai.games;

public class GameRecord {

    public String team;
    public String player;
    public int scores;
    public int passes;

    public GameRecord(String team, String player, int scores, int passes) {
        this.team = team;
        this.player = player;
        this.scores = scores;
        this.passes = passes;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public int getPasses() {
        return passes;
    }

    public void setPasses(int passes) {
        this.passes = passes;
    }
}