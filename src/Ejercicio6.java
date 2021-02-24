import java.util.HashMap;
import java.util.Map;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(trim("       hola         "));
        System.out.println(ltrim( "        hola"));
        System.out.println(rtrim("hola         "));
        System.out.println(indexOfN("John|Paul|George|Ringo",'|',2));
    }
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n) {
        String ret="";
        for (int i=0; i<n; i++){
            ret+=String.valueOf(c);
        }
        return ret;
    }
    ///Ejercicio 6
    public static String rpad(String s, int n, char c)
    {
        if(s.length()<n){
            String zeros="";
            String aux="";
            zeros= replicate(c,n-s.length());
            aux=s+zeros;
            return aux;
        }
        return s;

    }

    public static String trim(String s){
        StringBuilder ret=new StringBuilder();
        for(int i=0; i<s.length();i++){
            if (s.charAt(i)!=' '){
                ret.append(s.charAt(i));
            }
        }
        return ret.toString();
    }

    public static String ltrim(String s){
        StringBuilder ret=new StringBuilder();
        int i=0;
        while (s.charAt(i)==' '){
            i++;
        }
        for(int j=i; j<s.length();j++){
            ret.append(s.charAt(j));
        }
        return ret.toString();
    }
    public static String rtrim(String s){
        StringBuilder ret=new StringBuilder();
        int i=s.length()-1;
        while (s.charAt(i)==' '){
            i--;
        }
        for(int j=0; j<s.length()-i;j++){
            ret.append(s.charAt(j));
        }
        return ret.toString();
    }

    public static int indexOfN(String s,char c,int n){
        HashMap<Map<Character, Integer>,Integer> posisicones= new HashMap<Map<Character, Integer>, Integer>();
        int cont=0;
        int pos=0;
       if (s.indexOf(c)!=-1){
           for(int j=0; j<s.length();j++){
               if(s.charAt(j)==c){
                   cont++;
                   if (cont==n){
                       pos=j;
                   }
               }
           }
       }
       else
           pos=-1;
       return pos;
    }

}
