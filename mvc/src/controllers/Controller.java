package mvc.src.controllers;

import mvc.src.models.Contact;
import mvc.src.view.Inputs;

public class Controller {
    private Inputs input;
    private Contact contact;

    public Controller() {
        input = new Inputs();
        contact = new Contact();
    }

    public void executable() {
        int option;
        do {
            input.showMenu();
            option = input.getInputInt();
            switch (option) {
                case 1:
                    System.out.println(contact.getContacts());
                    break;
                case 2:
                    System.out.println(contact.addFriend("jaume", "calle 4C # 53D - 54", 312504778));
                    break;
                case 3:
                    System.out.println(contact.searchFriendByName("jaume"));
                    break;
                case 4:
                    System.out.println(contact.changeContact("jaume", 312504778, "jau", "calle 4C # 53D - 54", 310477084));
                    break;
                case 5:
                    System.out.println(contact.deleteContact(1));
                    break;
                case 6:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (option != 6);
    }
}