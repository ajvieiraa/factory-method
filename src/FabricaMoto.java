public class FabricaMoto implements FabricaVeiculo{
    @Override
    public Veiculo criarVeiculo(String tipo) {
        return new Moto(tipo);
    }
}
