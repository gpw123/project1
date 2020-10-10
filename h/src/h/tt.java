package h;

public class tt {
  public static void main(String[] arrgs){
	  System.out.println("Hello, world");
	  System.out.println("Hello, world"+9);
  }
}
/**

/**

   *@Date：2019-01-02

   *@Author：帅气的吴先生

   *@Attention:转载请注明出处

**/

 

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

 

public class Calculator extends JFrame {

	private JTextField field1;

	private JTextField field2;

	private JTextField field3;  //文本框

	

	private JButton bjia;

	private JButton bjian;

	private JButton bcheng;

	private JButton bchu;  //操作符按钮

	

	private JPanel jptop;

	private JPanel jpop;

	private JPanel jpbottom; // 面板

	

	public static void main(String []arg) {

		Calculator calc = new Calculator();

		calc.setVisible(true);  //设置框架为可见

	}

	

	//计算器的面板和布局

	void createUI() {

		setTitle("计算器");

		setBounds(330, 250, 300, 250);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

		setLayout(null);

		

		jpop = new JPanel();

		jpop.setLayout(new GridLayout(1,4));

		jpop.setBounds(10,100,260,40);

		

		jptop = new JPanel();

		jptop.setLayout(new GridLayout(2,1,0,2));

		jptop.setBounds(10,10,260,80);

		

		jpbottom = new JPanel();

		jpbottom.setLayout(new GridLayout(1,1));

		jpbottom.setBounds(10,150,260,40);

		

		add(jpop);

		add(jptop);

		add(jpbottom);

		

		field1 = new JTextField();

		field2 = new JTextField();

		field3 = new JTextField();

		

		bjia = new JButton("+");

		bjian = new JButton("-");

		bcheng = new JButton("*");

		bchu = new JButton("/");

		

		jptop.add(field1);

		jptop.add(field2);

		jpbottom.add(field3);

		jpop.add(bjia);

		jpop.add(bjian);

		jpop.add(bcheng);

		jpop.add(bchu);

	}

 

	//事件监听器

	void creatListener() {

		bjia.addActionListener(new MyActionListener(field1, field2, field3, '+'));

		bjian.addActionListener(new MyActionListener(field1, field2, field3, '-'));

		bcheng.addActionListener(new MyActionListener(field1, field2, field3, '*'));

		bchu.addActionListener(new MyActionListener(field1, field2, field3, '/'));

	}

	

	//构造函数

	public Calculator() {

		createUI();

		creatListener();

	}

}

 

class MyActionListener implements ActionListener{

	JTextField num1;

	JTextField num2;

	JTextField result;

	char op;

	public MyActionListener(JTextField num1,JTextField num2,JTextField result,char op){

	       this.num1 = num1;

	       this.num2 = num2;

	       this.result = result;

	       this.op = op;

	   }

	public void actionPerformed(ActionEvent e){

        int x=Integer.parseInt(num1.getText());

        int y=Integer.parseInt(num2.getText());

        double z = 0;

        switch(op) {

        	case '+': z = x + y;break;

        	case '-': z = x - y;break;

        	case '*': z = x * y;break;

        	case '/': z = (double)x / y;break;

        }

        result.setText(Double.toString(z));

    }

}
**/
