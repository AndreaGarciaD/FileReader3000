import javax.swing.*;

public class Main extends JFrame {

    Panel panel_principal = new Panel();

    public Main(){
        this.setSize(700,600);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        cargarElementos();
    }

    public void cargarElementos(){
        this.add(panel_principal);
    }

    public static void main(String[] args) {
        new Main();
    }
}
