package Fabrica_de_Calzado;

class FabricaDeZapatosHombre implements FabricaDeZapatos {
    @Override
    public Zapato crearZapatoDeportivo() {
        return new ZapatoDeportivo("Cuero", "Rayon", "Deportivo Hombre");
    }

    @Override
    public Zapato crearZapatoFormal() {
        return new ZapatoFormal("EVA", "poliester", "Formal Hombre");
    }
}
