package br.com.alura.beatBlissMusic.principal;

import br.com.alura.beatBlissMusic.modelos.Favoritas;
import br.com.alura.beatBlissMusic.modelos.Musica;
import br.com.alura.beatBlissMusic.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        //instanciando uma música
        Musica deusPerdoa = new Musica();
        deusPerdoa.setTitulo("Deus Perdoa");
        deusPerdoa.setCantor("Filipe ret");
        deusPerdoa.setGenero("Rap");
        for (int i = 0; i < 50000; i++) {
            deusPerdoa.reproduz();
        }

        for (int i = 0; i < 80000; i++) {
            deusPerdoa.curte();
        }

        //preparando dados da música para apresentação
        String exibirMusica = String.format("""
                Dados da música escolhida abaixo:
                Música: %s | Cantor: %s | Gênero: %s | curtidas: %d | Reproduções: %d
                =============
                """, deusPerdoa.getTitulo(), deusPerdoa.getCantor(), deusPerdoa.getGenero(), deusPerdoa.getTotalCurtidas(), deusPerdoa.getTotalReproducoes());

        //instanciando um podcast
        Podcast osSocios = new Podcast();
        osSocios.setTitulo("Os sócios");
        osSocios.setApresentador("Bruno e Malu Perini");
        osSocios.setDescricao("Podcast sobre investimentos e finanças");
        for (int i = 0; i < 100; i++) {
            osSocios.reproduz();
        }

        for (int i = 0; i < 8000; i++) {
            osSocios.curte();
        }

        //preparando os dados do podcast para apresentação
        String exibirPodcast = String.format("""
                Dados do podcast escolhida abaixo:
                Podcast: %s | Apresentador(s): %s | Descrição: %s | curtidas: %d | Reproduções: %d
                =============
                """, osSocios.getTitulo(), osSocios.getApresentador(), osSocios.getDescricao(), osSocios.getTotalCurtidas(), osSocios.getTotalReproducoes());

        //exibindo podcast e música
        System.out.println(exibirMusica);
        System.out.println(exibirPodcast);

        Favoritas favoritas = new Favoritas();
        favoritas.incluir(osSocios);
        favoritas.incluir(deusPerdoa);

    }
}
