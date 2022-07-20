import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaMinhaThread extends JDialog {

	private JPanel jPainel = new JPanel(new GridBagLayout());// painel de componentes
	private JLabel descricaohora = new JLabel("Nome");
	private JTextField mostratempo = new JTextField();
	private JLabel descricaohora2 = new JLabel("Email");
	private JTextField mostratempo2 = new JTextField();
	JButton jButton = new JButton("Add Lista");
	JButton jButton2 = new JButton("Stop");
	
	private implementacaoFilaThread fila = new implementacaoFilaThread();

	public TelaMinhaThread() {
		setTitle("Programa");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		GridBagConstraints gridBagConstraints = new GridBagConstraints();// controlador de posicionamento de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		//System.out.println(gridBagConstraints.gridheight);
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;

		descricaohora.setPreferredSize(new Dimension(200, 25));
		jPainel.add(descricaohora, gridBagConstraints);

		mostratempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPainel.add(mostratempo, gridBagConstraints);

		descricaohora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPainel.add(descricaohora2, gridBagConstraints);

		mostratempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPainel.add(mostratempo2, gridBagConstraints);

		// colocando os botoes no incio da coluna
		gridBagConstraints.gridwidth = 1;

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPainel.add(jButton, gridBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPainel.add(jButton2, gridBagConstraints);
		
		
		fila.start();
		add(jPainel, BorderLayout.WEST);
		

		jButton.addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {
			if (fila==null) {
				fila= new implementacaoFilaThread();
				fila.start();
			}
			//for(int i = 0; i<10; i++) {simulando 10 envios em massa
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNomeString(mostratempo.getText());
				filaThread.setEmailString(mostratempo2.getText());
				fila.add(filaThread);
			//}
			}
		});

		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				fila.stop();
				fila=null;
			}
		});

		setVisible(true);// torna tela visivel sempre sera ultimo comando
		// largura
		// altura
	}
}
