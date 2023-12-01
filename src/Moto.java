public class Moto implements  Veiculo{

    private String tipo;
    private int cc;

    public Moto(String tipo){
        this.tipo = tipo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Tipo da Moto: " + tipo );
    }

    @Override
    public void manutencao() {
        System.out.println("Troca de óleo do motor e aperto da corrente" );
    }
}
