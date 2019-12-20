/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registrasi;
import java.awt.event.*;
import javax.swing.*;
import Login.*;
/**
 *
 * @author M Yusuf Ariesandy
 */
public class Registrasi extends JFrame{
    JLabel registrasi = new JLabel("Registrasi");
    JLabel nama = new JLabel("Nama");
    JLabel ttl = new JLabel("TTL");
    JLabel alamat = new JLabel ("Alamat");
    JLabel id = new JLabel("ID");
    JLabel pass = new JLabel("Password");
    JTextField textID = new JTextField();
    JPasswordField password = new JPasswordField();
    JButton ok = new JButton("OK");
    
    String user, pswd;
    
    Admin admin = new Admin();
    
    public Registrasi(){
        setSize(275, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        textID.setBounds(10, 10, 100, 25);
        password.setBounds(10, 50, 100, 25);
        ok.setBounds(10, 90, 50, 25);
        ok.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                cariUser();
            }
        });
        add(textID);
        add(password);
        add(ok);
    }
    
    public void cariUser(){
        for(int i = 0; i < admin.index; i++){
            if(textID.getText().equals(admin.reg.getID()) && password.getText().equals(admin.reg.getPassword())){
                JOptionPane.showMessageDialog(null, "Berhasil Login");
            }
        }
    }
}
