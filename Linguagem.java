public class Linguagem{

    protected String nome;
    protected double numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;

    public Linguagem(String nome, double numFalantes, String regioesFaladas, String ordemDasPalavras){
        this.nome = nome;
        this.numFalantes = numFalantes;
        this.regioesFaladas = regioesFaladas;
        this.ordemDasPalavras = ordemDasPalavras;
    }

    public void getInfo(){
        System.out.println(nome + " é falado por " + numFalantes + " pessoas principalmente em " + regioesFaladas);
        System.out.println("A linguagem segue a ordem das palavras: " + ordemDasPalavras);
    }

    public static void main(String[]args){
        Linguagem espanhol = new Linguagem("Espanhol", 538000000, "países da America do Sul", "Sujeito + Verbos + Complementos");
        espanhol.getInfo();
        Linguagem maia = new Mayan("Maia", 800000);
        Linguagem quiche = new Mayan("quiché", 1000000);
        Linguagem mandarim = new SinoTibetan("Chinês",  918.000000);
        Linguagem birmanes = new SinoTibetan("Birmanês", 32.000000);
        maia.getInfo();
        quiche.getInfo();
        mandarim.getInfo();
        birmanes.getInfo();
    }
}