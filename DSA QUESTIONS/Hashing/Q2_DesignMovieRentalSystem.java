package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class Q2_DesignMovieRentalSystem {
class Pair implements Comparable<Pair>{
    int price;
    int shop;
    Pair(int price,int shop){
        this.price = price;
        this.shop = shop;
    }
    public int compareTo(Pair p){
        if(this.price == p.price) return this.shop - p.shop;
        return this.price - p.price;
    }
}
class Triplet implements Comparable<Triplet>{
    int price;
    int shop;
    int movie;
    Triplet(int price,int shop,int movie){
        this.price = price;
        this.shop = shop;
        this.movie = movie;
    }
    public int compareTo(Triplet t){
        if(this.price != t.price) return this.price - t.price;
        else if(this.shop != t.shop) return this.shop - t.shop;
        else return this.movie - t.movie;
    }
}
class MovieRentingSystem {

    HashMap<Integer,TreeSet<Pair>> unrented = new HashMap<>(); 
    // movie -> TreeSet{ pair(price,shop), .... }
    TreeSet<Triplet> rented = new TreeSet<>();
    // TreeSet{ Triplet(price , shop , movie), ..... }
    HashMap<Integer,HashMap<Integer,Integer>> movieToShopToPrice = new HashMap<>();
    // movie -> shop -> price

    public MovieRentingSystem(int n, int[][] entries) {
        for(int i=0;i<entries.length;i++){
            int shop = entries[i][0];
            int movie = entries[i][1];
            int price = entries[i][2];
            Pair p = new Pair(price,shop);
            if(!unrented.containsKey(movie)){
                TreeSet<Pair> set = new TreeSet<>();
                set.add(p);
                unrented.put(movie,set);
            }
            else unrented.get(movie).add(p);

            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(shop,price);
            if(!movieToShopToPrice.containsKey(movie)){
                movieToShopToPrice.put(movie,map);
            }
            else movieToShopToPrice.get(movie).put(shop,price);
        }
    }
    
    public List<Integer> search(int movie) {
        List<Integer> list = new ArrayList<>();
        if(!unrented.containsKey(movie)) return list;
        TreeSet<Pair> set = unrented.get(movie);
        int c=0;
        for(Pair p : set){
            list.add(p.shop);
            c++;
            if(c==5) break;
        }
        return list;
    }
    
    public void rent(int shop, int movie) {
        int price = movieToShopToPrice.get(movie).get(shop);
        Triplet t = new Triplet(price,shop,movie);
        rented.add(t);
        unrented.get(movie).remove(new Pair(price,shop));
    }
    
    public void drop(int shop, int movie) {
        int price = movieToShopToPrice.get(movie).get(shop);
        Pair p = new Pair(price,shop);
        unrented.get(movie).add(p);
        rented.remove(new Triplet(price, shop, movie));
    }
    
    public List<List<Integer>> report() {
        List<List<Integer>> res = new ArrayList<>();
        int c=0;
        for(Triplet t : rented){
            List<Integer> list = new ArrayList<>();
            list.add(t.shop);
            list.add(t.movie);
            res.add(list);
            c++;
            if(c==5) break;
        }
        return res;
    }
}

/**
 * Your MovieRentingSystem object will be instantiated and called as such:
 * MovieRentingSystem obj = new MovieRentingSystem(n, entries);
 * List<Integer> param_1 = obj.search(movie);
 * obj.rent(shop,movie);
 * obj.drop(shop,movie);
 * List<List<Integer>> param_4 = obj.report();
 */
}