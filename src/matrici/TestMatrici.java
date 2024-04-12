package matrici;
import java.util.Random;
import java.util.Scanner;

public class TestMatrici {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random generatore = new Random();
        int n1,n2,colonne,righe,scelta;
        do {
            System.out.println("Scegli un opzione del menù");
            System.out.println("0-Funzione 1");
            System.out.println("1-Funzione 2");
            System.out.println("2-Funzione 3");
            System.out.println("3-Funzione 4");
            System.out.println("4-Funzione 5");
            System.out.println("5-Funzione 6");
            System.out.println("6-Funzione 7");
            System.out.println("7-Funzione 8");
            System.out.println("8-Funzione 9");
            System.out.println("9-Esci");
            scelta=in.nextInt();

            switch (scelta){
                case 0:
                    //Inserimento automatizzato
                    System.out.println("Inserisci il numero di righe");
                    righe=in.nextInt();
                    System.out.println("Inserisci il numero di colonne");
                    colonne=in.nextInt();
                    int [][] m=new int[righe][colonne];
                    for (int i = 0; i < m.length; i++) {
                        for (int p = 0; p <m[0].length; p++) {
                            m[i][p] = generatore.nextInt(200);
                        }
                    }
                    System.out.println(Matrici.Stampa(m));
                    //Prima funzione
                    int rr1,rr2;
                    do {
                        System.out.println("Inserire due indici di colonna da scambiare --> Il primo :");
                        rr1=in.nextInt();
                        if (rr1<0 || rr1>= m.length)
                            System.out.println("Inserire un valore accettabile della matrice");
                    }while(rr1<0 || rr1>= m.length);
                    do {
                        System.out.println("Inserire due indici di colonna da scambiare --> Il secondo :");
                        rr2=in.nextInt();
                        if (rr2<0 || rr2>= m.length)
                            System.out.println("Inserire un valore accettabile della matrice");
                    }while(rr2<0 || rr2>= m.length);
                    Matrici.invertiIndiciColonne(m,rr1,rr2);
                    System.out.println(Matrici.Stampa(m));
                    break;
                case 1:
                    //Inserimento automatizzato
                    System.out.println("Inserisci il numero di righe");
                    righe=in.nextInt();
                    System.out.println("Inserisci il numero di colonne");
                    colonne=in.nextInt();
                    int [][] m2=new int[righe][colonne];
                    for (int i = 0; i < m2.length; i++) {
                        for (int p = 0; p <m2[0].length; p++) {
                            m2[i][p] = generatore.nextInt(200);
                        }
                    }
                    System.out.println(Matrici.Stampa(m2));
                    //Seconda funzione
                    int r1,r2;
                    do {
                        System.out.println("Inserire due indici di riga da scambiare --> Il primo :");
                        r1=in.nextInt();
                        if (r1<0 || r1>= m2.length)
                            System.out.println("Inserire un valore accettabile della matrice");
                    }while(r1<0 || r1>= m2.length);
                    do {
                        System.out.println("Inserire due indici di riga da scambiare --> Il secondo :");
                        r2=in.nextInt();
                        if (r2<0 || r2>= m2.length)
                            System.out.println("Inserire un valore accettabile della matrice");
                    }while(r2<0 || r2>= m2.length);
                    Matrici.invertiIndiciRighe(m2,r1,r2);
                    System.out.println(Matrici.Stampa(m2));
                    break;
                case 2:
                    //Terza funzione
                    int [][] m3={
                            {0,7,3,8},
                            {7,0,4,11},
                            {3,4,0,13},
                            {8,11,13,0}
                    };
                    if(Matrici.isSimmetricaDiagMaggiore(m3))
                        System.out.println("La matrice è simmetrica rispetto la diagonale maggiore");
                    else
                        System.out.println("La matrice NON ... RIPETO NON E' simmetrica rispetto la diagonale");
                    break;
                case 3:
                    //Quarta funzione
                    int [][] m4={
                            {0,15,13,18},
                            {57,0,54,211},
                            {3,4,0,163},
                            {8,11,13,0}
                    };
                    Matrici.matriceTrasposta(m4);
                    System.out.println(Matrici.Stampa(m4));
                    break;
                case 4:
                    //Inserimento automatizzato
                    System.out.println("Inserisci il numero di righe");
                    righe=in.nextInt();
                    System.out.println("Inserisci il numero di colonne");
                    colonne=in.nextInt();
                    int [][] m5=new int[righe][colonne];
                    for (int i = 0; i < m5.length; i++) {
                        for (int p = 0; p <m5[0].length; p++) {
                            m5[i][p] = generatore.nextInt(200);
                        }
                    }
                    System.out.println(Matrici.Stampa(m5));
                    //Quinta funzione
                    int [] sommariga=new int[m5.length];
                    Matrici.matriceSommaRighe(m5,sommariga);
                    for (int i=0;i< sommariga.length;i++){
                        System.out.println("La somma della riga "+i+" è "+sommariga[i]);
                    }
                    break;
                case 5:
                    //Inserimento automatizzato
                    System.out.println("Inserisci il numero di righe");
                    righe=in.nextInt();
                    System.out.println("Inserisci il numero di colonne");
                    colonne=in.nextInt();
                    int [][] m6=new int[righe][colonne];
                    for (int i = 0; i < m6.length; i++) {
                        for (int p = 0; p <m6[0].length; p++) {
                            m6[i][p] = generatore.nextInt(200);
                        }
                    }
                    System.out.println(Matrici.Stampa(m6));
                    //Sesta funzione
                    int [] sommacolonna=new int[m6[0].length];
                    Matrici.matriceSommaColonne(m6,sommacolonna);
                    for (int i=0;i< sommacolonna.length;i++){
                        System.out.println("La somma della colonna "+i+" è "+sommacolonna[i]);
                    }
                    break;
                case 6:
                    //Settima funzione
                    int [][] m7={
                            {0,15,13,18},
                            {57,0,54,211},
                            {3,4,0,163},
                            {8,11,13,0}
                    };
                    Matrici.matriceRiempitiva(m7);
                    System.out.println(Matrici.Stampa(m7));
                    break;
                case 7:
                    //Ottava funzione
                    int [][] m8={
                            {0,15,13,18},
                            {57,0,54,211},
                            {3,4,0,163},
                            {8,11,13,0}
                    };
                    Matrici.matriceRiempitivaContraria(m8);
                    System.out.println(Matrici.Stampa(m8));
                    break;
                case 8:
                    //Nona funzione
                    int [][] m9={
                            {0,15,13,18},
                            {5,0,54,211},
                            {5,5,0,163},
                            {5,5,5,0}
                    };
                    int [][] m13={
                            {0,15,13,18},
                            {57,0,54,211},
                            {3,4,0,163},
                            {8,11,13,0}
                    };
                    if(Matrici.isSottoLaDiagonale(m9))
                        System.out.println("Gli elementi sotto la diagonale principale di m9 sono tutti uguali fra di loro");
                    else
                        System.out.println("Elementi sotto la diagonale principale di m9 non sono tutti uguali fra loro");
                    if(Matrici.isSottoLaDiagonale(m13))
                        System.out.println("Gli elementi sotto la diagonale principale di m13 sono tutti uguali fra di loro");
                    else
                        System.out.println("Elementi sotto la diagonale principale di m13 non sono tutti uguali fra loro");
                    break;
                case 9:
                    System.out.println("Ciao");
                    break;
                default:
                    System.out.println("Inserire qualcosa di ciò che è dato.");
            }
        }while (scelta!=9);
    }

}