package intro.IslandOfKnowledge;

import java.util.ArrayList;

/*
An IP address is a numerical label assigned to each device (e.g., computer, printer)
participating in a computer network that uses the Internet Protocol for communication.
There are two versions of the Internet protocol, and thus two versions of addresses.
One of them is the IPv4 address.

IPv4 addresses are represented in dot-decimal notation, which consists of four decimal numbers,
each ranging from 0 to 255 inclusive, separated by dots, e.g., 172.16.254.1.

Given a string, find out if it satisfies the IPv4 address naming rules.
*/
public class IsIPv4Address {
    public static void main(String[] args) {
        String inputString = "172.16.254.1";

        result(inputString);
    }

   static boolean result (String inputString) {
       String[] splitString = inputString.split(".");
       if (splitString.length > 4) {
           return false;
       }
       for (String string : splitString) {
           if (string.isEmpty()) {
               return false;
           }
           if (!string.matches("[0-9]{1,3}")) {
               return false;
           }
           int number = Integer.parseInt(string);
           if (!(number >= 0 && number <= 255)) {
               return false;
           }
       }
       return true;
    }
}
