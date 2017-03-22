import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener.*;
import java.io.*;

public class CharacterCreator  implements java.io.Serializable{
    private JFrame frame;
    private Team team;
    private CharacterPanel char1DisplayPanel;
    private CharacterPanel char2DisplayPanel;
    private CharacterPanel char3DisplayPanel;
    private CharacterPanel char4DisplayPanel;
    private JPanel contentPane;
    private JLabel character;
    private JPanel currentCharacter;
    private String saveName;
    public CharacterCreator(Team team){
        this.team = team;
        saveName = "";
        char1DisplayPanel = new CharacterPanel(team.getTeam().get(0));
        char2DisplayPanel = new CharacterPanel(team.getTeam().get(1));
        char3DisplayPanel = new CharacterPanel(team.getTeam().get(2));
        char4DisplayPanel = new CharacterPanel(team.getTeam().get(3));
        makeFrame();
    }

    public void actionPerformed(ActionEvent event){
        System.out.println("Menu item: " + event.getActionCommand());
    }

    private void makeFrame(){
        frame = new JFrame("Character Creator");
        makeMenuBar(frame);
        contentPane = (JPanel) frame.getContentPane();
        contentPane.setBorder(new EmptyBorder(12,12,12,12));
        contentPane.setLayout(new BorderLayout(6,6));
        makeCharacterMenu();
        makeCharacterDisplay();
        frame.pack();
        frame.setVisible(true);
    }

    private void makeMenuBar(JFrame frame){
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);

        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);

        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){quit();}
            });
        fileMenu.add(quitItem);
    }

    private void makeCharacterMenu(){
        JPanel characterPanel = new JPanel();
        characterPanel.setLayout(new GridLayout(5,1));

        JButton char1 = new JButton("Character 1");
        char1.addActionListener((event) -> displayChar1());
        characterPanel.add(char1);

        JButton char2 = new JButton("Character 2");
        char2.addActionListener((event) -> displayChar2());
        characterPanel.add(char2);

        JButton char3 = new JButton("Character 3");
        char3.addActionListener((event) -> displayChar3());
        characterPanel.add(char3);

        JButton char4 = new JButton("Character 4");
        char4.addActionListener((event) -> displayChar4());
        characterPanel.add(char4);

        JButton complete = new JButton("Complete");
        complete.addActionListener((event) -> complete());
        characterPanel.add(complete);

        contentPane.add(characterPanel, BorderLayout.WEST);
    }

    private void makeCharacterDisplay(){
        character = new JLabel("Character 1");
        contentPane.add(character, BorderLayout.NORTH);
        currentCharacter = char1DisplayPanel.getCharPanel();
        contentPane.add(currentCharacter, BorderLayout.CENTER);
    }

    private void displayChar1(){
        character.setText("Character 1");
        contentPane.remove(currentCharacter);
        currentCharacter = char1DisplayPanel.getCharPanel();
        contentPane.add(currentCharacter, BorderLayout.CENTER);
        contentPane.revalidate();
        contentPane.repaint();
        frame.pack();
    }

    private void displayChar2(){
        character.setText("Character 2");
        contentPane.remove(currentCharacter);
        currentCharacter = char2DisplayPanel.getCharPanel();
        contentPane.add(currentCharacter, BorderLayout.CENTER);
        contentPane.revalidate();
        contentPane.repaint();
        frame.pack();
    }

    private void displayChar3(){
        character.setText("Character 3");
        contentPane.remove(currentCharacter);
        currentCharacter = char3DisplayPanel.getCharPanel();
        contentPane.add(currentCharacter, BorderLayout.CENTER);
        contentPane.revalidate();
        contentPane.repaint();
        frame.pack();
    }

    private void displayChar4(){
        character.setText("Character 4");
        contentPane.remove(currentCharacter);
        currentCharacter = char4DisplayPanel.getCharPanel();
        contentPane.add(currentCharacter, BorderLayout.CENTER);
        contentPane.revalidate();
        contentPane.repaint();
        frame.pack();
    }

    private void quit(){
        System.exit(0);
    }

    public void setSave(String name){
        saveName = name;
        String newSave = saveName + ".dat";
        try {
            FileOutputStream fileOut =
                new FileOutputStream(newSave);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(team);
            out.close();
            fileOut.close();
        }catch(IOException i) {
            i.printStackTrace();
        }
    }

    private void complete(){
        SaveFrame save = new SaveFrame(this);
    }
}
