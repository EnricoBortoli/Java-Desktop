package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import controller.ClienteController;
import model.vo.Cliente;
import javax.swing.JTable;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PesquisaTodos extends JFrame {

	private JPanel contentPane;
	private JTable tblClientes;
	private String[] cabeçalho = {"Nome", "CPF", "Endereço", "Total Telefones", "Cliente Ativo"};
	private ArrayList<Cliente> clientes;
	private ClienteController controller = new ClienteController();
	private JButton btnEditar;
	private JButton btnExcluir;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PesquisaTodos frame = new PesquisaTodos();
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
	public PesquisaTodos() {
		setTitle("Tela de listagem de clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(195dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JButton btnPesquisarTodos = new JButton("Pesquisar Todos");
		btnPesquisarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientes = (ArrayList<Cliente>) controller.consultarTodos();
				atualizarTabelaClientes();
			}
		});
		contentPane.add(btnPesquisarTodos, "2, 2, 3, 1, center, default");
		
		tblClientes = new JTable();
		tblClientes.setToolTipText("teste");
		contentPane.add(tblClientes, "2, 4, 3, 1, fill, fill");
		
		btnEditar = new JButton("Editar");
		contentPane.add(btnEditar, "2, 6");
		
		btnExcluir = new JButton("Excluir");
		contentPane.add(btnExcluir, "4, 6");
	}
	
	
	
	public void atualizarTabelaClientes() {
		this.limparTabelaClientes();

		DefaultTableModel model = (DefaultTableModel) tblClientes.getModel();

		for (Cliente c : clientes) {
			Object[] novaLinhaDaTabela = new Object[5];
			novaLinhaDaTabela[0] = c.getNome();
			novaLinhaDaTabela[1] = formatarCPF(c.getCpf());
			novaLinhaDaTabela[2] = c.getEndereco().getEnderecoResumido();
			novaLinhaDaTabela[3] = c.getTelefones().size();
			novaLinhaDaTabela[4] = c.isAtivo() ? "Sim" : "Não";

			model.addRow(novaLinhaDaTabela);
		}
		
	}

    public static String formatarCPF(String cpf) {
        cpf = cpf.replaceAll("\\D", "");
        if (cpf.length() == 11) {
            cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
            return cpf;
        }
        return cpf;
    }

	private void limparTabelaClientes() {
		tblClientes.setModel(new DefaultTableModel(new Object[][] { cabeçalho, }, cabeçalho));
	}
	
	
}
