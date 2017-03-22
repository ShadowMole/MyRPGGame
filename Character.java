import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character implements java.io.Serializable
{
    private Integer strength;
    private Integer dexterity;
    private Integer agility;
    private Integer endurance;
    private Integer intelligence;
    private Integer wisdom;
    private Integer perception;
    private Integer luck;
    private Integer charisma;
    private Integer vitality;

    private Double modStr;
    private Double modDex;
    private Double modAgi;
    private Double modEnd;
    private Double modInt;
    private Double modWis;
    private Double modPer;
    private Double modLuc;
    private Double modCha;
    private Double modVit;

    private Double moddedStr;
    private Double moddedDex;
    private Double moddedAgi;
    private Double moddedEnd;
    private Double moddedInt;
    private Double moddedWis;
    private Double moddedPer;
    private Double moddedLuc;
    private Double moddedCha;
    private Double moddedVit;

    private Double totalHealth;
    private Double totalStamina;
    private Double totalMana;

    private Double health;
    private Double stamina;
    private Double mana;

    private Double healthRegen;
    private Double staminaRegen;
    private Double manaRegen;

    private Race race;
    private Background story;

    private Weapon hand1;
    private Weapon hand2;
    private Armor head;
    private Armor chest;
    private Armor arms;
    private Armor legs;
    private Armor feet;

    private WeaponStyle style;

    private Integer armorWeight;
    private Integer weaponWeight;

    private Magic primaryMagic;
    private Magic secondaryMagic;
    private Magic magic;

    private Double weaponDamage;
    private Double weaponSpeed;
    private Double parryChance;
    private Double dodgeChance;
    private Double blockDefense;
    private Double armor;
    private Double critChance;
    private Double moveSpeed;

    private Double magicPower;
    private Double castSpeed;
    private Double magicDefense;
    private Double magicControl;
    private Double magicSupport;
    private Double magicMobility;

    private Double npcInfluence;

    private ArrayList<Item> inventory;
    private ArrayList<Skill> skillList;

    private String raceDescription;
    private String primaryDescription;
    private String secondaryDescription;
    private String storyDescription;

    private String name;
    private Integer level;
    private FileRead filereader;
    public Character(){
        filereader = new FileRead();
        race = new Race(filereader.raceReader("Gox"));
        story = new Background(filereader.storyReader("Wealthy"));
        hand1 = story.getWeapon1();
        hand2 = story.getWeapon2();
        head = story.getHead();
        chest = story.getChest();
        arms = story.getArms();
        legs = story.getLegs();
        feet = story.getFeet();
        primaryMagic = new Magic(filereader.firstMagicReader("Fire"));
        secondaryMagic = new Magic(filereader.secondMagicReader("Water"));
        magic = new Magic(primaryMagic, secondaryMagic);

        raceDescription = race.getDescription();
        primaryDescription = primaryMagic.getDescription();
        secondaryDescription = secondaryMagic.getDescription();
        storyDescription = story.getDescription();

        level = 1;

        strength = 8;
        dexterity = 8;
        agility = 8;
        endurance = 8;
        intelligence = 8;
        wisdom = 8;
        perception = 8;
        luck = 8;
        charisma = 8;
        vitality = 8;
        setModStr();
        setModAgi();
        setModDex();
        setModEnd();
        setModInt();
        setModWis();
        setModPer();
        setModCha();
        setModLuc();
        setModVit();
    }

    public Integer getBasestrength(){
        return strength;
    }

    public Integer getBaseagility(){
        return agility;
    }

    public Integer getBasedexterity(){
        return dexterity;
    }

    public Integer getBaseendurance(){
        return endurance;
    }

    public Integer getBaseintelligence(){
        return intelligence;
    }

    public Integer getBasewisdom(){
        return wisdom;
    }

    public Integer getBaseperception(){
        return perception;
    }

    public Integer getBasecharisma(){
        return charisma;
    }

    public Integer getBaseluck(){
        return luck;
    }

    public Integer getBasevitality(){
        return vitality;
    }

    public String getName(){
        return name;
    }

    public Double getmodStr(){
        return modStr;
    }

    public Double getmodAgi(){
        return modAgi;
    }

    public Double getmodDex(){
        return modDex;
    }

    public Double getmodEnd(){
        return modEnd;
    }

    public Double getmodInt(){
        return modInt;
    }

    public Double getmodWis(){
        return modWis;
    }

    public Double getmodPer(){
        return modPer;
    }

    public Double getmodCha(){
        return modCha;
    }

    public Double getmodLuc(){
        return modLuc;
    }

    public Double getmodVit(){
        return modVit;
    }

    public Double getStrength(){
        moddedStr = strength * modStr;
        return moddedStr;
    }

    public Double getDexterity(){
        moddedDex = dexterity * modDex;
        return moddedDex;
    }

    public Double getAgility(){
        moddedAgi = agility * modAgi;
        return moddedAgi;
    }

    public Double getEndurance(){
        moddedEnd = endurance * modEnd;
        return moddedEnd;
    }

    public Double getIntelligence(){
        moddedInt = intelligence * modInt;
        return moddedInt;
    }

    public Double getWisdom(){
        moddedWis = wisdom * modWis;
        return moddedWis;
    }

    public Double getPerception(){
        moddedPer = perception * modPer;
        return moddedPer;
    }

    public Double getLuck(){
        moddedLuc = luck * modLuc;
        return moddedLuc;
    }

    public Double getCharisma(){
        moddedCha = charisma * modCha;
        return moddedCha;
    }

    public Double getVitality(){
        moddedVit = vitality * modVit;
        return moddedVit;
    }

    public String getRace(){
        return race.getRace();
    }

    public String getBackground(){
        return story.getStory();
    }

    public String getMagic(){
        return magic.getType();
    }

    public Armor getChest(){
        return chest;
    }

    public Armor getHead(){
        return head;
    }

    public Armor getLegs(){
        return legs;
    }

    public Armor getArms(){
        return arms;
    }

    public Armor getFeet(){
        return feet;
    }

    public Weapon getWeapon1(){
        return hand1;
    }

    public Weapon getWeapon2(){
        return hand2;
    }

    public Double getHealth(){
        return health;
    }

    public Double getStamina(){
        return stamina;
    }

    public Double getMana(){
        return mana;
    }

    public Double getTotalHealth(){
        totalHealth = (getVitality() * 50) + (getStrength() * 10);
        return totalHealth;
    }

    public Double getTotalStamina(){
        totalStamina = (getEndurance() * 50) + (getAgility() * 10);
        return totalStamina;
    }

    public Double getTotalMana(){
        totalMana = (getIntelligence() * 50) + (getWisdom() * 10);
        return totalMana;
    }

    public Double getHealthRegen(){
        healthRegen = (getStrength() * 5) + (getVitality() * 2);
        return healthRegen;
    }

    public Double getStaminaRegen(){
        staminaRegen = (getAgility() * 5) + (getEndurance() * 2);
        return staminaRegen;
    }

    public Double getManaRegen(){
        manaRegen = (getWisdom() * 5) + (getIntelligence() * 2);
        return manaRegen;
    }

    public void printInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Level: " + getLevel());
        System.out.println("Race: " + getRace());
        System.out.println("Background: " + getBackground());
        System.out.println("Magic: " + getMagic());
        System.out.println("Weapon Style: " + getStyle().getStyle());
        System.out.println("Current Health: " + getHealth() + "\t Total Health: " + getTotalHealth() + "\t Health Regen: " + getHealthRegen());
        System.out.println("Current Stamina: " + getStamina() + "\t Total Stamina: " + getTotalStamina() + "\t Stamina Regen: " + getStaminaRegen());
        System.out.println("Current Mana: " + getMana() + "\t Total Mana: " + getTotalMana() + "\t Mana Regen: " + getManaRegen());
        System.out.println("Head Armor: " + getHead().getName());
        System.out.println("Chest Armor: " + getChest().getName());
        System.out.println("Leg Armor: " + getLegs().getName());
        System.out.println("Arm Armor: " + getArms().getName());
        System.out.println("Feet Armor: " + getFeet().getName());
        System.out.println("Main Weapon: " + getWeapon1().getName());
        if(getWeapon2() != null){
            System.out.println("Off Weapon: " + getWeapon2().getName());
        }
        System.out.println("Weapon Damage: " + getWeaponDamage());
        System.out.println("Armor Rating: " + getArmor());
        System.out.println("Movement Speed: " + getMoveSpeed());
        System.out.println("Weapon Speed: " + getWeaponSpeed());
        System.out.println("Block Defense: " + getBlockDefense());
        System.out.println("Dodge Chance: " + getDodgeChance());
        System.out.println("Parry Chance: " + getParryChance());
        System.out.println("Critical Chance: " + getCritChance());
        System.out.println("NPC Influence: " + getInfluence());
        System.out.println("Magic Power: " + getMagicPower());
        System.out.println("Cast Speed: " + getCastSpeed());
        System.out.println("Magic Defense: " + getMagicDefense());
        System.out.println("Magic Control: " + getMagicControl());
        System.out.println("Magic Support: " + getMagicSupport());
        System.out.println("Magic Mobility: " + getMagicMobility());
        System.out.println("Strength: " + getStrength());
        System.out.println("Dexterity: " + getDexterity());
        System.out.println("Agility: " + getAgility());
        System.out.println("Endurance: " + getEndurance());
        System.out.println("Intelligence: " + getIntelligence());
        System.out.println("Wisdom: " + getWisdom());
        System.out.println("Perception: " + getPerception());
        System.out.println("Luck: " + getLuck());
        System.out.println("Charisma: " + getCharisma());
        System.out.println("Vitality: " + getVitality());
    }

    public WeaponStyle getStyle(){
        style = new WeaponStyle(filereader.styleReader(hand1,hand2));
        return style;
    }

    public Double getWeaponDamage(){
        if(getStyle().getStyle().equals("Bow") || getStyle().getStyle().equals("Crossbow")){
            weaponDamage = hand1.getOffense() + getStyle().getOffense() + (getDexterity() / 3) + (getStrength() / 5);
        }else if(getStyle().getStyle().equals("DW Sword") || getStyle().getStyle().equals("DW Axe") || getStyle().getStyle().equals("DW Mace") || getStyle().getStyle().equals("DW Dagger")){
            weaponDamage = ((hand1.getOffense() + hand2.getOffense()) / 2)+ getStyle().getOffense() + (getDexterity() / 5) + (getStrength() / 3);
        }else{
            weaponDamage = hand1.getOffense() + getStyle().getOffense() + (getDexterity() / 5) + (getStrength() / 3);
        }
        return weaponDamage;
    }

    public Integer getArmorWeight(){
        armorWeight = chest.getWeight() + head.getWeight() + legs.getWeight() + arms.getWeight() + feet.getWeight();
        return armorWeight;
    }

    public Integer getWeaponWeight(){
        weaponWeight = hand1.getWeight();
        if(hand2 != null){
            weaponWeight += hand2.getWeight();
        }
        return weaponWeight;
    }

    public Integer getWeaponDefense(){
        Integer weaponDefense = hand1.getDefense();
        if(hand2 != null){
            weaponDefense += hand2.getDefense();
        }
        return weaponDefense;
    }

    public Double getWeaponSpeed(){
        weaponSpeed = getDexterity() * .01 + getStrength() * .005;
        if(hand2 != null){
            weaponSpeed += .05 * getStyle().getSpeed() / (getWeaponWeight() / 2);
        }else{
            weaponSpeed += .05 * getStyle().getSpeed() / hand1.getWeight();
        }
        return weaponSpeed;
    }

    public Double getMoveSpeed(){
        moveSpeed = getAgility() / 15 + (getStrength() + getEndurance()) / 30 + (getStyle().getMobility() / (getArmorWeight() + getWeaponWeight()));
        return moveSpeed;
    }

    public Double getDodgeChance(){
        dodgeChance = ((getAgility() / 2 + getLuck() / 6 + getStyle().getMobility() / 5) - (getArmorWeight() + getWeaponWeight())) / 3;
        return dodgeChance;
    }

    public Double getParryChance(){
        parryChance = getDexterity() / 2 + getPerception() / 6 + getStyle().getSpeed() / 5;
        if(hand2 != null){
            parryChance -=  (arms.getWeight() + (getWeaponWeight() / 2));
        }else{
            parryChance -=  (arms.getWeight() + hand1.getWeight());
        }
        return parryChance;
    }

    public Double getBlockDefense(){
        blockDefense = getStrength() / 2 + getEndurance() / 6;

        blockDefense += ( getWeaponDefense() + getStyle().getDefense()) / 3;

        return blockDefense;
    }

    public Double getArmor(){
        armor = ((getStrength() + getEndurance() + getVitality()) / 3) + chest.getDefense() + head.getDefense() + arms.getDefense() + legs.getDefense() + feet.getDefense();
        return armor;
    }

    public Double getCritChance(){
        critChance = (getDexterity() + getPerception() + getLuck() + getStyle().getMobility()) / 3;
        return critChance;
    }

    public Double getMagicPower(){
        magicPower = magic.getOffense() + getIntelligence() / 2 + getWisdom() / 4;
        return magicPower;
    }

    public Double getCastSpeed(){
        castSpeed = (getWisdom() * .001 + getIntelligence() * .0006) * magic.getSpeed();
        return castSpeed;
    }

    public Double getMagicDefense(){
        magicDefense = ((getIntelligence() + getWisdom() + getVitality()) / 3) + magic.getDefense();
        return magicDefense;
    }

    public Double getMagicControl(){
        magicControl = ((getIntelligence() + getWisdom()) / 3) + magic.getControl();
        return magicControl;
    }

    public Double getMagicSupport(){
        magicSupport = getIntelligence() / 2 + magic.getSupport();
        return magicSupport;
    }

    public Double getMagicMobility(){
        magicMobility = ((getAgility() + getIntelligence()) / 4) + magic.getMobile();
        return magicMobility;
    }

    public Double getInfluence(){
        npcInfluence = (getCharisma() + getWisdom() / 2 + getPerception() / 3 + getLuck() / 5) / 3;
        return npcInfluence;
    }

    public void gainLevel(){
        level++;
        System.out.println(getName() + " has gained a level!");
        System.out.println("The possible attributes are: \n Strength \n Dexterity \n Agility \n Endurance \n Intelligence \n Wisdom \n Perception \n Luck \n Charisma \n Vitality");
        for(int i = 0; i < 3; i++){
            System.out.println(name + " has " + (3 - i) + " attributes left to assign.");
            increaseStats();
        }
    }

    public void increaseStats(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select which attribute " + name + " wishes to increase.");
        String attribute = sc.nextLine();
        while((attribute.equals("Strength") || attribute.equals("Dexterity") || attribute.equals("Agility") || attribute.equals("Endurance") || attribute.equals("Intelligence") || attribute.equals("Wisdom") || attribute.equals("Perception") || attribute.equals("Charisma") || attribute.equals("Luck") || attribute.equals("Vitality")) == false){
            System.out.println("That is not one of the attributes");
            System.out.println("Please pick an attribute.");
            attribute = sc.nextLine();
        }
        if(attribute.equals("Strength")){
            strength++;
        }
        if(attribute.equals("Dexterity")){
            dexterity++;
        }
        if(attribute.equals("Agility")){
            agility++;
        }
        if(attribute.equals("Endurance")){
            endurance++;
        }
        if(attribute.equals("Intelligence")){
            intelligence++;
        }
        if(attribute.equals("Wisdom")){
            wisdom++;
        }
        if(attribute.equals("Perception")){
            perception++;
        }
        if(attribute.equals("Luck")){
            luck++;
        }
        if(attribute.equals("Charisma")){
            charisma++;
        }
        if(attribute.equals("Vitality")){
            vitality++;
        }
    }

    public Integer getLevel(){
        return level;
    }

    public ArrayList<Item> getInventory(){
        return inventory;
    }

    public ArrayList<Skill> getSkillList(){
        return skillList;
    }

    public void displayItemStats(){
        getWeapon1().display();
        System.out.println("");
        if(getWeapon2() != null){
            getWeapon2().display();
            System.out.println("");
        }
        getHead().display();
        System.out.println("");
        getChest().display();
        System.out.println("");
        getLegs().display();
        System.out.println("");
        getArms().display();
        System.out.println("");
        getFeet().display();
    }   

    public void setModStr(){
        modStr = 1.0;
        if(race.getPrimaryBuff().equals("Strength")){
            modStr += .3;
        }else if(race.getSecondaryBuff().equals("Strength")){
            modStr += .2;
        }else if(race.getTertiaryBuff().equals("Strength")){
            modStr += .1;
        }else if(race.getPrimaryDeBuff().equals("Strength")){
            modStr -= .2;
        }else if(race.getSecondaryDeBuff().equals("Strength")){
            modStr -= .1;
        }
        if(story.getPrimaryBuff().equals("Strength")){
            modStr += .2;
        }else if(story.getSecondaryBuff().equals("Strength")){
            modStr += .1;
        }else if(story.getPrimaryDeBuff().equals("Strength")){
            modStr -= .1;
        }
    }

    public void setModDex(){
        modDex = 1.0;
        if(race.getPrimaryBuff().equals("Dexterity")){
            modDex += .3;
        }else if(race.getSecondaryBuff().equals("Dexterity")){
            modDex += .2;
        }else if(race.getTertiaryBuff().equals("Dexterity")){
            modDex += .1;
        }else if(race.getPrimaryDeBuff().equals("Dexterity")){
            modDex -= .2;
        }else if(race.getSecondaryDeBuff().equals("Dexterity")){
            modDex -= .1;
        }
        if(story.getPrimaryBuff().equals("Dexterity")){
            modDex += .2;
        }else if(story.getSecondaryBuff().equals("Dexterity")){
            modDex += .1;
        }else if(story.getPrimaryDeBuff().equals("Dexterity")){
            modDex -= .1;
        }
    }

    public void setModAgi(){
        modAgi = 1.0;
        if(race.getPrimaryBuff().equals("Agility")){
            modAgi += .3;
        }else if(race.getSecondaryBuff().equals("Agility")){
            modAgi += .2;
        }else if(race.getTertiaryBuff().equals("Agility")){
            modAgi += .1;
        }else if(race.getPrimaryDeBuff().equals("Agility")){
            modAgi -= .2;
        }else if(race.getSecondaryDeBuff().equals("Agility")){
            modAgi -= .1;
        }
        if(story.getPrimaryBuff().equals("Agility")){
            modAgi += .2;
        }else if(story.getSecondaryBuff().equals("Agility")){
            modAgi += .1;
        }else if(story.getPrimaryDeBuff().equals("Agility")){
            modAgi -= .1;
        }
    }

    public void setModEnd(){
        modEnd = 1.0;
        if(race.getPrimaryBuff().equals("Endurance")){
            modEnd += .3;
        }else if(race.getSecondaryBuff().equals("Endurance")){
            modEnd += .2;
        }else if(race.getTertiaryBuff().equals("Endurance")){
            modEnd += .1;
        }else if(race.getPrimaryDeBuff().equals("Endurance")){
            modEnd -= .2;
        }else if(race.getSecondaryDeBuff().equals("Endurance")){
            modEnd -= .1;
        }
        if(story.getPrimaryBuff().equals("Endurance")){
            modEnd += .2;
        }else if(story.getSecondaryBuff().equals("Endurance")){
            modEnd += .1;
        }else if(story.getPrimaryDeBuff().equals("Endurance")){
            modEnd -= .1;
        }
    }

    public void setModInt(){
        modInt = 1.0;
        if(race.getPrimaryBuff().equals("Intelligence")){
            modInt += .3;
        }else if(race.getSecondaryBuff().equals("Intelligence")){
            modInt += .2;
        }else if(race.getTertiaryBuff().equals("Intelligence")){
            modInt += .1;
        }else if(race.getPrimaryDeBuff().equals("Intelligence")){
            modInt -= .2;
        }else if(race.getSecondaryDeBuff().equals("Intelligence")){
            modInt -= .1;
        }
        if(story.getPrimaryBuff().equals("Intelligence")){
            modInt += .2;
        }else if(story.getSecondaryBuff().equals("Intelligence")){
            modInt += .1;
        }else if(story.getPrimaryDeBuff().equals("Intelligence")){
            modInt -= .1;
        }
    }

    public void setModWis(){
        modWis = 1.0;
        if(race.getPrimaryBuff().equals("Wisdom")){
            modWis += .3;
        }else if(race.getSecondaryBuff().equals("Wisdom")){
            modWis += .2;
        }else if(race.getTertiaryBuff().equals("Wisdom")){
            modWis += .1;
        }else if(race.getPrimaryDeBuff().equals("Wisdom")){
            modWis -= .2;
        }else if(race.getSecondaryDeBuff().equals("Wisdom")){
            modWis -= .1;
        }
        if(story.getPrimaryBuff().equals("Wisdom")){
            modWis += .2;
        }else if(story.getSecondaryBuff().equals("Wisdom")){
            modWis += .1;
        }else if(story.getPrimaryDeBuff().equals("Wisdom")){
            modWis -= .1;
        }
    }

    public void setModPer(){
        modPer = 1.0;
        if(race.getPrimaryBuff().equals("Perception")){
            modPer += .3;
        }else if(race.getSecondaryBuff().equals("Perception")){
            modPer += .2;
        }else if(race.getTertiaryBuff().equals("Perception")){
            modPer += .1;
        }else if(race.getPrimaryDeBuff().equals("Perception")){
            modPer -= .2;
        }else if(race.getSecondaryDeBuff().equals("Perception")){
            modPer -= .1;
        }
        if(story.getPrimaryBuff().equals("Perception")){
            modPer += .2;
        }else if(story.getSecondaryBuff().equals("Perception")){
            modPer += .1;
        }else if(story.getPrimaryDeBuff().equals("Perception")){
            modPer -= .1;
        }
    }

    public void setModLuc(){
        modLuc = 1.0;
        if(race.getPrimaryBuff().equals("Luck")){
            modLuc += .3;
        }else if(race.getSecondaryBuff().equals("Luck")){
            modLuc += .2;
        }else if(race.getTertiaryBuff().equals("Luck")){
            modLuc += .1;
        }else if(race.getPrimaryDeBuff().equals("Luck")){
            modLuc -= .2;
        }else if(race.getSecondaryDeBuff().equals("Luck")){
            modLuc -= .1;
        }
        if(story.getPrimaryBuff().equals("Luck")){
            modLuc += .2;
        }else if(story.getSecondaryBuff().equals("Luck")){
            modLuc += .1;
        }else if(story.getPrimaryDeBuff().equals("Luck")){
            modLuc -= .1;
        }
    }

    public void setModCha(){
        modCha = 1.0;
        if(race.getPrimaryBuff().equals("Charisma")){
            modCha += .3;
        }else if(race.getSecondaryBuff().equals("Charisma")){
            modCha += .2;
        }else if(race.getTertiaryBuff().equals("Charisma")){
            modCha += .1;
        }else if(race.getPrimaryDeBuff().equals("Charisma")){
            modCha -= .2;
        }else if(race.getSecondaryDeBuff().equals("Charisma")){
            modCha -= .1;
        }
        if(story.getPrimaryBuff().equals("Charisma")){
            modCha += .2;
        }else if(story.getSecondaryBuff().equals("Charisma")){
            modCha += .1;
        }else if(story.getPrimaryDeBuff().equals("Charisma")){
            modCha -= .1;
        }
    }

    public void setModVit(){
        modVit = 1.0;
        if(race.getPrimaryBuff().equals("Vitality")){
            modVit += .3;
        }else if(race.getSecondaryBuff().equals("Vitality")){
            modVit += .2;
        }else if(race.getTertiaryBuff().equals("Vitality")){
            modVit += .1;
        }else if(race.getPrimaryDeBuff().equals("Vitality")){
            modVit -= .2;
        }else if(race.getSecondaryDeBuff().equals("Vitality")){
            modVit -= .1;
        }
        if(story.getPrimaryBuff().equals("Vitality")){
            modVit += .2;
        }else if(story.getSecondaryBuff().equals("Vitality")){
            modVit += .1;
        }else if(story.getPrimaryDeBuff().equals("Vitality")){
            modVit -= .1;
        }
    }

    public void incStr(){
        strength++;
    }

    public void decStr(){
        if(strength == 8){
            return;
        }
        strength--;
    }

    public void incAgi(){
        agility++;
    }

    public void decAgi(){
        if(agility == 8){
            return;
        }
        agility--;
    }

    public void incDex(){
        dexterity++;
    }

    public void decDex(){
        if(dexterity == 8){
            return;
        }
        dexterity--;
    }

    public void incEnd(){
        endurance++;
    }

    public void decEnd(){
        if(endurance == 8){
            return;
        }
        endurance--;
    }

    public void incInt(){
        intelligence++;
    }

    public void decInt(){
        if(intelligence == 8){
            return;
        }
        intelligence--;
    }

    public void incWis(){
        wisdom++;
    }

    public void decWis(){
        if(wisdom == 8){
            return;
        }
        wisdom--;
    }

    public void incPer(){
        perception++;
    }

    public void decPer(){
        if(perception == 8){
            return;
        }
        perception--;
    }

    public void incCha(){
        charisma++;
    }

    public void decCha(){
        if(charisma == 8){
            return;
        }
        charisma--;
    }

    public void incLuc(){
        luck++;
    }

    public void decLuc(){
        if(luck == 8){
            return;
        }
        luck--;
    }

    public void incVit(){
        vitality++;
    }

    public void decVit(){
        if(vitality == 8){
            return;
        }
        vitality--;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setRace(String tempRace){
        race = new Race(filereader.raceReader(tempRace));
        raceDescription = race.getDescription();
    }

    public void setStory(String tempStory){
        story = new Background(filereader.storyReader(tempStory));
        hand1 = story.getWeapon1();
        hand2 = story.getWeapon2();
        head = story.getHead();
        chest = story.getChest();
        arms = story.getArms();
        legs = story.getLegs();
        feet = story.getFeet();
        storyDescription = story.getDescription();
    }

    public void setPrimaryMagic(String tempFirst){
        primaryMagic = new Magic(filereader.firstMagicReader(tempFirst));
        primaryDescription = primaryMagic.getDescription();
    }

    public void setSecondaryMagic(String tempSecond){
        secondaryMagic = new Magic(filereader.secondMagicReader(tempSecond));
        secondaryDescription = secondaryMagic.getDescription();
    }

    public void setMagic(){
        magic = new Magic(primaryMagic, secondaryMagic);
    }

    public String getOffWeaponName(){
        if(getWeapon2() != null){
            return getWeapon2().getName();
        }else{
            return "Empty";
        }
    }

    public void setStyle(){
        style = new WeaponStyle(filereader.styleReader(hand1,hand2));
    }

    public String getRaceDescription(){
        return raceDescription;
    }

    public String getPrimaryDescription(){
        return primaryDescription;
    }

    public String getSecondaryDescription(){
        return secondaryDescription;
    }
    
    public String getStoryDescription(){
        return storyDescription;
    }
}
