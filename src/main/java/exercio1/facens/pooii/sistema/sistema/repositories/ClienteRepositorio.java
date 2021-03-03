package exercio1.facens.pooii.sistema.sistema.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import exercio1.facens.pooii.sistema.sistema.entities.Client;

@Component
public class ClienteRepositorio {
    
    public List<Client> getClients() {
        Client c = new Client();
        c.setId(1);
        c.setNome("Carlos");
        c.setEmail("kainanquirino@gmail.com");
        c.setDataNacimento("12/03/2000");

        Client c2 = new Client();
        c2.setId(2);
        c2.setNome("Kaina");
        c2.setEmail("carlos.kaina1@gmail.com");
        c2.setDataNacimento("14/02/2001");

        List <Client> list = new ArrayList<>();
        list.add(c);
        list.add(c2); 

        return list;
    }
}
