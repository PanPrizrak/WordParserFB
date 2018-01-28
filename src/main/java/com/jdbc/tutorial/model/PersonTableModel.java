/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.model;

import com.jdbc.tutorial.entity.Person;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author asiro
 */
public class PersonTableModel extends AbstractTableModel {

    private int colnum = 3;
    private int rownum;
    private String[] colNames = {
        "ID", "Имя", "Страна"};
    private List<Person> ResultSets;

    /**
     * Creates a new instance of FoodTableModel
     */
    public PersonTableModel(List<Person> bufList) {

        ResultSets = bufList;

        /*try {
            while (rs.next()) {
                String[] row = {
                    String.valueOf(rs.getInt("id")), rs.getString("name"), rs.getString("country")};
                ResultSets.add(row);

            }
        } catch (Exception e) {
            System.out.println("Exception in WorkerTableModel");
        }*/
    }

    public Object getValueAt(int rowindex, int columnindex) {

        Person o = ResultSets.get(rowindex);
        if (columnindex == 0) {
            return o.getId();
        } else if (columnindex == 1) {
            return o.getName();
        } else if (columnindex == 2) {
            return o.getCountry();
        } else {
            return null;
        }
        /*  String[] row = ResultSets.get(rowindex);
        return row[columnindex];*/

    }

    @Override
    public int getRowCount() {
        return ResultSets.size();
    }

    @Override
    public int getColumnCount() {
        return colnum;
    }

    @Override
    public String getColumnName(int param) {

        return colNames[param];
    }

}
