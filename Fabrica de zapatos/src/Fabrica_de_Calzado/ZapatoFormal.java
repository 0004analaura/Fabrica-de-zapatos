package Fabrica_de_Calzado;

class ZapatoFormal extends Zapato {
    public ZapatoFormal(String materialSuela, String tipoTejido, String diseño) {
        this.materialSuela = materialSuela;
        this.tipoTejido = tipoTejido;
        this.diseño = diseño;
    }

    @Override
    public void crear() {
        System.out.println("Creando zapato formal con suela: " + materialSuela + ", tejido: " + tipoTejido + ", diseño: " + diseño);
    }
}

