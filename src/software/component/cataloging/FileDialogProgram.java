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
    
    //Note: Typically the main method will be in a
    //separate class. As this is a simple one class
    //example it's all in the one class.
    public static void main(String[] args) {
     
         //Use the event dispatch thread for Swing components
         EventQueue.invokeLater(new Runnable()
         {
             
            @Override
             public void run()
             {
                 
                 new FileDialogProgram();         
             }
         });
              
    }
     
    //handles the creation of the JFrame and
    //all it's components
    public FileDialogProgram()
    { 
        guiFrame = new JFrame();
        //make sure the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("File Dialog");
        guiFrame.setSize(500,300);
        
        //This will center the JFrame in the middle of the screen
        guiFrame.setLocationRelativeTo(null);
        
        
        guiFrame.setLayout(new BorderLayout());
        
        //create an instance of JFileChooser class
        fileDialog = new JFileChooser();//"C:\\Documents and Settings\\Owner\\My Documents"
        
        //Using a JTextArea to diplay feedback
        
        optPanel = new JPanel();
        optPanel.setLayout(new GridLayout(1,2));
        
        
        guiFrame.add(optPanel,BorderLayout.SOUTH);

        JButton openButton = new JButton("Open Dialog");
        openButton.setActionCommand("Open Dialog");
        openButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                openDialog();
            }
        });
        
        optPanel.add(openButton);
        
        JButton saveButton = new JButton("Save Dialog");
        saveButton.setActionCommand("Save Dialog");
        saveButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                saveDialog();
            }
        });
        
        optPanel.add(saveButton);
        
        guiFrame.setVisible(true);
    }
    
    //Show a open file dialog box
    private File openDialog()
    {
        int openChoice = fileDialog.showOpenDialog(guiFrame);
        
        //display choice using tracker 
        logChoice(openChoice, "Open Dialog");
        
        if (openChoice == JFileChooser.APPROVE_OPTION)
        {
            //Put open file code in here
            File openFile = fileDialog.getSelectedFile();
            System.out.printf("\nThe file selected is " + openFile.getName());
            System.out.printf("\nThe file's path is " + openFile.getPath());
            return openFile;
        }
        return null;
        
    }
        
    //Show a save file dialog box
    private void saveDialog()
    {
        int saveChoice = fileDialog.showSaveDialog(guiFrame);
        
        //display choice using tracker 
        logChoice(saveChoice, "Open Dialog");
        
        if (saveChoice == JFileChooser.APPROVE_OPTION)
        {
            //Put save file code in here
            File saveFile = fileDialog.getSelectedFile();
            System.out.printf("\nThe file selected is " + saveFile.getName());
            System.out.printf("\nThe file's path is " + saveFile.getPath());
        }
    }
    
    //append the button choice to the tracker JTextArea
    private void logChoice(int choice, String dialog)
    {
        switch (choice)
        {
            //The user pressed cancel button
            case JFileChooser.CANCEL_OPTION:
                tracker.append("\nCancel Option received from " + dialog);
                break;
                
            //The user pressed the open/save button
            case JFileChooser.APPROVE_OPTION:
                tracker.append("\nApprove Option received from " + dialog);
                break;
                
            //The user dismissed the dialog without pressing a button
            case JFileChooser.ERROR_OPTION:
                tracker.append("\nError Option received from " + dialog);
                break;
        }
    }
}
