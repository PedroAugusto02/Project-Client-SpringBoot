package pedro.clients;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import pedro.clients.model.repository.ClientRepository;
import pedro.clients.model.entity.Client;

@SpringBootApplication
public class ClientsApplication {

	@Bean
	public CommandLineRunner run(@Autowired ClientRepository repository) {
    return args -> {
        LocalDate dataCadastro = LocalDate.now(); // Obtém a data atual
        Client client = Client.builder().cpf("000000").nome("Pedro").dataCadastro(dataCadastro).build();
        repository.save(client);
    };
}


	public static void main(String[] args) {
		SpringApplication.run(ClientsApplication.class, args);
	}

}
