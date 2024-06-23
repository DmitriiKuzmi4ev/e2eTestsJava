package api.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Data
@Builder
public class CompanyInfo {
    private String name;
    private String founder;
    private int founded;
    private int employees;
    private int vehicles;
    private int launch_sites;
    private int test_sites;
    private String ceo;
    private String cto;
    private String coo;
    private String cto_propulsion;
    private long valuation;
    private Headquarters headquarters;
    private Links links;
    private String summary;

    public static CompanyInfo getCompanyInfo(String name, String founder, int founded, int employees, int vehicles,
                                       int launch_sites, int test_sites, String ceo, String cto,
                                       String coo, String cto_propulsion, long valuation) {
        return CompanyInfo.builder()
                .name("SpaceX")
                .founder("Elon Musk")
                .founded(2002)
                .employees(7000)
                .vehicles(3)
                .launch_sites(3)
                .test_sites(1)
                .ceo("Elon Musk")
                .cto("Elon Musk")
                .coo("Gwynne Shotwell")
                .cto_propulsion("Tom Mueller")
                .valuation(27500000000L)
                .headquarters(new Headquarters("Rocket Road", "Hawthorne", "California"))
                .links(new Links("https://www.spacex.com/", "https://www.flickr.com/photos/spacex/", "https://twitter.com/SpaceX", "https://twitter.com/elonmusk"))
                .summary("SpaceX designs, manufactures and launches advanced rockets and spacecraft. The company was founded in 2002 to revolutionize space technology, with the ultimate goal of enabling people to live on other planets.")
                .build();
    }
}
