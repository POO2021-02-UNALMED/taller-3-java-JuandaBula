package taller3.televisores;

public class TV {
    private static int numTV;

    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (1 <= canal && canal <= 120 && this.estado) {
            this.canal = canal;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (0 <= volumen && volumen <= 7 && this.estado){
            this.volumen = volumen;
        }
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp() {
        this.setCanal(canal + 1);
    }

    public void canalDown() {
        this.setCanal(canal - 1);
    }

    public void volumenUp() {
        this.setVolumen(volumen + 1);
    }

    public void volumenDown() {
        this.setVolumen(volumen - 1);
    }
}
