package com.example.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogsApplication {


    private static final Logger logger = LoggerFactory.getLogger(LogsApplication.class);

    public static void main(String[] args) {


        SpringApplication.run(LogsApplication.class, args);
        logger.info("TESTING INFO SERVICE FOR APPLICATION ID: " +
                "234242342423423ERTREDFQVVVVVVVCCccccccccccssdfsdfsfsdfsfs. CALLBACK INFO: " +
                "{\"attttrr1\":{\"attttrr2\":\"anonymous\",\"attttrr5\":{\"attttrr13434\":\"432265ZZZZZZ6893\"," +
                "\"expirationDate\":\"03/23\",\"attttrr12342\":\"Pepe Viruela Casas del Olmo\"}}," +
                "\"attttrr66666\":{\"customIdentifier" +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\":\"1b98d1ab83c1400asdadadasdasdsadasdasdadasdasdasds30211c51ad5bfc30bfb2a73d188548eiosdfhisdfhsiufydfyisdyfusdifysidyfuisdyfisydfuisydfuisdyfuisdyfuisdfyis49813b3084226cc23c\",\"concept\":\"Pago con " +
                "tarjeasdadsadssdfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsfsdfadadasdasdta " +
                "(crédasdadasdasdasdadassdfsdfsdfsdfsdfsddasdassdasdadasdasdasdasdasdasdasdadsadsadasito o " +
                "débito)\",\"currfsdfsdfency\":\"EUR\",\"amosdfsfsfdsfsdfsdfunt\":4330," +
                "\"staasdasdasdasdasdasdasdsdfsdfsfsdfasdasdasdasdtuasdwersdf " +
                "dsfert sdfsdfsdertertertsdfsdfertert The end");
    }
}
