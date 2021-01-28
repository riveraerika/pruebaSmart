/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import dao.ClientDao;
 import java.util.List;
import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Usuario
 */

@Service("clientService")
public class ClienteService {
    	
       	@Autowired
	       ClientDao clientDao;
	
	@Transactional
	public List<Cliente> getAllClient() {
		return clientDao.getAllClients();
	}

	@Transactional
	public Cliente getClient(int id) {
		return clientDao.getClients(id);
	}

	@Transactional
	public void addClient(Cliente cliente) {
		clientDao.addClients(cliente);
	}

	@Transactional
	public void updateClient(Cliente cliente) {
		clientDao.updateClient(cliente);

	}

	@Transactional
	public void deleteClient(int id) {
		clientDao.deleteClient(id);
	}


    
    
    
   
    
}
