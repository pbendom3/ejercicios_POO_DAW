package festival;

public enum TipoEntrada {

    GENERAL(20),PISTA(30),VIP(150);

    private double precio;

    TipoEntrada(double precio){
        this.precio=precio;
    }

    public double getPrecio() {
        return precio;
    }

}
