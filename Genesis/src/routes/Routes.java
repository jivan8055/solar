package routes;

import java.util.Scanner;

public class Routes {
	public void routeLines() {
		String [] wstation = {"Marine Line","Grant Road","Mumbai Central","PraphaDevi","Dadar Western","Bandra","Anderi","Ram Mandir","Borivali","Mira Road","Naigaon","Vasai Road","Virar"};
		int [] wKilometer = {5,8,10,14,17,21,25,27,31,34,37,38,40};
		String [] estation = {"Masjid","Dockyard Road","Cotton Road","vadala","Kurla","Chembur","Vashi","Panvel"};
		int [] eKilometer = {3,5,8,10,15,17,19,21};
		String [] cstation = {"Byculla","Dadar Western","Ghatkopar","Thane","Dombivli","Ambernath"};
		int [] cKilometer = {9,14,16,19,21,27};
		System.out.println("*** WELCOME TO MUMBAI LOCALS ***"+"\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Please Choose your Route..."+"\n"+"1) Western Line"+"\n"+"2) East Line"+"\n"+"3) Central Line");
		Scanner scan= new Scanner (System.in);
		int lineOption=scan.nextInt();
		String [] choosedLine=null;
		int [] kilometer=null;
		switch(lineOption){
		case 1:choosedLine= wstation; kilometer=wKilometer; break;
		case 2:choosedLine= estation; kilometer=eKilometer; break;
		case 3:choosedLine= cstation; kilometer=cKilometer; break;
		default:System.out.println("------------INVALID ENTRY--------------");
		}
		System.out.println("Please Choose your Station...");
		int n=1;
		int k=5;
		for(int i=0;i<choosedLine.length;i++){
			System.out.println(n+") "+choosedLine[i]);
			n++;
		}
		int stationOption=scan.nextInt();
		if(stationOption>0 && stationOption<=(choosedLine.length)) {
			System.out.println(choosedLine[stationOption-=1]+" Station Selected..");
			if((kilometer[(stationOption-=1)])>0){	
				if((kilometer[(stationOption-=1)])>5){
					if((kilometer[(stationOption-=1)])>15){
						if((kilometer[(stationOption-=1)])>25){
							if((kilometer[(stationOption-=1)])>35){
								k=60;
							}else { k=55;
							}
						}else {
							k=40;
						}
					}else {
						k=35;
					}
				}else {
					k=25;
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("TOTAL FARE = "+k+" RS.");
			System.out.println("\n"+"*** HAPPY JOURNEY ***");
		}else {
			System.out.println("INVALID INPUT");
		}
		scan.close();
	}
}
