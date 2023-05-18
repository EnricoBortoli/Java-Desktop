package view;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import controller.EnderecoController;
import model.vo.Endereco;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroEndereco extends JFrame {

	private JPanel contentPane;
	private JTextField tfRua;
	private JTextField tfNumero;
	private JTextField tfBairro;
	private JTextField tfCidade;
	private JTextField tfEstado;
	private JLabel lblCep;
	private JLabel lblRua;
	private JLabel lblNumero;
	private JLabel lblBairro;
	private JLabel lblCidade;
	private JLabel lblEstado;
	private JFormattedTextField ftfCep;
	private MaskFormatter mascaraCep;
	private JButton btnSalvar;
	private Endereco novoEndereco;
	private EnderecoController enderecoController = new EnderecoController();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroEndereco frame = new TelaCadastroEndereco();
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
	public TelaCadastroEndereco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		
		try {
			mascaraCep = new MaskFormatter("#####-###");
			mascaraCep.setValueContainsLiteralCharacters(false);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Erro ao criar a mascara");
		}
		
		ftfCep = new JFormattedTextField(mascaraCep);
		contentPane.add(ftfCep, "8, 4, fill, default");
		
		lblCep = new JLabel("Cep:");
		contentPane.add(lblCep, "4, 4");
		
		lblRua = new JLabel("Rua:");
		contentPane.add(lblRua, "4, 6");
		
		tfRua = new JTextField();
		contentPane.add(tfRua, "8, 6, left, default");
		tfRua.setColumns(10);
		
		lblNumero = new JLabel("Número:");
		contentPane.add(lblNumero, "4, 8");
		
		tfNumero = new JTextField();
		contentPane.add(tfNumero, "8, 8");
		tfNumero.setColumns(10);
		
		lblBairro = new JLabel("Bairro:");
		contentPane.add(lblBairro, "4, 10");
		
		tfBairro = new JTextField();
		contentPane.add(tfBairro, "8, 10, fill, default");
		tfBairro.setColumns(10);
		
		lblCidade = new JLabel("Cidade:");
		contentPane.add(lblCidade, "4, 12");
		
		tfCidade = new JTextField();
		contentPane.add(tfCidade, "8, 12, fill, default");
		tfCidade.setColumns(10);
		
		lblEstado = new JLabel("Estado:");
		contentPane.add(lblEstado, "4, 14");
		
		tfEstado = new JTextField();
		contentPane.add(tfEstado, "8, 14, left, default");
		tfEstado.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					novoEndereco.setCep((String) mascaraCep.stringToValue(ftfCep.getText()));
					novoEndereco.setRua(tfRua.getText());
					novoEndereco.setNumero(tfNumero.getText());
					novoEndereco.setBairro(tfBairro.getText());
					novoEndereco.setCidade(tfCidade.getText());
					novoEndereco.setEstado(tfEstado.getText());
					
					enderecoController.inserir(novoEndereco);
				}catch(Exception a){
					JOptionPane.showMessageDialog(null, "Tem que preencher tudo, cabaço");
				}
			}
		});
		contentPane.add(btnSalvar, "8, 18, center, default");
	}

}
