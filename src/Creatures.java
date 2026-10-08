import java.util.Random;

public class Creatures {
    Random rand = new Random();

    String[] naturesList= {"Docile", "Quirky", "Serious", "Brave", "Lonely", "Bold", "Relaxed", "Hasty", "Timid"};
    int min = 1;
    int max = naturesList.length - 1;

    private String name;
    private String creature;
    private String type;
    private int level;
    private int healthStat;
    private int attackStat;
    private int defenseStat;
    private int speedStat;
    private String nature;

    //yo
    //new

    public Creatures(String name, String creature, int level) {
        this.name = name;
        this.creature = creature;
        this.level = level;
        this.nature = naturesList[rand.nextInt((max - min) + 1) + min];
        this.healthStat = 20 + level * 4;
        this.type =
        this.attackStat =
        this.defenseStat =
        this.speedStat =

    }
}
