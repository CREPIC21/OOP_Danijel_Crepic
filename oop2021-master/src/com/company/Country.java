package com.company;

public enum Country {
    CROATIA("Croatian","HR",10000000.0), 
    CANADA("English", "CA",20000000.0),
    NORWAY("Norwegian","YEAH", 3000000000.0), 
    IRELAND("Irish", "Ie",4000000000000.0),
    THAILAND("Thai", "TH", 50000000000000.0);



    private String language;
    private String code;
    private double gdpInUsd;


    Country(String language, String code, double gdpInUsd) {
        this.language = language;
        this.code = code;
        this.gdpInUsd = gdpInUsd;
    }

    public String getLanguage() {
        return language;
    }

    public String getCode() {
        return code;
    }

    public double getGdpInUsd() {
        return gdpInUsd;
    }

    public double getGdpInPln(){
        return this.getGdpInUsd()*4.26;
    }
}