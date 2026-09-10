import java.awt.*;
import java.awt.event.*;

// Main class - Frame ko extend karke banayi gayi hai
public class AWTAllDemo extends Frame implements ActionListener, ItemListener,
        TextListener, AdjustmentListener, MouseListener, KeyListener, FocusListener {

    // Components declare kiye
    Label nameLabel, outputLabel;
    TextField nameField;
    Button submitButton, clearButton;
    TextArea commentsArea;
    Checkbox agreeCheckbox, readingCheckbox, sportsCheckbox;
    CheckboxGroup genderGroup;
    Checkbox maleRadio, femaleRadio;
    Choice countryChoice;
    List itemList;
    Scrollbar scrollbar;
    Canvas drawingCanvas;
    Panel mainPanel, topPanel, centerPanel, bottomPanel, canvasPanel;
    Dialog aboutDialog;

    // Constructor
    public AWTAllDemo() {
        // Frame ka title aur size set kiya
        setTitle("AWT Components and Events Demo");
        setSize(700, 600);
        setLayout(new BorderLayout());

        // Menu bar create kiya
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem exitItem = new MenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        Menu helpMenu = new Menu("Help");
        MenuItem aboutItem = new MenuItem("About");
        helpMenu.add(aboutItem);
        menuBar.add(helpMenu);
        setMenuBar(menuBar);

        // Menu items ke events
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        exitItem.addActionListener(e -> System.exit(0)); // Exit directly
        aboutItem.addActionListener(e -> showAboutDialog());

        // Top panel - Label, TextField, Button
        topPanel = new Panel(new FlowLayout());
        nameLabel = new Label("Naam:");
        nameField = new TextField(20);
        submitButton = new Button("Submit");
        clearButton = new Button("Clear");

        topPanel.add(nameLabel);
        topPanel.add(nameField);
        topPanel.add(submitButton);
        topPanel.add(clearButton);

        // Center panel - Checkboxes, Radio buttons, Choice, List, TextArea
        centerPanel = new Panel(new GridLayout(3, 2, 10, 10));

        // Checkbox group (gender radio buttons)
        Panel genderPanel = new Panel(new FlowLayout());
        genderGroup = new CheckboxGroup();
        maleRadio = new Checkbox("Male", genderGroup, false);
        femaleRadio = new Checkbox("Female", genderGroup, false);
        genderPanel.add(new Label("Gender:"));
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);

        // Simple checkboxes
        Panel hobbyPanel = new Panel(new FlowLayout());
        readingCheckbox = new Checkbox("Reading");
        sportsCheckbox = new Checkbox("Sports");
        agreeCheckbox = new Checkbox("I agree to terms");
        hobbyPanel.add(new Label("Hobbies:"));
        hobbyPanel.add(readingCheckbox);
        hobbyPanel.add(sportsCheckbox);
        hobbyPanel.add(agreeCheckbox);

        // Choice (dropdown)
        Panel choicePanel = new Panel(new FlowLayout());
        choicePanel.add(new Label("Country:"));
        countryChoice = new Choice();
        countryChoice.add("India");
        countryChoice.add("USA");
        countryChoice.add("UK");
        countryChoice.add("Canada");
        choicePanel.add(countryChoice);

        // List
        Panel listPanel = new Panel(new FlowLayout());
        listPanel.add(new Label("Select Items:"));
        itemList = new List(3, true); // 3 rows, multiple selection
        itemList.add("Item 1");
        itemList.add("Item 2");
        itemList.add("Item 3");
        itemList.add("Item 4");
        listPanel.add(itemList);

        // TextArea
        commentsArea = new TextArea(5, 30);
        commentsArea.setText("Yahan comments likhein...");

        // Scrollbar
        scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 100);

        // Components ko center panel mein add kiya
        centerPanel.add(genderPanel);
        centerPanel.add(hobbyPanel);
        centerPanel.add(choicePanel);
        centerPanel.add(listPanel);
        centerPanel.add(commentsArea);
        centerPanel.add(scrollbar);

        // Bottom panel - Canvas (drawing area)
        bottomPanel = new Panel(new BorderLayout());
        drawingCanvas = new Canvas();
        drawingCanvas.setBackground(Color.LIGHT_GRAY);
        drawingCanvas.setSize(200, 150);
        bottomPanel.add(new Label("Canvas area (mouse draw karein):"), BorderLayout.NORTH);
        bottomPanel.add(drawingCanvas, BorderLayout.CENTER);

        // Output label
        outputLabel = new Label("Events yahan dikhenge...");
        outputLabel.setAlignment(Label.CENTER);
        outputLabel.setBackground(Color.YELLOW);

        // Panels ko frame mein add kiya
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        add(outputLabel, BorderLayout.EAST); // East side par output label

        // Events register kiye
        submitButton.addActionListener(this);
        clearButton.addActionListener(this);
        nameField.addActionListener(this); // Enter press par
        nameField.addTextListener(this);
        nameField.addKeyListener(this);
        nameField.addFocusListener(this);

        maleRadio.addItemListener(this);
        femaleRadio.addItemListener(this);
        readingCheckbox.addItemListener(this);
        sportsCheckbox.addItemListener(this);
        agreeCheckbox.addItemListener(this);

        countryChoice.addItemListener(this);
        itemList.addItemListener(this);
        itemList.addActionListener(this); // Double click par
        scrollbar.addAdjustmentListener(this);

        drawingCanvas.addMouseListener(this);
        drawingCanvas.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                outputLabel.setText("Mouse dragged at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Window closing event - Frame band karne par program exit
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

    // About dialog show karne ka method
    private void showAboutDialog() {
        aboutDialog = new Dialog(this, "About", true);
        aboutDialog.setLayout(new FlowLayout());
        aboutDialog.add(new Label("AWT Demo Program"));
        aboutDialog.add(new Label("Version 1.0"));
        Button okButton = new Button("OK");
        okButton.addActionListener(e -> aboutDialog.setVisible(false));
        aboutDialog.add(okButton);
        aboutDialog.setSize(250, 150);
        aboutDialog.setVisible(true);
    }

    // ActionListener - Buttons, TextField (Enter), List double-click, MenuItem
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == submitButton) {
            outputLabel.setText("Submit button dabaya, Naam: " + nameField.getText());
        } else if (source == clearButton) {
            nameField.setText("");
            commentsArea.setText("");
            outputLabel.setText("Fields clear kar diye");
        } else if (source == nameField) {
            outputLabel.setText("TextField mein Enter press hua: " + nameField.getText());
        } else if (source == itemList) {
            outputLabel.setText("List item double-click: " + itemList.getSelectedItem());
        } else if (e.getActionCommand().equals("New")) {
            outputLabel.setText("New menu item selected");
        } else if (e.getActionCommand().equals("Open")) {
            outputLabel.setText("Open menu item selected");
        }
    }

    // ItemListener - Checkboxes, Radio buttons, Choice, List selection
    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getItemSelectable();
        if (source == maleRadio) {
            outputLabel.setText("Male selected: " + e.getStateChange());
        } else if (source == femaleRadio) {
            outputLabel.setText("Female selected: " + e.getStateChange());
        } else if (source == readingCheckbox) {
            outputLabel.setText("Reading checkbox: " + (readingCheckbox.getState() ? "checked" : "unchecked"));
        } else if (source == sportsCheckbox) {
            outputLabel.setText("Sports checkbox: " + (sportsCheckbox.getState() ? "checked" : "unchecked"));
        } else if (source == agreeCheckbox) {
            outputLabel.setText("Agree checkbox: " + (agreeCheckbox.getState() ? "checked" : "unchecked"));
        } else if (source == countryChoice) {
            outputLabel.setText("Country selected: " + countryChoice.getSelectedItem());
        } else if (source == itemList) {
            outputLabel.setText("List selection: " + itemList.getSelectedItem());
        }
    }

    // TextListener - TextField ya TextArea ke text change par
    @Override
    public void textValueChanged(TextEvent e) {
        if (e.getSource() == nameField) {
            outputLabel.setText("Text changed: " + nameField.getText());
        }
    }

    // AdjustmentListener - Scrollbar movement par
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        outputLabel.setText("Scrollbar value: " + e.getValue());
    }

    // MouseListener - Canvas par mouse events
    @Override
    public void mouseClicked(MouseEvent e) {
        outputLabel.setText("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        outputLabel.setText("Mouse pressed at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        outputLabel.setText("Mouse released at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        outputLabel.setText("Mouse entered canvas");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        outputLabel.setText("Mouse exited canvas");
    }

    // KeyListener - TextField par key events
    @Override
    public void keyTyped(KeyEvent e) {
        outputLabel.setText("Key typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        outputLabel.setText("Key pressed: " + e.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        outputLabel.setText("Key released: " + e.getKeyText(e.getKeyCode()));
    }

    // FocusListener - TextField focus gain/loss
    @Override
    public void focusGained(FocusEvent e) {
        outputLabel.setText("TextField focus gained");
    }

    @Override
    public void focusLost(FocusEvent e) {
        outputLabel.setText("TextField focus lost");
    }

    // Main method - program start
    public static void main(String[] args) {
        AWTAllDemo demo = new AWTAllDemo();
        demo.setVisible(true);
    }
}