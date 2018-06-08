package com.cambeeler;

public abstract class AbsElem {
    protected Object value;
    protected AbsElem rightLink=null;
    protected AbsElem leftLink=null;

    public AbsElem(Object value){
        this.value = value;
    }

    public AbsElem() {
    }

    abstract AbsElem next();
    abstract AbsElem previous();
    abstract AbsElem setNext(Elem item);
    abstract AbsElem setPrevious(Elem item);

    abstract int compareTo(Elem item);


    public Object getValue(){
        return this.value;
     }

    public void setValue(Object object){
    this.value = object;
    }
}
