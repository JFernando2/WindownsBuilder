package teste1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 450, 450);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro Livros");
		lblNewLabel.setBounds(149, 11, 146, 61);
		lblNewLabel.setForeground(new Color(160, 82, 45));
		lblNewLabel.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, 39));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 94, 360, 269);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Gloucester MT Extra Condensed", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 17, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(51, 17, 130, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("G\u00EAnero:");
		lblNewLabel_2.setFont(new Font("Gloucester MT Extra Condensed", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 44, 46, 30);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Aventura", "Romance", "Suspense", "Religioso", "Fic\u00E7\u00E3o Cient\u00EDfica ", "Infantil"}));
		comboBox.setBounds(61, 52, 92, 20);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Autor (a):");
		lblNewLabel_3.setFont(new Font("Gloucester MT Extra Condensed", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(10, 85, 57, 20);
		panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(71, 83, 110, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Editora:");
		lblNewLabel_4.setFont(new Font("Gloucester MT Extra Condensed", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(10, 116, 75, 20);
		panel.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(81, 114, 100, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Quantidade:");
		lblNewLabel_5.setFont(new Font("Gloucester MT Extra Condensed", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(10, 147, 75, 20);
		panel.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(80, 147, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(51, 239, 102, 30);
		panel.add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(193, 239, 102, 30);
		panel.add(btnVoltar);
		
		JLabel lblNewLabel_6 = new JLabel("Pre\u00E7o:");
		lblNewLabel_6.setFont(new Font("Gloucester MT Extra Condensed", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(10, 178, 75, 20);
		panel.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(51, 178, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
	}
}
