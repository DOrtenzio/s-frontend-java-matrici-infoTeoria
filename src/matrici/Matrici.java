package matrici;
public class Matrici {
    public static void invertiIndiciColonne(int [][] m,int n1,int n2){
        int temp;
        for (int i=0;i<m.length;i++){
            temp=m[i][n1];
            m[i][n1]=m[i][n2];
            m[i][n2]=temp;
        }
    }
    public static void invertiIndiciRighe(int [][] m,int n1,int n2){
        int temp;
        for (int i=0;i<m[0].length;i++){
            temp=m[n1][i];
            m[n1][i]=m[n2][i];
            m[n2][i]=temp;
        }
    }
    public static boolean isSimmetricaDiagMaggiore (int [][] m){
        for (int i = 0; i < m.length; i++) {
            for (int p = i+1 ; p < m[0].length; p++) {
                if (m[p][i]!=m[i][p]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void matriceTrasposta (int [][] m){
        int temp;
        for (int i = 0; i < m.length; i++) {
            for (int p = i+1; p < m[0].length; p++) {
                temp=m[i][p];
                m[i][p]=m[p][i];
                m[p][i]=temp;
            }
        }
    }
    public static void matriceSommaRighe (int [][] m, int [] somma){
        for (int i = 0; i < m.length; i++) { //Indice della riga
            for (int p = 0; p < m[0].length; p++) { //Indice della colonna
                somma[i]+=m[i][p];
            }
        }
    }
    public static void matriceSommaColonne (int [][] m, int [] somma){
        for (int i = 0; i < m[0].length; i++) { //Indice della colonna
            for (int p = 0; p < m.length; p++) { //Indice della riga
                somma[i]+=m[p][i];
            }
        }
    }
    public static void matriceRiempitiva (int [][] m){
        for (int i=0;i<m.length;i++) {
            for (int p=0;p<m[0].length;p++) {
                if (p<=i)
                    m[i][p]=0;
                else
                    m[i][p]=1;
            }
        }
    }
    public static void matriceRiempitivaContraria (int [][] m){
        for (int i=0;i<m.length;i++) {
            for (int p=0;p<m[0].length;p++) {
                if (p>=i)
                    m[i][p]=1;
                else
                    m[i][p]=0;
            }
        }
    }
    public static boolean isSottoLaDiagonale (int [][] m){
        for (int i=0;i<m.length;i++) {
            for (int p=0;p<m[i].length;p++) {
                if (p<i && m[1][0]!=m[i][p]){
                    return false;
                }
            }
        }
        return true;
    }
    //Stampa
    public static String Stampa (int [][] m){
        String s="";
        for (int i = 0; i < m.length; i++) {
            for (int p = 0; p < m[0].length; p++) {
                s=s+m[i][p]+"\t";
            }
            s=s+"\n";
        }
        return s;
    }
}
