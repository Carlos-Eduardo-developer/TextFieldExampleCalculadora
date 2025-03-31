package textFieldLabel;

import javax.swing.*;  
import java.awt.event.*;  
public class TextFieldExampleCalculadoraLabel implements ActionListener {  
    // Declaration of JTextField and JButton objects  
    JTextField textofonte1, textofonte2, textofonte3;  
    JButton botao1, botao2;  
    // Constructor  
    TextFieldExampleCalculadoraLabel() {  
        // Creating a JFrame object  
        JFrame quadro = new JFrame("Calculadora");   
        
        // Creating JTextField objects  
        JLabel l1,l2,l3;  
        l1=new JLabel("Digite um número :");
        l1.setBounds(50, 30, 150, 20);  
        l2=new JLabel("Digite um número :");
        l2.setBounds(50, 80, 150, 20); 
        l3=new JLabel("resultado:");
        l3.setBounds(50, 130, 150, 20); 
        textofonte1 = new JTextField();  
        textofonte1.setBounds(50, 50, 150, 20);          
        textofonte2 = new JTextField();  
        textofonte2.setBounds(50, 100, 150, 20);          
        textofonte3 = new JTextField();  
        textofonte3.setBounds(50, 150, 150, 20);  
        // Making tf3 non-editable  
        textofonte3.setEditable(false);  
        // Creating JButton objects  
        botao1 = new JButton("+");  
        botao1.setBounds(50, 200, 50, 50);          
        botao2 = new JButton("-");  
        botao2.setBounds(120, 200, 50, 50);  
        // Adding ActionListener to buttons  
        botao1.addActionListener(this);  
        botao2.addActionListener(this);  
        // Adding components to the JFrame 
        quadro.add(l1);
        quadro.add(l2);
        quadro.add(l3);
        quadro.add(textofonte1);  
        quadro.add(textofonte2);  
        quadro.add(textofonte3);  
        quadro.add(botao1);  
        quadro.add(botao2);  
        // Setting JFrame size and layout  
        quadro.setSize(300, 300);  
        quadro.setLayout(null);  
        // Making JFrame visible  
        quadro.setVisible(true);  
    }  
    // actionPerformed method from ActionListener interface  
    public void actionPerformed(ActionEvent e) {  
        // Retrieving text from text fields  
        String s1 = textofonte1.getText();  
        String s2 = textofonte2.getText();         
        // Converting string inputs to integers  
        int a = Integer.parseInt(s1);  
        int b = Integer.parseInt(s2);          
        // Variable to hold the result  
        int c = 0;          
        // Checking which button is clicked  
        if (e.getSource() == botao1) {  
            c = a + b; // Addition  
        } else if (e.getSource() == botao2) {  
            c = a - b; // Subtraction  
        }          
        // Converting result back to a string  
        String result = String.valueOf(c);          
        // Setting the result in the third text field  
        textofonte3.setText(result);  
    }  
    public static void main(String[] args) {  
        // Creating an instance of TextFieldExample  
        new TextFieldExampleCalculadoraLabel();  
    }  
}