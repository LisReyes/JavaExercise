import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class App extends JFrame{

    /* Creacion de objetos y sus valores  */
    private static JLabel lblDirections = new JLabel("Ingresa tu nombre ");
    private static JLabel lbloutput = new JLabel();
    private static JTextField nameBox = new JTextField(30);
    private static JButton nameButton = new JButton("Click me");

    public static void main(String[]args) throws Exception{
        App window = new App();
        window.setSize(500,500);
        window.setVisible(true);
        window.setTitle("Hola en Swing");
        /* Comenzamos con el proceso de añadir los elementos al panel 
         * Se añaden conforme queremos que se miren en nuestro panel
        */
        //window.setLayout(new FlowLayout());
        window.setLayout(new GridLayout(3,2));//Rows,columnn es el orden
        window.getContentPane().add(lblDirections);
        window.getContentPane().add(nameBox);
        //blank line
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(new JLabel());
        window.getContentPane().add(nameButton);
        window.getContentPane().add(lbloutput);

        /* Añadimos los action listener */
        nameButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonClick(e);

            }
        });
        window.pack(); /* Se adapta */


        
        //agregamos los objetos Swing aqui
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void buttonClick(ActionEvent e){
        // Codigo para que el boton escuche
        //JOptionPane.showMessageDialog(null, "FUCIONA!!", "Hola mundo desde Swing", JOptionPane.INFORMATION_MESSAGE);
        
        String yourName = nameBox.getText();
        String outputMessage = "Hola: "+yourName;
        lbloutput.setText(outputMessage);
    }
}