
public class InfoWeather {
	public  String id;
	public  String name_city;
	
	public  String lon;
	public  String lat;
	
	public String ct;
	
	public String rise;
	public String set;
	
	public  String temp_value;
	public String temp_min;
	public  String temp_max;
	public  String temp_unit;
	
	public  String humid_value;
	public  String humid_unit;
	
	public  String pres_value;
	public  String pres_unit;
	
	public  String speed_value;
	public  String speed_name;
	
	
	public  String direct_value;
	public  String direct_code;
	public String direct_name;
	
	
	public  String cloud_value;
	public  String cloud_name;
	
	public  String visi_value;
	
	public  String preci_mode;
	
	public  String weather_value;
	public  String weather_number;
	public String weather_icon;
	
	public  String lastupdate;

	public  String getId() {
		return id;
	}

	public  void setId(String id) {
		 this.id = id;
	}

	public  String getName_city() {
		return name_city;
	}

	public  void setName_city(String name_city) {
		this.name_city = name_city;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public  String getLat() {
		return lat;
	}

	public  void setLat(String lat) {
		this.lat = lat;
	}

	public  String getCt() {
		return ct;
	}

	public  void setCt(String ct) {
		this.ct = ct;
	}

	public  String getRise() {
		return rise;
	}

	public  void setRise(String rise) {
		this.rise = rise;
	}

	public String getSet() {
		return set;
	}

	public  void setSet(String set) {
		this.set = set;
	}

	public String getTemp_value() {
		return temp_value;
	}

	public  void setTemp_value(String temp_value) {
		this.temp_value = temp_value;
	}

	public  String getTemp_min() {
		return temp_min;
	}

	public  void setTemp_min(String temp_min) {
		this.temp_min = temp_min;
	}

	public  String getTemp_max() {
		return temp_max;
	}

	public  void setTemp_max(String temp_max) {
		this.temp_max = temp_max;
	}

	public  String getTemp_unit() {
		return temp_unit;
	}

	public  void setTemp_unit(String temp_unit) {
		this.temp_unit = temp_unit;
	}

	public  String getHumid_value() {
		return humid_value;
	}

	public  void setHumid_value(String humid_value) {
		this.humid_value = humid_value;
	}

	public  String getHumid_unit() {
		return humid_unit;
	}

	public  void setHumid_unit(String humid_unit) {
	    this.humid_unit = humid_unit;
	}

	public  String getPres_value() {
		return pres_value;
	}

	public  void setPres_value(String pres_value) {
		this.pres_value = pres_value;
	}

	public  String getPres_unit() {
		return pres_unit;
	}

	public void setPres_unit(String pres_unit) {
		this.pres_unit = pres_unit;
	}

	public  String getSpeed_value() {
		return speed_value;
	}

	public  void setSpeed_value(String speed_value) {
		this.speed_value = speed_value;
	}

	public  String getSpeed_name() {
		return speed_name;
	}

	public  void setSpeed_name(String speed_name) {
		this.speed_name = speed_name;
	}

	public  String getDirect_value() {
		return direct_value;
	}

	public void setDirect_value(String direct_value) {
		this.direct_value = direct_value;
	}

	public  String getDirect_code() {
		return direct_code;
	}

	public void setDirect_code(String direct_code) {
		this.direct_code = direct_code;
	}

	public String getDirect_name() {
		return direct_name;
	}

	public  void setDirect_name(String direct_name) {
		this.direct_name = direct_name;
	}

	public  String getCloud_value() {
		return cloud_value;
	}

	public  void setCloud_value(String cloud_value) {
		this.cloud_value = cloud_value;
	}

	public  String getCloud_name() {
		return cloud_name;
	}

	public  void setCloud_name(String cloud_name) {
		this.cloud_name = cloud_name;
	}

	public  String getVisi_value() {
		return visi_value;
	}

	public  void setVisi_value(String visi_value) {
		this.visi_value = visi_value;
	}

	public  String getPreci_mode() {
		return preci_mode;
	}

	public  void setPreci_mode(String preci_mode) {
		this.preci_mode = preci_mode;
	}

	public  String getWeather_value() {
		return weather_value;
	}

	public  void setWeather_value(String weather_value) {
		this.weather_value = weather_value;
	}

	public  String getWeather_number() {
		return weather_number;
	}

	public  void setWeather_number(String weather_number) {
		this.weather_number = weather_number;
	}

	public  String getWeather_icon() {
		return weather_icon;
	}

	public void setWeather_icon(String weather_icon) {
		this.weather_icon = weather_icon;
	}

	public  String getLastupdate() {
		return lastupdate;
	}

	public  void setLastupdate(String lastupdate) {
		this.lastupdate = lastupdate;
	}
	
	public String toString() {
		String txt = "{ "+"\n"+"   \""+"city"+"\""+":"+" {"+"\n"+"     \""+"id"+":"+"\""+this.getId()+"\""+","+"\n"
	                                          +"     \""+"name"+":"+"\""+this.getName_city()+"\""+","+"\n"
				                              +"      \""+"coord"+"\""+":"+"{"+"\n"
	                                                     +"         \""+"lon"+"\""+":"+"\""+this.getLon()+"\""+","+"\n"
	                                                     +"         \""+"lat"+"\""+":"+"\""+this.getLat()+"\""+","+"\n"
	                                                     +"       },"+"\n"+
	                                                     "       \""+"country"+"\""+":"+"\""+this.getCt()+"\""+","+"\n"
	                                                    +"       \""+"sun"+"\""+":"+" {"+"\n"
	                                                    +"         \""+"rise"+"\""+":"+"\""+this.getRise()+"\""+","+"\n"
	                                                    +"         \""+"set"+"\""+":"+"\""+this.getSet()+"\""+"\n"+"       }"+"\n"+"     },"+"\n"
	                                                    +"     \""+"temperature"+"\""+":"+" {"+"\n"+"       \""+"value"+"\""+": "+"\""+this.getTemp_value()+"\""+","+"\n"
	                                                    +"       \""+"min"+"\""+": "+"\""+this.getTemp_min()+"\""+","+"\n"
	                                                    +"       \""+"max"+"\""+": "+"\""+this.getTemp_max()+"\""+","+"\n"
	                                                    +"       \""+"unit"+"\""+": "+"\""+this.getTemp_unit()+"\""+"\n"
	                                                    +"     },"+"\n"
	                                                    +"     \""+"humidity"+"\""+": "+"{"+"\n"
	                                                    +"       \""+"value"+"\""+": "+"\""+this.getHumid_value()+"\""+","+"\n"
	                                                    +"       \""+"unit"+"\""+": "+"\""+this.getHumid_unit()+"\""+"\n"
	                                                    +"     },"+"\n"
	                                                    +"     \""+"pressure"+"\""+": "+"{"+"\n"
	                                                    +"       \""+"value"+"\""+": "+"\""+this.getPres_value()+"\""+","+"\n"
	                                                    +"       \""+"unit"+"\""+": "+"\""+this.getPres_unit()+"\""+"\n"
	                                                    +"     },"+"\n"
	                                                    +"     \""+"wind"+"\""+": "+"{"+"\n"
	                                                    +"       \""+"speed"+"\""+": "+"{"+"\n"
	                                                    +"         \""+"value"+"\""+": "+"\""+this.getSpeed_value()+"\""+","+"\n"
	                                                    +"         \""+"name"+"\""+": "+"\""+this.getSpeed_name()+"\""+"\n"
	                                                    +"     },"+"\n"
	                                                    +"       \""+"direction"+"\""+": "+"{"+"\n"
	                                                    +"         \""+"value"+"\""+": "+"\""+this.getDirect_value()+"\""+","+"\n"
	                                                    +"         \""+"code"+"\""+": "+"\""+this.getDirect_code()+"\""+","+"\n"
	                                                    +"         \""+"name"+"\""+": "+"\""+this.getDirect_name()+"\""+"\n"
	                                                    +"       }"+"\n"
	                                                    +"     },"+"\n"
	                                                    +"     \""+"clouds"+"\""+": "+"{"+"\n"
	                                                    +"       \""+"value"+"\""+": "+"\""+this.getCloud_value()+"\""+","+"\n"
	                                                    +"       \""+"name"+"\""+": "+"\""+this.getCloud_name()+"\""+"\n"
	                                                    +"     },"+"\n"
	                                                    +"     \""+"visibility"+"\""+": "+"{"+"\n"
	                                                    +"       \""+"value"+"\""+": "+"\""+this.getVisi_value()+"\""+"\n"
	                                                    +"     },"+"\n"
	                                                    +"     \""+"precipitation"+"\""+": "+"{"+"\n"
	                                                    +"       \""+"mode"+"\""+": "+"\""+this.getPreci_mode()+"\""+"\n"
	                                                    +"     },"+"\n"
	                                                    +"     \""+"weather"+"\""+": "+"{"+"\n"
	                                                    +"       \""+"number"+"\""+": "+"\""+this.getWeather_number()+"\""+","+"\n"
	                                                    +"       \""+"value"+"\""+": "+"\""+this.getWeather_value()+"\""+"\n"
	                                                    +"       \""+"icon"+"\""+": "+"\""+this.getWeather_icon()+"\""+"\n"
	                                                    +"     },"+"\n"
	                                                    +"     \""+"lastupdate"+"\""+": "+"{"+"\n"
	                                                    +"       \""+"value"+"\""+": "+"\""+this.getLastupdate()+"\""+"\n"
	                                                    +"     }"+"\n"
	                                                    +" }"+"\n"
	                                          ;
		
		                              
			
			
		
		
		return txt;
	}
}
