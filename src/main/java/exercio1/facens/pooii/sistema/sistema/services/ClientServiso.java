package exercio1.facens.pooii.sistema.sistema.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exercio1.facens.pooii.sistema.sistema.dtos.ClientDTO;
import exercio1.facens.pooii.sistema.sistema.entities.Client;
import exercio1.facens.pooii.sistema.sistema.repositories.ClienteRepositorio;

@Service
public class ClientServiso {
    
    @Autowired
    private ClienteRepositorio repository;

    public List<ClientDTO> getClients() {
        
        List<Client> list = repository.getClients();
        List<ClientDTO> listDTO = new ArrayList<>();

        for (Client c : list) {
            
            ClientDTO dto = new ClientDTO(c.getNome(), c.getEmail(), c.getDataNacimento());
            listDTO.add(dto);
        }

        return listDTO;
    }
}
