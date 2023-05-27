package view.aula10.paineis;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import model.vo.Endereco;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelCadastroEndereco extends JPanel {
	private JTextField tfCep;
	private JTextField tfRua;
	private JTextField tfNumero;
	private JTextField tfBairro;
	private JTextField tfCidade;
	private JTextField tfEstado;
	private Endereco novoEndereco;

	/**
	 * Create the panel.
	 */
	public PainelCadastroEndereco() {
		setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(26dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
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
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblTitulo = new JLabel("Cadastro de Endereços");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblTitulo, "4, 4, 5, 1, center, default");
		
		JLabel lblCep = new JLabel("CEP:");
		add(lblCep, "4, 6, left, default");
		
		tfCep = new JTextField();
		add(tfCep, "6, 6, 3, 1, fill, default");
		tfCep.setColumns(10);
		
		ButtonGroup grupo = new ButtonGroup();
		
		JLabel lblRua = new JLabel("Rua:");
		add(lblRua, "4, 8, left, default");
		
		tfRua = new JTextField();
		tfRua.setColumns(10);
		add(tfRua, "6, 8, 3, 1, fill, default");
		
		JLabel lblNumero = new JLabel("Numero:");
		add(lblNumero, "4, 10, right, default");
		
		tfNumero = new JTextField();
		tfNumero.setColumns(10);
		add(tfNumero, "6, 10, fill, default");
		
		JLabel lblBairro = new JLabel("Bairro:");
		add(lblBairro, "4, 12, left, default");
		
		tfBairro = new JTextField();
		tfBairro.setColumns(10);
		add(tfBairro, "6, 12, 3, 1, fill, default");
		
		JLabel lblCidade = new JLabel("Cidade:");
		add(lblCidade, "4, 14, left, default");
		
		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		add(tfCidade, "6, 14, 3, 1, fill, default");
		
		JLabel lblEstado = new JLabel("Estado:");
		add(lblEstado, "4, 16, left, default");
		
		tfEstado = new JTextField();
		tfEstado.setColumns(10);
		add(tfEstado, "6, 16, fill, default");
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		add(btnVoltar, "6, 20, left, default");
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				novoEndereco = new Endereco();
				novoEndereco.setRua(tfRua.getText());
				novoEndereco.setNumero(tfNumero.getText());
				novoEndereco.setBairro(tfBairro.getText());
			}
		});
		add(btnSalvar, "8, 20, right, default");

	}

}
