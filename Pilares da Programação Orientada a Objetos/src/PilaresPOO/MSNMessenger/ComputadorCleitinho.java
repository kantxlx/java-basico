package PilaresPOO.MSNMessenger;

import PilaresPOO.MSNMessenger.apps.FacebookMessenger;
import PilaresPOO.MSNMessenger.apps.MSNMessenger;
import PilaresPOO.MSNMessenger.apps.ServicoMensagemInstantanea;
import PilaresPOO.MSNMessenger.apps.Telegram;

//Simulação do uso da classe MSNMessenger
public class ComputadorCleitinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        /* não se saber qual app, mas qualquer um devera enviar e receber mensagem */

        String appEscolhido="tlg";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fcb"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
