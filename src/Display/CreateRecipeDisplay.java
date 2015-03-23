package Display;

import Ingredients.CreateIngredient;
import Ingredients.LoadIngredientNames;
import Recipes.LoadRecipeNames;
import Recipes.SaveRecipe;
import java.io.IOException;

/**
 * @author Jonathan Doll
 */
public class CreateRecipeDisplay extends javax.swing.JPanel {

    public CreateRecipeDisplay() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new java.awt.Button();
        btnClear = new java.awt.Button();
        txtRecipeName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInstructions = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtIngredients = new javax.swing.JTextArea();
        lblSave = new javax.swing.JLabel();

        btnSave.setLabel("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setLabel("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtRecipeName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRecipeNameKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Recipe Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Ingredients:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Instructions:");

        txtInstructions.setColumns(20);
        txtInstructions.setRows(5);
        jScrollPane1.setViewportView(txtInstructions);

        txtIngredients.setColumns(20);
        txtIngredients.setRows(5);
        jScrollPane2.setViewportView(txtIngredients);

        lblSave.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSave.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtRecipeName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                                .addGap(132, 132, 132)))
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addComponent(txtRecipeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        LoadRecipeNames lrn = new LoadRecipeNames();
        try {
            String[] recNames = lrn.getRecipeNames();
            if (!txtRecipeName.getText().equals("") && !txtIngredients.getText().equals("") && !txtInstructions.getText().equals("")) {
                String recipeName = txtRecipeName.getText();
                boolean found = false;
                for (String n : recNames) {
                    if (recipeName.equals(n)) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    String ingredients = txtIngredients.getText();
                    String instructions = txtInstructions.getText();

                    try {
                        new SaveRecipe(recipeName, ingredients, instructions);
                    } catch (IOException ex) {
                        System.err.println("uh oh");
                    }

                    RecipeListDisplay.dlm.add(RecipeListDisplay.dlm.size(), txtRecipeName.getText());
                    
                    txtRecipeName.setText("");
                    txtIngredients.setText("");
                    txtInstructions.setText("");
                    lblSave.setText("Recipe Saved");
                    
                    checkForIngredients(ingredients);
                    
                } else {
                    lblSave.setText("Recipe Already Exists");
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtRecipeName.setText("");
        txtIngredients.setText("");
        txtInstructions.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtRecipeNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRecipeNameKeyPressed
        lblSave.setText("");
    }//GEN-LAST:event_txtRecipeNameKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnClear;
    private java.awt.Button btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSave;
    private javax.swing.JTextArea txtIngredients;
    private javax.swing.JTextArea txtInstructions;
    private javax.swing.JTextField txtRecipeName;
    // End of variables declaration//GEN-END:variables
}
