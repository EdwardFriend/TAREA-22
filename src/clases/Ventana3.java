
/**
 * 
 */
package clases;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author MARIO LUZARDO
 *
 */
public class Ventana3 extends JFrame{
    private JPanel content1;
    private JButton save;
    private JButton cancel;
    private JButton negrita;
    private JButton cursiva;
    private JButton color;
    private JButton tamanio;
    private JButton tipo;
	/**
	 * 
	 */
	public Ventana3() {
            // TODO Auto-generated constructor stub
            super("Mis datos");
		
            this.setSize(400,400);
            this.setMinimumSize(new Dimension(350, 350));
            this.setLocation(100,100);
            content1 = new JPanel(new BorderLayout());
            setContentPane(content1);
            this.setVisible(true);
		
            JPanel panel1 = new JPanel();
            JTextField text1 = new JTextField();
            text1.setColumns(5);
            panel1.add(new JLabel("Nombre: "));
            panel1.add(text1);
		
            JPanel panel2 = new JPanel();
            JTextField text2 = new JTextField();
            text2.setColumns(5);
            panel2.add(new JLabel("Apellido: "));
            panel2.add(text2);
		
            JPanel panel3 =new JPanel();
            String [] civilState = {"Soltero",
                                    "Casado",
                                    "Viudo",
                                    "Divorciado"};
            JComboBox jComboBox = new JComboBox(civilState);
            jComboBox.setSelectedIndex(0);
            panel3.add(new JLabel("Estado Civil: "));
            panel3.add(jComboBox);
		
            JPanel panel4 = new JPanel();
            JTextArea text3 = new JTextArea(10,25);
            JScrollPane description = new JScrollPane(text3);
            panel4.add(new JLabel("Descripcion: "));
            panel4.add(description);
		
            JPanel pnlNorte = new JPanel();
            GridLayout grid0 = new GridLayout (3,1);
            pnlNorte.setLayout(grid0);
            pnlNorte.add(panel1);
            pnlNorte.add(panel2);
            pnlNorte.add(panel3);
            

            JPanel pnlCentro = new JPanel();
            pnlCentro.add(panel4);
            
		
            JPanel pnlSur = new JPanel();
            save =new JButton("Guardar");
            save.addActionListener(new MiListener(this));
            pnlSur.add(save);
            
            cancel =new JButton("Cancelar");
            cancel.addActionListener(new MiListener(this));
            pnlSur.add(cancel);
            
            
            JPanel content0 = new JPanel();
            content0.add(pnlNorte, BorderLayout.NORTH);
            content0.add(pnlCentro,BorderLayout.CENTER);
            content0.add(pnlSur, BorderLayout.SOUTH);
            
            JPanel textEdit = new JPanel();
            JTextArea text4 = new JTextArea(17,30);
            JScrollPane edit = new JScrollPane(text4);
            textEdit.add(edit, BorderLayout.NORTH);
            negrita = new JButton("B");
            cursiva = new JButton("I");
            color = new JButton("Color");
            tamanio = new JButton("Tama�o");
            tipo = new JButton("Tipo");
            JPanel botones = new JPanel();
            botones.add(negrita);
            botones.add(cursiva);
            botones.add(color);
            botones.add(tipo);
            botones.add(tamanio);
            textEdit.add(botones, BorderLayout.SOUTH);
            /*GridLayout grid1 = new GridLayout (0,1);
            textEdit.setLayout(grid1);
            textEdit.add(edit);
            textEdit.add(botones,BorderLayout.SOUTH);*/
            
            JTabbedPane tabbedPane = new JTabbedPane ();
            tabbedPane.addTab("Tab 1",content0);
            tabbedPane.addTab("Tab 2", textEdit);
            
            content1.add(tabbedPane);
		
	}
        public JButton getSave(){
            return this.save;
        }
        public JButton getCancel(){
            return this.cancel;
        }
        /*@Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==save){
                System.out.println("Guardar");
                return;
            }
            if(e.getSource()==cancel){
                System.out.println("Cancelar");
                return;
            }
        }*/     

}
