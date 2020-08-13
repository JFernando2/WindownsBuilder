package teste1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;

public class TelaUsuario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdmin frame = new TelaAdmin();
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
	public TelaUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Livrarias Tarso");
		lblNewLabel.setForeground(new Color(160, 82, 45));
		lblNewLabel.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, 39));
		lblNewLabel.setBounds(150, 22, 139, 75);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton(" ");
		btnNewButton.setBounds(22, 135, 40, 44);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Editar Perfil");
		lblNewLabel_1.setForeground(new Color(160, 82, 45));
		lblNewLabel_1.setFont(new Font("Gloucester MT Extra Condensed", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(72, 143, 96, 29);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(22, 208, 40, 44);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(22, 290, 40, 44);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(250, 135, 40, 44);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(250, 208, 40, 44);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_2 = new JLabel("Carrinho de Compras");
		lblNewLabel_2.setForeground(new Color(160, 82, 45));
		lblNewLabel_2.setFont(new Font("Gloucester MT Extra Condensed", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(305, 140, 119, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hist\u00F3rico de Vendas");
		lblNewLabel_3.setForeground(new Color(160, 82, 45));
		lblNewLabel_3.setFont(new Font("Gloucester MT Extra Condensed", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(72, 223, 122, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Livros Cadastrados");
		lblNewLabel_4.setForeground(new Color(160, 82, 45));
		lblNewLabel_4.setFont(new Font("Gloucester MT Extra Condensed", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(300, 215, 124, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Log Off");
		lblNewLabel_5.setForeground(new Color(160, 82, 45));
		lblNewLabel_5.setFont(new Font("Gloucester MT Extra Condensed", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(72, 295, 46, 29);
		contentPane.add(lblNewLabel_5);
	}
}
