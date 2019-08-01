package Payroll.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Race {
    private String african,coloured,white;

    private Race(){}

    private Race(Builder builder){
        this.african = builder.african;
        this.coloured = builder.coloured;
        this.white = builder.white;

    }

    public String getAfrican() {
        return african;
    }

    public String getColoured() {
        return coloured;
    }

    public String getWhite() {
        return white;
    }
    public static class Builder{
        private String african,coloured,white;

     public Builder african(String african){
         this.african = african;
         return this;
     }
     public Builder coloured(String coloured){
         this.coloured = coloured;
         return this;
     }
     public Builder white(String white){
         this.white = white;
         return this;
     }
     public Race build(){
         return new Race(this);
     }

        @Override
        public String toString() {
            return "Builder{" +
                    "african='" + african + '\'' +
                    ", coloured='" + coloured + '\'' +
                    ", white='" + white + '\'' +
                    '}';
        }
    }
}
