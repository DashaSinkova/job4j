package ru.job4j.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {
        Comparator<Address> addressComp = Comparator.comparing(Address::getCity);
        return profiles.stream().map(profile -> profile.getAddress()).sorted(addressComp).distinct().collect(Collectors.toList());
    }
}
