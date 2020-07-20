package com.company;

import com.company.controller.ShoppingCart;
import com.company.model.Product;
import com.company.controller.PaypalAlgorithm;
import com.company.controller.CreditCardAlgorithm;


public class Main {
    public static void main(String[] args){
        ShoppingCart cart=new ShoppingCart();

        Product pants=new Product("213", 21);
        Product shirt=new Product("543", 16);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        cart.pay(new PaypalAlgorithm("sanicksikani@gmail.com", "12324"));
        cart.pay(new CreditCardAlgorithm("Paulo", "2134"));
    }

}
