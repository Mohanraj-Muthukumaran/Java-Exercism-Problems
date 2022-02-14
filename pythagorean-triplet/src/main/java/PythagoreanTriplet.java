import java.util.ArrayList;
import java.util.List;


class PythagoreanTriplet{

    private int a,b,c;

    public PythagoreanTriplet(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static PythagoreanTripletBuilder makeTripletsList(){
        return new PythagoreanTripletBuilder();
    }

    // by defaults equals works for strings only, overiding for pythagoreantriplet
    @Override
    public boolean equals(Object b){
        // id both the objects are null
        if(this == b){
            return true;
        }
        else if(b instanceof PythagoreanTriplet){
            PythagoreanTriplet toCompare = (PythagoreanTriplet)b;
            if(this.a == toCompare.a && this.b == toCompare.b && this.c == toCompare.c){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

}

class PythagoreanTripletBuilder{
        
    int max, min = 1;
    
    public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int limit){
        return this;
    }

    public PythagoreanTripletBuilder thatSumTo(int sum){
        this.max = sum;
        return this;
    }

    public List<PythagoreanTriplet> build(){
        List<PythagoreanTriplet> list = new ArrayList<PythagoreanTriplet>();
        for(int a = min; a<max/3;a++){
            for(int b = a+1;b<max/2;b++){
               int c = max - (a+b);
               if(((a*a) + (b*b)) == (c*c)){
                   list.add(new PythagoreanTriplet(a, b, c));
               } 
            }
        }
        return list;
    }
}