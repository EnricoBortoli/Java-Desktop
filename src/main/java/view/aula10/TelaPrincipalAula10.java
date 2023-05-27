package view.aula10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.vo.Cliente;
import view.aula10.paineis.PainelCadastroCliente;
import view.aula10.paineis.PainelCadastroEndereco;
import view.aula10.paineis.PainelCadastroTelefone;
import view.aula10.paineis.PainelLogin;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipalAula10 extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnCliente;
	private JMenuItem mntmCadastrarCliente;
	private JMenuItem mntmListarCliente;
	private JMenu mnTefelone;
	private JMenuItem mntmCadastroTelefone;
	private JMenuItem mntmListarTelefone;
	private JMenu mnEndereco;
	private JMenuItem mntmCadastroEndereco;
	private PainelCadastroCliente painelCadastroCliente;
	private PainelCadastroTelefone painelCadastroTelefone;
	private PainelCadastroEndereco painelCadastroEndereco;
	private PainelLogin painelLogin;
	private Cliente cliente;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalAula10 frame = new TelaPrincipalAula10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public TelaPrincipalAula10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		painelLogin = new PainelLogin();
		setContentPane(painelLogin);
		revalidate();
		
		menuBar.setVisible(false);
		
		painelLogin.getBtnAcessar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painelLogin.getTfUsuario().getText();
				painelLogin.getTfSenha().getText();
				
				//TODO controller
				
				//Usuario u = controller.login(login, senha);
				setContentPane(contentPane);
				revalidate();
				menuBar.setVisible(true);
				
			}			
		});;
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);
		
		mntmCadastrarCliente = new JMenuItem("Cadastrar Cliente");
		mntmCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painelCadastroCliente = new PainelCadastroCliente();
				setContentPane(painelCadastroCliente);
				revalidate();
			}
		});
		mnCliente.add(mntmCadastrarCliente);
		
		mntmListarCliente = new JMenuItem("Listar Clientes");
		mnCliente.add(mntmListarCliente);
		
		mnTefelone = new JMenu("Tefelone");
		menuBar.add(mnTefelone);
		
		mntmCadastroTelefone = new JMenuItem("Cadastrar Telefone");
		mntmCadastroTelefone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painelCadastroTelefone = new PainelCadastroTelefone();
				setContentPane(painelCadastroTelefone);
				revalidate();
			}
		});
		mnTefelone.add(mntmCadastroTelefone);
		
		mntmListarTelefone = new JMenuItem("Listar Telefones");
		mnTefelone.add(mntmListarTelefone);
		
		mnEndereco = new JMenu("Endereço");
		menuBar.add(mnEndereco);
		
		mntmCadastroEndereco = new JMenuItem("Cadastrar Endereço");
		mntmCadastroEndereco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painelCadastroEndereco = new PainelCadastroEndereco();
				setContentPane(painelCadastroEndereco);
				revalidate();
			}
		});
		mnEndereco.add(mntmCadastroEndereco);
		
		
	}
}
