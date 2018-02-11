/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.model;

import com.jdbc.tutorial.entity.Tel;

import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author asiro
 */
public class TelTableModel extends AbstractTableModel {
    
    private int colnum = 4;
    private int rownum;
    private String[] colNames = {"ID", "Tel", "Sender", "Recipient"};
    private List<Tel> ResultSets;

    public TelTableModel(List<Tel> ResultSets) {
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
        Tel t = this.ResultSets.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return t.getId();
            case 1:
                return t.getTel();
            case 2:
                return t.getSender_id();
            case 3:
                return t.getRecipient_id();
            default:
                return null;
        }
    }
}
