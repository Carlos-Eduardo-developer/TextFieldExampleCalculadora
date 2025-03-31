
package textField;
import javax.swing.*;  
import java.awt.event.*;  
public class TextFieldExampleCalculadora implements ActionListener {  
	
    // Declaração de objetos JTextField e JButton 	
    JTextField textofonte1, textofonte2, textofonte3;  
    JButton botao1, botao2;  
    
    // Construtor
    TextFieldExampleCalculadora() {  
    	
        // Criando um objeto JFrame     	
        JFrame fonte = new JFrame("Calculadora Flamingo");   
        
        // Criando objetos JTextField        
        textofonte1 = new JTextField();  
        textofonte1.setBounds(50, 50, 150, 20);          
        textofonte2 = new JTextField();  
        textofonte2.setBounds(50, 100, 150, 20);          
        textofonte3 = new JTextField();  
        textofonte3.setBounds(50, 150, 150, 20);  
        
        // Tornando o textofonte3 não editável          
        textofonte3.setEditable(false);  
        
        // Criando objetos JButton         
        botao1 = new JButton("+");  
        botao1.setBounds(50, 200, 50, 50);   
        botao2 = new JButton("-");  
        botao2.setBounds(120, 200, 50, 50);  
        
        // Adicionando ActionListener aos botões         
        botao1.addActionListener(this);  
        botao2.addActionListener(this);  
        
             
        // Adicionando componentes ao JFrame         
        fonte.add(textofonte1);  
        fonte.add(textofonte2);  
        fonte.add(textofonte3);  
        fonte.add(botao1);  
        fonte.add(botao2);  
        
        // Configurando o tamanho e o layout do JFrame         
        fonte.setSize(300, 300);  
        fonte.setLayout(null);  
        
        // Tornando o JFrame visível         
        fonte.setVisible(true);  
    }  
    
    // método actionPerformed da interface ActionListener    
    public void actionPerformed(ActionEvent e) {  
    	
        // Recuperando texto de campos de texto     	
        String s1 = textofonte1.getText();  
        String s2 = textofonte2.getText();   
        
        // Convertendo entradas de string em inteiros         
        int a = Integer.parseInt(s1);  
        int b = Integer.parseInt(s2);     
        
        // Variável para armazenar o resultado          
        int c = 0;    
        
        // Verificando qual botão foi clicado        
        if (e.getSource() == botao1) {  
            c = a + b; // Adição
        } else if (e.getSource() == botao2) {  
            c = a - b; // Subtração
        }  
        
        // Convertendo o resultado de volta para uma string        
        String result = String.valueOf(c);    
        
        // Definir o resultado no terceiro campo de texto 
        textofonte3.setText(result);  
    }  
    public static void main(String[] args) {  
    	
        // Criando uma instância de TextFieldExample    	
        new TextFieldExampleCalculadora();  
    }  
}  
