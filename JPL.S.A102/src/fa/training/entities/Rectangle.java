/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.entities;

/**
 *
 * @author ASUS
 */
public class Rectangle extends Shape{
    private int length;
    private int width;

    @Override
    public int calculatePerimeter() {
        return 2*(this.length+this.width); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calculateArea() {
        return this.length*this.width; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLengthWidth(int len, int width) {
        this.length = len;
        this.width = width;
    }

    @Override
    public int getLength() {
        return this.length; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getWidth() {
        return this.width; //To change body of generated methods, choose Tools | Templates.
    }
}
