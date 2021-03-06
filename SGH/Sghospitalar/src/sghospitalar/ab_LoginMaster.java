package sghospitalar;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;

public class ab_LoginMaster extends JFrame implements ActionListener{
 
    JLabel labelLogin, labelSenha, labelLogo, labelEntrar;
    JTextField textLogin, textSenha;
    JTextPane areaLogin,areaSombra;
    JButton bEntrar, bMaster;
    
    public ab_LoginMaster(){
        
        ImageIcon icon = new ImageIcon("sghLogo.png");
        ImageIcon icon2 = new ImageIcon("sghLogin.png");
        
        icon.setImage(icon.getImage().getScaledInstance(500, 450, 100));
        icon2.setImage(icon2.getImage().getScaledInstance(300, 150, 80));
        
        Container c = this.getContentPane();
        c.setLayout(null);
        
        labelLogo = new JLabel(icon);
        labelLogo.setBounds(343, 20, 458, 430);
        add(labelLogo);
        
        labelEntrar = new JLabel(icon2);
        labelEntrar.setBounds(27, 0, 300, 300);
        add(labelEntrar);
        
        labelLogin = new JLabel();
        labelLogin.setText("Login:");
        labelLogin.setBounds(20, 210, 50, 30);
        add(labelLogin);
        
        textLogin = new JTextField();
        textLogin.setBounds(20, 235, 314, 30);
        textLogin.setBorder(new LineBorder(Color.BLACK));
        add(textLogin);
        
        labelSenha = new JLabel();
        labelSenha.setText("Senha:");
        labelSenha.setBounds(20, 280, 50, 30);
        add(labelSenha);
        
        textSenha = new JTextField();
        textSenha.setBounds(20, 305, 314, 30);
        textSenha.setBorder(new LineBorder(Color.BLACK));
        add(textSenha);
        
        bEntrar = new JButton();
        bEntrar.setText("Entrar");
        bEntrar.setBounds(98, 372, 150, 45);
        bEntrar.setBackground(Color.decode("#00FF7F"));
        bEntrar.setBorder(new LineBorder(Color.BLACK));
        bEntrar.setFocusPainted(false);
        bEntrar.addActionListener(this);
        add(bEntrar);
        
        bMaster = new JButton();
        bMaster.setText("<-");
        bMaster.setBounds(20, 20, 45, 45);
        bMaster.setBackground(Color.decode("#6495ED"));
        bMaster.setBorder(new LineBorder(Color.BLACK));
        bMaster.setFocusPainted(false);
        bMaster.addActionListener(this);
        add(bMaster);
        
        areaLogin = new JTextPane();
        areaLogin.setBounds(10, 10, 335, 443);
        areaLogin.setBackground(Color.decode("#D1EEEE"));
        areaLogin.setBorder(new LineBorder(Color.BLACK));
        areaLogin.setEditable(false);
        add(areaLogin);
        
        areaSombra = new JTextPane();
        areaSombra.setBounds(15, 15, 335, 443);
        areaSombra.setBackground(Color.GRAY);
        areaSombra.setEditable(false);
        add(areaSombra);
        
        setTitle("Login");
        setSize(800, 500);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == bEntrar){
            ba_MenuMaster telamenu = new ba_MenuMaster();
            dispose();
            
        }
        
        if(e.getSource() == bMaster){
            ac_LoginFunc telamenufunc = new ac_LoginFunc();
            dispose();
            
        }
        
    }
    
}
