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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;

public class PainelCadastroTelefone extends JPanel {
	private JTextField tfDDD;
	private JTextField tfNumero;

	/**
	 * Create the panel.
	 */
	public PainelCadastroTelefone() {
		setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(26dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(38dlu;default):grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(125dlu;default):grow"),
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
		
		JLabel lblTitulo = new JLabel("Cadastro de Telefones");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblTitulo, "4, 4, 7, 1, center, default");
		
		JLabel lblDDD = new JLabel("DDD:");
		add(lblDDD, "4, 6, left, default");
		
		tfDDD = new JTextField();
		add(tfDDD, "6, 6, fill, default");
		tfDDD.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero:");
		add(lblNumero, "4, 8, right, default");
		
		tfNumero = new JTextField();
		tfNumero.setColumns(10);
		add(tfNumero, "6, 8, 3, 1, fill, default");
		
		JRadioButton rdbtnFixo = new JRadioButton("Fixo");
		add(rdbtnFixo, "6, 10");
		
		JRadioButton rdbtnMovel = new JRadioButton("Movel");
		add(rdbtnMovel, "8, 10");
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnMovel);
		grupo.add(rdbtnFixo);
		
		JButton btnVoltar = new JButton("Voltar");
		add(btnVoltar, "6, 18, 3, 1, left, default");
		
		JButton btnSalvar = new JButton("Salvar");
		add(btnSalvar, "10, 18, right, default");

	}

}
