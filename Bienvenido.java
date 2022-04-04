import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Bienvenido extends JFrame{
  
public Bienvenido (){
  setTitle ("Bienvenido");
  getContentPane().setBackground(new Color (255,209,220));
  setIconImage (new ImageIcon(getClass().getResource("images/dress.jpg")).getImage());
 
 JLabel label2 = new JLabel ("Moodcast");
 label2.setBounds (150,100,300,100);
 label2.setFont (new Font ("Bad Script",3,18));
 label2.setForeground (new Color (0,0,0));
 add (label2);
 
 ImageIcon imagen = new ImageIcon ("images/marco.png");
 setLayout (null);
 JLabel label1 = new JLabel (imagen);
 label1.setBounds (3,25,350,250);
 add (label1);

 JLabel label3 = new JLabel ("Ingrese su nombre");
 label3.setBounds (100,270,200,40);
 label3.setFont (new Font ("Andale Mono",1,12));
 label3.setForeground (new Color (0,0,0));
 add (label3);

 JLabel label4 = new JLabel ("By Marisol 2022");
 label4.setBounds (110,365,100,30);
 label4.setFont (new Font ("Andale Mono",1,10));
 label4.setForeground (new Color (0,0,0));
 add (label4);

 JTextField textfield1 = new JTextField ();
 textfield1.setBounds (80,300,150,20);
 textfield1.setBackground(new Color (255,255,255));
 textfield1.setFont (new Font ("Andale Mono",0,12));
 textfield1.setForeground (new Color (0,0,0));
 add (textfield1);
 
 JButton boton1 = new JButton ("Ingresar");
 boton1.setBounds (100,330,100,20);
 boton1.setBackground (new Color (255,255,255));
 boton1.setFont (new Font ("Bad Script",0,12));
 boton1.setForeground (new Color (0,0,0)); 
 add (boton1);
}

public static void main (String args []){
   Bienvenido ventanabienvenida = new Bienvenido ();
   ventanabienvenida.setBounds (0,0,350,450);
   ventanabienvenida.setVisible (true);
   ventanabienvenida.setResizable (true);
   ventanabienvenida.setLocationRelativeTo (null);
 }
}