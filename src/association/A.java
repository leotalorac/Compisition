/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

/**
 *
 * @author Estudiante
 */
public class A {
    private int a1;
    private B[] bs;
    private int n =6;
    
   
   
    public A(){
       this.bs = new B[6];
        bs[0] = new B("Calculo");
        bs[1] = new B("Fisica");
        bs[2] = new B("Lineal");
        bs[3] = new B("biologia");
        bs[4] = new B("POO");
        bs[5] = new B("Dibujo");
    }
    
    public A(int a,B[] l){
        a1 = a;
        if(l.length <6){
            this.bs = l;
        }
    }
    
    
    public void get(){
        for(int i=0;i<n;i++){
            System.out.println(this.bs[i].get());
        }
    }

    public int getN() {
        return this.n;
    }  
    

    public void addb(B b){
           if(n<6){
               this.bs[n] = b;
               n++;
           }
    } 
}
