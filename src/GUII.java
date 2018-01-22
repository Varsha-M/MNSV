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
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame jf=new JFrame();
JPanel p = new JPanel(new GridBagLayout());

GridLayout gl=new GridLayout(9,4);
jf.setLayout(gl);


JLabel jl1=new JLabel("Sand(In percentage)");
jf.add(jl1);
TextField tf1=new TextField(" ");
jf.add(tf1);

JLabel jl2=new JLabel("OC(Organic Carbon in mn)");
jf.add(jl2);
TextField tf2=new TextField(" ");
jf.add(tf2);

JLabel jl3=new JLabel("Slit(In percentage)");
jf.add(jl3);
TextField tf3=new TextField(" ");
jf.add(tf3);

JLabel jl4=new JLabel("P(Phosphorous)");
jf.add(jl4);
TextField tf4=new TextField(" ");
jf.add(tf4);

JLabel jl5=new JLabel("Clay(In percentage)");
jf.add(jl5);
TextField tf5=new TextField(" ");
jf.add(tf5);

JLabel jl6=new JLabel("Zn(Zinc)");
jf.add(jl6);
TextField tf6=new TextField(" ");
jf.add(tf6);

JLabel jl7=new JLabel("pH");
jf.add(jl7);
TextField tf7=new TextField(" ");
jf.add(tf7);

JLabel jl8=new JLabel("S(Sulpher)");
jf.add(jl8);
TextField tf8=new TextField(" ");
jf.add(tf8);

JLabel jl9=new JLabel("Ec(Electrical conductivity in mn)");
jf.add(jl9);
TextField tf9=new TextField(" ");
jf.add(tf9);

JLabel jl10=new JLabel("K(Potassium)");
jf.add(jl10);
TextField tf10=new TextField(" ");
jf.add(tf10);

JLabel jl18=new JLabel("Mn(Manganese)");
jf.add(jl18);
TextField tf18=new TextField(" ");
jf.add(tf18);

JLabel jl19=new JLabel("B(Boron)");
jf.add(jl19);
TextField tf19=new TextField(" ");
jf.add(tf19);


JLabel jl15=new JLabel(" ");
jf.add(jl15);
JLabel jl11=new JLabel("OR",SwingConstants.RIGHT);
jf.add(jl11);


JLabel jl12=new JLabel(" ");
jf.add(jl12);
JLabel jl16=new JLabel(" ");
jf.add(jl16);

JLabel jl17=new JLabel(" ");
jf.add(jl17);
JLabel jl13=new JLabel(" ");
jf.add(jl13);


JLabel jl14=new JLabel("IMPORT SOIL DATA");
jf.add(jl14);
TextField tf14=new TextField(" ");
jf.add(tf14);


JButton jb1=new JButton("submit");

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
		File f=new File("C:/Users/Admin/Desktop/Sample.txt");
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
		tf4.setText(" ");
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

