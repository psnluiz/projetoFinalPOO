package teste1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ProdutosFrame extends JFrame {

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
					ProdutosFrame frame = new ProdutosFrame();
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
	public ProdutosFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 241, 764, 209);
		contentPane.add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(678, 11, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(678, 42, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(678, 73, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(678, 104, 96, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(631, 17, 37, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblQuantidadeEmEstoque = new JLabel("Quantidade em Estoque");
		lblQuantidadeEmEstoque.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuantidadeEmEstoque.setBounds(540, 41, 128, 20);
		contentPane.add(lblQuantidadeEmEstoque);
		
		JLabel lblPreoDeVenda = new JLabel("Pre\u00E7o de Venda\r\n");
		lblPreoDeVenda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoDeVenda.setBounds(584, 76, 84, 14);
		contentPane.add(lblPreoDeVenda);
		
		JLabel lblPreoDeCusto = new JLabel("Pre\u00E7o de Custo\r\n");
		lblPreoDeCusto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreoDeCusto.setBounds(584, 107, 84, 14);
		contentPane.add(lblPreoDeCusto);
		
		textField_4 = new JTextField();
		textField_4.setBounds(678, 135, 96, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Data Ultima Compra");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(561, 138, 107, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox fornecedorComboBox = new JComboBox();
		fornecedorComboBox.setBounds(678, 166, 96, 22);
		contentPane.add(fornecedorComboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Fornecedor");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(597, 174, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Adicionar Produto");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(621, 201, 143, 29);
		contentPane.add(btnNewButton);
	}
}
