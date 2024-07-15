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

public class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;
}