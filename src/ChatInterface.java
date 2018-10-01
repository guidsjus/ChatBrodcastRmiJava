
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public interface ChatInterface extends java.rmi.Remote 
{
 boolean checkClientCredintials(ChatInterface ci,String name, String pass) throws RemoteException;
 void broadcastMessage(String name,String message) throws RemoteException;
 void sendMessageToClient(String message) throws RemoteException;
}
