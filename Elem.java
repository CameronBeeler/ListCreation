package com.cambeeler;

public class Elem extends AbsElem {

    public Elem() {
    }

    public Elem(Object object){
        super(object);
    }

    @Override
    public Elem next(){
        return (Elem)this.rightLink;
    }

    @Override
    public Elem previous(){
        return (Elem)this.leftLink;
    }

    @Override
    public Elem setNext(Elem item){
        this.rightLink = item;
        return (Elem)this.rightLink;
    }

    @Override
    public Elem setPrevious(Elem item){
        this.leftLink = item;
        return (Elem)this.leftLink;
    }

    @Override
    public int compareTo(Elem item){
        if(item!=null){
            return ((String) super.getValue()).compareToIgnoreCase((String)item.getValue());
        }
        return -999;
    }



}
