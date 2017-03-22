import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener.*;

public class StatPanel{
    private JPanel charStats;
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

    public StatPanel(Character c, Speaker hT,Speaker hR,Speaker sT,Speaker sR,Speaker mT,Speaker mR,Speaker wD,Speaker aR,Speaker mV,Speaker wS,Speaker cC,Speaker bD,Speaker dC,Speaker pC,Speaker mP,Speaker cS,Speaker mD,Speaker mC,Speaker mS,Speaker mM, Speaker wT,Speaker w1,Speaker w2,Speaker hA,Speaker cA,Speaker aA,Speaker lA,Speaker fA){
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

    public void makeDisplay(){
        charStats = new JPanel();
        charStats.setLayout(new BorderLayout());
        JLabel stats = new JLabel("Character Stats");
        charStats.add(stats, BorderLayout.NORTH);

        JPanel displayStats = new JPanel();
        displayStats.setLayout(new GridLayout(7,8));

        JLabel tHealth = new JLabel("Total Health:");
        Listener totalH = new Listener();
        hT.addObserver(totalH);
        totalH.display(c.getTotalHealth());
        displayStats.add(tHealth);
        displayStats.add(totalH);

        JLabel tStamina = new JLabel("Total Stamina:");
        Listener totalS = new Listener();
        sT.addObserver(totalS);
        totalS.display(c.getTotalStamina());
        displayStats.add(tStamina);
        displayStats.add(totalS);

        JLabel tMana = new JLabel("Total Mana:");
        Listener totalM = new Listener();
        mT.addObserver(totalM);
        totalM.display(c.getTotalMana());
        displayStats.add(tMana);
        displayStats.add(totalM);

        JLabel firstW = new JLabel("Main Weapon:");
        Listener mainW = new Listener();
        w1.addObserver(mainW);
        mainW.display(c.getWeapon1().getName());
        displayStats.add(firstW);
        displayStats.add(mainW);

        JLabel rHealth = new JLabel("Health Regen:");
        Listener regenH = new Listener();
        hR.addObserver(regenH);
        regenH.display(c.getHealthRegen());
        displayStats.add(rHealth);
        displayStats.add(regenH);

        JLabel rStamina = new JLabel("Stamina Regen:");
        Listener regenS = new Listener();
        sR.addObserver(regenS);
        regenS.display(c.getStaminaRegen());
        displayStats.add(rStamina);
        displayStats.add(regenS);

        JLabel rMana = new JLabel("Mana Regen:");
        Listener regenM = new Listener();
        mR.addObserver(regenM);
        regenM.display(c.getManaRegen());
        displayStats.add(rMana);
        displayStats.add(regenM);

        JLabel secondW = new JLabel("Off Weapon:");
        Listener offW = new Listener();
        w2.addObserver(offW);
        offW.display(c.getOffWeaponName());
        displayStats.add(secondW);
        displayStats.add(offW);

        JLabel style = new JLabel("Weapon Style:");
        Listener wStyle = new Listener();
        wT.addObserver(wStyle);
        wStyle.display(c.getStyle().getStyle());
        displayStats.add(style);
        displayStats.add(wStyle);

        JLabel damageW = new JLabel("Weapon Damage:");
        Listener weaponD = new Listener();
        wD.addObserver(weaponD);
        weaponD.display(c.getWeaponDamage());
        displayStats.add(damageW);
        displayStats.add(weaponD);

        JLabel aRating = new JLabel("Armor:");
        Listener rating = new Listener();
        aR.addObserver(rating);
        rating.display(c.getArmor());
        displayStats.add(aRating);
        displayStats.add(rating);

        JLabel armorH = new JLabel("Head Armor:");
        Listener headA = new Listener();
        hA.addObserver(headA);
        headA.display(c.getHead().getName());
        displayStats.add(armorH);
        displayStats.add(headA);

        JLabel moveS = new JLabel("Movement Speed:");
        Listener move = new Listener();
        mV.addObserver(move);
        move.display(c.getMoveSpeed());
        displayStats.add(moveS);
        displayStats.add(move);

        JLabel speedW = new JLabel("Weapon Speed:");
        Listener weaponS = new Listener();
        wS.addObserver(weaponS);
        weaponS.display(c.getWeaponSpeed());
        displayStats.add(speedW);
        displayStats.add(weaponS);

        JLabel crit = new JLabel("Critical Chance:");
        Listener cChance = new Listener();
        cC.addObserver(cChance);
        cChance.display(c.getCritChance());
        displayStats.add(crit);
        displayStats.add(cChance);

        JLabel armorC = new JLabel("Chest Armor:");
        Listener chestA = new Listener();
        cA.addObserver(chestA);
        chestA.display(c.getChest().getName());
        displayStats.add(armorC);
        displayStats.add(chestA);

        JLabel block = new JLabel("Block Defense:");
        Listener blockD = new Listener();
        bD.addObserver(blockD);
        blockD.display(c.getBlockDefense());
        displayStats.add(block);
        displayStats.add(blockD);

        JLabel dodge = new JLabel("Dodge Chance:");
        Listener dodgeC = new Listener();
        dC.addObserver(dodgeC);
        dodgeC.display(c.getDodgeChance());
        displayStats.add(dodge);
        displayStats.add(dodgeC);

        JLabel parry = new JLabel("Parry Chance:");
        Listener parryC = new Listener();
        pC.addObserver(parryC);
        parryC.display(c.getParryChance());
        displayStats.add(parry);
        displayStats.add(parryC);

        JLabel armorA = new JLabel("Arms Armor:");
        Listener armsA = new Listener();
        aA.addObserver(armsA);
        armsA.display(c.getArms().getName());
        displayStats.add(armorA);
        displayStats.add(armsA);

        JLabel magicP = new JLabel("Magic Power:");
        Listener pMagic = new Listener();
        mP.addObserver(pMagic);
        pMagic.display(c.getMagicPower());
        displayStats.add(magicP);
        displayStats.add(pMagic);

        JLabel castS = new JLabel("Cast Speed:");
        Listener sCast = new Listener();
        cS.addObserver(sCast);
        sCast.display(c.getCastSpeed());
        displayStats.add(castS);
        displayStats.add(sCast);

        JLabel magicD = new JLabel("Magic Defense:");
        Listener dMagic = new Listener();
        mD.addObserver(dMagic);
        dMagic.display(c.getMagicDefense());
        displayStats.add(magicD);
        displayStats.add(dMagic);

        JLabel armorL = new JLabel("Legs Armor:");
        Listener legsA = new Listener();
        lA.addObserver(legsA);
        legsA.display(c.getLegs().getName());
        displayStats.add(armorL);
        displayStats.add(legsA);

        JLabel magicC = new JLabel("Magic Control:");
        Listener cMagic = new Listener();
        mC.addObserver(cMagic);
        cMagic.display(c.getMagicControl());
        displayStats.add(magicC);
        displayStats.add(cMagic);

        JLabel magicS = new JLabel("Magic Support:");
        Listener sMagic = new Listener();
        mS.addObserver(sMagic);
        sMagic.display(c.getMagicSupport());
        displayStats.add(magicS);
        displayStats.add(sMagic);

        JLabel magicM = new JLabel("Magic Movement:");
        Listener mMagic = new Listener();
        mM.addObserver(mMagic);
        mMagic.display(c.getMagicMobility());
        displayStats.add(magicM);
        displayStats.add(mMagic);

        JLabel armorF = new JLabel("Feet Armor:");
        Listener feetA = new Listener();
        fA.addObserver(feetA);
        feetA.display(c.getFeet().getName());
        displayStats.add(armorF);
        displayStats.add(feetA);

        charStats.add(displayStats, BorderLayout.CENTER);
    }

    public JPanel getStatPanel(){
        return charStats;
    }
}
