/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tela;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 *
 * @author Edy
 */
public class Tela extends JFrame {

    private JLabel numero1 = new JLabel("Número 1:");
    private JLabel numero2 = new JLabel("Número 2:");

    private JTextField num1 = new JTextField();
    private JTextField num2 = new JTextField();

    private JButton botaoCalcular = new JButton("Calcular");
    //private JButton botaoEnviarTodos = new JButton("Enviar Todos");

    private JComboBox opcoes = new JComboBox();

    private JTextArea resultado = new JTextArea(10,22);

    public Tela() {
        super("Calculadora Distribuída");
    }

    public void mostraTela() {

        //Monta a interface

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 380);

        this.setLayout(new FlowLayout());

        GridLayout gl = new GridLayout(5,2,10,1);
        JPanel panel = new JPanel(gl);

        panel.add(numero1);
        panel.add(num1);

        panel.add(numero2);
        panel.add(num2);

        opcoes.addItem("Adição (+)");
        opcoes.addItem("Subtração (-)");
        opcoes.addItem("Multiplicação (*)");
        opcoes.addItem("Divisão (/)");

        panel.add(opcoes);
        panel.add((new JPanel()));

        FazCalculo faz = new FazCalculo();
        faz.setArea(resultado);
        faz.setValor1(num1);
        faz.setValor2(num2);
        faz.setOperacao(opcoes);
        botaoCalcular.addActionListener(faz);

        //EnviaParaTodos enviar = new EnviaParaTodos();
        //botaoEnviarTodos.addActionListener(enviar);

        
        panel.add(botaoCalcular);
        //panel.add(botaoEnviarTodos);

        this.add(panel);

        resultado.setEditable(false);
        JPanel panel2 = new JPanel();
        panel2.add(new JScrollPane(resultado));

        this.add(panel2);
        this.setVisible(true);

    }

}
