import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener.*;

public class SaveFrame{

    private JFrame frame;
    private JPanel contentPane;
    private String saveName;
    private CharacterCreator c;

    public SaveFrame(CharacterCreator c){
        this.c = c;
        frame = new JFrame();
        saveName = "";
        makeFrame();
        frame.pack();
        frame.setVisible(true);
    }

    public void makeFrame(){
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(2,1));
        JLabel save = new JLabel("Enter file name:");
        contentPane.add(save);

        JTextField nameInput = new JTextField(20);
        nameInput.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){assignName(nameInput.getText());}
            });
        contentPane.add(nameInput);
        frame.add(contentPane);
    }

    private void assignName(String name){
        c.setSave(name);
        frame.setVisible(false);
    }
}
