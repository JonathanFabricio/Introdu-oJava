/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class EquipamentoVisao {
    public static void exibirFormularioCadastroEquipamento(){
        Scanner entrada = new Scanner( System.in);
        System.out.println(" +++++++ CADASTRO EQUIPAMENTO +++++++ ");
        String nome, patrimonio;
        Date dataAquisicao, dataTerminoGarantia;
        float valor;
        
        System.out.println(" Informe as seguintes informações: ");
        System.out.print("Nome: ");
        nome = entrada.nextLine();
        System.out.print("Patrimonio: ");
        patrimonio = entrada.nextLine();
        
        System.out.print("Data Aquisição: ");
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        formatadorData.setLenient(false);
        
        do{
            try{
                dataAquisicao = formatadorData.parse(entrada.nextLine());
                break;
            }catch(Exception e){
                System.out.print(" ---- Data Inválida: ");
            }
        }while(true);
        
        
        System.out.print("Data Termino Garantia: ");
        do{
            try{
                dataTerminoGarantia = formatadorData.parse(entrada.nextLine());
                if(dataTerminoGarantia.after(dataAquisicao)){
                    break;
                }else{
                    System.out.println("Data de termino de garantia deve ser posterior à data de Aquisição.");
                }
            }catch(Exception e){
                System.out.println("---- Data Inválida!  Digite Novamente: ");
            }
        }while(true);
        
        System.out.print("Valor: ");
        do{
            try{
                valor = Float.parseFloat(entrada.nextLine());
            }catch(Exception e){
                System.out.print("---- Valor inválido!  Digite novamente: ");
            }
        }while(true);
    }
}
