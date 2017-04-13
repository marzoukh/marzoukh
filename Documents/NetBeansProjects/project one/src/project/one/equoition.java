package project.one;

import java.util.Scanner;
public class ProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        double a,b,c,d;
        System.out.println("resoulition des equoitions de 2eme degre ax^2+bx+cx=0");
        System.out.println("entrez le 1er parametre");
        a=sc.nextDouble();
        System.out.println("entrez le 2er parametre");
        b=sc.nextDouble();
        System.out.println("entrez la 3er nombre");
        c=sc.nextDouble();
        d=b*b-4*a*c;
        if(d<0)
        {
            System.out.print("aucune solution dans R");
        }
        if(d==0)
        {
            System.out.println("l'inque solution est -b/(2*a)");
        }
        if(d>0)
        System.out.println("deux solution x1=");
        System.out.println(((-b-math.sqrt(d))/(2*a)));
        System.out.println(((-b+math.sqrt(d))/(2*a)));
        
        }
        
    }