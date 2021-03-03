package exercio1.facens.pooii.sistema.sistema.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exercio1.facens.pooii.sistema.sistema.dtos.ClientDTO;
import exercio1.facens.pooii.sistema.sistema.services.ClientServiso;


@RestController
@RequestMapping ("/clients")
public class ClientController {
    
    @Autowired
    private ClientServiso service;

    @GetMapping
    public ResponseEntity<List<ClientDTO>> getClient(){
        
        List <ClientDTO> list = service.getClients();
        return ResponseEntity.ok(list);
    }
}
