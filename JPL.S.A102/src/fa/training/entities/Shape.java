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
public abstract class Shape {
    public abstract int calculatePerimeter();
    public abstract int calculateArea();
    public abstract int getLength();
    public abstract int getWidth();
    public abstract void setLengthWidth(int len, int width);
}
