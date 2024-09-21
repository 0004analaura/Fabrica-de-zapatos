package Fabrica_de_Calzado;

class FabricaDeZapatosMujer implements FabricaDeZapatos {
    @Override
    public Zapato crearZapatoDeportivo() {
        return new ZapatoDeportivo("algodon", "licra", "Deportivo Mujer");
    }

    @Override
    public Zapato crearZapatoFormal() {
        return new ZapatoFormal("cuerina", "lona", "Formal Mujer");
    }
}

