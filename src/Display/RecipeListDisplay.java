package Display;

import Ingredients.CreateIngredient;
import Ingredients.LoadIngredient;
import Ingredients.LoadIngredientNames;
import Recipes.LoadRecipe;
import Recipes.LoadRecipeNames;
import arc.cookworks.ArcCookworks;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;

/**
 * @author Jonathan Doll
 */
public class RecipeListDisplay extends javax.swing.JPanel {

    public RecipeListDisplay() throws IOException {
        initComponents();
        populateList();
        btnAddToList.setEnabled(false);
        btnSave.setEnabled(false);
        btnEdit.setEnabled(false);
    }
    
    public void populateList() throws IOException{
        dlm = new DefaultListModel();
        recipeList.setModel(dlm);
        String[] r = new LoadRecipeNames().getRecipeNames();
        for(String rn:r){
            dlm.addElement(rn);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        recipeList = new javax.swing.JList();
        btnAddToList = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInstructions = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtIngredients = new javax.swing.JTextArea();
        txtRecipeName = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblSave = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        recipeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        recipeList.setToolTipText("");
        recipeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                recipeListValueChanged(evt);
            }
        });
        recipeList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                recipeListFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(recipeList);

        btnAddToList.setText("Add to Grocery List");
        btnAddToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToListActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Recipe Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ingredients");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Instructions:");

        txtInstructions.setEditable(false);
        txtInstructions.setColumns(20);
        txtInstructions.setRows(5);
        jScrollPane1.setViewportView(txtInstructions);

        txtIngredients.setEditable(false);
        txtIngredients.setColumns(20);
        txtIngredients.setRows(5);
        jScrollPane3.setViewportView(txtIngredients);

        txtRecipeName.setEditable(false);

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblSave.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSave.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddToList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtRecipeName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddToList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit)
                            .addComponent(btnSave))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSave, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(txtRecipeName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToListActionPerformed
        try {
            String[] ing = txtIngredients.getText().split("\n");
            for(String i:ing){
                GroceryListDisplay.ingredients.add(new LoadIngredient(i));
            }
            GroceryListDisplay.meals.add(recipeList.getSelectedValue().toString());
            ArcCookworks.gld.populateList();
        } catch (IOException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnAddToListActionPerformed

    private void recipeListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recipeListFocusGained
        
    }//GEN-LAST:event_recipeListFocusGained

    private void recipeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_recipeListValueChanged
        String recipe = recipeList.getSelectedValue().toString();
        try {
            LoadRecipe lr = new LoadRecipe(recipe);
            txtRecipeName.setText(lr.getRecipeName());
            txtIngredients.setText(lr.getIngredients());
            txtInstructions.setText(lr.getInstructions());
            btnEdit.setEnabled(true);
            btnSave.setEnabled(false);
            btnAddToList.setEnabled(true);
            lblSave.setText("");
            txtRecipeName.setEditable(false);
            txtIngredients.setEditable(false);
            txtInstructions.setEditable(false);
        } catch (IOException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_recipeListValueChanged

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        btnEdit.setEnabled(false);
        btnSave.setEnabled(true);
        txtRecipeName.setEditable(true);
        txtIngredients.setEditable(true);
        txtInstructions.setEditable(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String recName = recipeList.getSelectedValue().toString();
            String[] il = new LoadRecipeNames().getRecipeNames();
            boolean found = false;
            
            for (String ilIng : il) {
                if (ilIng.equals(txtRecipeName.getText())) {
                    found = true;
                }
            }
            if (txtRecipeName.getText().equals(recName) || !found) {
                
                BufferedReader read = new BufferedReader(new FileReader("recipeList.txt"));
                FileWriter write = new FileWriter("tempr.txt");

                String r;
                while ((r = read.readLine()) != null) {
                    if (r.equals(recName)) {
                        r = txtRecipeName.getText() + "\nIngredients:\n" + txtIngredients.getText() + "\nInstructions:\n" + txtInstructions.getText();
                        write.write(r + "\n");
                        while((r = read.readLine()) != null){
                            if(r.equals("Recipe Name:")){
                                write.write(r + "\n");
                                break;
                            }
                        }
                    }else{
                        write.write(r + "\n");
                    }
                }

                read.close();
                write.close();
                
                checkForIngredients(txtIngredients.getText());
                
                fileSwitch();
                
                dlm.setElementAt(txtRecipeName.getText(), recipeList.getSelectedIndex());
                
                btnSave.setEnabled(false);
                btnEdit.setEnabled(true);
                txtRecipeName.setEditable(false);
                txtIngredients.setEditable(false);
                txtInstructions.setEditable(false);
                lblSave.setText("Recipe Updated");
                
            } else {
                lblSave.setText("Recipe already exists");
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void fileSwitch(){
        File ingList = new File("recipeList.txt");
        ingList.delete();
        new File("tempr.txt").renameTo(ingList);
    }
    
    private void checkForIngredients(String ingredients) throws IOException{
        String[] il = new LoadIngredientNames().getIngredientNames();
        String[] ing = ingredients.split("\n");
        for(String recIng:ing){
            boolean found = false;
            for(String ilIng:il){
                if(ilIng.equals(recIng)){
                    found = true;
                    break;
                }
            }
            if(!found){
                new CreateIngredient(recIng);
                IngredientListDisplay.dlm.add(IngredientListDisplay.dlm.size(), recIng);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToList;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblSave;
    private javax.swing.JList recipeList;
    private javax.swing.JTextArea txtIngredients;
    private javax.swing.JTextArea txtInstructions;
    private javax.swing.JTextField txtRecipeName;
    // End of variables declaration//GEN-END:variables
    public static DefaultListModel dlm;
}
