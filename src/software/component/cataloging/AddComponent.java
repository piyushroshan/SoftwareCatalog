/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software.component.cataloging;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
/**
 *
 * @author R0$H4N
 */
public class AddComponent extends javax.swing.JPanel implements ActionListener {
    private String[] code;
    private String[] design;
    /**
     * Creates new form AddComponent
     */
    public AddComponent(String[] code, String[] design) {
        initComponents();
        choiceCategoryField.addActionListener(this);
        this.code = code;
        System.out.print(code);
        this.design = design;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        typeLabel = new javax.swing.JLabel();
        choiceCategoryField = new javax.swing.JComboBox();
        choiceSubCatagoryField = new javax.swing.JComboBox();
        descriptionLabel = new javax.swing.JLabel();
        descriptionText = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        contentLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        chooseFileButton = new javax.swing.JButton();
        fileLabel = new javax.swing.JLabel();

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nameLabel.setText("Name");

        typeLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        typeLabel.setText("Type");

        choiceCategoryField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----", "Code", "Design" }));

        choiceSubCatagoryField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----" }));

        descriptionLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        descriptionLabel.setText("Description");

        jTextPane1.setVerifyInputWhenFocusTarget(false);
        descriptionText.setViewportView(jTextPane1);

        contentLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        contentLabel.setText("Content");

        saveButton.setText("Save");

        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        chooseFileButton.setText("Choose File");
        chooseFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileButtonActionPerformed(evt);
            }
        });

        fileLabel.setText("Filename");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionLabel)
                    .addComponent(contentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton)
                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(choiceCategoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(choiceSubCatagoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(chooseFileButton))
                    .addComponent(cancelButton))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(choiceCategoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(typeLabel))
                    .addComponent(choiceSubCatagoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chooseFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(descriptionLabel))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        choiceSubCatagoryField.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cancelButtonMouseClicked

private void chooseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileButtonActionPerformed
// TODO add your handling code here:
    FileDialogProgram fileD = new FileDialogProgram();
    File file = fileD.openDialog();
}//GEN-LAST:event_chooseFileButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox choiceCategoryField;
    private javax.swing.JComboBox choiceSubCatagoryField;
    private javax.swing.JButton chooseFileButton;
    private javax.swing.JLabel contentLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JScrollPane descriptionText;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables

    @Override
 public void actionPerformed(ActionEvent e) {
        if(e.getSource() == choiceCategoryField){
        String text = choiceCategoryField.getModel().getSelectedItem().toString();
            switch (text) {
                case "Code":
                    choiceSubCatagoryField.setModel(new javax.swing.DefaultComboBoxModel(code));
                    choiceSubCatagoryField.setVisible(true);
                    break;
                case "Design":
                    choiceSubCatagoryField.setModel(new javax.swing.DefaultComboBoxModel(design));
                    choiceSubCatagoryField.setVisible(true);
                    break;
                default:
                    choiceSubCatagoryField.setModel(new javax.swing.DefaultComboBoxModel());
                    choiceSubCatagoryField.setVisible(false);
            }
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
