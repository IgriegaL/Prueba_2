/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl.duoc.pgy2121.juegosolimpicos.juegosolimpicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ClDuocPgy2121JuegosOlimpicosJuegosOlimpicos {


    public static void main(String[] args) {
    List<Atleta> Atletas = new ArrayList<Atleta>();
    
    Futbolista futbolista1 = new Futbolista(15,"Ronaldo donacimiento","Brasil", true, "Oro",false,0);
    Futbolista futbolista2 = new Futbolista(12,"Ivan Zamorano","Chile", true, "Bronce",false,0);
    Futbolista futbolista3 = new Futbolista(11,"Edison Cavani","Uruguay", false, "Ninguna",false,0);
    
    SaltoAlto SaltoAlt1 = new SaltoAlto (220,"Jonathan Kurkic","Finlandia", true,"Oro",true,220);
    SaltoAlto SaltoAlt2 = new SaltoAlto (200,"Juanito Perez","Bolivia", false,"Ninguna",false,0);
    SaltoAlto SaltoAlt3 = new SaltoAlto (210,"jonn chalchichon","USA", true,"Plata",false,0);
    
    Atletas.add(futbolista1);
    Atletas.add(futbolista2);
    Atletas.add(futbolista3);
    Atletas.add(SaltoAlt1);
    Atletas.add(SaltoAlt2);
    Atletas.add(SaltoAlt3);
    Scanner s = new Scanner(System.in);
    var opcion = 0;
        while (opcion != 5) { 
            System.out.println("1.-ver medallas de los paises 2.Ver Record Olimpico 3.- Ver podio");
            opcion = s.nextInt();
            if(opcion == 1){
                for (Atleta Atleta1 : Atletas) {
                    if(Atleta1.getMedalla() == true)
                    System.out.println("El pais " + Atleta1.getPais()+ "  Tiene medalla de " +Atleta1.getTipoMedalla());
                    
                }
                    
                }
            if(opcion == 2){
                for (Atleta Atleta1 : Atletas) {
                    if(Atleta1.isRecordOlimpico() == true)
                    System.out.println("El atleta " + Atleta1.getNombre() + " del pais " + Atleta1.getPais()+ " Obtuvo medalla de " +Atleta1.getTipoMedalla() + " Rompiendo el record de " + Atleta1.getRecordOlimpicoDetalle());
                    
                }
                    
                }
            
                if(opcion == 3){
                for (Atleta Atleta1 : Atletas) {
                    if(Atleta1.getTipoMedalla() == "Oro"){
                    System.out.println("El Primer lugar fue para "+ Atleta1.getPais() +" con su atleta :"+ Atleta1.getNombre()  );
                    }
                    if(Atleta1.getTipoMedalla() == "Plata"){
                    System.out.println("El Segundo lugar fue para "+ Atleta1.getPais() +" con su atleta :"+ Atleta1.getNombre()  );
                    }
                    if(Atleta1.getTipoMedalla() == "Bronce"){
                    System.out.println("El Tercer lugar fue para "+ Atleta1.getPais() +" con su atleta :"+ Atleta1.getNombre()  );
                    }
                }
            }
        }
    
    }
    
