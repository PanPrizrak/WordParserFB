/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.model;

import com.jdbc.tutorial.entity.Worker;

import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author asiro
 */
public class WorkerTableModel extends AbstractTableModel {

    private int colnum = 6;
    private int rownum;
    private String[] colNames = {"ID", "Position", "Name", "Sname", "Patronymic", "Recipient"};
    private List<Worker> ResultSets;

    public WorkerTableModel(List<Worker> ResultSets) {
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
        Worker w = this.ResultSets.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return w.getId();
            case 1:
                return w.getPosition();
            case 2:
                return w.getName();
            case 3:
                return w.getSname();
            case 4:
                return w.getPatronymic();
            case 5:
                return w.getRecipient_id();
            default:
                return null;
        }
    }
}
