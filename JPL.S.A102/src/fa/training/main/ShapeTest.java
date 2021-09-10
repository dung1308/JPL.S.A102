/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.main;

import java.util.Scanner;
import fa.training.entities.Rectangle;
import fa.training.entities.Shape;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rectangles: ");
        int n = sc.nextInt();
        ArrayList<Rectangle> list = new ArrayList<Rectangle>();
        int choice;
        do{
            System.out.println("1.Input variables of rectangle");
            System.out.println("2.Display the info of previous input rectangle");
            System.out.println("3.Display the rectangle hasthe maximum area");
            System.out.println("4.Display the rectangle hasthe maximum perimeter");
            int i = 0;
            choice=0;
            boolean checkChoice = false;
            do{
                try{
                    choice = sc.nextInt();
                    checkChoice = true;
                }catch(Exception e){
                    System.out.println("Try again");
                    sc.next();
                }
            }while(checkChoice == false);
            switch(choice){
                case 1:
                    Rectangle rec = new Rectangle();
                    if(list.size() == n){
                        System.out.println("Already has " + list.size() +" rectangles");
                        break;
                    }
                    else{
                        System.out.println("Length:");
                        int len = sc.nextInt();
                        System.out.println("Width:");
                        int width = sc.nextInt();
                        rec.setLengthWidth(len, width);
                        list.add(rec);
                        i++;
                    }
                    break;
                case 2:
                    System.out.println("Width:"+list.get(list.size()-1).getWidth()+", length:"+list.get(list.size()-1).getLength()+", Perimeter:"+
                            list.get(list.size()-1).calculatePerimeter()+", Area:"+list.get(list.size()-1).calculateArea());
                    break;
                case 3:
                    Rectangle maxArea = list.get(0);
                    for(int j=0; j<list.size();j++){
                        for(int k=i+1;k<list.size();k++){
                            if(list.get(j).calculateArea()<list.get(k).calculateArea()){
                                maxArea = list.get(k);
                            }
                        }
                    }
                    System.out.println("Width:"+maxArea.getWidth()+", length:"+maxArea.getLength()+", Perimeter:"+
                            maxArea.calculatePerimeter()+", Area:"+maxArea.calculateArea());
                    break;
                case 4:
                    Rectangle maxPeri = list.get(0);
                    for(int j=0; j<n;j++){
                        for(int k=i+1;k<list.size();k++){
                            if(list.get(j).calculatePerimeter()<list.get(k).calculatePerimeter()){
                                maxPeri = list.get(k);
                            }
                        }
                    }
                    System.out.println("Width:"+maxPeri.getWidth()+", length:"+maxPeri.getLength()+", Perimeter:"+
                            maxPeri.calculatePerimeter()+", Area:"+maxPeri.calculateArea());
                    break;

            }
        }while(choice<5);
    }
}
