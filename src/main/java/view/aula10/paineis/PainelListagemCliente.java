package view.aula10.paineis;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;

public class PainelListagemCliente extends JPanel {
	private JTextField tfNome;
	private JTable table;


	public PainelListagemCliente() {
		setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(132dlu;default):grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
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
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNome = new JLabel("Nome:");
		add(lblNome, "4, 4, left, default");
		
		tfNome = new JTextField();
		add(tfNome, "6, 4, fill, default");
		tfNome.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF:");
		add(lblCPF, "4, 6, left, default");
		
		JFormattedTextField tfCPF = new JFormattedTextField();
		add(tfCPF, "6, 6, fill, default");
		
		JLabel lblTelefone = new JLabel("Telefone:");
		add(lblTelefone, "4, 8, left, default");
		
		JFormattedTextField tfTelefone = new JFormattedTextField();
		add(tfTelefone, "6, 8, fill, default");
		
		table = new JTable();
		add(table, "4, 12, 3, 1, fill, fill");

	}

}
