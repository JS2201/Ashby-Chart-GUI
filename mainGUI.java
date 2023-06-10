import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;
public class mainGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Ashby Chart GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
 
        JMenuBar obf = new JMenuBar();
        JMenu ob1 = new JMenu("File");
        JMenuItem m11 = new JMenuItem("Young's Modulus vs Density");
        JMenuItem m22 = new JMenuItem("Young's Modulus vs Cost");
        ob1.add(m11);
        ob1.add(m22);
        obf.add(ob1);
        frame.setJMenuBar(obf);
        
        JLabel label1 = new JLabel("Enter Young's Modulus (in GPa)");
        label1.setBounds(50, 60, 200, 30);
        JTextField tf1 = new JTextField(10); 
        tf1.setBounds(250, 60, 100, 30);
        JTextField tf12 = new JTextField(10); 
        tf12.setBounds(250, 60, 100, 30);
        JLabel label2 = new JLabel("Enter Density (in kg/m^3)");
        label2.setBounds(50, 90, 200, 30);
        JTextField tf2 = new JTextField(10); 
        tf2.setBounds(250, 90, 100, 30);
        JTextField tf22 = new JTextField(10); 
        tf22.setBounds(250, 90, 100, 30);
        JTextField tf4 = new JTextField(10); 
        tf4.setBounds(250, 90, 100, 30);
        JTextField tf44 = new JTextField(10); 
        tf44.setBounds(250, 90, 100, 30);
        JLabel label3= new JLabel("Desired material is: ");
        label3.setBounds(50, 200, 200, 30);
        JTextField tf3= new JTextField(15);
        tf3.setBounds(200, 200, 200, 30);
        JLabel label4 = new JLabel("Enter Young's Modulus (in GPa)");
        label4.setBounds(50, 60, 200, 30);
        JLabel label5 = new JLabel("Enter Cost (in Pound/kg)");
        label5.setBounds(50, 90, 200, 30);
        JButton find = new JButton("Find");
        find.setBounds(100, 300, 80, 50);
        JButton clear = new JButton("Clear");
        clear.setBounds(250, 300, 80, 50);
        m11.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e1) {
        		label1.setVisible(true);
        		label2.setVisible(true);
        		label4.setVisible(false);
        		label5.setVisible(false);
        		tf1.setVisible(true);
        		tf2.setVisible(true);
        		tf12.setVisible(false);
        		tf22.setVisible(false);
        		tf1.addKeyListener(new KeyAdapter(){
                	public void keyPressed(KeyEvent e2) {
                		char ch1= e2.getKeyChar();
                		if(Character.isDigit(ch1) || ch1=='.') {
                		}
                		else {
                			JOptionPane.showMessageDialog(null, "Only Numbers are Allowed!!");
                			tf1.setText(" ");
                		}
                	}
                });
                tf2.addKeyListener(new KeyAdapter(){
                	public void keyPressed(KeyEvent e3) {
                		char ch2= e3.getKeyChar();
                		if(Character.isDigit(ch2) || ch2=='.') {
                		}
                		else {
                			JOptionPane.showMessageDialog(null, "Only Numbers are Allowed!!");
                			tf2.setText(" ");
                		}
                	}
                });
                find.addActionListener(new ActionListener() {//Young's Modulus vs Density
                	public void actionPerformed(ActionEvent e4) {
                		float tf1_num= Float.parseFloat(tf1.getText()); 
                        float tf2_num= Float.parseFloat(tf2.getText());
                        if ((tf1_num>=45) && (tf1_num<=50) && (tf2_num>=1700) && (tf2_num<=1800)) {
                        	tf3.setText("Magnesium (Mg)");
                        }
                        else if ((tf1_num>=70) && (tf1_num<=90) && (tf2_num>=2500) && (tf2_num<=2900)) {
                        	tf3.setText("Aluminium (Al)");
                        }
                        else if ((tf1_num>=90) && (tf1_num<=140) && (tf2_num>=4300) && (tf2_num<=5000)) {
                        	tf3.setText("Titanium (Ti)");
                        }
                        else if ((tf1_num>=60) && (tf1_num<=110) && (tf2_num>=5000) && (tf2_num<=7800)) {
                        	tf3.setText("Zinc (Zn)");
                        }
                        else if ((tf1_num>=90) && (tf1_num<=210) && (tf2_num>=6500) && (tf2_num<=8000)) {
                        	tf3.setText("Cast Iron (Fe+C)");
                        }
                        else if ((tf1_num>=230) && (tf1_num<=250) && (tf2_num>=7900) && (tf2_num<=8000)) {
                        	tf3.setText("Stainless/Mild Steel (Fe+C)");
                        }
                        else if ((tf1_num>=280) && (tf1_num<=350) && (tf2_num>=8000) && (tf2_num<=8500)) {
                        	tf3.setText("Alloy Steel (Fe+C)");
                        }
                        else if ((tf1_num>=140) && (tf1_num<=300) && (tf2_num>=7500) && (tf2_num<=9000)) {
                        	tf3.setText("Nickel (Ni)");
                        }
                        else if ((tf1_num>=130) && (tf1_num<=140) && (tf2_num>=8400) && (tf2_num<=8500)) {
                        	tf3.setText("Copper (Cu)");
                        }
                        else if ((tf1_num>=90) && (tf1_num<=120) && (tf2_num>=8000) && (tf2_num<=8400)) {
                        	tf3.setText("Brass (Cu+Zn)");
                        }
                        else if ((tf1_num>=12) && (tf1_num<=15) && (tf2_num>=10500) && (tf2_num<=11000)) {
                        	tf3.setText("Lead (Pb)");
                        }
                        else if ((tf1_num>=70) && (tf1_num<=80) && (tf2_num>=19500) && (tf2_num<=20000)) {
                        	tf3.setText("Gold (Au)");
                        }
                        else if ((tf1_num>=9) && (tf1_num<=70) && (tf2_num>=2000) && (tf2_num<=2400)) {
                        	tf3.setText("Brick");
                        }
                        else if ((tf1_num>=20) && (tf1_num<=40) && (tf2_num>=2200) && (tf2_num<=2600)) {
                        	tf3.setText("Concrete");
                        }
                        else if ((tf1_num>=55) && (tf1_num<=80) && (tf2_num>=2500) && (tf2_num<=2800)) {
                        	tf3.setText("Glasses");
                        }
                        else if ((tf1_num>=60) && (tf1_num<=80) && (tf2_num>=1900) && (tf2_num<=2500)) {
                        	tf3.setText("Porcelain");
                        }
                        else if ((tf1_num>=140) && (tf1_num<=200) && (tf2_num>=2300) && (tf2_num<=2400)) {
                        	tf3.setText("Silicon (Si)");
                        }
                        else if ((tf1_num>=450) && (tf1_num<=500) && (tf2_num>=3000) && (tf2_num<=3500)) {
                        	tf3.setText("Silicon Carbide (SiC)");
                        }
                        else if ((tf1_num>=850) && (tf1_num<=1000) && (tf2_num>=4000) && (tf2_num<=4500)) {
                        	tf3.setText("Diamond (C)");
                        }
                        else if ((tf1_num>=280) && (tf1_num<=400) && (tf2_num>=3500) && (tf2_num<=4400)) {
                        	tf3.setText("Alumina (Al2O3)");
                        }
                        else if ((tf1_num>=100) && (tf1_num<=300) && (tf2_num>=5000) && (tf2_num<=6000)) {
                        	tf3.setText("Zirconia (ZrO2)");
                        }
                        else if ((tf1_num>=60) && (tf1_num<=180) && (tf2_num>=1700) && (tf2_num<=1800)) {
                        	tf3.setText("CFRP");
                        }
                        else if ((tf1_num>=18) && (tf1_num<=50) && (tf2_num>=1500) && (tf2_num<=2000)) {
                        	tf3.setText("GFRP");
                        }
                        else if ((tf1_num>=1) && (tf1_num<=2) && (tf2_num>=850) && (tf2_num<=900)) {
                        	tf3.setText("Polypropylene");
                        }
                        else if ((tf1_num>=1) && (tf1_num<=3) && (tf2_num>=1200) && (tf2_num<=1400)) {
                        	tf3.setText("Nylon");
                        }
                        else if ((tf1_num>=2) && (tf1_num<=3) && (tf2_num>=1300) && (tf2_num<=1400)) {
                        	tf3.setText("Polycarbonate");
                        }
                        else if ((tf1_num>=2) && (tf1_num<=4) && (tf2_num>=1400) && (tf2_num<=1600)) {
                        	tf3.setText("uPVC");
                        }
                        else if ((tf1_num>=2) && (tf1_num<=4) && (tf2_num>=1000) && (tf2_num<=1200)) {
                        	tf3.setText("Polystyrene");
                        }
                        else if ((tf1_num>=6) && (tf1_num<=10) && (tf2_num>=1200) && (tf2_num<=1500)) {
                        	tf3.setText("UF Polymer");
                        }
                        else if ((tf1_num>=0.01) && (tf1_num<=0.5) && (tf2_num>=100) && (tf2_num<=500)) {
                        	tf3.setText("Foams");
                        }
                        else if ((tf1_num>=0.01) && (tf1_num<=0.1) && (tf2_num>=900) && (tf2_num<=3200)) {
                        	tf3.setText("Rubbers");
                        }
                        else if ((tf1_num>=0.1) && (tf1_num<=0.2) && (tf2_num>=120) && (tf2_num<=200)) {
                        	tf3.setText("Balsa (AG)");
                        }
                        else if ((tf1_num>=3) && (tf1_num<=5) && (tf2_num>=110) && (tf2_num<=180)) {
                        	tf3.setText("Balsa (WG)");
                        }
                        else if ((tf1_num>=0.8) && (tf1_num<=11) && (tf2_num>=400) && (tf2_num<=700)) {
                        	tf3.setText("Pine (WG)");
                        }
                        else if ((tf1_num>=12) && (tf1_num<=25) && (tf2_num>=550) && (tf2_num<=900)) {
                        	tf3.setText("Oak (WG)");
                        }
                        else if ((tf1_num>=2) && (tf1_num<=7) && (tf2_num>=600) && (tf2_num<=900)) {
                        	tf3.setText("Oak (AG)");
                        }
                        else if ((tf1_num>=2) && (tf1_num<=4) && (tf2_num>=700) && (tf2_num<=1200)) {
                        	tf3.setText("Paper");
                        }
                        else if ((tf1_num>=0.7) && (tf1_num<=2) && (tf2_num>=420) && (tf2_num<=750)) {
                        	tf3.setText("Pine (AG)");
                        }
                        else if ((tf1_num>=2) && (tf1_num<=5) && (tf2_num>=600) && (tf2_num<=900)) {
                        	tf3.setText("MDF");
                        }
                        else {
                        	tf3.setText("Material Not Found");
                        }
                	}
                });
        	}
        });
        m22.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e5) {
        		label1.setVisible(false);
        		label2.setVisible(false);
        		label4.setVisible(true);
        		label5.setVisible(true);
        		tf1.setVisible(false);
        		tf2.setVisible(false);
        		tf12.setVisible(true);
        		tf22.setVisible(true);
        		 tf12.addKeyListener(new KeyAdapter(){
        	        	public void keyPressed(KeyEvent e6) {
        	        		char ch1= e6.getKeyChar();
        	        		if(Character.isDigit(ch1) || ch1=='.') {
        	        		}
        	        		else {
        	        			JOptionPane.showMessageDialog(null, "Only Numbers are Allowed!!");
        	        			tf12.setText(" ");
        	        		}
        	        	}
        	        });
        	        tf22.addKeyListener(new KeyAdapter(){
        	        	public void keyPressed(KeyEvent e7) {
        	        		char ch2= e7.getKeyChar();
        	        		if(Character.isDigit(ch2) || ch2=='.') {
        	        		}
        	        		else {
        	        			JOptionPane.showMessageDialog(null, "Only Numbers are Allowed!!");
        	        			tf22.setText(" ");
        	        		}
        	        	}
        	        });
        	        find.addActionListener(new ActionListener() {//Young's Modulus vs Cost
        	        	public void actionPerformed(ActionEvent e8) {
        	        		float tf12_num= Float.parseFloat(tf12.getText()); 
        	                float tf22_num= Float.parseFloat(tf22.getText());
        	                if ((tf12_num>=45) && (tf12_num<=50) && (tf22_num>=2) && (tf22_num<=8)) {
        	                	tf3.setText("Magnesium (Mg)");
        	                }
        	                else if ((tf12_num>=70) && (tf12_num<=90) && (tf22_num>=0.9) && (tf22_num<=2)) {
        	                	tf3.setText("Aluminium (Al)");
        	                }
        	                else if ((tf12_num>=90) && (tf12_num<=140) && (tf22_num>=15) && (tf22_num<=40)) {
        	                	tf3.setText("Titanium (Ti)");
        	                }
        	                else if ((tf12_num>=60) && (tf12_num<=110) && (tf22_num>=0.6) && (tf22_num<=2)) {
        	                	tf3.setText("Zinc (Zn)");
        	                }
        	                else if ((tf12_num>=90) && (tf12_num<=210) && (tf22_num>=0.1) && (tf22_num<=0.6)) {
        	                	tf3.setText("Cast Iron (Fe+C)");
        	                }
        	                else if ((tf12_num>=230) && (tf12_num<=250) && (tf22_num>=0.9) && (tf22_num<=8)) {
        	                	tf3.setText("Stainless/Mild Steel (Fe+C)");
        	                }
        	                else if ((tf12_num>=280) && (tf12_num<=350) && (tf22_num>=3) && (tf22_num<=10)) {
        	                	tf3.setText("Alloy Steel (Fe+C)");
        	                }
        	                else if ((tf12_num>=140) && (tf12_num<=300) && (tf22_num>=3) && (tf22_num<=22)) {
        	                	tf3.setText("Nickel (Ni)");
        	                }
        	                else if ((tf12_num>=130) && (tf12_num<=140) && (tf22_num>=1.4) && (tf22_num<=1.5)) {
        	                	tf3.setText("Copper (Cu)");
        	                }
        	                else if ((tf12_num>=90) && (tf12_num<=120) && (tf22_num>=0.9) && (tf22_num<=1.6)) {
        	                	tf3.setText("Brass (Cu+Zn)");
        	                }
        	                else if ((tf12_num>=12) && (tf12_num<=15) && (tf22_num>=0.4) && (tf22_num<=0.8)) {
        	                	tf3.setText("Lead (Pb)");
        	                }
        	                else if ((tf12_num>=70) && (tf12_num<=80) && (tf22_num>=80) && (tf22_num<=9000)) {
        	                	tf3.setText("Gold (Au)");
        	                }
        	                else if ((tf12_num>=9) && (tf12_num<=70) && (tf22_num>=0.3) && (tf22_num<=0.7)) {
        	                	tf3.setText("Brick");
        	                }
        	                else if ((tf12_num>=20) && (tf12_num<=40) && (tf22_num>=0.02) && (tf22_num<=0.06)) {
        	                	tf3.setText("Concrete");
        	                }
        	                else if ((tf12_num>=55) && (tf12_num<=80) && (tf22_num>=2.2) && (tf22_num<=3.2)) {
        	                	tf3.setText("Glasses");
        	                }
        	                else if ((tf12_num>=60) && (tf12_num<=80) && (tf22_num>=0.6) && (tf22_num<=5)) {
        	                	tf3.setText("Porcelain");
        	                }
        	                else if ((tf12_num>=140) && (tf12_num<=200) && (tf22_num>=0.8) && (tf22_num<=1.6)) {
        	                	tf3.setText("Silicon (Si)");
        	                }
        	                else if ((tf12_num>=450) && (tf12_num<=500) && (tf22_num>=7) && (tf22_num<=10)) {
        	                	tf3.setText("Silicon Carbide (SiC)");
        	                }
        	                else if ((tf12_num>=850) && (tf12_num<=1000) && (tf22_num>=60) && (tf22_num<=200000)) {
        	                	tf3.setText("Diamond (C)");
        	                }
        	                else if ((tf12_num>=280) && (tf12_num<=400) && (tf22_num>=5) && (tf22_num<=2500)) {
        	                	tf3.setText("Alumina (Al2O3)");
        	                }
        	                else if ((tf12_num>=100) && (tf12_num<=300) && (tf22_num>=8) && (tf22_num<=14)) {
        	                	tf3.setText("Zirconia (ZrO2)");
        	                }
        	                else if ((tf12_num>=60) && (tf12_num<=180) && (tf22_num>=25) && (tf22_num<=60)) {
        	                	tf3.setText("CFRP");
        	                }
        	                else if ((tf12_num>=18) && (tf12_num<=50) && (tf22_num>=1.4) && (tf22_num<=2.7)) {
        	                	tf3.setText("GFRP");
        	                }
        	                else if ((tf12_num>=1) && (tf12_num<=2) && (tf22_num>=0.5) && (tf22_num<=0.7)) {
        	                	tf3.setText("Polypropylene");
        	                }
        	                else if ((tf12_num>=1) && (tf12_num<=3) && (tf22_num>=2.5) && (tf22_num<=5.5)) {
        	                	tf3.setText("Nylon");
        	                }
        	                else if ((tf12_num>=2) && (tf12_num<=3) && (tf22_num>=2.7) && (tf22_num<=3)) {
        	                	tf3.setText("Polycarbonate");
        	                }
        	                else if ((tf12_num>=2) && (tf12_num<=4) && (tf22_num>=0.45) && (tf22_num<=0.6)) {
        	                	tf3.setText("uPVC");
        	                }
        	                else if ((tf12_num>=2) && (tf12_num<=4) && (tf22_num>=0.6) && (tf22_num<=0.8)) {
        	                	tf3.setText("Polystyrene");
        	                }
        	                else if ((tf12_num>=6) && (tf12_num<=10) && (tf22_num>=0.8) && (tf22_num<=1)) {
        	                	tf3.setText("UF Polymer");
        	                }
        	                else if ((tf12_num>=0.01) && (tf12_num<=0.5) && (tf22_num>=0.8) && (tf22_num<=60)) {
        	                	tf3.setText("Foams");
        	                }
        	                else if ((tf12_num>=0.01) && (tf12_num<=0.1) && (tf22_num>=0.8) && (tf22_num<=12)) {
        	                	tf3.setText("Rubbers");
        	                }
        	                else if ((tf12_num>=0.1) && (tf12_num<=0.2) && (tf22_num>=5) && (tf22_num<=8)) {
        	                	tf3.setText("Balsa (AG)");
        	                }
        	                else if ((tf12_num>=3) && (tf12_num<=5) && (tf22_num>=5) && (tf22_num<=7)) {
        	                	tf3.setText("Balsa (WG)");
        	                }
        	                else if ((tf12_num>=0.8) && (tf12_num<=11) && (tf22_num>=0.5) && (tf22_num<=1.6)) {
        	                	tf3.setText("Pine (WG)");
        	                }
        	                else if ((tf12_num>=12) && (tf12_num<=25) && (tf22_num>=1.5) && (tf22_num<=8)) {
        	                	tf3.setText("Oak (WG)");
        	                }
        	                else if ((tf12_num>=2) && (tf12_num<=7) && (tf22_num>=1.6) && (tf22_num<=8)) {
        	                	tf3.setText("Oak (AG)");
        	                }
        	                else if ((tf12_num>=2) && (tf12_num<=4) && (tf22_num>=1) && (tf22_num<=6)) {
        	                	tf3.setText("Paper");
        	                }
        	                else if ((tf12_num>=0.7) && (tf12_num<=2) && (tf22_num>=0.5) && (tf22_num<=1.5)) {
        	                	tf3.setText("Pine (AG)");
        	                }
        	                else if ((tf12_num>=2) && (tf12_num<=5) && (tf22_num>=0.5) && (tf22_num<=0.6)) {
        	                	tf3.setText("MDF");
        	                }
        	                else {
        	                	tf3.setText("Material Not Found");
        	                }
        	        	}
        	        });
        	}
        });
        
        
        clear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e4) {
        		tf1.setText(" ");
        		tf2.setText(" ");
        		tf12.setText(" ");
        		tf22.setText(" ");
        		tf3.setText(" ");
        	}
        });
        
        frame.add(label1); 
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(tf12);
        frame.add(tf22);
        frame.add(find);
        frame.add(clear);
        frame.setLayout(null);
        frame.setVisible(true);

	}

}
