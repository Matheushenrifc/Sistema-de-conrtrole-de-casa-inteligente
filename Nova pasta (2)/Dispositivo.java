public abstract class Dispositivo {  // Classe base para todos os dispositivos
    protected ModoOperacao modoOperacao;  // Atributo para armazenar o modo de operação

    public void alterarModo(ModoOperacao novoModo) {
        this.modoOperacao = novoModo;  // Método para alterar o modo de operação
    }

    public void executarModo() {
        if (modoOperacao != null) {
            modoOperacao.executarModo();  // Executa o modo atual
        }
    }

    public abstract void ligar();  // Método abstrato para ligar o dispositivo
    public abstract void desligar();  // Método abstrato para desligar o dispositivo
}
