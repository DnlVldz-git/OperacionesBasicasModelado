/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dani_
 */
public class DialogNumBits extends JDialog {

    private JComboBox cmbBx;
    private JButton btn;
    private JLabel lbl;
    private int num;

    public DialogNumBits(JFrame parent, int num2) {
        super(parent, JDialog.ModalityType.APPLICATION_MODAL);
        super.setSize(400, 300);
        super.setLayout(new BorderLayout());

        lbl = new JLabel("Introduzca el número de bits");
        btn = new JButton("Aceptar");
        cmbBx = new JComboBox();
        cmbBx.addItem(1);
        cmbBx.addItem(2);
        cmbBx.addItem(4);
        cmbBx.addItem(8);
        cmbBx.addItem(16);
        cmbBx.addItem(32);
        cmbBx.addItem(64);
        cmbBx.addItem(128);
        cmbBx.addItem(264);
        this.num = num2;

        getBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                num = (int)getCmbBx().getSelectedItem();
                
                dispose();
            }
        });

        add(lbl, BorderLayout.NORTH);
        //add(Box.createRigidArea(new Dimension(0, 20)));
        add(cmbBx, BorderLayout.WEST);
        //add(Box.createRigidArea(new Dimension(0, 20)));
        add(btn, BorderLayout.SOUTH);

    }

    public int getNum() {
        return num;
    }

    public JComboBox getCmbBx() {
        return cmbBx;
    }

    public JButton getBtn() {
        return btn;
    }

}
