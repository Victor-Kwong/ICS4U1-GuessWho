import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI extends JFrame implements ActionListener {
    // -=- Constant Colour Values
    static private final Color backgroundColour = new Color(25, 25, 30);
    static private final Color buttonColour = new Color(100, 100, 130);
    static private final Color textColour = new Color(230, 230, 250);

    // -=-  Component Initializations  -=-
    static private JPanel mainPanel = new JPanel();
    static private JLabel title = new JLabel("Guess Who?");
    static private JLabel authors = new JLabel("By: Moxin Guo, Victor Kwong, & Victoria Wong");
    static private JPanel buttonsPanel = new JPanel();

    static private JButton playButton;
    static private JButton mainMenuButton;
    static private JButton humanVsComputerButton;
    static private JButton gameModesButton;
    static private JButton normalDifficultyButton;
    static private JButton nightmareDifficultyButton;


    // -=-  GuiFrame Constructor  -=-
    public GUI() {
        // GUI frame settings
        setTitle("Guess Who? (By: Moxin Guo, Victor Kwong, & Victoria Wong)");
        setSize(1280, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel (vertical axis)
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
            mainPanel.setBackground(backgroundColour);
        add(mainPanel);

        // Padding above title
        mainPanel.add(Box.createVerticalStrut(20));

        // Title label
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(new Font("Monospaced", Font.BOLD, 50));
        title.setForeground(textColour);
        mainPanel.add(title);

        // Authors label
        authors.setAlignmentX(Component.CENTER_ALIGNMENT);
        authors.setFont(new Font("Monospaced", Font.ITALIC, 20));
        authors.setForeground(textColour);
        mainPanel.add(authors);

        // Padding below title
        mainPanel.add(Box.createVerticalStrut(15));

        // Buttons Panel (Horizontal Axis)
        buttonsPanel.setLayout(new FlowLayout());
        buttonsPanel.setBackground(backgroundColour);
        buttonsPanel.setMaximumSize(new Dimension(1000, 60));
        mainPanel.add(buttonsPanel);

        // "Play" Button
        playButton = createButton(buttonsPanel, "Play");

        // Setting the visibility of everything to true
        setVisible(true);
    }


    // -=-  ACTION LISTENER  -=-
    /**
     * This method listens to any actions/events that were performed related to the GUI and performs the respective code.
     * 
     * @param event An action that was performed.
     */
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        switch (command) {
            case "Play": // Code that executues when the "Play" button is pressed.
                buttonsPanel.remove(playButton);

                mainMenuButton = createButton(buttonsPanel, "Main Menu");
                humanVsComputerButton = createButton(buttonsPanel, "Human VS Computer");

                buttonsPanel.revalidate();
                buttonsPanel.repaint();

                break;
            case "Main Menu": // Code that executes when the "Main Menu" button is pressed.
                buttonsPanel.remove(mainMenuButton);
                buttonsPanel.remove(humanVsComputerButton);

                buttonsPanel.add(playButton);
                
                buttonsPanel.revalidate();
                buttonsPanel.repaint();

                break;
            case "Human VS Computer": // Code that executes when the "Human VS Computer" button is pressed.
                buttonsPanel.remove(humanVsComputerButton);
                buttonsPanel.remove(mainMenuButton);

                gameModesButton = createButton(buttonsPanel, "Game Modes");
                normalDifficultyButton = createButton(buttonsPanel, "Normal Difficulty");
                nightmareDifficultyButton = createButton(buttonsPanel, "Nightmare Difficulty");

                buttonsPanel.revalidate();
                buttonsPanel.repaint();

                break;
            case "Game Modes": // Code that executes when the "Game Modes" button is pressed.
                buttonsPanel.remove(gameModesButton);
                buttonsPanel.remove(normalDifficultyButton);
                buttonsPanel.remove(nightmareDifficultyButton);

                buttonsPanel.add(mainMenuButton);
                buttonsPanel.add(humanVsComputerButton);

                buttonsPanel.revalidate();
                buttonsPanel.repaint();

                break;
        }
    }


    // -=-  AUXILIARY GUI METHODS  -=-
    /**
     * This method creates a button for the buttons panel.
     * 
     * @param panel, text A JPanel and a String that helps with knowing how to create the button.
     * @return void
     */
    public JButton createButton(JPanel panel, String text) {
        JButton button = new JButton(text);
        
        button.setFont(new Font("Monospaced", Font.BOLD, 25));
        button.setForeground(textColour);
        button.setBackground(buttonColour);
        button.setFocusPainted(false);
        button.addActionListener(this);
        panel.add(button);

        return button;
    }
}
