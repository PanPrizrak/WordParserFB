/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.model;

import com.jdbc.tutorial.entity.Letter;

import java.util.List;

import javax.swing.table.AbstractTableModel;
/**
 *
 * @author asiro
 */
public class LetterTableModel extends AbstractTableModel {
    
    private int colnum = 9;
    private int rownum;
    private String[] colNames = {"ID", "Sender", "Recipient", "Data", "Number", "Subject", "Message", "Worker", "Executor"};
    List<Letter> ResultSets;

    public LetterTableModel(List<Letter> ResultSets) {
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
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Letter l = this.ResultSets.get(rowIndex);
        switch (columnIndex) {
                case 0:
                    return l.getId();
                case 1:
                    return l.getSender_id();
                case 2:
                    return l.getRecipient_id();
                case 3:
                    return l.getData();
                case 4:
                    return l.getNumber();
                case 5:
                    return l.getSubject();
                case 6:
                    return l.getMessage();
                case 7:
                    return l.getWorker_id();
                case 8:
                    return l.getExecutor();
                default:
                    return null;
        }
    }
}
