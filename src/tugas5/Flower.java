/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

class Flower extends Tugas5 {
     String name;
     String ordo;
     String kelas;
    
Flower ( String n, String o, String k ) {
          name = n;
          ordo = o;
          kelas = k;
}
String getDetails() {
         return "\nNama Bunga : " + name + "\nKingdom : " + super.Kingdom 
         + "\nDivisi : " + super.Divisi + "\nKelas : " + kelas + "\nOrdo : " + ordo;
}
}
    
