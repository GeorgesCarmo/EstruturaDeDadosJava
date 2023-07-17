package VetorString;

import java.util.Scanner;


public class VetorString {
    
    public static void main(String[] args) {
        
        String[] estados = new String[10];
        
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";
        
        for(int i = 0; i < estados.length; i++){
            System.out.println("Estado " + i + ": " + estados[i]);
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual sigla de estado deseja buscar: ");
        String buscaSigla = scan.nextLine();
        
        //busca linear
        
        boolean encontrou = false;
        for(int i = 0; i < estados.length; i++){
            String elemento = estados[i];// elemento vai andar junto com i
            if(elemento.equalsIgnoreCase(buscaSigla)){
                encontrou = true;
                break;
            }
        }
        if(encontrou == true){
              System.out.println("Achooooou!");
        }else{
              System.out.println("Nao Achou!");
        }
    }
    
    
}
