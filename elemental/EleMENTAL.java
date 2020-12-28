/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elemental;

/**
 *CSC 206
 * Mr.Osborne
 * @author Isaiah J Jones
 * 3-22-17
 */
public class EleMENTAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Give the information for hydrogen
        Element hydrogen = new Element("Hydrogen", "H", 1, 1.0078);

        hydrogen.setName("Hydrogen");
        hydrogen.setSymbol("H");
        hydrogen.setAtomicNumber(1);
        hydrogen.setAtomicWeight(1.0078);

        //Give the information for oxygen
        Element oxygen = new Element();

        oxygen.setName("Oxygen");
        oxygen.setSymbol("O");
        oxygen.setAtomicNumber(8);
        oxygen.setAtomicWeight(15.999);

        //Give the information for carbon
        Element carbon = new Element();

        carbon.setName("Carbon");
        carbon.setSymbol("C");
        carbon.setAtomicNumber(6);
        carbon.setAtomicWeight(12.009);

        //Give the information for sodium
        Element sodium = new Element();

        sodium.setName("Sodium");
        sodium.setSymbol("Na");
        sodium.setAtomicNumber(11);
        sodium.setAtomicWeight(22.990);

        //Give the information for nitrogen
        Element nitrogen = new Element();

        nitrogen.setName("Nitrogen");
        nitrogen.setSymbol("N");
        nitrogen.setAtomicNumber(7);
        nitrogen.setAtomicWeight(14.006);

        //Print out the common name and molecular weight of glucose
        System.out.println("Sugar has a chemical formula "
                + "of C6H12O6 and a molecular weight of "
                + (6 * carbon.getAtomicWeight() + 12 * hydrogen.getAtomicWeight()
                + 6 * oxygen.getAtomicWeight()));
        System.out.println();

        //Print out the common name and molecular weight of epinephrine
        System.out.println("Adrenaline has a chemical formula "
                + "of C9H13NO3 and a molecular weight of "
                + (9 * carbon.getAtomicWeight() + 13 * hydrogen.getAtomicWeight()
                + nitrogen.getAtomicWeight() + 6 * oxygen.getAtomicWeight()));
        System.out.println();

        //Print out the common name and molecular weight of acetic acid
        System.out.println("Vinegar has a chemical formula "
                + "of CH3COOH and a molecular weight of "
                + (2 * carbon.getAtomicWeight() + 4 * hydrogen.getAtomicWeight()
                + 2 * oxygen.getAtomicWeight()));
        System.out.println();

        //Print out the common name and molecular weight of sodium bicarbonate
        System.out.println("Baking Soda has a chemical formula "
                + "of NaHCO3 and a molecular weight of "
                + (sodium.getAtomicWeight() + hydrogen.getAtomicWeight()
                + carbon.getAtomicWeight() + 3 * oxygen.getAtomicWeight()));
        System.out.println();
    }

}
