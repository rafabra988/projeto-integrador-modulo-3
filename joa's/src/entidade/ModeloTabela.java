/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jbrag
 */
public class ModeloTabela extends AbstractTableModel{
    
    private ArrayList linha = null;
    private String[] coluna = null;
    
    public ModeloTabela(ArrayList row, String[] colunm){
        setLinha(row);
        setColuna(colunm);
    }

    public ArrayList getLinha() {
        return linha;
    }

    public void setLinha(ArrayList linha) {
        this.linha = linha;
    }

    public String[] getColuna() {
        return coluna;
    }

    public void setColuna(String[] coluna) {
        this.coluna = coluna;
    }
    
    @Override
    public int getColumnCount(){
        return coluna.length;
    }
    
    @Override
    public int getRowCount(){
        return linha.size();
    }
    
    @Override
    public String getColumnName(int numCol){
        return coluna[numCol];
    }
    
    @Override
    public Object getValueAt(int numLinha, int numCol){
        Object[] linha = (Object[])getLinha().get(numLinha);
        return linha[numCol];
    }
  
    
}
