import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ch10 {

	private JFrame frame;
	private JTextField Fn;
	private JTextField Ln;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ch10 window = new Ch10();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ch10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		ImageIcon chhs = new ImageIcon("..\\Wampum\\src\\Images\\chhs.png");
		ImageIcon whs = new ImageIcon("..\\Wampum\\src\\Images\\wchs.png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1009, 623);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 985, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Fn = new JTextField();
		Fn.setBounds(56, 97, 290, 39);
		panel.add(Fn);
		Fn.setColumns(10);
		
		Ln = new JTextField();
		Ln.setColumns(10);
		Ln.setBounds(386, 97, 290, 39);
		panel.add(Ln);
		
		JComboBox Grd = new JComboBox();
		Grd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Grd.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		Grd.setBounds(71, 250, 161, 21);
		panel.add(Grd);
		
		JComboBox Sch = new JComboBox();
		Sch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Sch.setModel(new DefaultComboBoxModel(new String[] {"Select School", "Pearson", "Crescent", "Western"}));
		Sch.setBounds(351, 250, 265, 21);
		panel.add(Sch);
		
		JTextArea out = new JTextArea();
		out.setBackground(Color.WHITE);
		out.setBounds(71, 327, 619, 107);
		panel.add(out);
		
		
		JLabel im = new JLabel("");
		im.setBounds(710, 52, 265, 255);
		panel.add(im);
		
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				String grade = "";
				String school = "";
				String FN = Fn.getText();
				String LN = Ln.getText();
				
				if(Grd.getSelectedItem().equals("10"))
				{
					grade = "10";
				}
				if(Grd.getSelectedItem().equals("11"))
				{
					grade = "11";
				}
				else
				{
					grade = "12";
				}
				
				if(Sch.getSelectedItem().equals("Crescent"))
				{
					school = "Crescent";
					im.setIcon(chhs);
					
				}
				
				if(Sch.getSelectedItem().equals("Western"))
				{
					school = "Western";
					im.setIcon(whs);
					
					
				}
				
				if(Sch.getSelectedItem().equals("Pearson"))
				{
					school = "Pearson";
					
				}
				
				
				out.setText
				(
						
					FN + " " + LN + " is in grade "+
					grade + " "+ " and goes to "+
					school + " " + "high school"
						
						
				);
				
				
				
			}
		});
		submit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		submit.setBounds(299, 478, 185, 54);
		panel.add(submit);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(56, 74, 176, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(385, 76, 176, 13);
		panel.add(lblNewLabel_1_1);
	}
}
