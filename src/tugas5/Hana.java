package tugas5;

class Hana extends Flower 
{
    String Famili ;
   Hana ( String n, String o, String k, String f ) {
    super(n,o,k);
           Famili = f;
}
    
String getDetails() 
{
    return  super.getDetails() + "\nFamili : " + Famili;}
}

class SuperFlower {
public static void main ( String args[] ) {   
    System.out.println("Tugas Modul 5 Kelompok 33");
    System.out.println("Program Klasifikasi Bunga");
    System.out.println("Erika Simanjuntak");
    System.out.println("21120117130063");
           
          Hana a1 = new Hana("Anggrek", "Asparagales", "Liliopsida", "Orchidaceae");
          System.out.println(a1.getDetails());

          Hana a2 = new Hana ("Lily", "Liliales", "Liliopsida", "Liliaceae");
          System.out.println(a2.getDetails());

          Hana a3 = new Hana ("Mawar", "Rosales", "Magnoliopsida", "Rosaceae");
          System.out.println(a3.getDetails());
          }
}

