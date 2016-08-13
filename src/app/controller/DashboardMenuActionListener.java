package app.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import app.view.DashboardGui;
import app.view.KaryawanCrudGui;

public class DashboardMenuActionListener implements ActionListener {
	private DashboardGui frame;

	public DashboardMenuActionListener(DashboardGui frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		switch(action){
		case "DATA_KARYAWAN":
			KaryawanCrudGui menuKaryawan = new KaryawanCrudGui();
			menuKaryawan.setVisible(true);
			break;
		case "DATA_SUPPLIER":
			JOptionPane.showMessageDialog(frame, "Gotcha");
			break;
		case "DATA_INVENTARIS":
			JOptionPane.showMessageDialog(frame, "Gotcha");
			break;
		case "PROFIL_PENGGUNA":
			JOptionPane.showMessageDialog(frame, "Gotcha");
			break;
		case "PENJUALAN":
			JOptionPane.showMessageDialog(frame, "Gotcha");
			break;
		case "PEMBELIAN":
			JOptionPane.showMessageDialog(frame, "Gotcha");
			break;
		case "PRODUK":
			JOptionPane.showMessageDialog(frame, "Gotcha");
			break;
		case "HAK_AKSES":
			JOptionPane.showMessageDialog(frame, "Gotcha");
			break;
		}

	}
}
