package org.lessons.java.christmas;

import java.util.*;

public class Main {
    public static void main(String[] args) throws WishListException {

        /*        creare una List<String> dove salvare la lista dei desideri per Natale.
        Continuare a chiedere all’utente di inserire un nuovo desiderio nella lista, fino a che l’utente sceglie di fermarsi.
        Ad ogni iterazione mostrare quanti desideri sono già stati espressi e chiedere all’utente se vuole continuare o fermarsi.
        Aggiungere ciascun desiderio alla lista. Al termine dell’inserimento stampare a video la lista ordinata*/

        List<String> wishList = new ArrayList<String>();



        Scanner scan = new Scanner(System.in);

        boolean stop = false;

        do{
            System.out.println("Insert a wish");
            String wish = scan.nextLine();
            wishList.add(wish);

            System.out.println(wishList.size());
            System.out.println("Is it enough? (y/n)");
            stop = scan.nextLine().equalsIgnoreCase("y");

        } while(!stop);

        Collections.sort(wishList, String.CASE_INSENSITIVE_ORDER);
        System.out.println(wishList);

        ChristmasLetter ginoLetter = new ChristmasLetter("Gino", "Via delle stesse, 5" , wishList);

        try {
            ginoLetter.send();
        }catch(WishListException e){
            System.out.println(e.getMessage());
        }

    }
}