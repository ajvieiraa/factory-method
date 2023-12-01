public class Carro implements Veiculo{
    private String modelo;
    private boolean direcaoHidraulica;

    public Carro(String modelo){
        this.modelo = modelo;
    }


    @Override
    public void exibirInfo(){
        System.out.println("Modelo do Carro: " + modelo  );
    }

    @Override
    public void manutencao(){
        System.out.println("Efetuada troca de pneus e balanceamento");
    }


}
