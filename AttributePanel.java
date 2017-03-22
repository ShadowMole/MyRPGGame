import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener.*;

public class AttributePanel{
    private JPanel charAttributes;
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

    private JButton decStr;
    private JButton incStr;
    private JButton decAgi;
    private JButton incAgi;
    private JButton decDex;
    private JButton incDex;
    private JButton decEnd;
    private JButton incEnd;
    private JButton decInt;
    private JButton incInt;
    private JButton decWis;
    private JButton incWis;
    private JButton decPer;
    private JButton incPer;
    private JButton decCha;
    private JButton incCha;
    private JButton decLuc;
    private JButton incLuc;
    private JButton decVit;
    private JButton incVit;

    private Updater remaining;

    public AttributePanel(Character c, Speaker hT,Speaker hR,Speaker sT,Speaker sR,Speaker mT,Speaker mR,Speaker wD,Speaker aR,Speaker mV,Speaker wS,Speaker cC,Speaker bD,Speaker dC,Speaker pC,Speaker mP,Speaker cS,Speaker mD,Speaker mC,Speaker mS,Speaker mM,Speaker mStr,Speaker mAgi,Speaker mDex,Speaker mEnd,Speaker mInt,Speaker mWis,Speaker mPer,Speaker mCha,Speaker mLuc,Speaker mVit,Speaker mdStr,Speaker mdAgi,Speaker mdDex,Speaker mdEnd,Speaker mdInt,Speaker mdWis,Speaker mdPer,Speaker mdCha,Speaker mdLuc,Speaker mdVit){
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

        this.c = c;
        makeDisplay();
    }

    private void makeDisplay(){
        charAttributes = new JPanel();
        charAttributes.setLayout(new BorderLayout());
        JLabel attributes = new JLabel("Attributes");
        charAttributes.add(attributes, BorderLayout.NORTH);

        remaining = new Updater(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());
        remaining.display();
        charAttributes.add(remaining, BorderLayout.SOUTH);
        Speaker update = new Speaker();
        update.addObserver(remaining);

        JPanel displayAttributes = new JPanel();
        displayAttributes.setLayout(new GridLayout(11,4));

        JLabel attribute = new JLabel("Attribute");
        JLabel strength = new JLabel("Strength:");
        JLabel agility = new JLabel("Agility:");
        JLabel dexterity = new JLabel("Dexterity:");
        JLabel endurance = new JLabel("Endurance:");
        JLabel intelligence = new JLabel("Intelligence:");
        JLabel wisdom = new JLabel("Wisdom:");
        JLabel perception = new JLabel("Perception:");
        JLabel charisma = new JLabel("Charisma:");
        JLabel luck = new JLabel("Luck:");
        JLabel vitality = new JLabel("Vitality:");

        JLabel base = new JLabel("Base Attributes");

        JPanel baseStr = new JPanel();
        baseStr.setLayout(new GridLayout(1,3));
        decStr = new JButton("<");
        Speaker cStr = new Speaker();
        decStr.addActionListener((event) -> {decreaseChar1Str();cStr.changeData(c.getBasestrength());mStr.changeData(c.getStrength());hT.changeData(c.getTotalHealth());hR.changeData(c.getHealthRegen());wD.changeData(c.getWeaponDamage());aR.changeData(c.getArmor());mV.changeData(c.getMoveSpeed());wS.changeData(c.getWeaponSpeed());bD.changeData(c.getBlockDefense());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        decStr.setEnabled(false);
        Listener str = new Listener();
        cStr.addObserver(str);
        str.display(c.getBasestrength());
        incStr = new JButton(">");
        incStr.addActionListener((event) -> {increaseChar1Str();cStr.changeData(c.getBasestrength());mStr.changeData(c.getStrength());hT.changeData(c.getTotalHealth());hR.changeData(c.getHealthRegen());wD.changeData(c.getWeaponDamage());aR.changeData(c.getArmor());mV.changeData(c.getMoveSpeed());wS.changeData(c.getWeaponSpeed());bD.changeData(c.getBlockDefense());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        baseStr.add(decStr);
        baseStr.add(str);
        baseStr.add(incStr);

        JPanel baseAgi = new JPanel();
        baseAgi.setLayout(new GridLayout(1,3));
        decAgi = new JButton("<");
        Speaker cAgi = new Speaker();
        decAgi.addActionListener((event) -> {decreaseChar1Agi();cAgi.changeData(c.getBaseagility());mAgi.changeData(c.getAgility());sT.changeData(c.getTotalStamina());sR.changeData(c.getStaminaRegen());mV.changeData(c.getMoveSpeed());dC.changeData(c.getDodgeChance());mM.changeData(c.getMagicMobility());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        decAgi.setEnabled(false);
        Listener agi = new Listener();
        cAgi.addObserver(agi);
        agi.display(c.getBaseagility());
        incAgi = new JButton(">");
        incAgi.addActionListener((event) -> {increaseChar1Agi();cAgi.changeData(c.getBaseagility());mAgi.changeData(c.getAgility());sT.changeData(c.getTotalStamina());sR.changeData(c.getStaminaRegen());mV.changeData(c.getMoveSpeed());dC.changeData(c.getDodgeChance());mM.changeData(c.getMagicMobility());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        baseAgi.add(decAgi);
        baseAgi.add(agi);
        baseAgi.add(incAgi);

        JPanel baseDex = new JPanel();
        baseDex.setLayout(new GridLayout(1,3));
        decDex = new JButton("<");
        Speaker cDex = new Speaker();
        decDex.addActionListener((event) -> {decreaseChar1Dex();cDex.changeData(c.getBasedexterity());mDex.changeData(c.getDexterity());wD.changeData(c.getWeaponDamage());wS.changeData(c.getWeaponSpeed());cC.changeData(c.getCritChance());pC.changeData(c.getParryChance());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        decDex.setEnabled(false);
        Listener dex = new Listener();
        cDex.addObserver(dex);
        dex.display(c.getBasedexterity());
        incDex = new JButton(">");
        incDex.addActionListener((event) -> {increaseChar1Dex();cDex.changeData(c.getBasedexterity());mDex.changeData(c.getDexterity());wD.changeData(c.getWeaponDamage());wS.changeData(c.getWeaponSpeed());cC.changeData(c.getCritChance());pC.changeData(c.getParryChance());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        baseDex.add(decDex);
        baseDex.add(dex);
        baseDex.add(incDex);

        JPanel baseEnd = new JPanel();
        baseEnd.setLayout(new GridLayout(1,3));
        decEnd = new JButton("<");
        Speaker cEnd = new Speaker();
        decEnd.addActionListener((event) -> {decreaseChar1End();cEnd.changeData(c.getBaseendurance());mEnd.changeData(c.getEndurance());sT.changeData(c.getTotalStamina());sR.changeData(c.getStaminaRegen());aR.changeData(c.getArmor());mV.changeData(c.getMoveSpeed());bD.changeData(c.getBlockDefense());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        decEnd.setEnabled(false);
        Listener end = new Listener();
        cEnd.addObserver(end);
        end.display(c.getBaseendurance());
        incEnd = new JButton(">");
        incEnd.addActionListener((event) -> {increaseChar1End();cEnd.changeData(c.getBaseendurance());mEnd.changeData(c.getEndurance());sT.changeData(c.getTotalStamina());sR.changeData(c.getStaminaRegen());aR.changeData(c.getArmor());mV.changeData(c.getMoveSpeed());bD.changeData(c.getBlockDefense());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        baseEnd.add(decEnd);
        baseEnd.add(end);
        baseEnd.add(incEnd);

        JPanel baseInt = new JPanel();
        baseInt.setLayout(new GridLayout(1,3));
        decInt = new JButton("<");
        Speaker cInt = new Speaker();
        decInt.addActionListener((event) -> {decreaseChar1Int();cInt.changeData(c.getBaseintelligence());mInt.changeData(c.getIntelligence());mT.changeData(c.getTotalMana());mR.changeData(c.getManaRegen());mP.changeData(c.getMagicPower());cS.changeData(c.getCastSpeed());mD.changeData(c.getMagicDefense());mC.changeData(c.getMagicControl());mS.changeData(c.getMagicSupport());mM.changeData(c.getMagicMobility());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        decInt.setEnabled(false);
        Listener inte = new Listener();
        cInt.addObserver(inte);
        inte.display(c.getBaseintelligence());
        incInt = new JButton(">");
        incInt.addActionListener((event) -> {increaseChar1Int();cInt.changeData(c.getBaseintelligence());mInt.changeData(c.getIntelligence());mT.changeData(c.getTotalMana());mR.changeData(c.getManaRegen());mP.changeData(c.getMagicPower());cS.changeData(c.getCastSpeed());mD.changeData(c.getMagicDefense());mC.changeData(c.getMagicControl());mS.changeData(c.getMagicSupport());mM.changeData(c.getMagicMobility());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        baseInt.add(decInt);
        baseInt.add(inte);
        baseInt.add(incInt);

        JPanel baseWis = new JPanel();
        baseWis.setLayout(new GridLayout(1,3));
        decWis = new JButton("<");
        Speaker cWis = new Speaker();
        decWis.addActionListener((event) -> {decreaseChar1Wis();cWis.changeData(c.getBasewisdom());mWis.changeData(c.getWisdom());mT.changeData(c.getTotalMana());mR.changeData(c.getManaRegen());mP.changeData(c.getMagicPower());cS.changeData(c.getCastSpeed());mD.changeData(c.getMagicDefense());mC.changeData(c.getMagicControl());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        decWis.setEnabled(false);
        Listener wis = new Listener();
        cWis.addObserver(wis);
        wis.display(c.getBasewisdom());
        incWis = new JButton(">");
        incWis.addActionListener((event) -> {increaseChar1Wis();cWis.changeData(c.getBasewisdom());mWis.changeData(c.getWisdom());mT.changeData(c.getTotalMana());mR.changeData(c.getManaRegen());mP.changeData(c.getMagicPower());cS.changeData(c.getCastSpeed());mD.changeData(c.getMagicDefense());mC.changeData(c.getMagicControl());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        baseWis.add(decWis);
        baseWis.add(wis);
        baseWis.add(incWis);

        JPanel basePer = new JPanel();
        basePer.setLayout(new GridLayout(1,3));
        decPer = new JButton("<");
        Speaker cPer = new Speaker();
        decPer.addActionListener((event) -> {decreaseChar1Per();cPer.changeData(c.getBaseperception());mPer.changeData(c.getPerception());cC.changeData(c.getCritChance());pC.changeData(c.getParryChance());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        decPer.setEnabled(false);
        Listener per = new Listener();
        cPer.addObserver(per);
        per.display(c.getBaseperception());
        incPer = new JButton(">");
        incPer.addActionListener((event) -> {increaseChar1Per();cPer.changeData(c.getBaseperception());mPer.changeData(c.getPerception());cC.changeData(c.getCritChance());pC.changeData(c.getParryChance());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        basePer.add(decPer);
        basePer.add(per);
        basePer.add(incPer);

        JPanel baseCha = new JPanel();
        baseCha.setLayout(new GridLayout(1,3));
        decCha = new JButton("<");
        Speaker cCha = new Speaker();
        decCha.addActionListener((event) -> {decreaseChar1Cha();cCha.changeData(c.getBasecharisma());mCha.changeData(c.getCharisma());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        decCha.setEnabled(false);
        Listener cha = new Listener();
        cCha.addObserver(cha);
        cha.display(c.getBasecharisma());
        incCha = new JButton(">");
        incCha.addActionListener((event) -> {increaseChar1Cha();cCha.changeData(c.getBasecharisma());mCha.changeData(c.getCharisma());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        baseCha.add(decCha);
        baseCha.add(cha);
        baseCha.add(incCha);

        JPanel baseLuc = new JPanel();
        baseLuc.setLayout(new GridLayout(1,3));
        decLuc = new JButton("<");
        Speaker cLuc = new Speaker();
        decLuc.addActionListener((event) -> {decreaseChar1Luc();cLuc.changeData(c.getBaseluck());mLuc.changeData(c.getLuck());cC.changeData(c.getCritChance());dC.changeData(c.getDodgeChance());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        decLuc.setEnabled(false);
        Listener luc = new Listener();
        cLuc.addObserver(luc);
        luc.display(c.getBaseluck());
        incLuc = new JButton(">");
        incLuc.addActionListener((event) -> {increaseChar1Luc();cLuc.changeData(c.getBaseluck());mLuc.changeData(c.getLuck());cC.changeData(c.getCritChance());dC.changeData(c.getDodgeChance());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        baseLuc.add(decLuc);
        baseLuc.add(luc);
        baseLuc.add(incLuc);

        JPanel baseVit = new JPanel();
        baseVit.setLayout(new GridLayout(1,3));
        decVit = new JButton("<");
        Speaker cVit = new Speaker();
        decVit.addActionListener((event) -> {decreaseChar1Vit();cVit.changeData(c.getBasevitality());mVit.changeData(c.getVitality());hT.changeData(c.getTotalHealth());hR.changeData(c.getHealthRegen());aR.changeData(c.getArmor());mD.changeData(c.getMagicDefense());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        decVit.setEnabled(false);
        Listener vit = new Listener();
        cVit.addObserver(vit);
        vit.display(c.getBasevitality());
        incVit = new JButton(">");
        incVit.addActionListener((event) -> {increaseChar1Vit();cVit.changeData(c.getBasevitality());mVit.changeData(c.getVitality());hT.changeData(c.getTotalHealth());hR.changeData(c.getHealthRegen());aR.changeData(c.getArmor());mD.changeData(c.getMagicDefense());update.changeData(100 - c.getBasestrength() - c.getBaseagility() - c.getBasedexterity() - c.getBaseendurance() - c.getBaseintelligence() - c.getBasewisdom() - c.getBaseperception() - c.getBasecharisma() - c.getBaseluck() - c.getBasevitality());check();
            });
        baseVit.add(decVit);
        baseVit.add(vit);
        baseVit.add(incVit);

        JLabel mod = new JLabel("Modifier");
        Listener modStr = new Listener();
        modStr.display(c.getmodStr());
        mdStr.addObserver(modStr);

        Listener modAgi = new Listener();
        modAgi.display(c.getmodAgi());
        mdAgi.addObserver(modAgi);

        Listener modDex = new Listener();
        modDex.display(c.getmodDex());
        mdDex.addObserver(modDex);

        Listener modEnd = new Listener();
        modEnd.display(c.getmodEnd());
        mdEnd.addObserver(modEnd);

        Listener modInt = new Listener();
        modInt.display(c.getmodInt());
        mdInt.addObserver(modInt);

        Listener modWis = new Listener();
        modWis.display(c.getmodWis());
        mdWis.addObserver(modWis);

        Listener modPer = new Listener();
        modPer.display(c.getmodPer());
        mdPer.addObserver(modPer);

        Listener modCha = new Listener();
        modCha.display(c.getmodCha());
        mdCha.addObserver(modCha);

        Listener modLuc = new Listener();
        modLuc.display(c.getmodLuc());
        mdLuc.addObserver(modLuc);

        Listener modVit = new Listener();
        modVit.display(c.getmodVit());
        mdVit.addObserver(modVit);

        JLabel finalAtt = new JLabel("Final");

        Listener finalStr = new Listener();
        finalStr.display(c.getStrength());
        mStr.addObserver(finalStr);

        Listener finalAgi = new Listener();
        finalAgi.display(c.getAgility());
        mAgi.addObserver(finalAgi);

        Listener finalDex = new Listener();
        finalDex.display(c.getDexterity());
        mDex.addObserver(finalDex);

        Listener finalEnd = new Listener();
        finalEnd.display(c.getEndurance());
        mEnd.addObserver(finalEnd);

        Listener finalInt = new Listener();
        finalInt.display(c.getIntelligence());
        mInt.addObserver(finalInt);

        Listener finalWis = new Listener();
        finalWis.display(c.getWisdom());
        mWis.addObserver(finalWis);

        Listener finalPer = new Listener();
        finalPer.display(c.getPerception());
        mPer.addObserver(finalPer);

        Listener finalCha = new Listener();
        finalCha.display(c.getCharisma());
        mCha.addObserver(finalCha);

        Listener finalLuc = new Listener();
        finalLuc.display(c.getLuck());
        mLuc.addObserver(finalLuc);

        Listener finalVit = new Listener();
        finalVit.display(c.getVitality());
        mVit.addObserver(finalVit);

        displayAttributes.add(attribute);
        displayAttributes.add(base);
        displayAttributes.add(mod);
        displayAttributes.add(finalAtt);

        displayAttributes.add(strength);
        displayAttributes.add(baseStr);
        displayAttributes.add(modStr);
        displayAttributes.add(finalStr);

        displayAttributes.add(agility);
        displayAttributes.add(baseAgi);
        displayAttributes.add(modAgi);
        displayAttributes.add(finalAgi);

        displayAttributes.add(dexterity);
        displayAttributes.add(baseDex);
        displayAttributes.add(modDex);
        displayAttributes.add(finalDex);

        displayAttributes.add(endurance);
        displayAttributes.add(baseEnd);
        displayAttributes.add(modEnd);
        displayAttributes.add(finalEnd);

        displayAttributes.add(intelligence);
        displayAttributes.add(baseInt);
        displayAttributes.add(modInt);
        displayAttributes.add(finalInt);

        displayAttributes.add(wisdom);
        displayAttributes.add(baseWis);
        displayAttributes.add(modWis);
        displayAttributes.add(finalWis);

        displayAttributes.add(perception);
        displayAttributes.add(basePer);
        displayAttributes.add(modPer);
        displayAttributes.add(finalPer);

        displayAttributes.add(charisma);
        displayAttributes.add(baseCha);
        displayAttributes.add(modCha);
        displayAttributes.add(finalCha);

        displayAttributes.add(luck);
        displayAttributes.add(baseLuc);
        displayAttributes.add(modLuc);
        displayAttributes.add(finalLuc);

        displayAttributes.add(vitality);
        displayAttributes.add(baseVit);
        displayAttributes.add(modVit);
        displayAttributes.add(finalVit);

        charAttributes.add(displayAttributes, BorderLayout.CENTER);
    }

    private void decreaseChar1Str(){
        c.decStr();
    }

    private void decreaseChar1Agi(){
        c.decAgi();
    }

    private void decreaseChar1Dex(){
        c.decDex();
    }

    private void decreaseChar1End(){
        c.decEnd();
    }

    private void decreaseChar1Int(){
        c.decInt();

    }

    private void decreaseChar1Wis(){
        c.decWis();
    }

    private void decreaseChar1Per(){
        c.decPer();
    }

    private void decreaseChar1Cha(){
        c.decCha();
    }

    private void decreaseChar1Luc(){
        c.decLuc();
    }

    private void decreaseChar1Vit(){
        c.decVit();
    }

    private void increaseChar1Str(){
        c.incStr();
    }

    private void increaseChar1Agi(){
        c.incAgi();

    }

    private void increaseChar1Dex(){
        c.incDex();
    }

    private void increaseChar1End(){
        c.incEnd();
    }

    private void increaseChar1Int(){
        c.incInt();
    }

    private void increaseChar1Wis(){
        c.incWis();
    }

    private void increaseChar1Per(){
        c.incPer();
    }

    private void increaseChar1Cha(){
        c.incCha();
    }

    private void increaseChar1Luc(){
        c.incLuc();
    }

    private void increaseChar1Vit(){
        c.incVit();
    }

    private void check(){
        if(remaining.getRemaining() <= 0){
            incStr.setEnabled(false);
            incAgi.setEnabled(false);
            incDex.setEnabled(false);
            incEnd.setEnabled(false);
            incInt.setEnabled(false);
            incWis.setEnabled(false);
            incPer.setEnabled(false);
            incCha.setEnabled(false);
            incLuc.setEnabled(false);
            incVit.setEnabled(false);
        }else{
            incStr.setEnabled(true);
            incAgi.setEnabled(true);
            incDex.setEnabled(true);
            incEnd.setEnabled(true);
            incInt.setEnabled(true);
            incWis.setEnabled(true);
            incPer.setEnabled(true);
            incCha.setEnabled(true);
            incLuc.setEnabled(true);
            incVit.setEnabled(true);
        }
        if(c.getBasestrength() == 8){
            decStr.setEnabled(false);
        }else{
            decStr.setEnabled(true);
        }
        if(c.getBaseagility() == 8){
            decAgi.setEnabled(false);
        }else{
            decAgi.setEnabled(true);
        }
        if(c.getBasedexterity() == 8){
            decDex.setEnabled(false);
        }else{
            decDex.setEnabled(true);
        }
        if(c.getBaseendurance() == 8){
            decEnd.setEnabled(false);
        }else{
            decEnd.setEnabled(true);
        }
        if(c.getBaseintelligence() == 8){
            decInt.setEnabled(false);
        }else{
            decInt.setEnabled(true);
        }
        if(c.getBasewisdom() == 8){
            decWis.setEnabled(false);
        }else{
            decWis.setEnabled(true);
        }
        if(c.getBaseperception() == 8){
            decPer.setEnabled(false);
        }else{
            decPer.setEnabled(true);
        }
        if(c.getBasecharisma() == 8){
            decCha.setEnabled(false);
        }else{
            decCha.setEnabled(true);
        }
        if(c.getBaseluck() == 8){
            decLuc.setEnabled(false);
        }else{
            decLuc.setEnabled(true);
        }
        if(c.getBasevitality() == 8){
            decVit.setEnabled(false);
        }else{
            decVit.setEnabled(true);
        }
    }

    public JPanel getAttPanel(){
        return charAttributes;
    }
}
