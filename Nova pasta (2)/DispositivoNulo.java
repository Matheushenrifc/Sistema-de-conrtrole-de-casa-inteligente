public class DispositivoNulo extends Dispositivo {  // Classe que representa um dispositivo não disponível
    @Override
    public void ligar() {
        System.out.println("Nenhum dispositivo disponível.");  // Mensagem quando tenta ligar
    }

    @Override
    public void desligar() {
        System.out.println("Nenhum dispositivo disponível.");  // Mensagem quando tenta desligar
    }
}
