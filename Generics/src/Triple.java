public class Triple<A,B,C> {

    A _first;
    B _second;
    C _third;

    public Triple(A first, B second, C third){

        this._first = first;
        this._second = second;
        this._third = third;

    }

    public A getFirst(){
        return this._first;
    }

    public B getSecond(){
        return this._second;
    }

    public C getThird(){
        return this._third;
    }

}