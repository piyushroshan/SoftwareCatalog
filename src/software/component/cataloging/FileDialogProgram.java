/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software.component.cataloging;

//Imports are listed in full to show what's being used
//could just import javax.swing.* and java.awt.* etc..
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;


public class FileDialogProgram {
    
    JFrame guiFrame;
    JTextArea tracker; 
    JPanel optPanel;
    JFileChooser fileDialog;
    

     
    //handles the creation of the JFrame and
    //all it's components
    public FileDialogProgram()
    { 
        fileDialog = new JFileChooser();
        
    }
    
    //Show a open file dialog box
    public File openDialog()
    {
        int openChoice = fileDialog.showOpenDialog(guiFrame);
        
        
        if (openChoice == JFileChooser.APPROVE_OPTION)
        {
            //Put open file code in here
            File openFile = fileDialog.getSelectedFile();
            //System.out.printf("\nThe file selected is " + openFile.getName());
            //System.out.printf("\nThe file's path is " + openFile.getPath());
            return openFile;
        }
        return null;
        
    }
        
    //Show a save file dialog box
    public void saveDialog()
    {
        int saveChoice = fileDialog.showSaveDialog(guiFrame);
        
        if (saveChoice == JFileChooser.APPROVE_OPTION)
        {
            //Put save file code in here
            File saveFile = fileDialog.getSelectedFile();
            //System.out.printf("\nThe file selected is " + saveFile.getName());
            //System.out.printf("\nThe file's path is " + saveFile.getPath());
        }
    }
    
    
}
