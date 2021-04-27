package com.covid19pune.covidbeds.service;

import com.covid19pune.covidbeds.model.CovidHospital;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class BedService {
    private static String url = "https://divcommpunecovid.com/ccsbeddashboard/hsr";

    public List<CovidHospital> getBeds() throws IOException {

            List<CovidHospital> ch = new ArrayList<>();
            Document document = Jsoup.connect(url).get();
            List<Element> element = document.select("#tablegrid tr td:eq(4)");
            element.forEach(e ->{
                    CovidHospital covidHospital = new CovidHospital();
                    covidHospital.setHospitalName(e.select("b:eq(0)").text());
                    if(e.select("b:eq(2)").size() > 0){
                        covidHospital.setHospitalAddress(e.select("b:eq(2)").get(0).nextSibling().toString());
                    }

                    ch.add(covidHospital);
            });


            return ch;
    }
}
