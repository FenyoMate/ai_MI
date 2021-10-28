package main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataSorter {
    private class crosses_n{
        public ArrayList<Integer> n_vert;
        public ArrayList<Integer> n_horiz;
        crosses_n(ArrayList<Integer> n){
            n_vert = new ArrayList<Integer>();
            n_horiz = new ArrayList<Integer>();
            for (int i = 0; i < n.size(); i++) {
                if(i%2 == 0) {
                    n_vert.add(n.get(i));
                }else
                    n_horiz.add(n.get(i));
            }
        }
    }
    private class p2p_p{
        public ArrayList<Integer> points;
        p2p_p(ArrayList<Integer> p){
            points = new ArrayList<Integer>(p);
        }
    }
    private class roads_e{

    }
    public DataSorter(String[] a) {

    }
}
