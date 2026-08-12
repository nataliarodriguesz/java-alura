public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int numAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("AnoLancamento: " + anoLancamento);
        System.out.println("Média Avaliacoes: " + mediaAvaliacao());
    }

    void avaliarMusica(double nota){
        somaAvaliacoes += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacao(){
        double media = somaAvaliacoes /numAvaliacoes;
        return media;
    }
}
