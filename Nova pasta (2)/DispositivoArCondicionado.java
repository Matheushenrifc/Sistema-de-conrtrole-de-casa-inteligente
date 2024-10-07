public class DispositivoArCondicionado extends Dispositivo {  // Classe que representa um ar condicionado
    public DispositivoArCondicionado() {
        this.modoOperacao = new ModoNormal();  // Inicializa com o modo normal
    }

    @Override
    public void ligar() {
        System.out.println("Ar Condicionado ligado.");  // Mensagem ao ligar
    }

    @Override
    public void desligar() {
        System.out.println("Ar Condicionado desligado.");  // Mensagem ao desligar
    }

    public void ajustarTemperatura(int temperatura) {
        System.out.println("Temperatura ajustada para: " + temperatura + " graus.");  // Ajusta a temperatura
    }
}