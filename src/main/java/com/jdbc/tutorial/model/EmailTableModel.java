/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.model;

import com.jdbc.tutorial.entity.Email;

import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author asiro
 */
public class EmailTableModel extends AbstractTableModel {

    private int colnum = 4;
    private int rownum;
    private String[] colNames = {"ID", "Email", "Sender", "Recipient"};
    private List<Email> ResultSets;

    public EmailTableModel() {
    }

    public EmailTableModel(List<Email> ResultSets) {
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
        Email e = this.ResultSets.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return e.getId();
            //break;
            case 1:
                return e.getEmail();
            //break;
            case 2:{
                if (e.getSender_id() == null)
                    return "";
                else
                 return e.getSender_id();
            //break;
            }
               
            case 3:{
                if(e.getRecipient_id() == null)
                    return "";
                else
                return e.getRecipient_id();
            //break;
            }
            default:
                return null;
        }

    }
}
