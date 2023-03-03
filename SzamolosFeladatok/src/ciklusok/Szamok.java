package ciklusok;

import java.util.Scanner;

public class Szamok {
    private static Scanner be = new Scanner(System.in);
    
    public static void main(String[] args) {
        feladatok();
    }
    private static void feladatok(){
        feladat1();
        feladat2();
    }
    private static void feladat1(){
        int db=0;
        boolean ismetel=true;
        for(int ix=2;ix<=4;ix++)
            for(int jx=2;jx<=4;jx++)
                for(int kx=2;kx<=4;kx++)
                    if(ismetel){
                        System.out.printf("%d%d%d\r\n",ix,jx,kx);
                        db++;
                    }
                    else if(ix!=jx && ix!=kx && jx!=kx){
                        System.out.printf("%d%d%d\r\n",ix,jx,kx);
                        db++;
                    }
        System.out.println("db: "+db);
    }
    
    private static void feladat2(){
        for(int ix=1;ix<145/7;ix++)
            for(int jx=1;jx<145/11;jx++)
                if(7*ix+11*jx==145)
                    System.out.printf("x: %d y: %d\r\n", ix, jx);
    }
}
