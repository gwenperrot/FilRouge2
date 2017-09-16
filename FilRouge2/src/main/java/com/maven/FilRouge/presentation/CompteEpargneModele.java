package com.maven.FilRouge.presentation;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import com.maven.FilRouge.metier.CompteEpargne;

public class CompteEpargneModele extends AbstractTableModel {

	private static final long serialVersionUID = 5392797015126457751L;

		private String[] tableColumnNames = new String[]{"Numéro", "Date d'ouverture", "Solde", "Taux"};
		private Vector<String[]> tableValues = new Vector<String[]>();
		
	@Override
	public int getRowCount() {
		return tableValues.size();
	}

	@Override
	public int getColumnCount() {
		return tableColumnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return tableValues.get(rowIndex)[columnIndex];
	}
	
	public String getColumnName(int column) {
		return tableColumnNames[column];
	}
	
	public void setData(CompteEpargne c) {
		tableValues = new Vector<String[]>();
			tableValues.add(new String[] {
					String.valueOf(c.getNumCompte()), c.getDateOuverture(), String.valueOf(c.getSolde()), String.valueOf(c.getTauxEpargne())
			});
		fireTableChanged(null);
	}
}
