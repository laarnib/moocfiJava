/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lb123
 */
public class Cube {
    private int edgeLength;
    private int volume;
    
    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
        this.volume = 0;
    }
    
    public int volume() {
        this.volume = edgeLength * edgeLength * edgeLength;
        return volume;
    }
    
    @Override
    public String toString() {
        return "The length of the edge is " + this.edgeLength +
                " and the volume " + this.volume();
    }
}
