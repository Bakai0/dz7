public abstract class Hero implements HavingSuperAbility {

    private   int HeroHealth;
  private   int HeroDamage;
     private String  Typesuperpowers;

    public String getSuperpowers() {
        return Typesuperpowers;
    }

    public String getTypesuperpowers() {
        return Typesuperpowers;
    }

    public void setTypesuperpowers(String typesuperpowers) {
        Typesuperpowers = typesuperpowers;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        HeroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return HeroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        HeroHealth = heroHealth;
    }
}
