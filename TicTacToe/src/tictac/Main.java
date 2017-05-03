package tictac;

import java.util.Scanner;

public class Main {

	public static final String POROZNIA = "   ";
	public static final String KHRESTYK = " X ";
	public static final String NOLYK = " O ";

	public static String aktyvnyyGravets;
	public static String aktyvnyyGravets1;
	public static String GravetsX;
	public static String GravetsO;

	public static Scanner scanner = new Scanner(System.in);
	

	public static final int RIADKIV = 3, STOVPCHYKIV = 3;
	public static String[][] sitka = new String[RIADKIV][STOVPCHYKIV];

	public static int statusGry;
	public static final int SATUS_DRA_TRYVAE = 0, STATUS_NICHYYA = 1, STATUS_PEREMOGA_X = 3, STATUS_PEREMOGA_O = 4;

	public static void main(String[] args) {
		System.out.println("¬вед≥ть ≥м€ першого гравц€");
		GravetsX = scanner.next(); 
		
		System.out.println("¬вед≥ть ≥м€ другого гравц€");
		GravetsO = scanner.next();
		PochatyGru();
		do {
			
			
			otrymatyVvedennyGravtsi();
			ProanalizuvatySitcu();
			vyvestySitku();
			if (statusGry == STATUS_PEREMOGA_X) {
				System.out.println("winer " + GravetsX);
			} else if (statusGry == STATUS_PEREMOGA_O) {
				System.out.println("winer " + GravetsO );
			} else if (statusGry == STATUS_NICHYYA) {
				System.out.println("no winer");
			}
			aktyvnyyGravets1 = (aktyvnyyGravets1 == GravetsX ? GravetsO : GravetsX);
			aktyvnyyGravets = (aktyvnyyGravets == KHRESTYK ? NOLYK : KHRESTYK);
		} while (statusGry == SATUS_DRA_TRYVAE);

	}

	public static void PochatyGru() {
		for (int riad = 0; riad < RIADKIV; riad++) {
			for (int stovp = 0; stovp < STOVPCHYKIV; stovp++) {
				sitka[riad][stovp] = POROZNIA;
			}
		}
		aktyvnyyGravets = KHRESTYK;
		aktyvnyyGravets1 = GravetsX;
		System.out.println("“в≥й х≥д " + aktyvnyyGravets1);
		vyvestySitku();
	}

	public static void otrymatyVvedennyGravtsi() {
		boolean vvedeniaDiysne = false;
		do {
			System.out.println("√равець " + aktyvnyyGravets1 + " введ≥ть р€док ( 1 - 3) через проб≥л");
			int riad = scanner.nextInt() - 1;
			int stovp = scanner.nextInt() - 1;

			if (riad >= 0 && riad < RIADKIV && stovp >= 0 && stovp < STOVPCHYKIV && sitka[riad][stovp] == POROZNIA) {
				sitka[riad][stovp] = aktyvnyyGravets;
				vvedeniaDiysne = true;
			} else {
				System.out.println("¬ибране розм≥щенн€ (" + (riad + 1) + "," + (stovp + 1)
						+ " )не може бути виконане. —пробуй ще ... ");
			}
		} while (!vvedeniaDiysne);
	}

	public static void ProanalizuvatySitcu() {
		String peremozets = ZnaityPeremoztsy();
		if (peremozets.equalsIgnoreCase(KHRESTYK)) {
			statusGry = STATUS_PEREMOGA_X;
		} else if (peremozets.equalsIgnoreCase(NOLYK)) {
			statusGry = STATUS_PEREMOGA_O;
		} else if (ChyVsiKlityncyZapovneni()) {
			statusGry = STATUS_NICHYYA;
		} else {
			statusGry = SATUS_DRA_TRYVAE;
		}

	}

	public static boolean ChyVsiKlityncyZapovneni() {
		for (int riad = 0; riad < RIADKIV; riad++) {
			for (int stovp = 0; stovp < STOVPCHYKIV; stovp++) {

				if (sitka[riad][stovp] == POROZNIA) {
					return false;
				}
			}
		}
		return true;
	}

	public static String ZnaityPeremoztsy() {
		int kilkistOdnakovyh;
		for (int riad = 0; riad < RIADKIV; riad++) {
			kilkistOdnakovyh = 0;
			for (int stovp = 0; stovp < STOVPCHYKIV; stovp++) {
				if (sitka[riad][0] != POROZNIA && sitka[riad][0] == sitka[riad][stovp]) {
					kilkistOdnakovyh++;
				}

			}
			if (kilkistOdnakovyh == 3) {
				return sitka[riad][0];

			}
		}
		for (int stovp = 0; stovp < STOVPCHYKIV; stovp++) {
			kilkistOdnakovyh = 0;
			for (int riad = 0; riad < RIADKIV; riad++) {
				if (sitka[0][stovp] != POROZNIA && sitka[0][stovp] == sitka[riad][stovp]) {
					kilkistOdnakovyh++;
				}
			}
			if (kilkistOdnakovyh == 3) {
				return sitka[0][stovp];
			}
		}
		if (sitka[0][0] != POROZNIA && sitka[0][0] == sitka[1][1] && sitka[0][0] == sitka[2][2]) {
			return sitka[0][0];
		}
		if (sitka[0][2] != POROZNIA && sitka[0][2] == sitka[1][1] && sitka[0][2] == sitka[2][0]) {
			return sitka[0][2];
		}
		return POROZNIA;
	}

	public static void vyvestySitku() {
		for (int riad = 0; riad < RIADKIV; riad++) {
			for (int stovp = 0; stovp < STOVPCHYKIV; stovp++) {

				System.out.print(sitka[riad][stovp]);
				if (stovp != STOVPCHYKIV - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (riad != RIADKIV - 1) {
				System.out.println("-----------");
			}
		}
		System.out.println();
	}
}
