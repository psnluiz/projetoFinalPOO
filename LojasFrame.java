package teste1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class LojasFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField enderecoField;
	private JTextField bairroField;
	private JTextField cidadeField;
	private JTextField estadoField;
	private JTable lojasTable;
	private Loja lj;
	public static Loja data;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LojasFrame frame = new LojasFrame();
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
	public LojasFrame() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton addLojaBtn = new JButton("Adicionar Loja");
		addLojaBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = nomeField.getText();
				String endereco = enderecoField.getText();
				String bairro = bairroField.getText();
				String cidade = cidadeField.getText();
				String estado = estadoField.getText();
				
				lj = new Loja(nome, endereco, bairro, cidade, estado);
				DefaultTableModel model = (DefaultTableModel) lojasTable.getModel();
				model.addRow(new Object [] {nome, endereco, bairro, cidade, estado});
				System.out.println(lj);
				Controlador.addLoja(lj);
				cleanFields();
				
			}
		});
		addLojaBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addLojaBtn.setBounds(585, 166, 138, 46);
		contentPane.add(addLojaBtn);
		
		JLabel nomeLabel = new JLabel("Nome:");
		nomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nomeLabel.setBounds(558, 11, 48, 14);
		contentPane.add(nomeLabel);
		
		JLabel enderecoLabel = new JLabel("Endere\u00E7o:");
		enderecoLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enderecoLabel.setBounds(558, 39, 70, 24);
		contentPane.add(enderecoLabel);
		
		JLabel bairroLabel = new JLabel("Bairro:");
		bairroLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bairroLabel.setBounds(558, 74, 48, 14);
		contentPane.add(bairroLabel);
		
		JLabel cidadeLabel = new JLabel("Cidade:");
		cidadeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cidadeLabel.setBounds(558, 99, 48, 14);
		contentPane.add(cidadeLabel);
		
		JLabel estadoLabel = new JLabel("Estado:");
		estadoLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		estadoLabel.setBounds(558, 124, 48, 14);
		contentPane.add(estadoLabel);
		
		nomeField = new JTextField();
		nomeField.setBounds(678, 10, 96, 20);
		contentPane.add(nomeField);
		nomeField.setColumns(10);
		
		enderecoField = new JTextField();
		enderecoField.setColumns(10);
		enderecoField.setBounds(678, 43, 96, 20);
		contentPane.add(enderecoField);
		
		bairroField = new JTextField();
		bairroField.setColumns(10);
		bairroField.setBounds(678, 73, 96, 20);
		contentPane.add(bairroField);
		
		cidadeField = new JTextField();
		cidadeField.setColumns(10);
		cidadeField.setBounds(678, 98, 96, 20);
		contentPane.add(cidadeField);
		
		estadoField = new JTextField();
		estadoField.setColumns(10);
		estadoField.setBounds(678, 123, 96, 20);
		contentPane.add(estadoField);
		
		JLabel listaDeLojasLabel = new JLabel("Lista de Lojas:");
		listaDeLojasLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		listaDeLojasLabel.setBounds(20, 197, 117, 28);
		contentPane.add(listaDeLojasLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 236, 754, 214);
		contentPane.add(scrollPane);
		
		lojasTable = new JTable();
		lojasTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Endere\u00E7o", "Bairro", "Cidade", "Estado"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(lojasTable);
		
		
		JComboBox lojasComboBox = new JComboBox();
		lojasComboBox.setBounds(20, 72, 188, 22);
		contentPane.add(lojasComboBox);
		//adding Lojas to EditarComboBox
		
		
		JButton editarLojaBtn = new JButton("Editar");
		editarLojaBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object data = (Loja) lojasComboBox.getSelectedItem();
				
				
			}
		});
		
		editarLojaBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		editarLojaBtn.setBounds(20, 120, 188, 23);
		contentPane.add(editarLojaBtn);
		
		JButton atualizarBtn = new JButton("Atualizar Lista");
		atualizarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(Loja lj : Controlador.listaDeLojas) {
					//checks if items is already in ComboBox
					if( ((DefaultComboBoxModel)lojasComboBox.getModel()).getIndexOf(lj) == -1 ) {
						lojasComboBox.addItem(lj);
					}
				}
			}
		});
		
		
		atualizarBtn.setBounds(223, 72, 117, 23);
		contentPane.add(atualizarBtn);
		
	}
	
	public static Loja getReference() {
		return data;
	}
	
	public void cleanFields() {
		nomeField.setText("");
		enderecoField.setText("");
		bairroField.setText("");
		cidadeField.setText("");
		estadoField.setText("");
	}
}
