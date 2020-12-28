/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elemental;

/**
 *
 * @author Isaiah
 */
public class Element {
    private String name;
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;
    


public Element(String name, String symbol, int atomicNumber, double atomicWeight){
this.name = name;
this.symbol = symbol;
this.atomicNumber = atomicNumber;
this.atomicWeight = atomicWeight;
}

public Element(){
    this("Hydrogen", "H", 1, 1.0078);
}

public String getName (){
    return name;
}

public void setName(String name){
    this.name = name;
}

public String getSymbol (){
    return symbol;
}

public void setSymbol(String symbol){
    this.symbol = symbol;
}

public int getAtomicNumber (){
    return atomicNumber;
}

public void setAtomicNumber(int getAtomicNumber){
    this.atomicNumber = getAtomicNumber;
}

public double getAtomicWeight (){
    return atomicWeight;
}

public void setAtomicWeight(double getAtomicWeight){
    this.atomicWeight = getAtomicWeight;
}
}
