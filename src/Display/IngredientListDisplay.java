package Display;

import Ingredients.LoadIngredient;
import Ingredients.LoadIngredientNames;
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
public class IngredientListDisplay extends javax.swing.JPanel {

    public IngredientListDisplay() throws IOException {
        initComponents();
        populateList();
        btnSave.setEnabled(false);
        btnEdit.setEnabled(false);
        btnAddToList.setEnabled(false);
    }

    public void populateList() throws IOException {
        dlm = new DefaultListModel();
        ingredientList.setModel(dlm);
        String[] il = new LoadIngredientNames().getIngredientNames();
        for (String i : il) {
            dlm.addElement(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAddToList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ingredientList = new javax.swing.JList();
        txtIngredientName = new javax.swing.JTextField();
        txtCost = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblSave = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Ingredient Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Price ($):");

        btnAddToList.setText("Add to Grocery List");
        btnAddToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToListActionPerformed(evt);
            }
        });

        ingredientList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ingredientList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ingredientListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ingredientList);

        txtIngredientName.setEditable(false);

        txtCost.setEditable(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(txtIngredientName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEdit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSave)))
                                .addGap(0, 76, Short.MAX_VALUE))))
                    .addComponent(btnAddToList))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(txtIngredientName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit)
                            .addComponent(btnSave))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSave, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddToList)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ingredientListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ingredientListValueChanged
        String ingredient = ingredientList.getSelectedValue().toString();
        try {
            LoadIngredient ing = new LoadIngredient(ingredient);
            txtIngredientName.setText(ing.getIngredientName());
            txtCost.setText(ing.getCost());
            btnEdit.setEnabled(true);
            btnSave.setEnabled(false);
            btnAddToList.setEnabled(true);
            lblSave.setText("");
            txtIngredientName.setEditable(false);
            txtCost.setEditable(false);
        } catch (IOException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_ingredientListValueChanged

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        btnEdit.setEnabled(false);
        btnSave.setEnabled(true);
        txtIngredientName.setEditable(true);
        txtCost.setEditable(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String ingName = ingredientList.getSelectedValue().toString();
            String[] il = new LoadIngredientNames().getIngredientNames();
            boolean found = false;

            for (String ilIng : il) {
                if (ilIng.equals(txtIngredientName.getText())) {
                    found = true;
                }
            }
            if (txtIngredientName.getText().equals(ingName) || !found) {

                BufferedReader read = new BufferedReader(new FileReader("ingredientList.txt"));
                FileWriter write = new FileWriter("temp.txt");

                String r;
                while ((r = read.readLine()) != null) {
                    if (r.equals(ingName)) {
                        r = txtIngredientName.getText() + "\nPrice:\n" + txtCost.getText();
                        read.readLine();
                        read.readLine();
                    }
                    write.write(r + "\n");
                }

                read.close();
                write.close();

                BufferedReader readRec = new BufferedReader(new FileReader("recipeList.txt"));
                FileWriter writeRec = new FileWriter("tempr.txt");
                String re;
                while ((re = readRec.readLine()) != null) {

                    if (re.equals("Ingredients:")) {
                        writeRec.write(re + "\n");
                        while ((re = readRec.readLine()) != null && !re.equals("Instructions:")) {
                            if (re.equals(ingName)) {
                                re = txtIngredientName.getText();
                            }
                            writeRec.write(re + "\n");
                        }
                        writeRec.write(re + "\n");
                    }else{
                        writeRec.write(re + "\n");
                    }

                }

                readRec.close();
                writeRec.close();

                fileSwitch("ingredientList.txt", "temp.txt");
                fileSwitch("recipeList.txt", "tempr.txt");

                dlm.setElementAt(txtIngredientName.getText(), ingredientList.getSelectedIndex());

                btnSave.setEnabled(false);
                btnEdit.setEnabled(true);
                txtIngredientName.setEditable(false);
                txtCost.setEditable(false);
                lblSave.setText("Ingredient Updated");

            } else {
                lblSave.setText("Ingredient name already in list");
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToListActionPerformed
        try {
            GroceryListDisplay.ingredients.add(new LoadIngredient(ingredientList.getSelectedValue().toString()));
            ArcCookworks.gld.populateList();
        } catch (IOException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnAddToListActionPerformed

    private void fileSwitch(String oldFile, String newFile) {
        File ingList = new File(oldFile);
        ingList.delete();
        new File(newFile).renameTo(ingList);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToList;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JList ingredientList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSave;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtIngredientName;
    // End of variables declaration//GEN-END:variables
    public static DefaultListModel dlm;
}
