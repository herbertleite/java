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
	private JLabel descricaohora = new JLabel("Time Thread 1");
	private JTextField mostratempo = new JTextField();
	private JLabel descricaohora2 = new JLabel("Time Thread 2");
	private JTextField mostratempo2 = new JTextField();
	JButton jButton = new JButton("Start");
	JButton jButton2 = new JButton("Stop");

	private Runnable thread1 = new Runnable() {
		public void run() {
			while (true) {
				mostratempo
						.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	};

	private Runnable thread2 = new Runnable() {
		public void run() {
			while (true) {
				mostratempo2
						.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	};

	private Thread threadtime1;
	private Thread threadtime2;

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
		mostratempo.setEditable(false);
		gridBagConstraints.gridy++;
		jPainel.add(mostratempo, gridBagConstraints);

		descricaohora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPainel.add(descricaohora2, gridBagConstraints);

		mostratempo2.setPreferredSize(new Dimension(200, 25));
		mostratempo2.setEditable(false);
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
		
		

		add(jPainel, BorderLayout.WEST);

		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				threadtime1 = new Thread(thread1);
				threadtime1.start();
				threadtime2 = new Thread(thread2);
				threadtime2.start();
				jButton.setEnabled(false);
				jButton2.setEnabled(true);
				
				
			}
		});

		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				threadtime1.stop();
				threadtime2.stop();
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
			}
		});

		setVisible(true);// torna tela visivel sempre sera ultimo comando
		// largura
		// altura
	}
}
