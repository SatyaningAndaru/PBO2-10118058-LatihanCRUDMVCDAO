/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcjdbc.main;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import latihanmvcjdbc.database.KingBarbershopDatabase;
import latihanmvcjdbc.entity.Pelanggan;
import latihanmvcjdbc.error.PelangganException;
import latihanmvcjdbc.service.PelangganDao;
import latihanmvcjdbc.view.MainPelanggan;

/**
 *
 * @author toshiba
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                try{
                   MainPelanggan pelanggan = new MainPelanggan();
                   pelanggan.loadDatabase();
                   pelanggan.setVisible(true);
                }catch (SQLException e){
                    
                }catch(PelangganException ex){
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        });
            
            
        
    }
    
}
