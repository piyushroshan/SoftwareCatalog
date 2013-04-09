/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software.component.cataloging;

import java.util.TimerTask;


/**
 *
 * @author roshan
 */
import java.util.Date;

import java.util.Timer;

import java.util.TimerTask;

public class PurgeUnused {

    long delay = 12*60*60*1000; // delay in ms : 10 * 1000 ms = 10 sec.
    PurgeTask task = new PurgeTask();
    Timer timer = new Timer("TaskName");

    public void start() {
    timer.cancel();
    timer = new Timer("TaskName");
    Date executionDate = new Date(); // no params = now
    timer.scheduleAtFixedRate(task, executionDate, delay);
    }

public class PurgeTask extends TimerTask {
    
    
    public boolean removeComponent(int id){
        if(id==-1)
            return false;
        //remove component from database
        return true;
    }
    

    
    public void scanDB()
    {
         int id = -1;
        //search DB
        //for id with unused/used > 100
        removeComponent(id);
    }

    @Override
    public void run() {
         scanDB();
    }
    
}
}