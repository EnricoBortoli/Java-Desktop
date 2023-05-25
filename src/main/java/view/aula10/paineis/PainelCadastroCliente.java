package view.aula10.paineis;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;

public class PainelCadastroCliente extends JPanel {
	private JTextField tfNome;

	/**
	 * Create the panel.
	 */
	public PainelCadastroCliente() {
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
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblCadastroDeCliente = new JLabel("Cadastro de Cliente");
		lblCadastroDeCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblCadastroDeCliente, "4, 4, 5, 1, center, default");
		
		JLabel lblNome = new JLabel("Nome:");
		add(lblNome, "4, 6, left, default");
		
		tfNome = new JTextField();
		add(tfNome, "6, 6, 3, 1, fill, default");
		tfNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		add(lblCpf, "4, 8, left, default");
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		add(formattedTextField, "6, 8, fill, default");
		
		JLabel lblEndereco = new JLabel("Endereço:");
		add(lblEndereco, "4, 10, left, default");
		
		JComboBox cbxEndereco = new JComboBox();
		add(cbxEndereco, "6, 10, 3, 1, fill, default");
		
		JLabel lblTelefone = new JLabel("Telefone:");
		add(lblTelefone, "4, 12, left, default");
		
		JComboBox cbxTelefone = new JComboBox();
		add(cbxTelefone, "6, 12, 3, 1, fill, default");
		
		JButton btnVoltar = new JButton("Voltar");
		add(btnVoltar, "6, 18, left, default");
		
		JButton btnSalvar = new JButton("Salvar");
		add(btnSalvar, "8, 18, right, default");

	}

}
