package com.company;

public class Skeleton extends Boss {


    private int quantityOfArrows;

    public int getQuantityOfArrows() {
        return quantityOfArrows;
    }

    public void setQuantityOfArrows(int quantityOfArrows) {
        this.quantityOfArrows = quantityOfArrows;
    }

    public String printInfo(){
        return super.printInfo() + " Quantity Of Arrows: " + quantityOfArrows;

    }
}
