/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto30082024;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Proyecto30082024 {

    public static void main(String[] args) {
        String segundosString="";
        String minutosString="";
        String horaString="";
        Scanner lectura = new Scanner (System.in);        
        System.out.println("Ingrese la hora 0-23: ");
        int hora = lectura.nextInt();
        System.out.println("Ingrese los minutos 0-59: ");
        int minutos = lectura.nextInt();
        System.out.println("Ingrese los segundos 0-59: ");
        int segundos = lectura.nextInt();
        segundosString=segundos+"";
        minutosString=minutos+"";
        horaString=hora+"";
        System.out.println(horaString+":"+minutosString+":"+segundosString);
        segundos=segundos+1;
        if(segundos>59 ){
            minutos=minutos+1;
            segundos=0;
        }
        if(minutos>59 ){
            hora=hora+1;
            minutos=0;
        
        }
        if(hora>23) {
        hora=0;
       
        }
        segundosString=segundos+"";
        minutosString=minutos+"";
        horaString=hora+"";
        if(segundosString.length()==1){
        segundosString="0"+segundosString;
        }
        if(minutosString.length()==1){
        minutosString="0"+minutosString;
        }
        if(horaString.length()==1){
        horaString="0"+horaString;
        }
        System.out.println(horaString+":"+minutosString+":"+segundosString);
    }
}
