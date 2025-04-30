
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazTeatroMunicipal extends JFrame {
    private JRadioButton rPalco, rPlatea, rGaleria;
    private JTextField txtNumero, txtDias;
    private JButton btnVender, btnSalir;
    private JLabel lblResultado;

    public InterfazTeatroMunicipal() {
        setTitle("Teatro Municipal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Teatro Municipal", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        add(titulo, BorderLayout.NORTH);

        JPanel centro = new JPanel(new GridLayout(6, 2, 5, 5));
        centro.setBorder(BorderFactory.createTitledBorder("Datos del Boleto"));

        ButtonGroup grupo = new ButtonGroup();
        rPalco = new JRadioButton("Palco");
        rPlatea = new JRadioButton("Platea");
        rGaleria = new JRadioButton("Galería");
        grupo.add(rPalco);
        grupo.add(rPlatea);
        grupo.add(rGaleria);
        rPalco.setSelected(true);

        centro.add(rPalco);
        centro.add(rPlatea);
        centro.add(rGaleria);
        centro.add(new JLabel("Número:"));
        txtNumero = new JTextField("1");
        centro.add(txtNumero);
        centro.add(new JLabel("Cant. Días para el Evento:"));
        txtDias = new JTextField();
        centro.add(txtDias);

        btnVender = new JButton("Vende");
        btnSalir = new JButton("Salir");
        centro.add(btnVender);
        centro.add(btnSalir);

        add(centro, BorderLayout.CENTER);

        lblResultado = new JLabel("Información: ", JLabel.CENTER);
        lblResultado.setFont(new Font("Arial", Font.BOLD, 16));
        add(lblResultado, BorderLayout.SOUTH);

        btnVender.addActionListener(e -> venderBoleto());
        btnSalir.addActionListener(e -> System.exit(0));

        setSize(450, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void venderBoleto() {
        try {
            int numero = Integer.parseInt(txtNumero.getText().trim());
            int dias = txtDias.getText().isEmpty() ? 0 : Integer.parseInt(txtDias.getText().trim());

            Boleto boleto;
            if (rPalco.isSelected()) {
                boleto = new Palco(numero);
            } else if (rPlatea.isSelected()) {
                boleto = new Platea(numero, dias);
            } else {
                boleto = new Galeria(numero, dias);
            }

            lblResultado.setText("Número: " + numero + ", Precio: " + boleto.getPrecio());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos.");
        }
    }

    public static void main(String[] args) {
        new InterfazTeatroMunicipal();
    }
}
