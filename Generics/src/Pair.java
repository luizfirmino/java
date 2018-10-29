public class Pair<A,B> {

    A _first;
    B _second;

    public Pair(A first, B second){

        this._first = first;
        this._second = second;

    }

    public A getFirst(){
        return this._first;
    }

    public B getSecond(){
        return this._second;
    }

}