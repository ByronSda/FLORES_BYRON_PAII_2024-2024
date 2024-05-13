package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dao.SubjectDAO;
import models.Subject;

public class Win_Subject extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtIdSave;
    private JTextField txtNameSubject;
    private JTextField txtDescription;
    private JTextField txtLevel;
    private JTextField txtIdSearch;
    private JTextField txtIdUpdate;
    private JTextField txtNameUpdate;
    private JTextField txtIdDelete;
    
    Color color1 = new Color(156/255f, 156/255f, 156/255f); // Pantalla
    Color color2 = new Color(1f, 1f, 0f); // Botones
    Color color3 = new Color(1f, 0f, 0f); // Botón de salida
    Color color4 = new Color(1f, 0f, 1f); //Cuadros

    SubjectDAO subjectDAO = new SubjectDAO();


    public Win_Subject() {
        super("Subject");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);

        setVisible(true);

        contentPane = new JPanel();
        contentPane.setBackground(color1);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblWelcome = new JLabel("Subject");
        lblWelcome.setFont(new Font("Arial", Font.ITALIC, 23));
        lblWelcome.setBounds(350, 10, 100, 20);
        lblWelcome.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblWelcome.setHorizontalAlignment(JLabel.CENTER);
        lblWelcome.setVerticalAlignment(JLabel.CENTER);
        contentPane.add(lblWelcome);
        
        // Panel de Información
        JPanel panelInformation = new JPanel();
        panelInformation.setBackground(color4);
        panelInformation.setBounds(10, 50, 250, 170);
        panelInformation.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelInformation.setLayout(null);
        contentPane.add(panelInformation);
        
        JLabel lblInformation = new JLabel("Information:");
        lblInformation.setFont(new Font("Arial", Font.BOLD, 16));
        lblInformation.setBounds(5, 5, 150, 20);
        panelInformation.add(lblInformation);

        JLabel lblIdSave = new JLabel("ID:");
        lblIdSave.setBounds(5, 30, 100, 20);
        panelInformation.add(lblIdSave);

        txtIdSave = new JTextField();
        txtIdSave.setColumns(10);
        txtIdSave.setBounds(110, 30, 100, 20);
        panelInformation.add(txtIdSave);

        JLabel lblNameSubject = new JLabel("Name subject:");
        lblNameSubject.setBounds(5, 60, 100, 20);
        panelInformation.add(lblNameSubject);

        txtNameSubject = new JTextField();
        txtNameSubject.setColumns(10);
        txtNameSubject.setBounds(110, 60, 100, 20);
        panelInformation.add(txtNameSubject);

        JLabel lblDescription = new JLabel("Description:");
        lblDescription.setBounds(5, 90, 100, 20);
        panelInformation.add(lblDescription);

        txtDescription = new JTextField();
        txtDescription.setColumns(10);
        txtDescription.setBounds(110, 90, 100, 20);
        panelInformation.add(txtDescription);

        JLabel lblLevel = new JLabel("Level:");
        lblLevel.setBounds(5, 120, 100, 20);
        panelInformation.add(lblLevel);

        txtLevel = new JTextField();
        txtLevel.setColumns(10);
        txtLevel.setBounds(110, 120, 100, 20);
        panelInformation.add(txtLevel);

        // Panel de Búsqueda
        JPanel panelSearch = new JPanel();
        panelSearch.setBackground(color4);
        panelSearch.setBounds(10, 250, 250, 80);
        panelSearch.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelSearch.setLayout(null);
        contentPane.add(panelSearch);

        JLabel lblSearch = new JLabel("Search:");
        lblSearch.setFont(new Font("Arial", Font.BOLD, 16)); 
        lblSearch.setBounds(5, 5, 150, 20);
        panelSearch.add(lblSearch);

        JLabel lblEnterIdSearch = new JLabel("ID to search:");
        lblEnterIdSearch.setBounds(5, 30, 100, 20);
        panelSearch.add(lblEnterIdSearch);

        txtIdSearch = new JTextField();
        txtIdSearch.setColumns(10);
        txtIdSearch.setBounds(110, 30, 100, 20);
        panelSearch.add(txtIdSearch);

        // Panel de Actualización
        JPanel panelUpdate = new JPanel();
        panelUpdate.setBackground(color4);
        panelUpdate.setBounds(10, 360, 250, 120);
        panelUpdate.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelUpdate.setLayout(null);
        contentPane.add(panelUpdate);

        JLabel lblUpdate = new JLabel("Update:");
        lblUpdate.setFont(new Font("Arial", Font.BOLD, 16)); 
        lblUpdate.setBounds(5, 5, 150, 20);
        panelUpdate.add(lblUpdate);

        JLabel lblEnterIdUpdate = new JLabel("ID to update:");
        lblEnterIdUpdate.setBounds(5, 30, 100, 20);
        panelUpdate.add(lblEnterIdUpdate);

        txtIdUpdate = new JTextField();
        txtIdUpdate.setColumns(10);
        txtIdUpdate.setBounds(110, 30, 100, 20);
        panelUpdate.add(txtIdUpdate);

        JLabel lblEnterNameUpdate = new JLabel("Name to update:");
        lblEnterNameUpdate.setBounds(5, 60, 150, 20);
        panelUpdate.add(lblEnterNameUpdate);

        txtNameUpdate = new JTextField();
        txtNameUpdate.setColumns(10);
        txtNameUpdate.setBounds(110, 60, 100, 20);
        panelUpdate.add(txtNameUpdate);

        // Panel de Eliminación
        JPanel panelDelete = new JPanel();
        panelDelete.setBackground(color4);
        panelDelete.setBounds(10, 510, 250, 80);
        panelDelete.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelDelete.setLayout(null);
        contentPane.add(panelDelete);

        JLabel lblDelete = new JLabel("Delete:");
        lblDelete.setFont(new Font("Arial", Font.BOLD, 16));
        lblDelete.setBounds(5, 5, 150, 20);
        panelDelete.add(lblDelete);

        JLabel lblEnterIdDelete = new JLabel("ID to delete:");
        lblEnterIdDelete.setBounds(5, 30, 100, 20);
        panelDelete.add(lblEnterIdDelete);

        txtIdDelete = new JTextField();
        txtIdDelete.setColumns(10);
        txtIdDelete.setBounds(110, 30, 100, 20);
        panelDelete.add(txtIdDelete);

        // Botones
        JButton btnSave = new JButton("Save");
        btnSave.setBounds(350, 120, 120, 40); 
        btnSave.setBackground(color2);
        btnSave.setBorder(BorderFactory.createRaisedBevelBorder());
        contentPane.add(btnSave);

        JButton btnSearch = new JButton("Search");
        btnSearch.setBounds(350, 270, 120, 40); 
        btnSearch.setBackground(color2);
        btnSearch.setBorder(BorderFactory.createRaisedBevelBorder());
        contentPane.add(btnSearch);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.setBounds(350, 400, 120, 40); 
        btnUpdate.setBackground(color2);
        btnUpdate.setBorder(BorderFactory.createRaisedBevelBorder());
        contentPane.add(btnUpdate);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(350, 530, 120, 40); 
        btnDelete.setBackground(color2);
        btnDelete.setBorder(BorderFactory.createRaisedBevelBorder());
        contentPane.add(btnDelete);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(350, 700, 100, 40); 
        btnBack.setBackground(color3);
        btnBack.setBorder(BorderFactory.createRaisedBevelBorder());
        contentPane.add(btnBack);

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(txtIdSave.getText());
                String nameSubject = txtNameSubject.getText();
                String description = txtDescription.getText();
                String level = txtLevel.getText();
                Subject subject = new Subject(id, nameSubject, description, level);
                subjectDAO.create(subject);
            }
        });

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(txtIdSearch.getText());
                Subject subject = subjectDAO.read(id);
                if (subject != null) {
                    txtNameSubject.setText(subject.getNameSubject());
                    txtDescription.setText(subject.getDescription());
                    txtLevel.setText(subject.getLevel());
                } else {
                    // Handle case where subject is not found
                    // For example, show a message dialog
                    System.out.println("Subject not found!");
                }
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(txtIdUpdate.getText());
                String nameSubject = txtNameUpdate.getText();
                Subject subject = new Subject(id, nameSubject, "", ""); // Empty strings for unused fields
                subjectDAO.update(subject);
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(txtIdDelete.getText());
                subjectDAO.delete(id);
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Win_Subject.this.dispose();
                Manager menu = new Manager();
            }
        });
    }
}
