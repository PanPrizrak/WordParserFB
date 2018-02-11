/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.model;

import com.jdbc.tutorial.entity.Sender;

import java.util.List;

import javax.swing.table.AbstractTableModel;
/**
 *
 * @author asiro
 */
public class SenderTableModel extends AbstractTableModel {
    
    private int colnum = 8;
    private int rownum;
    private String[] colNames = {"ID", "Ved", "Name", "Adres", "RS", "Bank", "Kod", "UNP"};
    private List<Sender> ResultSets;

    public SenderTableModel(List<Sender> ResultSets) {
        this.ResultSets = ResultSets;
    }
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.ResultSets.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.colnum;
    }
    
    @Override
    public String getColumnName(int param) {

        return colNames[param];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Sender s = this.ResultSets.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return s.getId();
            case 1:
                return s.getVed();
            case 2:
                return s.getName();
            case 3:
                return s.getAdres();
            case 4:
                return s.getRs();
            case 5:
                return s.getBank();
            case 6:
                return s.getKodbank();
            case 7:
                return s.getUnp();
            default:
                return null;
        }
    }
}
