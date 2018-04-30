/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorhonda;

import java.util.Scanner;

/**
 *
 * @author jhon
 */
public final class isi {
    int mtr,byr,kmb,p,jml,i,j;
    operasi x;
    
    public isi(){
    x = new operasi();
    menu();
    input();
    }
    public void input(){
    Scanner h = new Scanner(System.in);
    System.out.println("masukan nomor pilihan Produk Motor Honda : ");
    mtr = h.nextInt();
    x.mtr=this.mtr;
    System.out.println("masukan jumlah Produk Motor Honda yang ingin anda beli : ");
    jml = h.nextInt();
    x.jml=this.jml;
    System.out.println("masukan nilai uang pembayaran : ");
    byr = h.nextInt();  
    x.byr=this.byr;
    }
    public void menu(){
    String [][] smart ={
            
            {"No","Tipe Motor","Harga(Rp)"},
            {"1.","Supra\t","12,500,000"}, 
            {"2.","Vario\t","16,000,000"}, 
            {"3.","Vario 150","19,500,000"},   
            {"4.","CB150R\t","22,450,000"},        
            {"5.","CBR150RR","30,850,000"}, 
            {"6.","CBR250RR","56,950,000"},
            {"7.","CBR1000RR","139,900,000"},
            {"8.","CRF150L\t","24,750,000"}
        };
    System.out.println("\n=========================================================");    
    for ( i=0;i<9; i++){
            for ( j=0;j<3; j++){
                System.out.print(smart[i][j]+"\t|\t");  
            }
        System.out.println("\n---------------------------------------------------------");         //pindah baris
        }
}
    public void olah(){
        String [][] smart ={
            
            {"No","Tipe Motor","Harga(Rp)"},
            {"1.","Supra\t","12,500,000"}, 
            {"2.","Vario\t","16,000,000"}, 
            {"3.","Vario 150","19,500,000"},   
            {"4.","CB150R\t","22,450,000"},        
            {"5.","CBR150RR","30,850,000"}, 
            {"6.","CBR250RR","56,950,000"},
            {"7.","CBR1000RR","139,900,000"},
            {"8.","CRF150L\t","24,750,000"}
        };
    switch (mtr) {
                case 1:
                    p =12500000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[1][1]+" Sejumlah "+jml+" buah\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        
                    }
                    else{x.k(smart[1][1],jml);}
                    break;
                case 2:
                    p =16000000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[2][1]+" Sejumlah "+jml+" buah\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                    }
                    else {x.k(smart[2][1],jml);}
                    break;
                case 3:
                    p =19500000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[3][1]+" Sejumlah "+jml+" buah|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                    }
                    else {x.k(smart[3][1],jml);}
                    break;
                case 4:
                    p =22450000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[4][1]+" Sejumlah "+jml+" buah\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                    }
                    else {x.k(smart[4][1],jml);}
                    break;
                case 5:
                    p =30850000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[5][1]+" Sejumlah "+jml+" buah\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                    }
                    else {x.k(smart[5][1],jml);}
                    break;
                case 6:
                    p =56950000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[6][1]+" Sejumlah "+jml+" buah\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                    }
                    else {x.k(smart[6][1],jml);}
                    break;
                case 7:
                    p =139900000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[7][1]+" Sejumlah "+jml+" buah\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                    }
                    else {x.k(smart[7][1],jml);}
                    break;
                case 8:
                    p =24750000;
                    x.p=this.p;
                    kmb=x.kembalian();
                    if (kmb>=0){
                        System.out.println("\t\t\t\t\t\t\t\t _______________________________________________________________");
                        x.tx();
                        System.out.println(smart[8][1]+" Sejumlah "+jml+" buah\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                        System.out.println("\t\t\t\t\t\t\t\t|Uang kembalian anda "+kmb+" rupiah\t\t\t\t|");
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------------------------------");
                    }
                    else {x.k(smart[8][1],jml);}
                    break;
                default:
                    System.out.println("masukan salah");
                    break;
            }
}
    
    
    }
