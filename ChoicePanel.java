import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener.*;

public class ChoicePanel{
    private JPanel choicePanel;
    private Character c;

    private Speaker hT;
    private Speaker hR;
    private Speaker sT;
    private Speaker sR;
    private Speaker mT;
    private Speaker mR;
    private Speaker wD;
    private Speaker aR;
    private Speaker mV;
    private Speaker wS;
    private Speaker cC;
    private Speaker bD;
    private Speaker dC;
    private Speaker pC;
    private Speaker mP;
    private Speaker cS;
    private Speaker mD;
    private Speaker mC;
    private Speaker mS;
    private Speaker mM;

    private Speaker wT;
    private Speaker w1;
    private Speaker w2;
    private Speaker hA;
    private Speaker cA;
    private Speaker aA;
    private Speaker lA;
    private Speaker fA;

    private Speaker mStr;
    private Speaker mAgi;
    private Speaker mDex;
    private Speaker mEnd;
    private Speaker mInt;
    private Speaker mWis;
    private Speaker mPer;
    private Speaker mCha;
    private Speaker mLuc;
    private Speaker mVit;
    private Speaker mdStr;
    private Speaker mdAgi;
    private Speaker mdDex;
    private Speaker mdEnd;
    private Speaker mdInt;
    private Speaker mdWis;
    private Speaker mdPer;
    private Speaker mdCha;
    private Speaker mdLuc;
    private Speaker mdVit;

    public ChoicePanel(Character c, Speaker hT,Speaker hR,Speaker sT,Speaker sR,Speaker mT,Speaker mR,Speaker wD,Speaker aR,Speaker mV,Speaker wS,Speaker cC,Speaker bD,Speaker dC,Speaker pC,Speaker mP,Speaker cS,Speaker mD,Speaker mC,Speaker mS,Speaker mM,Speaker mStr,Speaker mAgi,Speaker mDex,Speaker mEnd,Speaker mInt,Speaker mWis,Speaker mPer,Speaker mCha,Speaker mLuc,Speaker mVit,Speaker mdStr,Speaker mdAgi,Speaker mdDex,Speaker mdEnd,Speaker mdInt,Speaker mdWis,Speaker mdPer,Speaker mdCha,Speaker mdLuc,Speaker mdVit, Speaker wT,Speaker w1,Speaker w2,Speaker hA,Speaker cA,Speaker aA,Speaker lA,Speaker fA){
        this.hT = hT;
        this.hR = hR;
        this.sT = sT;
        this.sR = sR;
        this.mT = mT;
        this.mR = mR;
        this.wD = wD;
        this.aR = aR;
        this.mV = mV;
        this.wS = wS;
        this.cC = cC;
        this.bD = bD;
        this.dC = dC;
        this.pC = pC;
        this.mP = mP;
        this.cS = cS;
        this.mD = mD;
        this.mC = mC;
        this.mS = mS;
        this.mM = mM;

        this.mStr = mStr;
        this.mAgi = mAgi;
        this.mDex = mDex;
        this.mEnd = mEnd;
        this.mInt = mInt;
        this.mWis = mWis;
        this.mPer = mPer;
        this.mCha = mCha;
        this.mLuc = mLuc;
        this.mVit = mVit;
        this.mdStr = mdStr;
        this.mdAgi = mdAgi;
        this.mdDex = mdDex;
        this.mdEnd = mdEnd;
        this.mdInt = mdInt;
        this.mdWis = mdWis;
        this.mdPer = mdPer;
        this.mdCha = mdCha;
        this.mdLuc = mdLuc;
        this.mdVit = mdVit;

        this.wT = wT;
        this.w1 = w1;
        this.w2 = w2;
        this.hA = hA;
        this.cA = cA;
        this.aA = aA;
        this.lA = lA;
        this.fA = fA;

        this.c = c;
        makeDisplay();
    }

    private void makeDisplay(){
        choicePanel = new JPanel();
        choicePanel.setLayout(new BorderLayout());
        JLabel choices = new JLabel("Character Choices");
        choicePanel.add(choices, BorderLayout.NORTH);

        JPanel choice = new JPanel();
        choice.setLayout(new GridLayout(9,1));

        JPanel nameChoice = new JPanel();
        nameChoice.setLayout(new GridLayout(1,2));

        JLabel name = new JLabel("Name");
        nameChoice.add(name);

        JTextField nameInput = new JTextField(20);
        nameInput.addActionListener((event) -> {assignName(nameInput.getText());
            });
        nameChoice.add(nameInput);

        choice.add(nameChoice);

        JPanel choiceRace = new JPanel();
        choiceRace.setLayout(new GridLayout(1,2));

        JLabel race = new JLabel("Race");
        choiceRace.add(race);

        String[] raceList = {"Gox","Valdar","Eona","Kroll","Surmeli","Zem","Criffon","Eldrizi","Elassi","Clovis"};
        JComboBox<String> raceChoice = new JComboBox<>(raceList);
        Speaker raceSpeak = new Speaker();
        raceChoice.addActionListener((event) -> {changeRace(raceChoice.getSelectedObjects());raceSpeak.changeData(c.getRaceDescription());mdStr.changeData(c.getmodStr());mdAgi.changeData(c.getmodAgi());mdDex.changeData(c.getmodDex());mdEnd.changeData(c.getmodEnd());mdInt.changeData(c.getmodInt());mdWis.changeData(c.getmodWis());mdPer.changeData(c.getmodPer());mdCha.changeData(c.getmodCha());mdLuc.changeData(c.getmodLuc());mdVit.changeData(c.getmodVit());mStr.changeData(c.getStrength());hT.changeData(c.getTotalHealth());hR.changeData(c.getHealthRegen());wS.changeData(c.getWeaponSpeed());bD.changeData(c.getBlockDefense());mAgi.changeData(c.getAgility());sT.changeData(c.getTotalStamina());sR.changeData(c.getStaminaRegen());mV.changeData(c.getMoveSpeed());dC.changeData(c.getDodgeChance());mDex.changeData(c.getDexterity());wD.changeData(c.getWeaponDamage());mEnd.changeData(c.getEndurance());mInt.changeData(c.getIntelligence());mC.changeData(c.getMagicControl());mS.changeData(c.getMagicSupport());mM.changeData(c.getMagicMobility());mWis.changeData(c.getWisdom());mT.changeData(c.getTotalMana());mR.changeData(c.getManaRegen());mP.changeData(c.getMagicPower());cS.changeData(c.getCastSpeed());mPer.changeData(c.getPerception());pC.changeData(c.getParryChance());mLuc.changeData(c.getLuck());cC.changeData(c.getCritChance());mCha.changeData(c.getCharisma());mVit.changeData(c.getVitality());aR.changeData(c.getArmor());mD.changeData(c.getMagicDefense());
            });
        choiceRace.add(raceChoice);

        choice.add(choiceRace);

        Listener raceDescript = new Listener();
        raceDescript.display(c.getRaceDescription());
        raceSpeak.addObserver(raceDescript);

        choice.add(raceDescript);

        JPanel choiceStory = new JPanel();
        choiceStory.setLayout(new GridLayout(1,2));

        JLabel story = new JLabel("Background");
        choiceStory.add(story);

        String[] storyList = {"Wealthy","Barbaric","Rebel","Ranger","Scout","Scholar","Wanderer","Explorer","Loner","Thief","Assassin","Soldier","Bard","Blacksmith","Carpenter","Clothier","Merchant","Spy","Religious","Survivor","Acrobat","Monk","Commander","Strategist","Flag-Bearer","Farmer","Guard","Priest","Rogue","Researcher"};
        JComboBox<String> storyChoice = new JComboBox<>(storyList);
        Speaker storySpeak = new Speaker();
        storyChoice.addActionListener((event) -> {changeStory(storyChoice.getSelectedObjects());storySpeak.changeData(c.getStoryDescription());wT.changeData(c.getStyle().getStyle());w1.changeData(c.getWeapon1().getName());w2.changeData(c.getOffWeaponName());hA.changeData(c.getHead().getName());cA.changeData(c.getChest().getName());aA.changeData(c.getArms().getName());lA.changeData(c.getLegs().getName());fA.changeData(c.getFeet().getName());mdStr.changeData(c.getmodStr());mdAgi.changeData(c.getmodAgi());mdDex.changeData(c.getmodDex());mdEnd.changeData(c.getmodEnd());mdInt.changeData(c.getmodInt());mdWis.changeData(c.getmodWis());mdPer.changeData(c.getmodPer());mdCha.changeData(c.getmodCha());mdLuc.changeData(c.getmodLuc());mdVit.changeData(c.getmodVit());mStr.changeData(c.getStrength());hT.changeData(c.getTotalHealth());hR.changeData(c.getHealthRegen());wS.changeData(c.getWeaponSpeed());bD.changeData(c.getBlockDefense());mAgi.changeData(c.getAgility());sT.changeData(c.getTotalStamina());sR.changeData(c.getStaminaRegen());mV.changeData(c.getMoveSpeed());dC.changeData(c.getDodgeChance());mDex.changeData(c.getDexterity());wD.changeData(c.getWeaponDamage());mEnd.changeData(c.getEndurance());mInt.changeData(c.getIntelligence());mC.changeData(c.getMagicControl());mS.changeData(c.getMagicSupport());mM.changeData(c.getMagicMobility());mWis.changeData(c.getWisdom());mT.changeData(c.getTotalMana());mR.changeData(c.getManaRegen());mP.changeData(c.getMagicPower());cS.changeData(c.getCastSpeed());mPer.changeData(c.getPerception());pC.changeData(c.getParryChance());mLuc.changeData(c.getLuck());cC.changeData(c.getCritChance());mCha.changeData(c.getCharisma());mVit.changeData(c.getVitality());aR.changeData(c.getArmor());mD.changeData(c.getMagicDefense());
            });
        choiceStory.add(storyChoice);

        choice.add(choiceStory);
        
        Listener storyDescript = new Listener();
        storyDescript.display(c.getStoryDescription());
        storySpeak.addObserver(storyDescript);
        
        choice.add(storyDescript);

        JPanel choicePrimary = new JPanel();
        choicePrimary.setLayout(new GridLayout(1,2));

        JLabel primary = new JLabel("Primary Magic");
        choicePrimary.add(primary);

        String[] magicList = {"Fire","Water","Earth","Air","Lightning","Shadow","Healing","Summoning","Illusion","Light"};
        JComboBox<String> primaryChoice = new JComboBox<>(magicList);
        JComboBox<String> secondaryChoice = new JComboBox<>(magicList);
        Speaker primarySpeak = new Speaker();
        Speaker secondarySpeak = new Speaker();
        primaryChoice.addActionListener((event) -> {changePrimary(primaryChoice.getSelectedObjects(),secondaryChoice.getSelectedObjects());primarySpeak.changeData(c.getPrimaryDescription());mP.changeData(c.getMagicPower());cS.changeData(c.getCastSpeed());mD.changeData(c.getMagicDefense());mC.changeData(c.getMagicControl());mS.changeData(c.getMagicSupport());mM.changeData(c.getMagicMobility());
            });

        choicePrimary.add(primaryChoice);

        choice.add(choicePrimary);

        Listener primaryDescript = new Listener();
        primaryDescript.display(c.getPrimaryDescription());
        primarySpeak.addObserver(primaryDescript);

        choice.add(primaryDescript);

        JPanel choiceSecondary = new JPanel();
        choiceSecondary.setLayout(new GridLayout(1,2));

        JLabel secondary = new JLabel("Secondary Magic");
        choiceSecondary.add(secondary);

        secondaryChoice.addActionListener((event) -> {changeSecondary(secondaryChoice.getSelectedObjects(),primaryChoice.getSelectedObjects());secondarySpeak.changeData(c.getSecondaryDescription());mP.changeData(c.getMagicPower());cS.changeData(c.getCastSpeed());mD.changeData(c.getMagicDefense());mC.changeData(c.getMagicControl());mS.changeData(c.getMagicSupport());mM.changeData(c.getMagicMobility());
            });
        choiceSecondary.add(secondaryChoice);

        choice.add(choiceSecondary);

        Listener secondaryDescript = new Listener();
        secondaryDescript.display(c.getSecondaryDescription());
        secondarySpeak.addObserver(secondaryDescript);

        choice.add(secondaryDescript);

        choicePanel.add(choice, BorderLayout.CENTER);
    }

    private void changeRace(Object[] pick){
        String selection = "";
        if(pick[0] instanceof String){
            selection = (String) pick[0];
        }
        c.setRace(selection);
        c.setModStr();
        c.setModAgi();
        c.setModDex();
        c.setModEnd();
        c.setModInt();
        c.setModWis();
        c.setModPer();
        c.setModCha();
        c.setModLuc();
        c.setModVit();
    }

    private void changeStory(Object[] pick){
        String selection = "";
        if(pick[0] instanceof String){
            selection = (String) pick[0];
        }
        c.setStory(selection);
        c.setModStr();
        c.setModAgi();
        c.setModDex();
        c.setModEnd();
        c.setModInt();
        c.setModWis();
        c.setModPer();
        c.setModCha();
        c.setModLuc();
        c.setModVit();
    }

    private void changePrimary(Object[] pick1, Object[] pick2){
        String selection1 = "";
        String selection2 = "";
        if(pick1[0] instanceof String && pick2[0] instanceof String){
            selection1 = (String) pick1[0];
            selection2 = (String) pick2[0];
        }
        if(!selection1.equals(selection2)){
            c.setPrimaryMagic(selection1);
            c.setMagic();
        }
    }

    private void changeSecondary(Object[] pick1, Object[] pick2){
        String selection1 = "";
        String selection2 = "";
        if(pick1[0] instanceof String && pick2[0] instanceof String){
            selection1 = (String) pick1[0];
            selection2 = (String) pick2[0];
        }
        if(!selection1.equals(selection2)){
            c.setSecondaryMagic(selection1);
            c.setMagic();
        }
    }

    private void assignName(String newName){
        c.setName(newName);
    }

    public JPanel getChoicePanel(){
        return choicePanel;
    }
}
