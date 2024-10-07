import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Criando a casa inteligente
        SmartHome casaInteligente = new SmartHome();

        // Adicionando um ar condicionado
        Dispositivo arCondicionado = new DispositivoArCondicionado();
        casaInteligente.adicionarDispositivo("Ar Condicionado", arCondicionado);

        // Controlando o ar condicionado
        Dispositivo dispositivo = casaInteligente.obterDispositivo("Ar Condicionado");
        dispositivo.ligar();  // "Ar Condicionado ligado."
        dispositivo.executarModo();  // "Executando em Modo Normal."

        // Alterando para modo economia
        dispositivo.alterarModo(new ModoEconomia());
        dispositivo.executarModo();  // "Executando em Modo Economia de Energia."

        // Desligando o ar condicionado
        dispositivo.desligar();  // "Ar Condicionado desligado."

        // Tentando acessar um dispositivo não disponível
        Dispositivo dispositivoInexistente = casaInteligente.obterDispositivo("Lâmpada Inexistente");
        dispositivoInexistente.ligar();  // "Nenhum dispositivo disponível."
    }
}

// Classe para gerenciar a casa inteligente
class SmartHome {
    private final Map<String, Dispositivo> dispositivos = new HashMap<>();

    public void adicionarDispositivo(String nome, Dispositivo dispositivo) {
        dispositivos.put(nome, dispositivo);  // Adiciona um dispositivo ao mapa
    }

    public Dispositivo obterDispositivo(String nome) {
        return dispositivos.getOrDefault(nome, new DispositivoNulo());  // Retorna o dispositivo ou um dispositivo nulo
    }
}
