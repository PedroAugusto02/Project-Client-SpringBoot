package pedro.clients.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter@Setter
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Incremento cargo do Banco
    private Integer id;
    
    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, length = 15)
    private String cpf;

    @Column
    private LocalDate dataCadastro;
    
}
