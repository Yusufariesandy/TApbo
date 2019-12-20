package TAPenjualan;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author M Yusuf Ariesandy
 */
public class komponen extends JFrame
{   
    JLabel label = new JLabel("ANGKRINGAN SAERAH");
    JLabel id = new JLabel("PRODUK ID ");
    JLabel nama = new JLabel("PRODUK NAMA ");
    JLabel bayar = new JLabel("HARGA");
    JLabel pesan = new JLabel("JUMLAH");

    JTextField us = new JTextField();
    JTextField nm = new JTextField();
    JTextField byr = new JTextField();
    JTextField psn = new JTextField();
    JTextField ttl = new JTextField();
    
    DefaultTableModel tabel;
    JTable tbl = new JTable();
    JScrollPane scroll = new JScrollPane();
    
    JButton ttlbyr = new JButton("TOTAL BAYAR");    
    JButton clear = new JButton("CLEAR!!");
    JButton print = new JButton("PRINT STRUCT");
    JButton add = new JButton("+TAMBAH");
    
}
