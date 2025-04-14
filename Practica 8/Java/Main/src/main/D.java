
package main;

public class D extends A {
    private B b;

    public D(int x, int y, int z) {
        super(x, z); 
        this.b = new B(y, z); 
 
    }
    public void incrementaXYZ() {
        
        
        b.incrementaYZ();
        incrementaXZ(); 
    }
    public void mostrarValores() {
        System.out.println("Valor de x: " + super.getX());
        System.out.println("Valor de y: " + b.getY()); 
        System.out.println("Valor de z: " + super.getZ());
    }
}
