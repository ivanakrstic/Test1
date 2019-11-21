package zadaci;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		//Traziti od korisnika da unese pozitivan broj N. 
				//Zatim ucitavati N brojeva sa standardnog ulaza i ispisati vrednost najmanjeg unetog broja.
				
				Scanner sc=new Scanner(System.in);
				int n;
				System.out.println("Unesi broj koliko brojeva hoces da poredis");
				n=sc.nextInt();
				
				if (n>1)
					System.out.println("Unesi broj" );
				int br=sc.nextInt();
				int min=br;
				
				for (int i=1; i<n; i++) {
					System.out.println("Unesi broj " );
				br=sc.nextInt();
				
				if (br<min)
					min=br;
				}
				//System.out.println(min);
				if (n==1)
					System.out.println("Ne poredim ni sa cim, jedan broj je u pitanju");
				if(n<1)
					System.out.println("Greska");
				
				System.out.println("Vrednost najmanjeg unetog broja iznosi " + min);
			}

		}


	


