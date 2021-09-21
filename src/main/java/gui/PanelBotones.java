/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dani_
 */
public class PanelBotones extends JPanel{
    private JButton btnIdentidad;
    private JButton btnInverso;
    private JButton btnUmbral;
    private JButton btnUmbralInverso;
    private JButton btnIntUmbralBin;
    private JButton btnIntUmbralBinInv;
    private JButton btnIntUmbralGris;
    private JButton btnIntUmbralGrisInv;
    private JButton btnExtension;
    private JButton btnReduGris;
    private JButton btnSuma;
    private JButton btnResta;
    private JButton btnAND;
    private JButton btnOR;
    
    public PanelBotones(){
        super.setBackground(Color.white);
        super.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));        
        
        btnIdentidad = new JButton("Operador Identidad");
        btnInverso = new JButton("Operador Inverso");
        btnUmbral = new JButton("Operador Umbral");
        btnUmbralInverso = new JButton("Operador Umbral Inverso");
        btnIntUmbralBin = new JButton("Operador Umbral Binario");
        btnIntUmbralBinInv = new JButton("Operador Umbral Binario Inverso");
        btnIntUmbralGris = new JButton("Operador Umbral Gris");
        btnIntUmbralGrisInv = new JButton("Operador Umbral Gris Inverso");
        btnExtension = new JButton("Operador Extension");
        btnReduGris = new JButton("Operador Reducción de Gris");
        btnSuma = new JButton("Suma");
        btnResta = new JButton("Resta");
        btnAND = new JButton("AND");
        btnOR = new JButton("OR");  
        
        btnIdentidad.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        btnInverso.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        btnUmbral.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        btnUmbralInverso.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        btnIntUmbralBin.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        btnIntUmbralBinInv.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        btnIntUmbralGris.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        btnIntUmbralGrisInv.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        btnExtension.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        btnReduGris.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        btnSuma.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        btnResta.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        btnAND.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        btnOR.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        
        
        
        add(btnIdentidad);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(btnInverso);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(btnUmbral);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(btnUmbralInverso);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(btnIntUmbralBin);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(btnIntUmbralBinInv);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(btnIntUmbralGris);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(btnIntUmbralGrisInv);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(btnExtension);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(btnReduGris);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(btnSuma);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(btnResta);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(btnAND);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(btnOR);
    }

    public JButton getBtnIdentidad() {
        return btnIdentidad;
    }

    public JButton getBtnInverso() {
        return btnInverso;
    }

    public JButton getBtnUmbral() {
        return btnUmbral;
    }

    public JButton getBtnUmbralInverso() {
        return btnUmbralInverso;
    }

    public JButton getBtnIntUmbralBin() {
        return btnIntUmbralBin;
    }

    public JButton getBtnIntUmbralBinInv() {
        return btnIntUmbralBinInv;
    }

    public JButton getBtnIntUmbralGris() {
        return btnIntUmbralGris;
    }

    public JButton getBtnIntUmbralGrisInv() {
        return btnIntUmbralGrisInv;
    }

    public JButton getBtnExtension() {
        return btnExtension;
    }

    public JButton getBtnReduGris() {
        return btnReduGris;
    }

    public JButton getBtnSuma() {
        return btnSuma;
    }

    public JButton getBtnResta() {
        return btnResta;
    }

    public JButton getBtnAND() {
        return btnAND;
    }

    public JButton getBtnOR() {
        return btnOR;
    }
    
    
}
