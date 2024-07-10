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

public class Transacao {
    private String tipo;
    private double valor;
}
