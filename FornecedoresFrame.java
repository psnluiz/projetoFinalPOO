package teste1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FornecedoresFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField telefoneField;
	private JTextField cnpjField;
	private JTable fornecedoresTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FornecedoresFrame frame = new FornecedoresFrame();
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
	public FornecedoresFrame() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de Fornecedores:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 174, 177, 22);
		contentPane.add(lblNewLabel);
		
		nomeField = new JTextField();
		nomeField.setBounds(678, 24, 96, 20);
		contentPane.add(nomeField);
		nomeField.setColumns(10);
		
		telefoneField = new JTextField();
		telefoneField.setColumns(10);
		telefoneField.setBounds(678, 55, 96, 20);
		contentPane.add(telefoneField);
		
		cnpjField = new JTextField();
		cnpjField.setColumns(10);
		cnpjField.setBounds(678, 86, 96, 20);
		contentPane.add(cnpjField);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(563, 27, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefone.setBounds(563, 58, 86, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCnpj.setBounds(563, 89, 48, 14);
		contentPane.add(lblCnpj);
		
		JButton adicionarFornecedorBtn = new JButton("Adicionar Fornecedor");
		adicionarFornecedorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = nomeField.getText();
				String telefone = telefoneField.getText();
				String cnpj = cnpjField.getText();
				
				Fornecedor fc = new Fornecedor(nome,telefone,cnpj);
				
				DefaultTableModel model = (DefaultTableModel) fornecedoresTable.getModel();
				model.addRow(new Object [] {nome,telefone, cnpj});
				System.out.println(fc);
				Controlador.addFornecedor(fc);
				cleanFields();
			}
		});
		adicionarFornecedorBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		adicionarFornecedorBtn.setBounds(563, 147, 173, 49);
		contentPane.add(adicionarFornecedorBtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 207, 764, 243);
		contentPane.add(scrollPane);
		
		fornecedoresTable = new JTable();
		fornecedoresTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Telefone", "CPNJ"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(fornecedoresTable);
	}

	
	public void cleanFields() {
		nomeField.setText("");
		telefoneField.setText("");
		cnpjField.setText("");
	}
}
