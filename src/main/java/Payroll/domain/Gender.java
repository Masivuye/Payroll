package Payroll.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Gender {
    private String female,male;

    private Gender(){}

    private Gender(Builder builder){
        this.female = builder.female;
        this.male = builder.male;
    }

    public String getFemale() {
        return female;
    }

    public String getMale() {
        return male;
    }
    public static class Builder{
        private String female,male;

        public Builder female(String female){
            this.female = female;
            return this;
        }

        public Builder male(String male){
            this.male = male;
            return this;
        }
        public Builder copy(Gender gender){
            this.female = female;
            this.male = male;
            return this;
        }
        public  Gender build(){
            return new Gender(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "female='" + female + '\'' +
                    ", male='" + male + '\'' +
                    '}';
        }
    }
}
