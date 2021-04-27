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
            List<Element> element = document.select("table:eq(2) tr[class]");

            element.forEach(e ->{
                    CovidHospital covidHospital = new CovidHospital();
                    covidHospital.setHospitalName(e.select("td:eq(4) b").first().text());
                    if(e.select("td:eq(4) b:eq(2)").size() > 0){
                        covidHospital.setHospitalAddress(e.select("td:eq(4) b:eq(2)").get(0).nextSibling().toString());
                        covidHospital.setNumber(e.select("td:eq(4) b:eq(4)").get(0).nextSibling().toString());
                    }

                    covidHospital.setBedCapacity(e.select("td:eq(8)").text());
                    covidHospital.setAvailableBedWithoutOxy(e.select("td:eq(9)").text());
                    covidHospital.setVacantBedWithoutOxy(e.select("td:eq(10)").text());
                    covidHospital.setAllocatedBedWithOxy(e.select("td:eq(11)").text());
                    covidHospital.setVacantBedWithOxy(e.select("td:eq(12)").text());
                    covidHospital.setAllocatedBedIcuWithouVenti(e.select("td:eq(13)").text());
                    covidHospital.setVacantBedIcuWithoutVenti(e.select("td:eq(14)").text());
                    covidHospital.setAllocatedBedWithVenti(e.select("td:eq(15)").text());
                    covidHospital.setVacantBedIcuWithVenti(e.select("td:eq(16)").text());
                    ch.add(covidHospital);
            });


            return ch;
    }
}
