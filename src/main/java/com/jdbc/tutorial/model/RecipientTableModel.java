/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.model;

import com.jdbc.tutorial.entity.Recipient;

import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author asiro
 */
public class RecipientTableModel extends AbstractTableModel {

    private int colnum = 2;
    private int rownum;
    private String[] colNames = {"ID", "Name"};
    private List<Recipient> ResultSets;

    public RecipientTableModel(List<Recipient> ResultSets) {
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
        Recipient r = this.ResultSets.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return r.getId();
            case 1:
                return r.getName();
            default:
                return null;
        }
    }

}
