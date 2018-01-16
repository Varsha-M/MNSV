
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

public class GUI1
{
	//hello

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame jf=new JFrame();
JPanel p = new JPanel();

GridLayout gl=new GridLayout(11,4);
jf.setLayout(gl);


JLabel jl1=new JLabel("Nitrogen content in fertilizer:");
jf.add(jl1);
TextField tf1=new TextField(" ");
jf.add(tf1);

JLabel jl2=new JLabel("Organic carbon content in soil:");
jf.add(jl2);
TextField tf2=new TextField(" ");
jf.add(tf2);

JLabel jl3=new JLabel("Phosphorous content in fertilizer:");
jf.add(jl3);
TextField tf3=new TextField(" ");
jf.add(tf3);

JLabel jl4=new JLabel("Average phosphorous in soil:");
jf.add(jl4);
TextField tf4=new TextField(" ");
jf.add(tf4);

JLabel jl5=new JLabel("Potassium content in fertilizer");
jf.add(jl5);
TextField tf5=new TextField(" ");
jf.add(tf5);

JLabel jl6=new JLabel("Average potasium in soil:");
jf.add(jl6);
TextField tf6=new TextField(" ");
jf.add(tf6);

JLabel jl7=new JLabel("Average rainfallin district: ");
jf.add(jl7);
TextField tf7=new TextField(" ");
jf.add(tf7);

JLabel jl8=new JLabel("Average sulpher in soil: ");
jf.add(jl8);
TextField tf8=new TextField(" ");
jf.add(tf8);

JLabel jl9=new JLabel("Average temperature in district: ");
jf.add(jl9);
TextField tf9=new TextField(" ");
jf.add(tf9);



JLabel jl10=new JLabel("Average zinc in soil: ");
jf.add(jl10);
TextField tf10=new TextField(" ");
jf.add(tf10);

JLabel jl11=new JLabel("Precipitation amount in district: ");
jf.add(jl11);
TextField tf11=new TextField(" ");
jf.add(tf11);

JLabel jl12=new JLabel("Average boron in soil: ");
jf.add(jl12);
TextField tf12=new TextField(" ");
jf.add(tf12);


JLabel jl13=new JLabel("pH value of soil in district: ");
jf.add(jl13);
TextField tf13=new TextField(" ");
jf.add(tf13);


JLabel jl14=new JLabel("Area in hectares: ");
jf.add(jl14);
TextField tf14=new TextField(" ");
jf.add(tf14);


JLabel jl15=new JLabel("Electrical conductivity of soil: ");
jf.add(jl15);
TextField tf15=new TextField(" ");
jf.add(tf15);


JLabel jl16=new JLabel("Production in tonnes: ");
jf.add(jl16);
TextField tf16=new TextField(" ");
jf.add(tf16);


JLabel jl17=new JLabel(" ");
jf.add(jl17);
JLabel jl25=new JLabel("OR",SwingConstants.RIGHT);
jf.add(jl25);


JLabel jl18=new JLabel(" ");
jf.add(jl18);
JLabel jl26=new JLabel(" ");
jf.add(jl26);

JLabel jl19=new JLabel(" ");
jf.add(jl19);
JLabel jl27=new JLabel(" ");
jf.add(jl27);


JLabel jl20=new JLabel("IMPORT SOIL DATA");
jf.add(jl20);
TextField tf20=new TextField(" ");
jf.add(tf20);

JLabel l=new JLabel("<html><br></html>"); 
JButton jb1=new JButton("submit");
jb1.setAlignmentX(JButton.CENTER_ALIGNMENT);
jb1.setHorizontalAlignment(JButton.CENTER);

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
		File f=new File("C:/Users/Dell/Desktop/Sample.txt");
		FileWriter fw=null;
		try{
			fw=new FileWriter(f);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try{
			fw.write(tf1.getText()+" "+tf2.getText()+" "+tf3.getText()+" "+tf4.getText()+" "+tf5.getText()+" "+tf6.getText()+" "+tf7.getText()+" "+tf8.getText()+" "+tf9.getText()+" "+tf10.getText()+" "+tf11.getText()+" "+tf12.getText()+" "+tf13.getText()+" "+tf14.getText()+" "+tf15.getText()+" "+tf16.getText()+" "+tf20.getText());
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
		tf5.setText(" ");
		tf6.setText(" ");
		tf7.setText(" ");
		tf8.setText(" ");
		tf9.setText(" ");
		tf10.setText(" ");
		tf11.setText(" ");
		tf12.setText(" ");
		tf13.setText(" ");
		tf14.setText(" ");
		tf15.setText(" ");
		tf16.setText(" ");
		tf20.setText(" ");
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

