package TAPenjualan;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import Cetak.GUI3;
/**
 *
 * @author M Yusuf Ariesandy
 */
public class GUI extends komponen
{
    int indek=4;
    String nma,nomor;
    int hga,stok=0;
    GUI[] panggilb = new GUI[100];
    int line=0,paten;
    int i=1;
        
    public GUI()
    {

        setTitle("Tugas Akhir");
        setSize(800,800);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
         
        label.setBounds(200,30,300,50);
        label.setFont(new Font("Consolas", Font.BOLD,20));
        label.setForeground(new Color(20,1,188));
        label.setBackground (new Color (30,1,200));
        add(label);
        
        id.setBounds(25,100,100,30);
        us.setBounds(25,130,160,30);
        add(id);
        add(us);
        
        nama.setBounds(25,160,100,30);
        nm.setBounds(25,190,160,30);
        add(nama);
        add(nm);
        
        bayar.setBounds(25,220,100,30);
        byr.setBounds(25,250,160,30);
        add(bayar);
        add(byr);
    
        pesan.setBounds(230,100,100,30);
        psn.setBounds(230,130,160,30);
        add(pesan);
        add(psn);

        ttlbyr.setBounds(230,165,130,20);
        ttlbyr.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    int harga = Integer.parseInt(byr.getText())*Integer.parseInt(psn.getText());
                    ttl.setText(String.valueOf(harga));
                    stok = Integer.parseInt(psn.getText());
                }
                catch(Exception ex)
                {
                }
            }
        });
        ttl.setBounds(230,190,160,30);
        add(ttlbyr);
        add(ttl);

        clear.setBounds(25,300,160,30);
        clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                us.setText("");
                nm.setText("");
                byr.setText("");
                psn.setText("");
                ttl.setText("");
            }
        });
        
        print.setBounds(200,300,160,30);
        print.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                GUI3 panggil4 = new GUI3(nm.getText(),us.getText(),byr.getText(),psn.getText(),ttl.getText());   
            }
        });
        add.setBounds(380,300,160,30);
        add.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int harga = Integer.parseInt(byr.getText());
                int quintity = Integer.parseInt(psn.getText());
                
                        tabel.addRow(new Object[0]);
                        tabel.setValueAt(us.getText(), line, 0);
                        tabel.setValueAt(nm.getText(), line, 1);
                        tabel.setValueAt(harga, line, 2);
                        tabel.setValueAt(quintity, line, 3);
                        line = line + 1;
            }
        });
        add(clear);
        add(print);
        add(add);
                        
        scroll.setBounds(25,350,600,80);
        add(scroll);
        scroll.setViewportView(tbl);
        
        tabel = (DefaultTableModel)tbl.getModel();
        tabel.addColumn("ID");
        tabel.addColumn("NAMA");
        tabel.addColumn("HARGA");
        tabel.addColumn("STOCK");



        tbl.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                int i=tbl.getSelectedRow();
                if(i>-1)
                {
                    us.setText(tabel.getValueAt(i, 0).toString());
                    nm.setText(tabel.getValueAt(i, 1).toString());
                    byr.setText(tabel.getValueAt(i, 2).toString());                    
                }
            }

        });
    }
}
