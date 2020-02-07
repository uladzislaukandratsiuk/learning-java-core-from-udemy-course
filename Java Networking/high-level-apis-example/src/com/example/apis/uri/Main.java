package com.example.apis.uri;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {
        try {
            URI baseUri = new URI("db://username:password@myserver.com:8080");
            URI uri = new URI("/catalogue/phones?os=android#samsung");
            URI resolvedUri = baseUri.resolve(uri);

            System.out.println("Scheme = " + resolvedUri.getScheme());
            System.out.println("Scheme-specific part = " + resolvedUri.getSchemeSpecificPart());
            System.out.println("Authority = " + resolvedUri.getAuthority());
            System.out.println("User info = " + resolvedUri.getUserInfo());
            System.out.println("Host = " + resolvedUri.getHost());
            System.out.println("Port = " + resolvedUri.getPort());
            System.out.println("Path = " + resolvedUri.getPath());
            System.out.println("Query = " + resolvedUri.getQuery());
            System.out.println("Fragment = " + resolvedUri.getFragment());

        } catch(URISyntaxException e) {
            System.out.println("URI Bad Syntax: " + e.getMessage());
        }
    }
}