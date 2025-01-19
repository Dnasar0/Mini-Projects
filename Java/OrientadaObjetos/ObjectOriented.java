public class ObjectOriented {
// Usar classes como objetos

    public static void main(String[] args) {
        /*Pen p = new Pen();                          // cria a caneta da classe Pen

        System.out.println(p.color);                // retorna a cor da caneta 
        System.out.println(p.point);                // retorna ...
        System.out.println(p.type);                 // retorna ...

        System.out.println(p.clicked);              // retorna se a caneta está clicada

        p.click();                                  // clica a caneta

        System.out.println(p.clicked);              // retorna se a caneta já está clicada*/

        
        Circle circle1 = new Circle();
        circle1.setColor("green");
        circle1.setRadius(2.0);
        System.out.println(circle1.toString());                     
    }
}