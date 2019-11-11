package com.challenge.vip.client;

public class Main {

    public static void main(String[] args) {

        VipClient defaultClient = new VipClient();
        System.out.println(defaultClient.getClientInfo());

        VipClient clientWithTwoParameters = new VipClient("Peter Lis" , 2000);
        System.out.println(clientWithTwoParameters.getClientInfo());

        VipClient clientWithThreeParameters = new VipClient("Ann Lis" , 2500,
                "ann.lis@gmail.com");
        System.out.println(clientWithThreeParameters.getClientInfo());
    }
}
