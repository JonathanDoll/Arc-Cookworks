package Display;

import Ingredients.LoadIngredient;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;

/**
 * @author Jonathan Doll
 */
public class GroceryListDisplay extends javax.swing.JPanel {

    public GroceryListDisplay() {
        initComponents();
        populateList();
    }
    
    public void populateList(){
        total = 0;
        int index = ingredientList.getSelectedIndex();
        dlm = new DefaultListModel();
        ingredientList.setModel(dlm);
        ingList = new HashMap();
        for(LoadIngredient i:ingredients){
            total += Double.parseDouble(i.getCost());
            if(ingList.containsKey(i.getIngredientName())){
                ingList.put(i.getIngredientName(), (int)ingList.get(i.getIngredientName()) + 1);
            }else{
                ingList.put(i.getIngredientName(), 1);
            }
        }

        
        String ing = ingList.entrySet() + "";
        ing = ing.replace("[", "").replace("]", "").replaceAll("=", " X ");
        il = ing.split(", ");
        
        for(String i:il){
                dlm.addElement(i);
        }
        
        
        String ml = "";
        for(String i:meals){
            ml += i + "\n";
        }
        txtMeals.setText(ml);
        String amount = String.format("%.2f", total);
        lblTotal.setText(amount);
        if(index == il.length){
            index--;
        }
        ingredientList.setSelectedIndex(index);
        
        if(il[0].equals("")){
            btnAdd.setEnabled(false);
            btnRemove.setEnabled(false);
            meals = new ArrayList();
            txtMeals.setText("");
        }else{
            btnAdd.setEnabled(true);
            btnRemove.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMeals = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ingredientList = new javax.swing.JList();
        btnExport = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Estimated Total ($):");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Meal Added:");

        txtMeals.setEditable(false);
        txtMeals.setColumns(20);
        txtMeals.setRows(5);
        jScrollPane1.setViewportView(txtMeals);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ingredient List:");

        btnRemove.setText("-1");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(ingredientList);

        btnExport.setText("Export To Text File");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnAdd.setText("+1");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jButton1.setText("Clear Lists");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd))
                    .addComponent(btnExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(0, 63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemove)
                            .addComponent(btnAdd))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExport)
                    .addComponent(jButton1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        LoadIngredient r = null;
        for(LoadIngredient i:ingredients){
            if(ingredientList.getSelectedValue().toString().contains(i.getIngredientName() + " X")){
                r = i;
                break;
            }
        }
        ingredients.remove(r);
        populateList();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        try {
            FileWriter write = new FileWriter("Grocery List.txt");
            for(String i:il){
                write.write(i + "\r\n");
            }
            write.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        LoadIngredient r = null;
        for(LoadIngredient i:ingredients){
            if(ingredientList.getSelectedValue().toString().contains(i.getIngredientName() + " X")){
                r = i;
                break;
            }
        }
        ingredients.add(r);
        populateList();
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ingredients = new ArrayList<>();
        meals = new ArrayList<>();
        txtMeals.setText("");
        populateList();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnRemove;
    private javax.swing.JList ingredientList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextArea txtMeals;
    // End of variables declaration//GEN-END:variables
    public static DefaultListModel dlm;
    private double total;
    public static ArrayList<LoadIngredient> ingredients = new ArrayList<>();
    public static ArrayList<String> meals = new ArrayList<>();
    private HashMap ingList;
    private String[] il;

}
