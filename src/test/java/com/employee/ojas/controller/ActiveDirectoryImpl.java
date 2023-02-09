//package com.employee.ojas.controller;
//
//import com.unboundid.ldap.sdk.*;
//
//public class ActiveDirectoryImpl {
//    public static void main(String[] args) throws LDAPException {
//        try {
//            // Create an LDAP connection to the server
//            LDAPConnection connection = new LDAPConnection("192.168.1.20", 389);
//
//            // Bind to the server using a DN and password
//            connection.bind("ojasidm\\adminro", "Ojas@1234567890");
//
//            SearchResult searchResult = connection.search("DC=OJASIDM,DC=COM", SearchScope.SUB, "(sAMAccountName=ag20129)");
//        //  SearchResult searchResult = connection.search("DC=OJASIDM,DC=COM", SearchScope.SUB, "(objectClass=*)", "*");
//
//
//
//            // Get the first entry in the search results
//            SearchResultEntry entry = searchResult.getSearchEntries().get(0);
//
//            // Print the user's attributes
//            System.out.println("DN: " + entry.getDN());
//            for (Attribute attr : entry.getAttributes()) {
//                System.out.println(attr.getName() + ": " + attr.getValue());
//            }
//
//            // Disconnect from the server
//            connection.close();
//        } catch (LDAPException e) {
//            System.err.println("Error: " + e.getMessage());
//        }
//    }
//}
//
