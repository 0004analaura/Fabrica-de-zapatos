package Fabrica_de_Calzado;

public class FabricaDeZapatosMain {
    public static void main(String[] args) {
        FabricaDeZapatos fabricaHombre = new FabricaDeZapatosHombre();
        FabricaDeZapatos fabricaMujer = new FabricaDeZapatosMujer();
        FabricaDeZapatos fabricaNino = new FabricaDeZapatosNino();


        Zapato zapatoDeportivoHombre = fabricaHombre.crearZapatoDeportivo();
        zapatoDeportivoHombre.crear();
        Zapato zapatoFormalHombre = fabricaHombre.crearZapatoFormal();
        zapatoFormalHombre.crear();


        Zapato zapatoDeportivoMujer = fabricaMujer.crearZapatoDeportivo();
        zapatoDeportivoMujer.crear();
        Zapato zapatoFormalMujer = fabricaMujer.crearZapatoFormal();
        zapatoFormalMujer.crear();


        Zapato zapatoDeportivoNino = fabricaNino.crearZapatoDeportivo();
        zapatoDeportivoNino.crear();
        Zapato zapatoFormalNino = fabricaNino.crearZapatoFormal();
        zapatoFormalNino.crear();
    }
}

