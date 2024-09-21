package Fabrica_de_Calzado;

class FabricaDeZapatosNino implements FabricaDeZapatos {
    @Override
    public Zapato crearZapatoDeportivo() {
        return new ZapatoDeportivo("cuero", "polyester", "Deportivo Niño");
    }

    @Override
    public Zapato crearZapatoFormal() {
        return new ZapatoFormal("goma", "Sintético", "Formal Niño");
    }
}

