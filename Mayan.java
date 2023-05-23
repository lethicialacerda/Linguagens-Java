public class Mayan extends Linguagem{

    public Mayan(String nome, double numFalantes) {
        super(nome, numFalantes, " países da America Central", "Verbo + Objeto + Sujeito");
        
    }

        @Override
        public void getInfo (){
        System.out.println(nome + " é falado por " + numFalantes + " pessoas principalmente em " + regioesFaladas);
        System.out.println("A linguagem segue a ordem das palavras: " + ordemDasPalavras + "Fato interessante: " + nome + " é uma língua ergativa.");
        }
    

    
}
