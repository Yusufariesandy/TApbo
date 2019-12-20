package Cetak;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.IOException;
import TAPenjualan.GUI;

/**
 *
 * @author M Yusuf Ariesandy
 */
public class GUI3 extends komponen3
{
    String nama,id;
    String harga,total,banyak;
    
    public GUI3(String nama,String id,String harga,String banyak,String total)
    {
        this.nama=nama;
        this.id=id;
        this.harga=harga;
        this.banyak=banyak;
        this.total=total;
        
        setTitle("print");
        setSize(800,800);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        print.setBounds(200,100,200,500);
        print.setText
        (
                " ==== STRUCT PEMBELIAN ====\n" +
                "\n"+
                "   ID     : "+this.id+"\n"+
                "   nama   : "+this.nama+"\n"+
                "   harga  : "+this.harga+"\n"+
                "   banyak : "+this.banyak+"\n"+
                "   total  : "+this.total+"\n"+
                "\n"+
                " ===========================\n"
        );
        add(print);
        
        kembali.setBounds(200,600,100,30);
        kembali.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
            }
        });
        add(kembali);
    }
}
