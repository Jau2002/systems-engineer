package mvc.src.models;

import java.util.ArrayList;

public class Contact {
    private Friends friend = null;
    private ArrayList<Friends> contacts = new ArrayList<Friends>();

    public String getContacts() {
        String acc = "";
        for (Friends friend : contacts) {
            acc += "\n" + friend.getName() + "\n" + friend.getAddress() + "\n" + friend.getNumber() + "\n";
        }
        return acc;
    }

    public int generateAutoIncrementalID() {
        return contacts.size() + 1;
    }

    public String addFriend(String name, String address, long number) {
        if (searchFriendByNumber(number) == null) {
            int id = generateAutoIncrementalID();
            friend = new Friends(id, name, address, number);
            contacts.add(friend);
            return "Your Friend " + name + " added";
        } else {
            return "error this friend " + name + " exist";
        }
    }

    public Friends searchFriendByName(String name) {
        for (Friends friend : contacts) {
            if (friend.getName().equalsIgnoreCase(name)) {
                this.friend = friend;
            }
        }
        if (friend == null) {
            System.out.println("Not find any friend " + name);
        }
        return friend;
    }

    public Friends searchFriendByNumber(long number) {
        for (Friends friend : contacts) {
            if (friend.getNumber() == number) {
                this.friend = friend;
            }
        }
        if (friend == null) {
            System.out.println("Not find any friend with " + number);
        }
        return friend;
    }

    public int searchFriendById(int id) {
        for (int i = 0; i < contacts.size(); i++) {
            if (friend.getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public String changeContact(String name, long number, String newName, String newAddress, long newNumber) {
        if (searchFriendByName(name) != null) {
            friend = searchFriendByName(name);
        }
        if (searchFriendByNumber(number) != null) {
            friend = searchFriendByNumber(number);
        }
        if (friend == null) {
            return "No exist the contact";
        } else {
            friend.putName(newName);
            friend.putAddress(newAddress);
            friend.putNumber(newNumber);
            return "Your contact is updated";
        }
    }

    public String deleteContact(int id) {
        if (searchFriendById(id) != -1) {
            int friendRemoved = searchFriendById(id);
            contacts.remove(friendRemoved);
            return "This deleted corrected";
        }
        return "Error no removed your friend no exist";
    }
}
