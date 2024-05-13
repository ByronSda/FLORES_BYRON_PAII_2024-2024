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

public class Manager extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Color color1 = new Color(156 / 255f, 156 / 255f, 156 / 255f); // Pantalla
	Color color2 = new Color(1f, 1f, 0f); // Botones
	Color color3 = new Color(1f, 0f, 0f); // Botón de salida

	public Manager() {
		super("Panel");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		setLocationRelativeTo(null);

		setVisible(true);

		contentPane = new JPanel();
		contentPane.setBackground(color1);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Registro
		JLabel lblWelcome = new JLabel("Register");
		lblWelcome.setFont(new Font("Arial", Font.ITALIC, 23));
		lblWelcome.setBounds(250, 50, 300, 50);
		lblWelcome.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblWelcome.setHorizontalAlignment(JLabel.CENTER);
		lblWelcome.setVerticalAlignment(JLabel.CENTER);
		contentPane.add(lblWelcome);

		// Botón para Estudiante
		JButton btnStudent = new JButton("Student");
		btnStudent.setFont(new Font("Arial", Font.PLAIN, 18));
		btnStudent.setBounds(50, 150, 300, 70);
		btnStudent.setBackground(color2);
		btnStudent.setBorder(BorderFactory.createRaisedBevelBorder());
		contentPane.add(btnStudent);

		btnStudent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Manager.this.dispose();
				Win_Student studentFrame = new Win_Student();
				studentFrame.setVisible(true);
			}
		});

		// Botón para Profesor
		JButton btnTeacher = new JButton("Teacher");
		btnTeacher.setFont(new Font("Arial", Font.PLAIN, 18));
		btnTeacher.setBounds(50, 250, 300, 70);
		btnTeacher.setBackground(color2);
		btnTeacher.setBorder(BorderFactory.createRaisedBevelBorder());
		contentPane.add(btnTeacher);

		btnTeacher.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Manager.this.dispose();
				Win_Teacher teacherFrame = new Win_Teacher();
				teacherFrame.setVisible(true);
			}
		});

		// Botón para Asignatura
		JButton btnSubject = new JButton("Subject");
		btnSubject.setFont(new Font("Arial", Font.PLAIN, 18));
		btnSubject.setBounds(50, 350, 300, 70);
		btnSubject.setBackground(color2);
		btnSubject.setBorder(BorderFactory.createRaisedBevelBorder());
		contentPane.add(btnSubject);

		btnSubject.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Manager.this.dispose();
				Win_Subject subjectFrame = new Win_Subject();
				subjectFrame.setVisible(true);
			}
		});

		// Botón para Horario
		JButton btnSchedule = new JButton("Schedule");
		btnSchedule.setFont(new Font("Arial", Font.PLAIN, 18));
		btnSchedule.setBounds(50, 450, 300, 70);
		btnSchedule.setBorder(BorderFactory.createRaisedBevelBorder());
		contentPane.add(btnSchedule);

		btnSchedule.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Manager.this.dispose();
				Win_Schedule scheduleFrame = new Win_Schedule();
				scheduleFrame.setVisible(true);
			}
		});

		// Botón para Salir
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Arial", Font.PLAIN, 18));
		btnExit.setBounds(250, 650, 200, 50);
		btnExit.setBackground(color3);
		btnExit.setBorder(BorderFactory.createRaisedBevelBorder());
		contentPane.add(btnExit);

		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Manager.this.dispose();
			}
		});

		setLocationRelativeTo(null);

	}

}
