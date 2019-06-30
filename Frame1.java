package teste1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;

public class Frame1 {

	private JFrame frame;
	private JLabel listaDeProdutosLabel;
	private JTable produtosTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 880, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		listaDeProdutosLabel = new JLabel("Lista de Produtos :");
		listaDeProdutosLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		listaDeProdutosLabel.setBounds(10, 143, 162, 43);
		frame.getContentPane().add(listaDeProdutosLabel);
		
		produtosTable = new JTable();
		produtosTable.setBounds(10, 192, 844, 258);
		frame.getContentPane().add(produtosTable);
		
		JButton lojasBtn = new JButton("Lojas");
		lojasBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame.dispose();
				LojasFrame lojasFrame = new LojasFrame();
				lojasFrame.setVisible(true);
			}
		});
		lojasBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lojasBtn.setBounds(10, 11, 162, 43);
		frame.getContentPane().add(lojasBtn);
		
		JButton fornecedoresBtn = new JButton("Fornecedores");
		fornecedoresBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FornecedoresFrame fornecedoresFrame = new FornecedoresFrame();
				fornecedoresFrame.setVisible(true);
			}
		});
		fornecedoresBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fornecedoresBtn.setBounds(182, 11, 162, 43);
		frame.getContentPane().add(fornecedoresBtn);
		
		JButton produtosBtn = new JButton("Produtos");
		produtosBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		produtosBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		produtosBtn.setBounds(354, 11, 162, 43);
		frame.getContentPane().add(produtosBtn);
		
		JLabel cidadeLabel = new JLabel("Cidade:");
		cidadeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cidadeLabel.setBounds(648, 34, 83, 20);
		frame.getContentPane().add(cidadeLabel);
		
		JLabel bairroLabel = new JLabel("Bairro:");
		bairroLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bairroLabel.setBounds(648, 67, 70, 20);
		frame.getContentPane().add(bairroLabel);
		
		JComboBox bairroComboBox = new JComboBox();
		bairroComboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bairroComboBox.setBounds(723, 65, 131, 22);
		frame.getContentPane().add(bairroComboBox);
		
		JComboBox cidadecomboBox = new JComboBox();
		cidadecomboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cidadecomboBox.setBounds(723, 35, 131, 22);
		frame.getContentPane().add(cidadecomboBox);
		
		JButton filtrarBtn = new JButton("Filtrar Produtos");
		filtrarBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		filtrarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		filtrarBtn.setBounds(723, 98, 131, 35);
		frame.getContentPane().add(filtrarBtn);
	}
}
