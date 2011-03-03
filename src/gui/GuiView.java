package gui;

import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Event;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.KeyStroke;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class GuiView {

	private JFrame jFrame = null;  //  @jve:decl-index=0:visual-constraint="10,10"
	private JPanel jContentPane = null;
	private JButton genCodeJB = null;
	private JTextArea messageJTA = null;
	private JTextArea inputJTA = null;
	private JTextArea outputJTA = null;
	private JScrollPane messageJSP = null;
	private JScrollPane inputJSP = null;
	private JScrollPane outputJSP = null;
	private JSplitPane centerJSP = null;
	/**
	 * This method initializes jFrame
	 * 
	 * @return javax.swing.JFrame
	 */
	private JFrame getJFrame() {
		if (jFrame == null) {
			jFrame = new JFrame();
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setSize(1089, 395);
			jFrame.setContentPane(getJContentPane());
			jFrame.setTitle("yUML to Java");
		}
		return jFrame;
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getGenCodeJB(), BorderLayout.NORTH);
			jContentPane.add(getMessageJSP(), BorderLayout.SOUTH);
			jContentPane.add(getCenterJSP(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * This method initializes genCodeJB	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getGenCodeJB() {
		if (genCodeJB == null) {
			genCodeJB = new JButton();
			genCodeJB.setText("Generate code");
			genCodeJB.setPreferredSize(new Dimension(45, 30));
			genCodeJB.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
							outputJTA.setText(GuiController.generateCode(inputJTA.getText()));
				}
			});
		}
		return genCodeJB;
	}

	/**
	 * This method initializes messageJTA	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getMessageJTA() {
		if (messageJTA == null) {
			messageJTA = new JTextArea();
			messageJTA.setColumns(20);
			messageJTA.setPreferredSize(new Dimension(40, 40));
			messageJTA.setEditable(false);
			messageJTA.setText("Message area");
			messageJTA.setRows(5);
		}
		return messageJTA;
	}

	/**
	 * This method initializes inputJTA	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getInputJTA() {
		if (inputJTA == null) {
			inputJTA = new JTextArea();
			inputJTA.setColumns(35);
			inputJTA.setText("Specification here");
		}
		return inputJTA;
	}

	/**
	 * This method initializes outputJTA	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getOutputJTA() {
		if (outputJTA == null) {
			outputJTA = new JTextArea();
			outputJTA.setColumns(35);
			outputJTA.setText("Code result");
			outputJTA.setEditable(false);
		}
		return outputJTA;
	}

	/**
	 * This method initializes messageJSP	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getMessageJSP() {
		if (messageJSP == null) {
			messageJSP = new JScrollPane();
			messageJSP.setViewportView(getMessageJTA());
		}
		return messageJSP;
	}

	/**
	 * This method initializes inputJSP	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getInputJSP() {
		if (inputJSP == null) {
			inputJSP = new JScrollPane();
			inputJSP.setViewportView(getInputJTA());
		}
		return inputJSP;
	}

	/**
	 * This method initializes outputJSP	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getOutputJSP() {
		if (outputJSP == null) {
			outputJSP = new JScrollPane();
			outputJSP.setViewportView(getOutputJTA());
		}
		return outputJSP;
	}

	/**
	 * This method initializes centerJSP	
	 * 	
	 * @return javax.swing.JSplitPane	
	 */
	private JSplitPane getCenterJSP() {
		if (centerJSP == null) {
			centerJSP = new JSplitPane();
			centerJSP.setLeftComponent(getInputJSP());
			centerJSP.setRightComponent(getOutputJSP());
		}
		return centerJSP;
	}

	/**
	 * Launches this application
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GuiView application = new GuiView();
				application.getJFrame().setVisible(true);
			}
		});
	}

}
