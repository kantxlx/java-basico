package teste.springbot.BancoDigital;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;
}
