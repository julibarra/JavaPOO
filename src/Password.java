import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
   private String formato;
    private Pattern pattern;
   // private Matcher matcher;


    public Password(String formato) {
        this.formato = formato;
        this.pattern= Pattern.compile(formato);

    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(String formato) {
        this.pattern= Pattern.compile(formato);
    }
/*
    public Matcher getMatcher() {
        return matcher;
    }

    public void setMatcher(String psswr) {
        this.matcher = pattern.matcher(psswr);
    }

 */
    public void setValue(String pssw){
       // Matcher matcher=pattern.matcher();
        if (!pattern.matches(getFormato(),pssw))
            throw new RuntimeException("El deniminador tiene que mayor al numerador");
}
}
