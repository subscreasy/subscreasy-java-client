package com.kodfarki.subscreasy.client.card;

import com.kodfarki.subscreasy.client.model.PaymentCard;

/**
 * User: Halil Karakose
 * Date: 2019-12-15
 * Time: 22:38
 */
public class TestPaymentCard {
    public static PaymentCard aktifbank() {
        PaymentCard paymentCard = new PaymentCard();
        paymentCard.setCardNumber("5345632006230604");
        paymentCard.setExpireMonth("03");
        paymentCard.setExpireYear("2022");
        paymentCard.setCvc("873");

        return paymentCard;
    }

    public static PaymentCard payu(){
        PaymentCard paymentCard = new PaymentCard();
        paymentCard.setCardNumber("4761340000000043");
        paymentCard.setExpireMonth("12");
        paymentCard.setExpireYear("2019");
        paymentCard.setCvc("000");

        return paymentCard;
    }
}
