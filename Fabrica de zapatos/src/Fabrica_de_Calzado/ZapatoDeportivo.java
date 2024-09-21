package Fabrica_de_Calzado;

class ZapatoDeportivo extends Zapato {
    public ZapatoDeportivo(String materialSuela, String tipoTejido, String diseño) {
        this.materialSuela = materialSuela;
        this.tipoTejido = tipoTejido;
        this.diseño = diseño;
    }

    @Override
    public void crear() {
        System.out.println("Creando zapato deportivo con suela: " + materialSuela + ", tejido: " + tipoTejido + ", diseño: " + diseño);
    }
}

