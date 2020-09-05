package claculator.gui;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class ClaculatorGUI extends JFrame implements ActionListener {
    
          JTextField x,y;
          JButton sum,mul,div;
          JLabel result;
          
    
    public ClaculatorGUI(){
        this.setSize(300,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        
        x= new JTextField(10);
        y= new JTextField(10); 
        div= new JButton("division");
        mul = new JButton("multiply");
        sum= new JButton("sum");
        result =new JLabel("result");
        
        sum.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        add(x); add(y);
        add(sum);  add(mul); add(div);
        add(result); 
}
    @Override
    public void actionPerformed(ActionEvent e) {
         Object obj=e.getSource();
         double first =Double.valueOf(x.getText());
         double second =Double.valueOf(y.getText());
         double res = first + second;
         double mul1 = first * second;
         double div1= first / second ;
         if(obj.equals(sum))
          {
         result.setText("result  " +String.valueOf(res));
           }
         else if(obj.equals(mul))
          {
          result.setText("result "+String.valueOf(mul1));
          }
         else if(obj.equals(div))
              result.setText("result" +String.valueOf(div1));
    }
    
    
    
    public static void main(String[] args) {
       new ClaculatorGUI().setVisible(true);
       
    }
}
    
