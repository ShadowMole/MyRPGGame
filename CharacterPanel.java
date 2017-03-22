import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener.*;
public class CharacterPanel implements java.io.Serializable
{
    private JPanel charPanel;
    private Character c;

    public CharacterPanel(Character c) {
        this.c = c;
        makeCharPanel();
    }

    private void makeCharPanel(){
        Speaker hT = new Speaker();
        Speaker hR = new Speaker();
        Speaker sT = new Speaker();
        Speaker sR = new Speaker();
        Speaker mT = new Speaker();
        Speaker mR = new Speaker();
        Speaker wD = new Speaker();
        Speaker aR = new Speaker();
        Speaker mV = new Speaker();
        Speaker wS = new Speaker();
        Speaker cC = new Speaker();
        Speaker bD = new Speaker();
        Speaker dC = new Speaker();
        Speaker pC = new Speaker();
        Speaker mP = new Speaker();
        Speaker cS = new Speaker();
        Speaker mD = new Speaker();
        Speaker mC = new Speaker();
        Speaker mS = new Speaker();
        Speaker mM = new Speaker();

        Speaker wT = new Speaker();
        Speaker w1 = new Speaker();
        Speaker w2 = new Speaker();
        Speaker hA = new Speaker();
        Speaker cA = new Speaker();
        Speaker aA = new Speaker();
        Speaker lA = new Speaker();
        Speaker fA = new Speaker();

        Speaker mStr = new Speaker();
        Speaker mAgi = new Speaker();
        Speaker mDex = new Speaker();
        Speaker mEnd = new Speaker();
        Speaker mInt = new Speaker();
        Speaker mWis = new Speaker();
        Speaker mPer = new Speaker();
        Speaker mCha = new Speaker();
        Speaker mLuc = new Speaker();
        Speaker mVit = new Speaker();
        Speaker mdStr = new Speaker();
        Speaker mdAgi = new Speaker();
        Speaker mdDex = new Speaker();
        Speaker mdEnd = new Speaker();
        Speaker mdInt = new Speaker();
        Speaker mdWis = new Speaker();
        Speaker mdPer = new Speaker();
        Speaker mdCha = new Speaker();
        Speaker mdLuc = new Speaker();
        Speaker mdVit = new Speaker();

        charPanel = new JPanel();
        JPanel top = new JPanel();
        top.setLayout(new GridLayout(1,2));
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(1,1));
        charPanel.setBorder(new EmptyBorder(12,12,12,12));
        charPanel.setLayout(new GridLayout(2,1));
        AttributePanel aP = new AttributePanel(c, hT, hR, sT, sR, mT, mR, wD, aR, mV, wS, cC, bD, dC, pC, mP, cS, mD, mC, mS, mM, mStr, mAgi, mDex, mEnd, mInt, mWis, mPer, mCha, mLuc, mVit, mdStr, mdAgi, mdDex, mdEnd, mdInt, mdWis, mdPer, mdCha, mdLuc, mdVit);
        StatPanel sP = new StatPanel(c, hT, hR, sT, sR, mT, mR, wD, aR, mV, wS, cC, bD, dC, pC, mP, cS, mD, mC, mS, mM, wT, w1, w2, hA, cA, aA, lA, fA);
        ChoicePanel cP = new ChoicePanel(c, hT, hR, sT, sR, mT, mR, wD, aR, mV, wS, cC, bD, dC, pC, mP, cS, mD, mC, mS, mM, mStr, mAgi, mDex, mEnd, mInt, mWis, mPer, mCha, mLuc, mVit, mdStr, mdAgi, mdDex, mdEnd, mdInt, mdWis, mdPer, mdCha, mdLuc, mdVit, wT, w1, w2, hA, cA, aA, lA, fA);
        top.add(aP.getAttPanel());
        top.add(cP.getChoicePanel());
        bottom.add(sP.getStatPanel());
        charPanel.add(top);
        charPanel.add(bottom);
    }

    public JPanel getCharPanel(){
        return charPanel;
    }
}
