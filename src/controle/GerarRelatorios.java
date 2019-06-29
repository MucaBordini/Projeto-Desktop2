/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author julio
 */
public class GerarRelatorios {
    
    ControleBD bd = new ControleBD();
      
    private Map constroiParametros(String x) {
        Map params = new HashMap();
        params.put("DEV_JOGO", x);
        return params;
    }
    
    public void Relatorio(String pdf, String relatorio, String x){
        JasperPrint impressao;
        try {
            impressao = JasperFillManager.fillReport(
                    relatorio,
                    constroiParametros(x),
                    bd.AcessaBD());
            JasperExportManager.exportReportToPdfFile(impressao, pdf);
            JasperViewer.viewReport(impressao, false);
            JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");
        } catch (JRException ex) {
            System.err.println("Não foi possível exportar o relatório.\n\n");
            ex.printStackTrace();
        }
    }
}
