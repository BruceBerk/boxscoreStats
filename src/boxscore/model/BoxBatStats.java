package boxscore.model;

/**
 * Boxscore stats for one batter in one game
 */

public class BoxBatStats {
    private String gameId;
    private String team;
    private String playerId;
    private int atBats;
    private int hits;
    private int runsScored;
    private int rbi;
    private int doubles;
    private int triples;
    private int homers;
    private int walks;
    private int strikeouts;
    private int stolenBases;
    private int caughtStealing;
    private int doublePlays;
    private int hitByPitch;
    private int sacBunts;
    private int sacFlies;

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getRbi() {
        return rbi;
    }

    public void setRbi(int rbi) {
        this.rbi = rbi;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getHomers() {
        return homers;
    }

    public void setHomers(int homers) {
        this.homers = homers;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    public int getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
    }

    public int getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
    }

    public int getDoublePlays() {
        return doublePlays;
    }

    public void setDoublePlays(int doublePlays) {
        this.doublePlays = doublePlays;
    }

    public int getHitByPitch() {
        return hitByPitch;
    }

    public void setHitByPitch(int hitByPitch) {
        this.hitByPitch = hitByPitch;
    }

    public int getSacBunts() {
        return sacBunts;
    }

    public void setSacBunts(int sacBunts) {
        this.sacBunts = sacBunts;
    }

    public int getSacFlies() {
        return sacFlies;
    }

    public void setSacFlies(int sacFlies) {
        this.sacFlies = sacFlies;
    }

    public BoxBatStats(String gameId, String team, String playerId, int atBats, int hits, int runsScored, int rbi, int doubles, int triples, int homers, int walks, int strikeouts, int stolenBases, int caughtStealing, int doublePlays, int hitByPitch, int sacBunts, int sacFlies) {
        this.gameId = gameId;
        this.team = team;
        this.playerId = playerId;
        this.atBats = atBats;
        this.hits = hits;
        this.runsScored = runsScored;
        this.rbi = rbi;
        this.doubles = doubles;
        this.triples = triples;
        this.homers = homers;
        this.walks = walks;
        this.strikeouts = strikeouts;
        this.stolenBases = stolenBases;
        this.caughtStealing = caughtStealing;
        this.doublePlays = doublePlays;
        this.hitByPitch = hitByPitch;
        this.sacBunts = sacBunts;
        this.sacFlies = sacFlies;
    }
}
