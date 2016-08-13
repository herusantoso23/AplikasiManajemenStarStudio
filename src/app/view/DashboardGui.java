package app.view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import app.controller.DashboardMenuActionListener;

import java.awt.Color;
import java.awt.Cursor;

import java.awt.Font;
import javax.swing.JButton;

public class DashboardGui extends JFrame {

	private JPanel contentPane;
	private DashboardMenuActionListener actionEvent;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashboardGui frame = new DashboardGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DashboardGui() {


		setTitle("Aplikasi Manajemen Staaar Studio Photo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1032, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(this);


		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DashboardGui.class.getResource("/image/dashboard/AplikasiManajemen.png")));
		lblNewLabel.setBounds(223, 26, 572, 70);
		contentPane.add(lblNewLabel);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(DashboardGui.class.getResource("/image/dashboard/staaarstudio.png")));
		label.setBounds(289, 94, 449, 70);
		contentPane.add(label);

		actionEvent = new DashboardMenuActionListener(this);

		createMenuKaryawan();
		createMenuSupplier();
		createMenuInventaris();
		createMenuProfilPengguna();
		createMenuPenjualan();
		createMenuPembelian();
		createMenuProduk();
		createMenuHakAkses();

	}

	public void createMenuKaryawan() {
		JPanel panelKaryawan = new JPanel();
		panelKaryawan.setBackground(new Color(0, 0, 51));
		panelKaryawan.setBounds(332, 216, 113, 121);
		contentPane.add(panelKaryawan);
		panelKaryawan.setLayout(null);

		JLabel lblDataKaryawan = new JLabel("  Data Karyawan");
		lblDataKaryawan.setBounds(0, 94, 115, 27);
		panelKaryawan.add(lblDataKaryawan);
		lblDataKaryawan.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDataKaryawan.setForeground(Color.WHITE);

		JButton btnDataKaryawan = new JButton("");
		btnDataKaryawan.setBounds(10, 0, 92, 95);
		panelKaryawan.add(btnDataKaryawan);
		btnDataKaryawan.setIcon(new ImageIcon(DashboardGui.class.getResource("/image/dashboard/karyawan.png")));
		btnDataKaryawan.setBackground(null);
		btnDataKaryawan.setOpaque(false);
		btnDataKaryawan.setBorderPainted(false);
		btnDataKaryawan.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnDataKaryawan.addActionListener(actionEvent);
		btnDataKaryawan.setActionCommand("DATA_KARYAWAN");

	}

	public void createMenuSupplier() {
		JPanel panelSupplier = new JPanel();
		panelSupplier.setLayout(null);
		panelSupplier.setBackground(new Color(0, 0, 51));
		panelSupplier.setBounds(455, 216, 113, 121);
		contentPane.add(panelSupplier);

		JLabel lblDataSupplier = new JLabel("   Data Supplier");
		lblDataSupplier.setForeground(Color.WHITE);
		lblDataSupplier.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDataSupplier.setBounds(0, 96, 109, 25);
		panelSupplier.add(lblDataSupplier);

		JButton btnDataSupplier = new JButton("");
		btnDataSupplier.setIcon(new ImageIcon(DashboardGui.class.getResource("/image/dashboard/supplier.png")));
		btnDataSupplier.setOpaque(false);
		btnDataSupplier.setBorderPainted(false);
		btnDataSupplier.setBackground((Color) null);
		btnDataSupplier.setBounds(10, 0, 92, 95);
		btnDataSupplier.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelSupplier.add(btnDataSupplier);
		btnDataSupplier.addActionListener(actionEvent);
		btnDataSupplier.setActionCommand("DATA_SUPPLIER");

	}

	public void createMenuInventaris() {
		JPanel panelInventaris = new JPanel();
		panelInventaris.setLayout(null);
		panelInventaris.setBackground(new Color(0, 0, 51));
		panelInventaris.setBounds(578, 216, 113, 121);
		contentPane.add(panelInventaris);

		JLabel lblDataInventaris = new JLabel(" Data Inventaris");
		lblDataInventaris.setForeground(Color.WHITE);
		lblDataInventaris.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDataInventaris.setBounds(0, 94, 115, 27);
		panelInventaris.add(lblDataInventaris);

		JButton btnDataInventaris = new JButton("");
		btnDataInventaris.setIcon(new ImageIcon(DashboardGui.class.getResource("/image/dashboard/inventaris.png")));
		btnDataInventaris.setOpaque(false);
		btnDataInventaris.setBorderPainted(false);
		btnDataInventaris.setBackground((Color) null);
		btnDataInventaris.setBounds(10, 0, 92, 95);
		btnDataInventaris.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelInventaris.add(btnDataInventaris);
		btnDataInventaris.addActionListener(actionEvent);
		btnDataInventaris.setActionCommand("DATA_INVENTARIS");
	}

	public void createMenuProfilPengguna() {
		JPanel panelProfilPengguna = new JPanel();
		panelProfilPengguna.setLayout(null);
		panelProfilPengguna.setBackground(new Color(0, 0, 51));
		panelProfilPengguna.setBounds(332, 348, 113, 121);
		contentPane.add(panelProfilPengguna);

		JLabel lblProfilPengguna = new JLabel(" Profil Pengguna");
		lblProfilPengguna.setForeground(Color.WHITE);
		lblProfilPengguna.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProfilPengguna.setBounds(0, 95, 115, 26);
		panelProfilPengguna.add(lblProfilPengguna);

		JButton btnProfiPengguna = new JButton("");
		btnProfiPengguna.setIcon(new ImageIcon(DashboardGui.class.getResource("/image/dashboard/profilpengguna.png")));
		btnProfiPengguna.setOpaque(false);
		btnProfiPengguna.setBorderPainted(false);
		btnProfiPengguna.setBackground((Color) null);
		btnProfiPengguna.setBounds(10, 0, 92, 95);
		btnProfiPengguna.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelProfilPengguna.add(btnProfiPengguna);
		btnProfiPengguna.addActionListener(actionEvent);
		btnProfiPengguna.setActionCommand("PROFIL_PENGGUNA");

	}

	public void createMenuPenjualan() {
		JPanel panelPenjualan = new JPanel();
		panelPenjualan.setLayout(null);
		panelPenjualan.setBackground(new Color(0, 0, 51));
		panelPenjualan.setBounds(455, 348, 113, 121);
		contentPane.add(panelPenjualan);

		JLabel lblPenjualan = new JLabel("    Penjualan");
		lblPenjualan.setForeground(Color.WHITE);
		lblPenjualan.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPenjualan.setBounds(10, 95, 99, 26);
		panelPenjualan.add(lblPenjualan);

		JButton btnPenjualan = new JButton("");
		btnPenjualan.setIcon(new ImageIcon(DashboardGui.class.getResource("/image/dashboard/penjualan.png")));
		btnPenjualan.setOpaque(false);
		btnPenjualan.setBorderPainted(false);
		btnPenjualan.setBackground((Color) null);
		btnPenjualan.setBounds(10, 0, 92, 95);
		btnPenjualan.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelPenjualan.add(btnPenjualan);

		btnPenjualan.addActionListener(actionEvent);
		btnPenjualan.setActionCommand("PENJUALAN");
	}

	public void createMenuPembelian() {
		JPanel panelPembelian = new JPanel();
		panelPembelian.setLayout(null);
		panelPembelian.setBackground(new Color(0, 0, 51));
		panelPembelian.setBounds(578, 348, 113, 121);
		contentPane.add(panelPembelian);

		JLabel lblPembelian = new JLabel("      Pembelian");
		lblPembelian.setForeground(Color.WHITE);
		lblPembelian.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPembelian.setBounds(0, 95, 113, 26);
		panelPembelian.add(lblPembelian);

		JButton btnPembelian = new JButton("");
		btnPembelian.setIcon(new ImageIcon(DashboardGui.class.getResource("/image/dashboard/pembelian.png")));
		btnPembelian.setOpaque(false);
		btnPembelian.setBorderPainted(false);
		btnPembelian.setBackground((Color) null);
		btnPembelian.setBounds(10, 0, 92, 95);
		btnPembelian.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelPembelian.add(btnPembelian);
		btnPembelian.addActionListener(actionEvent);
		btnPembelian.setActionCommand("PEMBELIAN");


	}

	public void createMenuProduk(){
		JPanel panelProduk = new JPanel();
		panelProduk.setLayout(null);
		panelProduk.setBackground(new Color(0, 0, 51));
		panelProduk.setBounds(332, 480, 113, 121);
		contentPane.add(panelProduk);

		JLabel lblProduk = new JLabel("        Produk");
		lblProduk.setForeground(Color.WHITE);
		lblProduk.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProduk.setBounds(0, 95, 115, 26);
		panelProduk.add(lblProduk);

		JButton btnProduk = new JButton("");
		btnProduk.setIcon(new ImageIcon(DashboardGui.class.getResource("/image/dashboard/emblem-camera.png")));
		btnProduk.setOpaque(false);
		btnProduk.setBorderPainted(false);
		btnProduk.setBackground((Color) null);
		btnProduk.setBounds(10, 0, 92, 95);
		btnProduk.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelProduk.add(btnProduk);
		btnProduk.addActionListener(actionEvent);
		btnProduk.setActionCommand("PRODUK");

	}

	public void createMenuHakAkses(){
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 51));
		panel.setBounds(455, 480, 113, 121);
		contentPane.add(panel);

		JLabel lblHakAkses = new JLabel("     Hak Akses");
		lblHakAkses.setForeground(Color.WHITE);
		lblHakAkses.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHakAkses.setBounds(0, 95, 115, 26);
		panel.add(lblHakAkses);

		JButton btnHakAkses = new JButton("");
		btnHakAkses.setIcon(new ImageIcon(DashboardGui.class.getResource("/image/dashboard/emblem-readonly.png")));
		btnHakAkses.setOpaque(false);
		btnHakAkses.setBorderPainted(false);
		btnHakAkses.setBackground((Color) null);
		btnHakAkses.setBounds(10, 0, 92, 95);
		btnHakAkses.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel.add(btnHakAkses);
		btnHakAkses.addActionListener(actionEvent);
		btnHakAkses.setActionCommand("HAK_AKSES");
	}
}
