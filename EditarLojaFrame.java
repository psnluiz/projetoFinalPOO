package teste1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EditarLojaFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField enderecoField;
	private JTextField bairroField;
	private JTextField cidadeField;
	private JTextField estadoField;
	private LojasFrame fr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarLojaFrame frame = new EditarLojaFrame();
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
	public EditarLojaFrame() {
		Loja lj = LojasFrame.data;

		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Editar Dados da Loja");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(174, 11, 182, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(135, 67, 48, 14);
		contentPane.add(lblNome);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(135, 105, 48, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(135, 140, 48, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(135, 178, 48, 14);
		contentPane.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(135, 215, 48, 14);
		contentPane.add(lblEstado);
		
		nomeField = new JTextField();
		nomeField.setBounds(184, 64, 96, 20);
		contentPane.add(nomeField);
		nomeField.setColumns(10);
		nomeField.setText(lj.getNome());
		
		enderecoField = new JTextField();
		enderecoField.setColumns(10);
		enderecoField.setBounds(184, 102, 96, 20);
		contentPane.add(enderecoField);
		enderecoField.setText(lj.getEndereco());
		
		bairroField = new JTextField();
		bairroField.setColumns(10);
		bairroField.setBounds(184, 137, 96, 20);
		contentPane.add(bairroField);
		bairroField.setText(lj.getBairro());
		
		cidadeField = new JTextField();
		cidadeField.setColumns(10);
		cidadeField.setBounds(184, 175, 96, 20);
		contentPane.add(cidadeField);
		cidadeField.setText(lj.getCidade());
		
		estadoField = new JTextField();
		estadoField.setColumns(10);
		estadoField.setBounds(184, 212, 96, 20);
		contentPane.add(estadoField);
		estadoField.setText(lj.getEstado());
		
		JButton atualizarDadosBtn = new JButton("Atualizar Dados");
		atualizarDadosBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		atualizarDadosBtn.setBounds(352, 127, 148, 40);
		contentPane.add(atualizarDadosBtn);
	}
	
	public EditarLojaFrame(Loja lj) {
		
		
	}

}
