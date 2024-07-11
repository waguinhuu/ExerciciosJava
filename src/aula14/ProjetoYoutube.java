package aula14;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video("POO");
        v[1] = new Video("Java");

       // System.out.println(v[0].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Wagner", 19, 'M', "Login");
        g[1] = new Gafanhoto("Julia",16, 'F', "Login");
       // System.out.println(g[0].toString());

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]); // Wagner assisti POO
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);// Wagner assisti Java
        vis[0].avaliar(85.0f);
        v[1].like();
        v[1].play();
        System.out.println(vis[1].toString());
    }
}
