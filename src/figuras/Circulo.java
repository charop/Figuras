package figuras;

/**
 * Una clase para representar círculos situados sobre el plano.
 * Cada círculo queda determinado por su radio junto con las 
 * coordenadas de su  centro.
 * @version 1.2, 24/12/04
 * @author Rafa Caballero
 */

public class Circulo {
    /**
	 * @uml.property  name="x"
	 */
    protected double x; // coordenadas del centro
	/**
	 * @uml.property  name="y"
	 */
	protected double y;
    /**
	 * @uml.property  name="r"
	 */
    protected double r;  // radio del c�rculo
    
    /** 
     * Crea un círculo a partir de su origen su radio.
     * @param x La coordenada x del centro del c�rculo.
     * @param y La coordenada y del centro del c�rculo.
     * @param r El radio del círculo. Debe ser mayor o igual a 0.
     */
    public Circulo(double x, double y, double r) {
        this.x=x; this.y = y; this.r = r;
    }   
    
    /** 
     * Cílculo del área de este círculo.
     * @return El área (mayor o igual que 0) del círculo.
     */
     public double area() {
        return Math.PI*r*r;
     }
     
     /** 
      * Indica si un punto esté dentro del círculo.
      * @param px componente x del punto
      * @param py componente y del punto
      * @return true si el punto está dentro del círculo o false en otro caso.
      */
     public boolean contiene(double px, double py) {
        /* Calculamos la distancia de (px,py) al centro del c�rculo (x,y),
           que se obtiene como raíz cuadrada de (px-x)^2+(py-y)^2 */
        double d = Math.sqrt((px-x)*(px-x)+(py-y)*(py-y));
        
        // el círculo contiene el punto si d es menor o igual al radio
        return  d <= r;
     }
}
