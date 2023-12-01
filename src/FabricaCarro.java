public class FabricaCarro implements FabricaVeiculo{

    @Override
    public Veiculo criarVeiculo(String modelo) {
        return new Carro(modelo);
    }
}
