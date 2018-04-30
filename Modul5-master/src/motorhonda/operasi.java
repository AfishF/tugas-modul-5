/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorhonda;

/**
 *
 * @author jhon
 */
public class operasi {
    public int mtr,byr,p,jml,hasil;
    
    public int kembalian(){
        int kembali;
        kembali=byr-(p*jml);
        hasil=kembali;
        return kembali;}
    public void tx(){
        System.out.print("\t\t\t\t\t\t\t\t|Terimakasih telah membeli motor ");}
    public void k(String nama,int jumlah){
        System.out.println("\t\t\t\t\t\t-Maaf, uang anda tidak cukup untuk membeli motor  "+nama+" sejumlah "+jumlah+" buah-");}
}
