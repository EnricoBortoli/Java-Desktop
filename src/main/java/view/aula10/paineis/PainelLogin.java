package view.aula10.paineis;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import model.vo.Cliente;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;

public class PainelLogin extends JPanel {
	private JTextField tfUsuario;
	private JTextField tfSenha;
	private Cliente clienteLogin;
	private JButton btnAcessar;
	private JComponent lblBoasVindas;


	public PainelLogin() {
		setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
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
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		lblBoasVindas = new JLabel("Bem Vindo ao Sistema");
		lblBoasVindas.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(lblBoasVindas, "10, 4, center, default");
		
		JLabel lblInstrucao = new JLabel("Insira suas credenciais para avançar:");
		add(lblInstrucao, "8, 8, 3, 1");
		
		JLabel lblUsuario = new JLabel("Usuario:");
		add(lblUsuario, "8, 12, right, default");
		
		tfUsuario = new JTextField();
		add(tfUsuario, "10, 12, fill, default");
		tfUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		add(lblSenha, "8, 14, left, default");
		
		tfSenha = new JTextField();
		tfSenha.setColumns(10);
		add(tfSenha, "10, 14, fill, default");
		
		btnAcessar = new JButton("Acessar");
		add(btnAcessar, "10, 18, right, default");

	}


	public JButton getBtnAcessar() {
		return btnAcessar;
	}


	public JTextField getTfUsuario() {
		return tfUsuario;
	}


	public void setTfUsuario(JTextField tfUsuario) {
		this.tfUsuario = tfUsuario;
	}


	public JTextField getTfSenha() {
		return tfSenha;
	}


	public void setTfSenha(JTextField tfSenha) {
		this.tfSenha = tfSenha;
	}
	
	
	
}
