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

import dao.ScheduleDAO;
import models.Schedule;

public class Win_Schedule extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIdSave;
	private JTextField txtIdStudent;
	private JTextField txtIdTeacher;
	private JTextField txtIdSubject;
	private JTextField txtStartTime;
	private JTextField txtEndTime;
	private JTextField txtDay;
	private JTextField txtIdSearch;
	private JTextField txtIdUpdate;
	private JTextField txtNameUpdate;
	private JTextField txtIdDelete;

	Color color1 = new Color(156 / 255f, 156 / 255f, 156 / 255f); // Pantalla
	Color color2 = new Color(1f, 1f, 0f); // Botones
	Color color3 = new Color(1f, 0f, 0f); // Botón de salida
	Color color4 = new Color(1f, 0f, 1f); // Cuadros

	ScheduleDAO scheduleDAO = new ScheduleDAO();

	public Win_Schedule() {
		super("Schedule");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		setLocationRelativeTo(null);

		setVisible(true);

		contentPane = new JPanel();
		contentPane.setBackground(color1);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblWelcome = new JLabel("Schedule");
		lblWelcome.setFont(new Font("Arial", Font.ITALIC, 23));
		lblWelcome.setBounds(350, 10, 100, 20);
		lblWelcome.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblWelcome.setHorizontalAlignment(JLabel.CENTER);
		lblWelcome.setVerticalAlignment(JLabel.CENTER);
		contentPane.add(lblWelcome);

		// Panel de Información
		JPanel panelInformation = new JPanel();
		panelInformation.setBackground(color4);
		panelInformation.setBounds(10, 50, 250, 250);
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

		JLabel lblIDStudent = new JLabel("ID Student:");
		lblIDStudent.setBounds(5, 60, 100, 20);
		panelInformation.add(lblIDStudent);

		txtIdStudent = new JTextField();
		txtIdStudent.setColumns(10);
		txtIdStudent.setBounds(110, 60, 100, 20);
		panelInformation.add(txtIdStudent);

		JLabel lblIDTeacher = new JLabel("ID Teacher:");
		lblIDTeacher.setBounds(5, 90, 100, 20);
		panelInformation.add(lblIDTeacher);

		txtIdTeacher = new JTextField();
		txtIdTeacher.setColumns(10);
		txtIdTeacher.setBounds(110, 90, 100, 20);
		panelInformation.add(txtIdTeacher);

		JLabel lblIDSubject = new JLabel("ID Subject:");
		lblIDSubject.setBounds(5, 120, 100, 20);
		panelInformation.add(lblIDSubject);

		txtIdSubject = new JTextField();
		txtIdSubject.setColumns(10);
		txtIdSubject.setBounds(110, 120, 100, 20);
		panelInformation.add(txtIdSubject);

		JLabel lblStartTime = new JLabel("Start Time:");
		lblStartTime.setBounds(5, 150, 100, 20);
		panelInformation.add(lblStartTime);

		txtStartTime = new JTextField();
		txtStartTime.setColumns(10);
		txtStartTime.setBounds(110, 150, 100, 20);
		panelInformation.add(txtStartTime);

		JLabel lblEndTime = new JLabel("End Time:");
		lblEndTime.setBounds(5, 180, 100, 20);
		panelInformation.add(lblEndTime);

		txtEndTime = new JTextField();
		txtEndTime.setColumns(10);
		txtEndTime.setBounds(110, 180, 100, 20);
		panelInformation.add(txtEndTime);

		JLabel lblDay = new JLabel("Day:");
		lblDay.setBounds(5, 210, 100, 20);
		panelInformation.add(lblDay);

		txtDay = new JTextField();
		txtDay.setColumns(10);
		txtDay.setBounds(110, 210, 100, 20);
		panelInformation.add(txtDay);

		// Panel de Búsqueda
		JPanel panelSearch = new JPanel();
		panelSearch.setBackground(color4);
		panelSearch.setBounds(10, 320, 250, 80);
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
		panelUpdate.setBounds(10, 420, 250, 120);
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
		panelDelete.setBounds(10, 560, 250, 80);
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
		btnSave.setBounds(350, 150, 120, 40);
		btnSave.setBackground(color2);
		btnSave.setBorder(BorderFactory.createRaisedBevelBorder());
		contentPane.add(btnSave);

		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(350, 340, 120, 40);
		btnSearch.setBackground(color2);
		btnSearch.setBorder(BorderFactory.createRaisedBevelBorder());
		contentPane.add(btnSearch);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(350, 460, 120, 40);
		btnUpdate.setBackground(color2);
		btnUpdate.setBorder(BorderFactory.createRaisedBevelBorder());
		contentPane.add(btnUpdate);

		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(350, 580, 120, 40);
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
				int idStudent = Integer.parseInt(txtIdStudent.getText());
				int idTeacher = Integer.parseInt(txtIdTeacher.getText());
				int idSubject = Integer.parseInt(txtIdSubject.getText());
				String startTime = txtStartTime.getText();
				String endTime = txtEndTime.getText();
				String day = txtDay.getText();
				Schedule schedule = new Schedule(id, idStudent, idTeacher, idSubject, startTime, endTime, day);
				scheduleDAO.create(schedule);
			}
		});

		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(txtIdSearch.getText());
				Schedule schedule = scheduleDAO.read(id);
				if (schedule != null) {
					// For example, show a message dialog
					System.out.println("Schedule found: " + schedule);
				} else {
					// For example, show a message dialog
					System.out.println("Schedule not found!");
				}
			}
		});

		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(txtIdUpdate.getText());
				String startTime = txtNameUpdate.getText();
				Schedule schedule = new Schedule(id, 0, 0, 0, startTime, "", ""); // Empty strings for unused fields
				scheduleDAO.update(schedule);
			}
		});

		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(txtIdDelete.getText());
				scheduleDAO.delete(id);
			}
		});

		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Win_Schedule.this.dispose();
				Manager manager = new Manager();
			}
		});
	}
}
