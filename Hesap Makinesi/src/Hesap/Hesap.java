package Hesap;
import java.awt.event.*;
import javax.swing.*;
public class Hesap extends JFrame implements ActionListener {
	JButton jb1,jb2,jb3,jb4;
	JTextField jt1,jt2;
	JLabel jl;
	Hesap(){
		super("Hesap Makinesi");
		jb1=new JButton("+");
		jb1.setBounds(120, 150, 180, 50);
		this.add(jb1);
		jb1.addActionListener(this);
		jb2=new JButton("-");
		jb2.setBounds(120, 210, 180, 50);
		this.add(jb2);
		jb2.addActionListener(this);
		jb3=new JButton("*");
		jb3.setBounds(120, 270, 180, 50);
		this.add(jb3);
		jb3.addActionListener(this);
		jb4=new JButton("/");
		jb4.setBounds(120, 330, 180, 50);
		this.add(jb4);
		jb4.addActionListener(this);
		jt1= new JTextField("");
		jt1.setBounds(120,30 ,180, 50);
		this.add(jt1);
		jt2= new JTextField("");
		jt2.setBounds(120,90 ,180, 50);
		this.add(jt2);
		jl=new JLabel("Sonuc:  ");
		jl.setBounds(120, 400, 180, 50);
		this.add(jl);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(400,400 , 500, 500);
		this.setResizable(false);
				
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double a=Double.parseDouble(jt1.getText());
		double b=Double.parseDouble(jt2.getText());
		double sonuc;
		if(e.getActionCommand()=="+") {
			sonuc=a+b;
			jl.setText("Sonuc: " +sonuc);
		}
		else if(e.getActionCommand()=="-") {
			sonuc=a-b;
			jl.setText("Sonuc: "+ sonuc);
		}
		else if(e.getActionCommand()=="*") {
			sonuc=a*b;
			jl.setText("Sonuc: "+ sonuc);
		}
		else {
			if(b==0){
			int x=(int)a;
			int y=(int)b;
			try {
				sonuc=x/y;
			}
			catch(ArithmeticException ex) {
				jl.setText("Bir sayi sifira bölünemez!!");
				JOptionPane.showMessageDialog(jb1, ex.toString());
				}
			}
			else {
				sonuc=a/b;
				jl.setText("Sonuc: "+sonuc);
			}
	
		}
	}



	public static void main(String[] args) {
		Hesap obj=new Hesap();
	}

}
