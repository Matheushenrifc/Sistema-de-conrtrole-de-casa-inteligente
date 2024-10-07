// Estratégias Concretas
public class ModoNormal implements ModoOperacao {  // Classe que representa o modo normal
    @Override
    public void executarModo() {
        System.out.println("Executando em Modo Normal.");
    }
}