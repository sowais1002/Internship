import java.util.ArrayList;

public class HotelManager {

    Hotel addHotel(String name,
                  String id,
                  String type,
                  int stars,
                  String address,
                  String state,
                  String country,
                  ArrayList<String> mails,
                  ArrayList<String> contacts,
                  ArrayList<String> amenities) {

        return new Hotel();
    }

    void deleteHotel(String id,
                     String name){


    }

    ArrayList<String> viewHotels(){

    return DataBase.HotelList;
    }

}
