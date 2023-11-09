package pedro.clients.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Incremento cargo do Banco
    private Integer id;
    
    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, length = 15)
    private String cpf;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;
    
}
