/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.wordparserfb;

import com.jdbc.tutorial.dao.EmailDAO;
import com.jdbc.tutorial.dao.SenderDAO;
import com.jdbc.tutorial.dao.TelDAO;
import com.jdbc.tutorial.entity.Email;
import com.jdbc.tutorial.entity.Sender;
import com.jdbc.tutorial.entity.Tel;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.oasis.JROdtExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.view.JasperViewer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author User
 */
public class FB {

    private Sender sender = null, sender_by = null;
    private Tel tel = null;
    private Email email =null;
    //private String nameS = null;
    private static final String sr = "D:\\Учеба\\pNetBeans\\WordParserFB\\reports\\";
    //private static final String fl = "Flower";
    private static final String fb = "FB";
    
   // private Sender sender = new Sender();
    private ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springFB.xml");
    
    

    public static void main(String[] args) throws JRException {
        try {
            FB buf = new FB();
            String b;
            b = fb;
            buf.compile(b);
            buf.fill(b);
            buf.docx(b);
            buf.odt(b);
            buf.viewer(b);
        } catch (IOException ex) {
            Logger.getLogger(FB.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Начало генерации отчёта");
        /*try {
            new Generator().create();
            System.out.println("Генерация отчёта завершена");
        } catch (Exception e) {
            System.out.println("Во время генерации возникла ошибка: " + e);
        }*/
    }
    
    public void run() throws JRException {
        try {
            String b;
            b = fb;
            this.compile(b);
            this.fill(b);
            this.docx(b);
            this.odt(b);
            this.viewer(b);
        } catch (IOException ex) {
            Logger.getLogger(FB.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Начало генерации отчёта");
    }

    public void setEntity(){
        SenderDAO senderDAO = context.getBean(SenderDAO.class);
        EmailDAO emailDAO = context.getBean(EmailDAO.class);
        TelDAO telDAO = context.getBean(TelDAO.class);
        sender_by = senderDAO.getSenderById(1);
        sender = senderDAO.getSenderById(2);
        tel = telDAO.getTelById(0);
        email = emailDAO.getEmailById(0);
        
        
    }
    
    public void compile(String s_n) {
        try {
            long start = System.currentTimeMillis();
            File bsFile = new File(sr + s_n + ".jrxml");
            JasperDesign jDesign = (JasperDesign) JRXmlLoader.load(bsFile);
            JasperCompileManager.compileReportToFile(jDesign, sr + s_n + ".jasper");
            System.err.println("Compile time : " + (System.currentTimeMillis() - start));
        } catch (JRException e) {
            System.out.println(e);
        }
    }

    public void fill(String s_n) throws IOException {
        try {
            DAOStub dataBeanMaker = new DAOStub();
            ArrayList<DataBean> dataBeanList = dataBeanMaker.getDataBeanList();
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(dataBeanList);
            long start = System.currentTimeMillis();
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("ministr", sender.toSender());
            parameters.put("name", "");
            File bsFile = new File(sr + s_n + ".jasper");
            JasperReport jReport = (JasperReport) JRLoader.loadObject(bsFile);
            JasperFillManager.fillReportToFile(jReport, sr + s_n + ".jrprint", parameters,beanColDataSource);
            System.err.println(sr + s_n + ".jasper" + "!!!Filling time : " + (System.currentTimeMillis() - start));
        } catch (JRException ex) {
            Logger.getLogger(FB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void docx(String s_n) {
        try {
            long start = System.currentTimeMillis();
            JRDocxExporter exporter = new JRDocxExporter();
            exporter.setExporterInput(new SimpleExporterInput(sr + s_n + ".jrprint"));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(sr + s_n + ".docx"));
            exporter.exportReport();
            System.err.println("DOCX creation time : " + (System.currentTimeMillis() - start));
        } catch (JRException ex) {
            Logger.getLogger(FB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void odt(String s_n) {
        try {
            long start = System.currentTimeMillis();
            JROdtExporter exporter = new JROdtExporter();
            exporter.setExporterInput(new SimpleExporterInput(sr + s_n + ".jrprint"));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(sr + s_n + ".odt"));
            exporter.exportReport();
            System.err.println("ODT creation time : " + (System.currentTimeMillis() - start));
        } catch (JRException ex) {
            Logger.getLogger(FB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void viewer(String s_n) {
        try {
            //отображение jrprint
            long start = System.currentTimeMillis();
            File sourceFile = new File(sr + s_n + ".jrprint");
            JasperPrint jasperPrint = (JasperPrint) JRLoader.loadObject(sourceFile);
            JasperViewer.viewReport(jasperPrint, false);
            System.err.println("Viewer creation time : " + (System.currentTimeMillis() - start));
        } catch (JRException ex) {
            Logger.getLogger(FB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
