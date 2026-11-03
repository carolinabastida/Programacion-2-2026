
package POOShowcaseActividad;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.net.URI;
import javax.swing.*;

public class Main {

    // Los cuatro conceptos que vamos a trabajar.
    private static Concepto[] conceptos = {
        new Concepto(
            1,
            "Abstracción",
            "La abstracción consiste en representar los aspectos "
            + "más importantes de algo, sin incluir detalles "
            + "que no necesitamos. Por ejemplo, en un sistema "
            + "escolar podemos representar a un estudiante "
            + "mediante su nombre, grupo y calificaciones. "
            + "Esto permite organizar mejor la información.",
            new String[]{"POO", "Abstracción"},
            ""
        ),

        new Concepto(
            2,
            "Encapsulamiento",
            "El encapsulamiento permite proteger los datos "
            + "de un objeto. En Java podemos declarar atributos "
            + "privados y utilizar métodos para consultar o "
            + "modificar sus valores. Por ejemplo, una cuenta "
            + "bancaria puede tener un saldo privado y un "
            + "método que controle los retiros de dinero.",
            new String[]{"POO", "Encapsulamiento"},
            ""
        ),

        new Concepto(
            3,
            "Herencia",
            "La herencia permite crear una clase a partir "
            + "de otra. La nueva clase puede aprovechar "
            + "atributos y métodos de la clase original. "
            + "Por ejemplo, una clase Estudiante puede "
            + "heredar de una clase Persona. En Java "
            + "utilizamos la palabra extends.",
            new String[]{"POO", "Herencia"},
            ""
        ),

        new Concepto(
            4,
            "Polimorfismo",
            "El polimorfismo permite que un mismo método "
            + "tenga comportamientos diferentes según "
            + "el objeto que lo utiliza. Por ejemplo, "
            + "las clases Perro y Gato pueden tener "
            + "un método hacerSonido, pero cada una "
            + "produce un resultado diferente.",
            new String[]{"POO", "Polimorfismo"},
            ""
        )
    };

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> crearVentana());
    }

    // Preparamos la ventana principal.
    private static void crearVentana() {

        JFrame ventana = new JFrame("POOShowcase");
        ventana.setSize(700, 450);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel panelSuperior = new JPanel(new FlowLayout());
        panelSuperior.add(new JLabel("Elegí un concepto:"));

        JComboBox<String> lista = new JComboBox<>();

        for (Concepto c : conceptos) {
            lista.addItem(c.getConcepto());
        }

        panelSuperior.add(lista);
        ventana.add(panelSuperior, BorderLayout.NORTH);

        JTextArea descripcion = new JTextArea();
        descripcion.setEditable(false);
        descripcion.setLineWrap(true);
        descripcion.setWrapStyleWord(true);
        descripcion.setMargin(new java.awt.Insets(20, 20, 20, 20));

        ventana.add(
            new JScrollPane(descripcion),
            BorderLayout.CENTER
        );

        JButton botonEjemplo = new JButton("Ver ejemplo en Replit");

        JPanel panelInferior = new JPanel();
        panelInferior.add(botonEjemplo);

        ventana.add(panelInferior, BorderLayout.SOUTH);

        // Mostramos la explicación del tema elegido.
        lista.addActionListener(e -> {
            int posicion = lista.getSelectedIndex();
            Concepto elegido = conceptos[posicion];

            descripcion.setText(
                elegido.getConcepto() + "\n\n"
                + elegido.getDescripcion()
            );
        });

        // Abrimos el ejemplo cuando tenga un enlace.
        botonEjemplo.addActionListener(e -> {
            int posicion = lista.getSelectedIndex();
            Concepto elegido = conceptos[posicion];
            String enlace = elegido.getEnlaceReplit();

            if (enlace == null || enlace.isEmpty()) {
                JOptionPane.showMessageDialog(
                    ventana,
                    "Todavía falta agregar el ejemplo de Replit."
                );
                return;
            }

            try {
                Desktop.getDesktop().browse(new URI(enlace));
            } catch (Exception error) {
                JOptionPane.showMessageDialog(
                    ventana,
                    "No se pudo abrir el enlace."
                );
            }
        });

        descripcion.setText(
            conceptos[0].getConcepto() + "\n\n"
            + conceptos[0].getDescripcion()
        );

        ventana.setVisible(true);
    }
}
