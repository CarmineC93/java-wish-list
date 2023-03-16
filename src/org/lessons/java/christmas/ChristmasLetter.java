package org.lessons.java.christmas;

import java.util.List;
import java.util.Random;

public class ChristmasLetter {

    //ATTRIBUTES
        private String sender;
        private String address;
        private List<String> wishList;

    //CONSTRUCTORS
        public ChristmasLetter(String sender, String address, List<String>  wishList){
            this.sender = sender;
            this.address = address;
            this.wishList = wishList;
        }

    //GETTER & SETTER
        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public List<String> getWishList() {
            return wishList;
        }

        public void setWishList(List<String> wishList) {
            this.wishList = wishList;
        }

        //METHODS
        @Override
        public String toString() {
            return "ChristmasLetter{" +
                    "sender='" + sender + '\'' +
                    ", address='" + address + '\'' +
                    ", wishList=" + wishList +
                    '}';
        }

        /*Aggiungere un metodo send(), che prova ad inviare la lettera a Babbo Natale:
        - se tutto va bene il metodo stampa a video la lettera, il nome e l’indirizzo
        - se la lista dei desideri supera i 5 elementi, il metodo deve sollevare un’eccezione
        - calcolare in modo random un booleano che rappresenta se il mittente è stato buono oppure no:
        se il booleano è false il metodo si chiude sollevando un’eccezione.*/

        public void send() throws WishListException {
            if (wishList.size() > 5){
                throw new WishListException("Your list is too long");
            }
                Random rnd = new Random();
                // genera numero casuale tra 0 e 1
                int GoodOrNot = rnd.nextInt(2);

                String status;
                if (GoodOrNot == 1){
                    status = "good";
                    System.out.println(toString() + "Congrats, you are a " + status + " guy");
                }else {
                    status = "bad";
                    throw new WishListException("Sorry, you are a " + status + " guy");
                }
        }
}
