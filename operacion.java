public class operacion {
    
    public double resultado, resultadoSubtotal, resultadoIva, total;
    
    public void calcularSuma1 (double cant1, double valor1) {
        resultado = valor1 * cant1;
    }
    
    public void calcularSuma2 (double cant2, double valor2) {
        resultado = valor2 * cant2;
    }
    
    public void calcularSuma3 (double cant3, double valor3) {
        resultado = valor3 * cant3;
    }
    
    public void calcularSuma4 (double cant4, double valor4) {
        resultado = valor4 * cant4;
    }
    
    public void calcularSubtotal (double calcularSub1, double calcularSub2, double calcularSub3, double calcularSub4) {
        resultadoSubtotal = calcularSub1 + calcularSub2 + calcularSub3 + calcularSub4;
    }
    
    public void calcularIva1 (double cant1, double valor1) {
        resultado = ((valor1 / 100) * 19 ) * cant1;
    }
    
    public void calcularIva2 (double cant2, double valor2) {
        resultado = ((valor2 / 100) * 19 ) * cant2;
    }
    
    public void calcularIva3 (double cant3, double valor3) {
        resultado = ((valor3 / 100) * 19 ) * cant3;
    }
    
    public void calcularIva4 (double cant4, double valor4) {
        resultado = ((valor4 / 100) * 19 ) * cant4;
    }
    
    public void calcularIvaTotal (double calcularIva1, double calcularIva2, double calcularIva3, double calcularIva4) {
        resultadoIva = calcularIva1 + calcularIva2 + calcularIva3 + calcularIva4;
    }
    
    public void calcularTotal (double resultadoIva, double calcularSubtotal) {
        total = resultadoIva + calcularSubtotal;
    }
}
