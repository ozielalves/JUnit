// Author: Oziel Alves

public class Conta{
 … public Conta (String p_id, double p_saldo) {
 this.saldo = p_saldo;
 this.codigo = p_id;
 }
 public int getSaldo() {…}
 public boolean debitar(int valor) {

 if(valor > 0 && saldo >= valor){
 saldo = saldo-valor;
 return true;
 }else{
 return false;
 }
 } 

// Primeiro Teste
public class TesteConta{
    public void testDebitar() {
        Conta C = new Conta (“25257”, 500);
        if( C.debitar(200)){
            if( C.getSaldo(300.0) == 300 ){
                System.out.println(“pass”);
            }else {
                System.out.println(“error”);
            }
        }else {
            System.out.println(“error”);
        }
    }

    public void testDebitar2() {
        Conta C = new Conta (“10”, 0);
        if( C.debitar(100)){
            if( C.getSaldo(0.0) == 0 ){
                System.out.println(“pass”);
            }else {
                System.out.println(“error”);
            }
        }else {
            System.out.println(“error”);
        }
    }

    public void testDebitar3() {
        Conta C = new Conta (“1212”, 100);
        if( C.debitar(100)){
            if( C.getSaldo(0.0) == 0 ){
                System.out.println(“pass”);
            }else {
                System.out.println(“error”);
            }
        }else {
            System.out.println(“error”);
        }
    }

    public void testDebita4() {
        Conta C = new Conta (“9999”, 9090);
        if( C.debitar(90)){
            if( C.getSaldo(9000.0) == 9000 ){
                System.out.println(“pass”);
            }else {
                System.out.println(“error”);
            }
        }else {
            System.out.println(“error”);
        }
    }

    public static void main (String args[]){
        TesteConta TC = new TesteConta ();
        TC.testDebitar();
        TC.testDebitar2();
        TC.testDebitar3();
        TC.testDebitar4();
 }
}
