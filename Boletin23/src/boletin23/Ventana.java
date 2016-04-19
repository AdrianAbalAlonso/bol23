/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author aabalalonso
 */
public class Ventana extends JFrame {

    JPanel panel1;
    JPanel panel2;
    JLabel nombreUsuario;
    JLabel contra;
    JTextField huecoNombre;
    JPasswordField huecoPassword;
    JButton premer;
    JButton limpar;
    JList lista;
    JButton botonEntreListas;
    JTextArea cuadroListas;

    public Ventana() {

        this.setLayout(null);
        setTitle("Boletin23");
        panel1 = new JPanel();
        panel2 = new JPanel();
        //setBounds(posicionamiento)
        panel1.setBounds(0, 0, 300, 150);
        panel2.setBounds(0, 150, 300, 150);
        panel1.setLayout(null);
        panel2.setLayout(null);
        nombreUsuario = new JLabel("Nome:");
        contra = new JLabel("Password:");
        premer = new JButton("Premer");
        limpar = new JButton("Limpar");
        huecoNombre = new JTextField(15);
        huecoPassword = new JPasswordField(15);
        lista = new JList();
        setBackground(Color.black);
        botonEntreListas = new JButton("Boton");
        //?
        cuadroListas = new JTextArea();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 50, 300, 300);
       //setBounds
        nombreUsuario.setBounds(80, 10, 50, 20);
        contra.setBounds(50, 50, 80, 20);
        huecoNombre.setBounds(140, 10, 100, 20);
        huecoPassword.setBounds(140, 50, 100, 20);
        premer.setBounds(50, 90, 90, 20);
        limpar.setBounds(150, 90, 90, 20);
        lista.setBounds(20, 10, 80, 100);
        botonEntreListas.setBounds(110, 50, 90, 20);
        cuadroListas.setBounds(210, 30, 80, 60);
        
//adds
        panel1.add(nombreUsuario);
        panel1.add(huecoNombre);
        panel1.add(contra);
        panel1.add(huecoPassword);
        panel1.add( premer);
        panel1.add(limpar);
        panel2.add(lista);
        panel2.add(botonEntreListas);
        panel2.add(cuadroListas);
        add(panel1);
        add(panel2);
        setResizable(false);
        setVisible(true);
    }

}
