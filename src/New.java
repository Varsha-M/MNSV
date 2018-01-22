

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.Icon;
import java.awt.EventQueue;
import javax.swing.JTextField;
import javax.swing.JFileChooser;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
JFrame jf=new JFrame();
JPanel p = new JPanel(new GridBagLayout());

GridLayout gl=new GridLayout(9,4);
jf.setLayout(gl);


//JLabel jl1=new JLabel("IMPORT SOIL TRAINING DATA");
//jf.add(jl1);
JButton jb1=new JButton("Import Soil training data");

JLabel jl2=new JLabel("IMPORT SOIL TEST DATA");
jf.add(jl2);


JButton jb2=new JButton("Apply algorithm for classification");

//jb1.setSize(300, 30);
jb1.setBounds(130, 100, 100, 40);
//jb1.setLocation(100, 50);
//p.add(jb1);
//p.add(new JButton("submit"),new GridBagConstraints());

//JLabel l = new JLabel("<html>hello<br/>kkk</html>",SwingConstants.CENTER);
//p.add(l);

//jb1.setBounds(280, 250, 140, 50);
Font f = new Font("Arial",Font.BOLD,18);
jb1.setFont(f);
Cursor cur = new Cursor(Cursor.HAND_CURSOR);
jb1.setCursor(cur);
jf.add(jb1);




//JButton jb2=new JButton("reset");
//jf.add(jb2);

jb1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent argo){
		final JFileChooser fc = new JFileChooser();
		int retVal = fc.showOpenDialog(p);

		/*File f=new File("C:/Users/Admin/Desktop/Sample.txt");
		FileWriter fw=null;
		try{
			fw=new FileWriter(f);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try{
			fw.write(tf1.getText()+" "+tf2.getText()+" "+tf3.getText()+" "+tf4.getText());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try{
			fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		tf1.setText(" ");
		tf2.setText(" ");
		tf3.setText(" ");
		tf4.setText(" ");*/
		
	}
	});
/*jb2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0){
		tf1.setText(" ");
	}
		
	});*/
jf.add(p);
jf.setSize(500,500);

jf.setBounds(100, 100, 700, 500);	
jf.pack();

jf.setVisible(true);
	}

}




