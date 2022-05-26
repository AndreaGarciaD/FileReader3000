import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Panel extends JPanel implements ActionListener {

    JButton btnImportar = new JButton("Importar");
    JButton btnEliminar = new JButton("Eliminar");
    JButton btnSalir = new JButton("Salir");
    DefaultTableModel registro = new DefaultTableModel();
    JTable tabla;
    File archivo;
    private Lista<Persona> listaPersona = new Lista<>();

    public Panel() {
        setLayout(null);
        registro.addColumn("Nombre");
        registro.addColumn("Genero");
        registro.addColumn("Edad");
        tabla = new JTable(registro);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(200, 20, 400, 500);
        add(scroll);

        btnImportar.setBounds(50, 50, 100, 30);
        btnImportar.addActionListener(this);
        add(btnImportar);
        btnEliminar.setBounds(50, 100, 100, 30);
        btnEliminar.addActionListener(this);
        add(btnEliminar);
        btnSalir.setBounds(50, 150, 100, 30);
        btnSalir.addActionListener(this);
        add(btnSalir);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnImportar) {
            try {
                archivo = new File("C:\\Users\\Andre\\OneDrive - Universidad Núr\\Documents\\archivoIII.txt");
                Scanner scanner = new Scanner(archivo);
                while (scanner.hasNextLine()) {
                    String infoPersonal = scanner.nextLine();
                    Persona persona = new Persona(infoPersonal);
                    this.registro.addRow(persona.getDatosFin());
                    listaPersona.adicionar(persona);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Error");
                ex.printStackTrace();
            }
        }

        if (e.getSource() == btnEliminar) {
            int filaElegida = tabla.getSelectedRow();
            try {
                System.out.println(listaPersona);
                registro.removeRow(filaElegida);
                listaPersona.eliminar(filaElegida);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Elija una fila");
            }
            System.out.println(listaPersona);
        }

        if (e.getSource() == btnSalir) {
            System.exit(0);
        }
    }
}
