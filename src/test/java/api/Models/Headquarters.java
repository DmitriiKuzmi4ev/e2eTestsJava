package api.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
@AllArgsConstructor
public class Headquarters {
    private String address;
    private String city;
    private String state;
}
