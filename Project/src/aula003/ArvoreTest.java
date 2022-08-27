package aula003;
public class ArvoreTest 
{
    
    public static void main(String[] args)
    {
        NodeBinary<String> x = new NodeBinary<String>("1º pai");
        NodeBinary<String> y = new NodeBinary<String>("2º pai");

        System.out.println(x.getRaiz());

        NodeBinary<String> filho1 =  x.addFilho("1º Primeiro filho. ");
        {

            NodeBinary<String> primeiroFilhoOculto = filho1.addFilho("1º filho oculto do 1º filho.");
            NodeBinary<String> segundoFilhoOculto = filho1.addFilho("2º filho oculto do 1º filho.");
        

            // Mostrando...

            System.out.println("--" + filho1);

            System.out.println("--" + primeiroFilhoOculto);
            System.out.println("--" + segundoFilhoOculto);
        

            System.out.println("Nível do 1º filho: " + filho1.getNivel());
            System.out.println("Nível do 2º filho oculto do 1º filho: " + segundoFilhoOculto.getNivel());

        }

        System.out.println();

        System.out.println("Mostra raiz: " + x.getRaiz());

        NodeBinary<String> filho2 = x.addFilho("2º Filho");
        {
            NodeBinary<String> primeiroFilhoOculto2 = filho2.addFilho("1º filho oculto do 2º filho");
            NodeBinary<String> segundoFilhoOculto2 = filho2.addFilho("2º filho oculto do 2º filho");
            NodeBinary<String> terceiroFilhoOculto2 = filho2.addFilho("3º filho oculto do 2º filho");
            {
                NodeBinary<String> quartoFilhoOculto2 = terceiroFilhoOculto2.addFilho("4º filho oculto do 2º filho");
                System.out.println(quartoFilhoOculto2.getNivel()); // pega nivel do 4º filho oculto
                System.out.println("\nO 3º filho oculto é folha? " + terceiroFilhoOculto2.ehFolha());
            
            }
            System.out.println("-" + filho2);

            System.out.println("--" + primeiroFilhoOculto2);
            System.out.println("--" + segundoFilhoOculto2);
            System.out.println("--" + terceiroFilhoOculto2);

            System.out.println("Nível do 2º filho: " + filho2.getNivel());
            System.out.println("Nível do 2º filho oculto: " + segundoFilhoOculto2.getNivel());
    
        }
    }
    
}
