/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotecontroller;

/**
 *
 * @author lars-harald
 */
public interface DataInterface {
    
    void setData(byte[] data);
    
    byte[] getData();
    
    boolean getThreadStatus();
    
    void setThreadStatus(boolean state);
    
}
