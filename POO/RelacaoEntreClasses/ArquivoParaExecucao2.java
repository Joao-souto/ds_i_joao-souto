package POO.RelacaoEntreClasses;

public class ArquivoParaExecucao2 {
    public static void main(String[] args) {
        // Criando um array de Lutadores com tamanho 5
        Lutador lutadores[] = new Lutador[5];

        // Inicializando os lutadores
        lutadores[0] = new Lutador("João Pedro", "Brasileiro", 17, 1.68f, 64.3f, 100, 50, 9);
        lutadores[1] = new Lutador("Maria Silva", "Portuguesa", 18, 1.70f, 60.0f, 95, 45, 8);
        lutadores[2] = new Lutador("Carlos Souza", "Mexicano", 20, 1.75f, 70.5f, 105, 55, 7);
        lutadores[3] = new Lutador("Ana Costa", "Espanhola", 19, 1.65f, 55.8f, 98, 48, 10);
        lutadores[4] = new Lutador("Pedro Oliveira", "Argentino", 21, 1.80f, 75.2f, 110, 60, 6);

        for (int i = 0; i < lutadores.length; i++) {
            lutadores[i].setId(i);
        }


        lutadores[1].apresentar();
        lutadores[2].apresentar();
        lutadores[3].apresentar();
        lutadores[4].apresentar();
    }
}