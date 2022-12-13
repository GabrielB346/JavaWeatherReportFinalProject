package WeatherReport;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class WeatherBits {
     String EventID;
  String district;
  String BeginDate;
  int StartTime;// 3
  String EventType;
  int deaths;// 5
  int injuries;// 6
  int damages;// 7
  String Latitude;
  String Longitude;

  public WeatherBits(String EventID, String district, String BeginDate, int StartTime, String EventType, int deaths,
      int injuries, int damages, String Latitude, String Longitude) {
    this.EventID = EventID;
    this.district = district;
    this.BeginDate = BeginDate;
    this.StartTime = StartTime;
    this.EventType = EventType;
    this.deaths = deaths;
    this.injuries = injuries;
    this.damages = damages;
    this.Latitude = Latitude;
    this.Longitude = Longitude;
  }
}
