/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tela;

import br.com.motim.web.client.Calculator;
import br.com.motim.web.client.CalculatorService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Edy
 */
public class FazCalculo implements ActionListener {

    private JTextField valor1;
    private JTextField valor2;
    private JTextArea  area;
    private JComboBox  operacao;

    public FazCalculo() {

    }

    public void actionPerformed(ActionEvent arg0)
    {
        //procura pelo serviço
        CalculatorService calculatorService = new CalculatorService();
        Calculator calculator = calculatorService.getCalculatorPort();      

        //method local inner class que faz o parse dos operadores
        class Parser
        {
            private int operation;
            private double oper1;
            private double oper2;

            public  Parser(String oper1, int operation, String oper2)
            {                
                this.oper1 = Double.parseDouble(oper1.trim().isEmpty() ? "0" : oper1);
                this.operation = operation;
                this.oper2 = Double.parseDouble(oper2.trim().isEmpty() ? "0" : oper2);
            }

            public int getOperation()
            {
                return operation;
            }

            public double getOper1()
            {
                return oper1;
            }

            public double getOper2()
            {
                return oper2;
            }
        }

        //method local inner class que chama o serviço requisitado
        class CallService
        {
            public  String calc(Calculator calculator, double oper1, int operation, double oper2)
            {
                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(5);
                double result;
                switch(operation)
                {
                    case 0: result =  calculator.sum(oper1, oper2);break;
                    case 1: result =  calculator.subtract(oper1, oper2);break;
                    case 2: result =  calculator.multiply(oper1, oper2);break;
                    case 3: result =  calculator.divide(oper1, oper2);break;
                    default: throw new IllegalArgumentException();
                }
                
                return nf.format(result);
            }
        }

        Parser parser = new Parser(getValor1().getText(), operacao.getSelectedIndex(), getValor2().getText());
        area.setText(area.getText().trim() + ((area.getText().trim().length() > 0)?"\n":"") + "Resultado da Operação: " +
                    new CallService().calc(calculator,
                                                                parser.getOper1(),
                                                                parser.getOperation(),
                                                                parser.getOper2()) + "\n ");
    }

    public JTextField getValor1() {
        return valor1;
    }

    public void setValor1(JTextField valor1) {
        this.valor1 = valor1;
    }

    public JTextField getValor2() {
        return valor2;
    }

    public void setValor2(JTextField valor2) {
        this.valor2 = valor2;
    }

    public JTextArea getArea() {
        return area;
    }

    public void setArea(JTextArea area) {
        this.area = area;
    }

    /**
     * @return the operacao
     */
    public JComboBox getOperacao() {
        return operacao;
    }

    /**
     * @param operacao the operacao to set
     */
    public void setOperacao(JComboBox operacao) {
        this.operacao = operacao;
    }

}
