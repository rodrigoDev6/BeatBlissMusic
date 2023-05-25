package br.com.alura.beatBlissMusic.modelos;

public class Favoritas {

    public void incluir(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é um dos favoritos dos ouvintes no momento.");
        } else {
            System.out.println(audio.getTitulo() + " os ouvintes estão gostando.");
        }
    }
}
