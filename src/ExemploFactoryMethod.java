public class ExemploFactoryMethod {
    public static void main(String[] args) {

        FabricaVeiculo carro = new FabricaCarro();
        Veiculo carroSedan = carro.criarVeiculo("Sedan");

        carroSedan.exibirInfo();
        carroSedan.manutencao();
        System.out.println();

        FabricaVeiculo moto = new FabricaMoto();
        Veiculo motoEsport = moto.criarVeiculo("Esportiva");

        motoEsport.exibirInfo();
        motoEsport.manutencao();

    }
}
