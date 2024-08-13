
package Controlador;

import Modelo.Visitas;
import Vista.frmVisitas;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ctrVisitas implements MouseListener{
    //1- Mandar a llamar el modelo y la vista
    private Visitas modelo;
    private frmVisitas vista;
    
    //2- Crear el constructor
    public ctrVisitas(Visitas modelo, frmVisitas vista){
        this.modelo = modelo;
        this.vista = vista;
        
        vista.btnAgregar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
        if(e.getSource() == vista.btnAgregar){
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEdad(Integer.parseInt(vista.txtEdad.getText()));
            modelo.setEspecialidad(vista.txtEspecialidad.getText());
            
            modelo.Guardar();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
