
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
	private JPanel content0; 
	private JPanel content1;
	private JPanel textEdit; 
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel pnlNorte; 
    private JPanel pnlCentro;
    private JPanel pnlSur; 
    private JButton save;
    private JButton cancel;
    private JButton negrita;
    private JButton cursiva;
    private JButton color;
    private JButton tamanio;
    private JButton tipo;
    private JTextField text1;
    private JTextField text2;
    private JTextArea text3;
    private JTextArea text4;
    private JComboBox jComboBox;
    private JComboBox jComboBoxT;
    private JComboBox jComboBoxTam;
    private boolean valB=false;
    private boolean valI=false;
    
	/**
	 * 
	 */
	public Ventana3() {
            // TODO Auto-generated constructor stub
            super("Mis datos");
		
            this.setSize(415,440);
            this.setLocation(100,100);
            setResizable(false);  
            content1 = new JPanel(new BorderLayout());
            content1.setOpaque(true);
            setContentPane(content1);
            this.setVisible(true);
		
            panel1 = new JPanel();
            text1 = new JTextField();
            text1.setColumns(20);
            panel1.add(new JLabel("Nombre: "));
            panel1.add(text1);
		
            panel2 = new JPanel();
            text2 = new JTextField();
            text2.setColumns(20);
            panel2.add(new JLabel("Apellido: "));
            panel2.add(text2);
            
            panel3 =new JPanel();
            String [] civilState = {"--Seleccionar--",
            						"Soltero",
                                    "Casado",
                                    "Viudo",
                                    "Divorciado"};
            jComboBox = new JComboBox(civilState);
            jComboBox.setSelectedIndex(0);
            panel3.add(new JLabel("Estado Civil: "));
            panel3.add(jComboBox);
		
            panel4 = new JPanel();
            text3 = new JTextArea(13,28);
            text3.setMinimumSize(new Dimension(13,28));
            text3.setMaximumSize(new Dimension(13,28));
            JScrollPane description = new JScrollPane(text3);
            description.setMinimumSize(new Dimension(13,28));
            description.setMaximumSize(new Dimension(13,28));
            panel4.add(new JLabel("Descripcion: "));
            panel4.add(description);
		
            pnlNorte = new JPanel();
            GridLayout grid0 = new GridLayout (3,1);
            pnlNorte.setLayout(grid0);
            pnlNorte.add(panel1);
            pnlNorte.add(panel2);
            pnlNorte.add(panel3);
            pnlNorte.setOpaque(false);

            pnlCentro = new JPanel();
            pnlCentro.add(panel4);
            pnlCentro.setOpaque(false);
		
            pnlSur = new JPanel();
            save =new JButton("Guardar");
            save.addActionListener(new MiListener(this));
            pnlSur.add(save);
            pnlSur.setOpaque(false);
            
            cancel =new JButton("Cancelar");
            cancel.addActionListener(new MiListener(this));
            pnlSur.add(cancel);
            
            
            content0 = new JPanel();
            content0.setOpaque(false);
            content0.add(pnlNorte, BorderLayout.NORTH);
            content0.add(pnlCentro,BorderLayout.CENTER);
            content0.add(pnlSur, BorderLayout.SOUTH);
            content0.setVisible(true);
            
            textEdit = new JPanel();
            text4 = new JTextArea(21,35);
            text4.setBackground(null);
            text4.setMinimumSize(new Dimension(21,30));
            text4.setMaximumSize(new Dimension(21,30));
            JScrollPane edit = new JScrollPane(text4);
            edit.setMinimumSize(new Dimension(21,30));
            edit.setMaximumSize(new Dimension(21,30));
            textEdit.add(edit, BorderLayout.CENTER);
            
            negrita = new JButton("B");
            negrita.addActionListener(new MiListener(this));
            
            cursiva = new JButton("I");
            cursiva.addActionListener(new MiListener(this));
            
            color = new JButton("Color");
            color.addActionListener(new MiListener(this));
            
 
            String [] tam = new String[30];
            for(int i=0;i<tam.length;i++) {
            	tam[i]=String.valueOf(i);
            	if(i==0) {
            		tam[i] = "--Size--";
            	}
            }
				
            		
            jComboBoxTam = new JComboBox(tam);
            jComboBoxTam.setSelectedIndex(0);
            jComboBoxTam.addActionListener(new MiListener(this));
            
 
            String [] tipoL = {"--Tipe--",
            		"Arial Black",
					"Brush Script MT",
                    "Calibri Light (Títulos)",
                    "Cambria",
                    "Rockwell Extra Bold",
                    "Times New Roman"};
            jComboBoxT = new JComboBox(tipoL);
            jComboBoxT.setSelectedIndex(0);
            jComboBoxT.addActionListener(new MiListener(this));
            
            JPanel botones = new JPanel();
            botones.add(negrita);
            botones.add(cursiva);
            botones.add(color);
            botones.add(jComboBoxT);
            botones.add(jComboBoxTam);
            textEdit.add(botones, BorderLayout.SOUTH);
            
            JTabbedPane tabbedPane = new JTabbedPane ();
            tabbedPane.addTab("Mis Datos",content0);
            tabbedPane.addTab("Editor de Texto", textEdit);
            
            content1.add(tabbedPane);
            content1.setVisible(true);
		
	}
        public JButton getSave(){
            return this.save;
        }
        public JButton getCancel(){
            return this.cancel;
        }
        public JButton getNegrita(){
        	return this.negrita;
        }
        public JButton getCursiva(){
        	return this.cursiva;
        }
        public JButton getColor(){
        	return this.color;
        }
        public JButton getTamanio(){
        	return this.tamanio;
        }
        public JButton getTipo() {
        	return this.tipo;
        }
        public JTextField getText1() {
        	return this.text1;
        }
        public JTextField getText2() {
        	return this.text2;
        }
        public JTextArea getText3() {
        	return this.text3;
        }
        public JTextArea getText4() {
        	return this.text4;
        }
        public JComboBox getJComboBox() {
        	return this.jComboBox;
        }
        public JComboBox getJComboBoxT() {
        	return this.jComboBoxT;
        }
        public JComboBox getJComboBoxTam() {
        	return this.jComboBoxTam;
        }
        public boolean getValB() {
    		return this.valB;
    	}
        public void setValB(boolean a) {
        	this.valB=a;
        }
        public boolean getValI() {
    		return this.valI;
    	}
        public void setValI(boolean a) {
        	this.valI=a;
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
