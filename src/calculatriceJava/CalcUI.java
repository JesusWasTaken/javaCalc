package calculatriceJava;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcUI extends JFrame {
	
	private static final long serialVersionUID = 3559934134936754131L;
	public static JTextArea area;
	
	public CalcUI() {
		setTitle("Java calculator");
		setSize(400,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(Color.GRAY);
		
		
		JPanel pannel = new JPanel();
		pannel.setBackground(Color.DARK_GRAY);
		this.setContentPane(pannel);
		pannel.setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.input("7");
			}
		});
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(38, 208, 61, 40);
		pannel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.input("8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setBounds(119, 208, 61, 40);
		getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.input("9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setBounds(200, 208, 61, 40);
		getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.input("4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setBounds(38, 261, 61, 40);
		getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.input("5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setBounds(119, 261, 61, 40);
		getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.input("6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setBounds(200, 261, 61, 40);
		getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.input("1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setBounds(38, 311, 61, 40);
		getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.input("2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBounds(119, 311, 61, 40);
		getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.input("3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setBounds(200, 311, 61, 40);
		getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.input("0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setBounds(119, 361, 61, 40);
		getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.addDot();
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDot.setBackground(Color.LIGHT_GRAY);
		btnDot.setBounds(200, 361, 61, 40);
		getContentPane().add(btnDot);
		
		JButton btnPosNeg = new JButton("+ -");
		btnPosNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.negative();
			}
		});
		btnPosNeg.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPosNeg.setBackground(Color.LIGHT_GRAY);
		btnPosNeg.setBounds(38, 361, 61, 40);
		getContentPane().add(btnPosNeg);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBorderPainted(false);
		btnEqual.setForeground(Color.WHITE);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.calculate();
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEqual.setBackground(Color.BLACK);
		btnEqual.setBounds(279, 361, 61, 40);
		getContentPane().add(btnEqual);
		
		area = new JTextArea();
		area.setWrapStyleWord(true);
		area.setLineWrap(true);
		area.setBackground(Color.LIGHT_GRAY);
		area.setEditable(false);
		area.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		area.setBounds(38, 29, 302, 99);
		getContentPane().add(area);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBorderPainted(false);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.operator("+");
			}
		});
		btnPlus.setForeground(Color.WHITE);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPlus.setBackground(Color.BLACK);
		btnPlus.setBounds(279, 311, 61, 40);
		getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBorderPainted(false);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.operator("-");
			}
		});
		btnMinus.setForeground(Color.WHITE);
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMinus.setBackground(Color.BLACK);
		btnMinus.setBounds(279, 261, 61, 40);
		getContentPane().add(btnMinus);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBorderPainted(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.operator("/");
			}
		});
		btnDivide.setForeground(Color.WHITE);
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDivide.setBackground(Color.BLACK);
		btnDivide.setBounds(279, 208, 61, 40);
		getContentPane().add(btnDivide);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setBorderPainted(false);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.operator("*");
			}
		});
		btnMultiply.setForeground(Color.WHITE);
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMultiply.setBackground(Color.BLACK);
		btnMultiply.setBounds(279, 158, 61, 40);
		getContentPane().add(btnMultiply);
		
		JButton btnC = new JButton("C");
		btnC.setBorderPainted(false);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.reset();
			}
		});
		btnC.setForeground(Color.WHITE);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnC.setBackground(Color.BLACK);
		btnC.setBounds(38, 158, 61, 40);
		getContentPane().add(btnC);
		
		JButton btnCE = new JButton("CE");
		btnCE.setBorderPainted(false);
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.delCurr();
			}
		});
		btnCE.setForeground(Color.WHITE);
		btnCE.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCE.setBackground(Color.BLACK);
		btnCE.setBounds(119, 158, 61, 40);
		getContentPane().add(btnCE);
		
		JButton btnDelete = new JButton("<-");
		btnDelete.setBorderPainted(false);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMethods.del();
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelete.setBackground(Color.BLACK);
		btnDelete.setBounds(200, 158, 61, 40);
		getContentPane().add(btnDelete);
		setBackground(Color.GRAY);
		setResizable(false);
		//area.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		
		this.setVisible(true);
	}
}
