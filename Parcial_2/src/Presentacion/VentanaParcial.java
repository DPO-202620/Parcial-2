package Presentacion;

import logica.parcial;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaParcial extends JFrame implements ActionListener
{
    JTextField txtA;
    JTextField txtB;
    JTextField txtC;
    JButton btnCalcular;
    JLabel lblResultado;

    public VentanaParcial()
    {
        setLayout(new GridLayout(4, 2));

        JLabel lblA = new JLabel("a: ");
        txtA = new JTextField();
        
        JLabel lblB = new JLabel("b: ");
        txtB = new JTextField();
        
        JLabel lblC = new JLabel("c: ");
        txtC = new JTextField();
        
        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(this); 
        
        lblResultado = new JLabel("");
        lblResultado.setForeground(Color.BLACK);

        add(lblA);
        add(txtA);
        add(lblB);
        add(txtB);
        add(lblC);
        add(txtC);
        add(btnCalcular);
        add(lblResultado);

        setTitle("Examen Hector Florez");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320, 180);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnCalcular) {
            try {
                double a = Double.parseDouble(txtA.getText());
                double b = Double.parseDouble(txtB.getText());
                double c = Double.parseDouble(txtC.getText());

                parcial miLogica = new parcial();
                String resultado = miLogica.calcularRaices(a, b, c);
                String resultadoFinal = resultado.replace("Raíz 1: ", "x=").replace(" | Raíz 2: ", ", x=");
                resultadoFinal = resultadoFinal.replace(".0", "");                
                lblResultado.setText(resultadoFinal);
                
            } catch (Exception excepcion) {
                lblResultado.setText("Error");
            }
        }
    }

    public static void main(String[] args)
    {
        new VentanaParcial();
    }
}