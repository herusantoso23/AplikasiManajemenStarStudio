package app.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.javafx.font.FontFactory;

import app.controller.DataKaryawanEditMouseListener;
import app.controller.DataKaryawanNewDataMouseListener;
import app.controller.DataKaryawanSearchByIdMouseListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class KaryawanCrudGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtNama;
	private JTextField txtTanggalLahir;
	private JTextField txtTempatLahir;
	private JTextField txtAlamat;
	private JTextField txtKelurahan;
	private JTextField txtKecamatan;
	private JTextField txtKabupaten;
	private JTextField txtProvinsi;
	private JTextField txtKodePos;
	private JTextField txtGapok;
	private JTextField txtHp;
	private JTextField txtEmail;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtAgama;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KaryawanCrudGui frame = new KaryawanCrudGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KaryawanCrudGui() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 45, 841, 593);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(this);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(10, 214, 395, 249);
		panel.setBorder(BorderFactory.createTitledBorder("Data Karyawan"));
		contentPane.add(panel);
		panel.setLayout(null);

		txtNama = new JTextField();
		txtNama.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtNama.setForeground(Color.BLACK);
		txtNama.setBackground(Color.LIGHT_GRAY);
		txtNama.setBounds(149, 26, 236, 20);
		panel.add(txtNama);
		txtNama.setColumns(10);

		txtTanggalLahir = new JTextField();
		txtTanggalLahir.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTanggalLahir.setForeground(Color.BLACK);
		txtTanggalLahir.setBackground(Color.LIGHT_GRAY);
		txtTanggalLahir.setColumns(10);
		txtTanggalLahir.setBounds(273, 57, 112, 20);
		panel.add(txtTanggalLahir);

		txtTempatLahir = new JTextField();
		txtTempatLahir.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTempatLahir.setForeground(Color.BLACK);
		txtTempatLahir.setBackground(Color.LIGHT_GRAY);
		txtTempatLahir.setColumns(10);
		txtTempatLahir.setBounds(149, 57, 112, 20);
		panel.add(txtTempatLahir);

		JLabel lblTempatTanggalLahir = new JLabel("Tempat, Tanggal Lahir");
		lblTempatTanggalLahir.setForeground(new Color(255, 255, 255));
		lblTempatTanggalLahir.setBounds(10, 60, 129, 14);
		panel.add(lblTempatTanggalLahir);

		JLabel lblJenisKelamin = new JLabel("Jenis Kelamin");
		lblJenisKelamin.setForeground(new Color(255, 255, 255));
		lblJenisKelamin.setBounds(10, 88, 129, 14);
		panel.add(lblJenisKelamin);

		JLabel lblNewLabel = new JLabel("Nama");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 29, 129, 14);
		panel.add(lblNewLabel);

		JLabel lblStatus = new JLabel("Status");
		lblStatus.setForeground(new Color(255, 255, 255));
		lblStatus.setBounds(10, 116, 129, 14);
		panel.add(lblStatus);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Belum Menikah", "Menikah" }));
		comboBox.setBounds(149, 113, 109, 20);
		panel.add(comboBox);

		JComboBox cbJenisKelamin = new JComboBox();
		cbJenisKelamin.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbJenisKelamin.setForeground(Color.BLACK);
		cbJenisKelamin.setBackground(Color.LIGHT_GRAY);
		cbJenisKelamin.setModel(new DefaultComboBoxModel(new String[] { "Laki-Laki", "Perempuan" }));
		cbJenisKelamin.setBounds(149, 88, 109, 20);
		panel.add(cbJenisKelamin);

		JLabel lblNomorHandphone = new JLabel("Nomor Handphone");
		lblNomorHandphone.setForeground(new Color(255, 255, 255));
		lblNomorHandphone.setBounds(10, 147, 129, 14);
		panel.add(lblNomorHandphone);

		txtHp = new JTextField();
		txtHp.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtHp.setForeground(Color.BLACK);
		txtHp.setBackground(Color.LIGHT_GRAY);
		txtHp.setColumns(10);
		txtHp.setBounds(149, 144, 236, 20);
		panel.add(txtHp);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setBounds(10, 175, 129, 14);
		panel.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtEmail.setForeground(Color.BLACK);
		txtEmail.setBackground(Color.LIGHT_GRAY);
		txtEmail.setColumns(10);
		txtEmail.setBounds(149, 172, 236, 20);
		panel.add(txtEmail);

		JLabel lblAgama = new JLabel("Agama");
		lblAgama.setForeground(new Color(255, 255, 255));
		lblAgama.setBounds(10, 203, 129, 14);
		panel.add(lblAgama);

		txtAgama = new JTextField();
		txtAgama.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtAgama.setForeground(Color.BLACK);
		txtAgama.setBackground(Color.LIGHT_GRAY);
		txtAgama.setColumns(10);
		txtAgama.setBounds(149, 200, 236, 20);
		panel.add(txtAgama);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 51));
		panel_1.setLayout(null);
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBorder(BorderFactory.createTitledBorder("Alamat"));
		panel_1.setBounds(415, 133, 395, 211);
		contentPane.add(panel_1);

		txtAlamat = new JTextField();
		txtAlamat.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtAlamat.setForeground(Color.BLACK);
		txtAlamat.setBackground(Color.LIGHT_GRAY);
		txtAlamat.setColumns(10);
		txtAlamat.setBounds(149, 30, 236, 20);
		panel_1.add(txtAlamat);

		JLabel lblAlamat = new JLabel("Alamat");
		lblAlamat.setForeground(new Color(255, 255, 255));
		lblAlamat.setBounds(10, 33, 129, 14);
		panel_1.add(lblAlamat);

		JLabel lblKelurahan = new JLabel("Kelurahan");
		lblKelurahan.setForeground(new Color(255, 255, 255));
		lblKelurahan.setBounds(10, 64, 129, 14);
		panel_1.add(lblKelurahan);

		txtKelurahan = new JTextField();
		txtKelurahan.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtKelurahan.setForeground(Color.BLACK);
		txtKelurahan.setBackground(Color.LIGHT_GRAY);
		txtKelurahan.setColumns(10);
		txtKelurahan.setBounds(149, 61, 118, 20);
		panel_1.add(txtKelurahan);

		JLabel lblKecamatan = new JLabel("Kecamatan");
		lblKecamatan.setForeground(new Color(255, 255, 255));
		lblKecamatan.setBounds(10, 92, 129, 14);
		panel_1.add(lblKecamatan);

		txtKecamatan = new JTextField();
		txtKecamatan.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtKecamatan.setForeground(Color.BLACK);
		txtKecamatan.setBackground(Color.LIGHT_GRAY);
		txtKecamatan.setColumns(10);
		txtKecamatan.setBounds(149, 89, 118, 20);
		panel_1.add(txtKecamatan);

		JLabel lblKabupaten = new JLabel("Kabupaten");
		lblKabupaten.setForeground(new Color(255, 255, 255));
		lblKabupaten.setBounds(10, 120, 129, 14);
		panel_1.add(lblKabupaten);

		txtKabupaten = new JTextField();
		txtKabupaten.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtKabupaten.setForeground(Color.BLACK);
		txtKabupaten.setBackground(Color.LIGHT_GRAY);
		txtKabupaten.setColumns(10);
		txtKabupaten.setBounds(149, 117, 118, 20);
		panel_1.add(txtKabupaten);

		JLabel lblProvinsi = new JLabel("Provinsi");
		lblProvinsi.setForeground(new Color(255, 255, 255));
		lblProvinsi.setBounds(10, 148, 129, 14);
		panel_1.add(lblProvinsi);

		txtProvinsi = new JTextField();
		txtProvinsi.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtProvinsi.setForeground(Color.BLACK);
		txtProvinsi.setBackground(Color.LIGHT_GRAY);
		txtProvinsi.setColumns(10);
		txtProvinsi.setBounds(149, 145, 118, 20);
		panel_1.add(txtProvinsi);

		JLabel lblKodePos = new JLabel("Kode Pos");
		lblKodePos.setForeground(new Color(255, 255, 255));
		lblKodePos.setBounds(10, 176, 129, 14);
		panel_1.add(lblKodePos);

		txtKodePos = new JTextField();
		txtKodePos.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtKodePos.setForeground(Color.BLACK);
		txtKodePos.setBackground(Color.LIGHT_GRAY);
		txtKodePos.setColumns(10);
		txtKodePos.setBounds(149, 173, 118, 20);
		panel_1.add(txtKodePos);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setColumns(10);
		textField.setBounds(10, 88, 236, 20);
		contentPane.add(textField);

		JLabel lblCariBerdasarkanId = new JLabel("Cari berdasarkan ID");
		lblCariBerdasarkanId.setForeground(new Color(255, 255, 255));
		lblCariBerdasarkanId.setBounds(10, 63, 129, 14);
		contentPane.add(lblCariBerdasarkanId);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 51));
		panel_3.setLayout(null);
		panel_3.setForeground(Color.WHITE);
		panel_3.setBorder(BorderFactory.createTitledBorder("ID Karyawan"));
		panel_3.setBounds(10, 133, 395, 62);
		contentPane.add(panel_3);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setForeground(Color.BLACK);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setColumns(10);
		textField_1.setBounds(149, 31, 234, 20);
		panel_3.add(textField_1);

		JLabel lblIdKaryawan = new JLabel("ID");
		lblIdKaryawan.setForeground(new Color(255, 255, 255));
		lblIdKaryawan.setBounds(10, 34, 129, 14);
		panel_3.add(lblIdKaryawan);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 51));
		panel_2.setBounds(415, 364, 395, 99);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setForeground(new Color(255, 255, 255));
		panel_2.setBorder(BorderFactory.createTitledBorder("Data Jabatan"));

		txtGapok = new JTextField();
		txtGapok.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtGapok.setForeground(Color.BLACK);
		txtGapok.setBackground(Color.LIGHT_GRAY);
		txtGapok.setColumns(10);
		txtGapok.setBounds(149, 57, 234, 20);
		panel_2.add(txtGapok);

		JLabel lblGajiPoko = new JLabel("Gaji Pokok");
		lblGajiPoko.setForeground(new Color(255, 255, 255));
		lblGajiPoko.setBounds(10, 60, 129, 14);
		panel_2.add(lblGajiPoko);

		JLabel lblJabatan = new JLabel("Jabatan");
		lblJabatan.setForeground(new Color(255, 255, 255));
		lblJabatan.setBounds(10, 29, 129, 14);
		panel_2.add(lblJabatan);

		JComboBox cbJabatan = new JComboBox();
		cbJabatan.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbJabatan.setForeground(Color.BLACK);
		cbJabatan.setBackground(Color.LIGHT_GRAY);
		cbJabatan.setModel(new DefaultComboBoxModel(new String[] { "Editor", "Kasir" }));
		cbJabatan.setBounds(149, 26, 234, 20);
		panel_2.add(cbJabatan);

		JButton btnNewData = new JButton("");
		btnNewData.setIcon(new ImageIcon(KaryawanCrudGui.class.getResource("/image/crud/document-new.png")));
		btnNewData.setBounds(10, 11, 48, 48);
		btnNewData.setBackground(null);
		btnNewData.setOpaque(false);
		btnNewData.setBorderPainted(false);
		btnNewData.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewData.addActionListener(new DataKaryawanNewDataMouseListener(this));
		btnNewData.setToolTipText("Buat Data Baru");
		contentPane.add(btnNewData);

		JButton btnEdit = new JButton("");
		btnEdit.setIcon(new ImageIcon(KaryawanCrudGui.class.getResource("/image/crud/document-edit.png")));
		btnEdit.setOpaque(false);
		btnEdit.setBorderPainted(false);
		btnEdit.setBackground((Color) null);
		btnEdit.setBounds(68, 11, 48, 48);
		btnEdit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEdit.addActionListener(new DataKaryawanEditMouseListener(this));
		btnEdit.setToolTipText("Edit Data");
		contentPane.add(btnEdit);

		JButton btnSearch = new JButton("");
		btnSearch.setIcon(new ImageIcon(KaryawanCrudGui.class.getResource("/image/crud/edit-find.png")));
		btnSearch.setOpaque(false);
		btnSearch.setBorderPainted(false);
		btnSearch.setBackground((Color) null);
		btnSearch.setBounds(256, 74, 48, 48);
		btnSearch.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSearch.addActionListener(new DataKaryawanSearchByIdMouseListener(this));
		btnSearch.setToolTipText("Cari Data");
		contentPane.add(btnSearch);

		JButton btnRemove = new JButton("");
		btnRemove.setIcon(new ImageIcon(KaryawanCrudGui.class.getResource("/image/crud/window-close.png")));
		btnRemove.setOpaque(false);
		btnRemove.setBorderPainted(false);
		btnRemove.setBackground((Color) null);
		btnRemove.setBounds(125, 11, 48, 48);
		btnRemove.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnRemove.setToolTipText("Hapus Data");
		contentPane.add(btnRemove);

		JButton btnSave = new JButton("");
		btnSave.setBounds(357, 474, 48, 48);
		contentPane.add(btnSave);
		btnSave.setBackground(new Color(0, 0, 51));
		btnSave.setIcon(new ImageIcon(KaryawanCrudGui.class.getResource("/image/crud/gtk-yes.png")));
		btnSave.setBackground(null);
		btnSave.setOpaque(false);
		btnSave.setBorderPainted(false);
		btnSave.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSave.setToolTipText("Simpan");

		JButton btnCancel = new JButton("");
		btnCancel.setIcon(new ImageIcon(KaryawanCrudGui.class.getResource("/image/crud/gtk-no.png")));
		btnCancel.setOpaque(false);
		btnCancel.setBorderPainted(false);
		btnCancel.setBackground(new Color(0, 0, 51));
		btnCancel.setBounds(415, 474, 48, 48);
		btnCancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCancel.setToolTipText("Batal");
		contentPane.add(btnCancel);

		JButton btnReset = new JButton("");
		btnReset.setIcon(new ImageIcon(KaryawanCrudGui.class.getResource("/image/crud/edit-clear.png")));
		btnReset.setOpaque(false);
		btnReset.setBorderPainted(false);
		btnReset.setBackground((Color) null);
		btnReset.setBounds(183, 11, 48, 48);
		btnReset.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnReset.setToolTipText("Reset Field Data");
		contentPane.add(btnReset);

	}
}
