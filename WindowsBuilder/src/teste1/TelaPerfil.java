package teste1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class TelaPerfil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPerfil frame = new TelaPerfil();
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
	public TelaPerfil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Perfil");
		lblNewLabel.setForeground(new Color(160, 82, 45));
		lblNewLabel.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.PLAIN, 39));
		lblNewLabel.setBounds(178, 23, 140, 67);
		contentPane.add(lblNewLabel);
		
		JPanel panelBotoes = new JPanel();
		panelBotoes.setBounds(53, 137, 300, 142);
		contentPane.add(panelBotoes);
		panelBotoes.setLayout(null);
		
		JButton btnNewButton = new JButton("Alterar Nome");
		btnNewButton.setForeground(new Color(160, 82, 45));
		btnNewButton.setFont(new Font("Gloucester MT Extra Condensed", Font.PLAIN, 20));
		btnNewButton.setBounds(0, 0, 300, 40);
		panelBotoes.add(btnNewButton);
		
		JButton btnAlterarSenha = new JButton("Alterar Senha");
		btnAlterarSenha.setForeground(new Color(160, 82, 45));
		btnAlterarSenha.setFont(new Font("Gloucester MT Extra Condensed", Font.PLAIN, 20));
		btnAlterarSenha.setBounds(0, 51, 300, 40);
		panelBotoes.add(btnAlterarSenha);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.setForeground(new Color(160, 82, 45));
		btnMenuPrincipal.setFont(new Font("Gloucester MT Extra Condensed", Font.PLAIN, 20));
		btnMenuPrincipal.setBounds(0, 102, 300, 40);
		panelBotoes.add(btnMenuPrincipal);
		
		panelBotoes.setVisible(false);
		
	}
}
