/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornospgit;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author admin
 */
public class NumerosConsola {

    public int Max(int num1In,int num2In,int num3In,int num4In,int num5In) {

        ArrayList<Integer> max = new ArrayList<>();

        max.add(num1In);
        max.add(num1In);
        max.add(num3In);
        max.add(num4In);
        max.add(num5In);

        Collections.sort(max);
        return max.get(max.size()-1);

    }

    public int Min(int num1In,int num2In,int num3In,int num4In,int num5In) {
        ArrayList<Integer> min = new ArrayList<>();
        min.add(num1In);
        min.add(num1In);
        min.add(num3In);
        min.add(num4In);
        min.add(num5In);
        Collections.sort(min);
        return (min.get(0));
    }

}
