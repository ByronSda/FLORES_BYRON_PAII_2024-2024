
import javax.swing.*;

import controller.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private JFrame frame;
    private JPanel mainPanel;

    private JComboBox<String> selectEntityComboBox;
    private JButton selectButton;

    private JTextField idField;
    private JTextField nameField;
    private JTextField lastnameField;
    private JTextField ageField;
    private JButton createButton;
    private JButton readButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton backButton;
    private JButton exitButton;

    private Container appContainer;

    public GUI() {
        frame = new JFrame("Simple CRUD Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        mainPanel = new JPanel();
        frame.add(mainPanel);
        initializeMainPanel();

        appContainer = new Container();

        frame.setVisible(true);
    }

    private void initializeMainPanel() {
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        selectEntityComboBox = new JComboBox<>(new String[]{"Student", "Teacher", "Subject", "Schedule"});
        mainPanel.add(selectEntityComboBox);

        selectButton = new JButton("Select");
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedEntity = (String) selectEntityComboBox.getSelectedItem();
                showEntityPanel(selectedEntity);
            }
        });
        mainPanel.add(selectButton);
    }

    private void showEntityPanel(String entity) {
        mainPanel.removeAll();

        JPanel entityPanel = new JPanel();
        entityPanel.setLayout(new BoxLayout(entityPanel, BoxLayout.Y_AXIS));

        idField = new JTextField(10);
        entityPanel.add(new JLabel("ID:"));
        entityPanel.add(idField);

        nameField = new JTextField(10);
        entityPanel.add(new JLabel("Name:"));
        entityPanel.add(nameField);

        lastnameField = new JTextField(10);
        entityPanel.add(new JLabel("Lastname:"));
        entityPanel.add(lastnameField);

        ageField = new JTextField(10);
        entityPanel.add(new JLabel("Age:"));
        entityPanel.add(ageField);

        createButton = new JButton("Create");
        readButton = new JButton("Read");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement create method based on the selected entity
            }
        });
        readButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement read method based on the selected entity
            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement update method based on the selected entity
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement delete method based on the selected entity
            }
        });

        entityPanel.add(createButton);
        entityPanel.add(readButton);
        entityPanel.add(updateButton);
        entityPanel.add(deleteButton);

        backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                initializeMainPanel();
                frame.revalidate();
                frame.repaint();
            }
        });
        entityPanel.add(backButton);

        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        entityPanel.add(exitButton);

        mainPanel.add(entityPanel);
        frame.revalidate();
        frame.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI();
            }
        });
    }
}

