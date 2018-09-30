import java.io.FileReader;
import java.io.BufferedReader;
//import java.util.StringTokenizer;
import java.util.*;
import java.io.IOException;

public class fileread{

	public static void main(String args[]){

		try{

			FileReader fr = new FileReader("/home/mimirin/tantantigerdata.csv");
			BufferedReader br = new BufferedReader(fr);

			String line;
			br.readLine();
			int i=0;
			List<tantandata> tantanlist = new ArrayList<tantandata>();
			while((line = br.readLine())!=null){
				List<String> token = new ArrayList<String>(Arrays.asList(line.split(",",0)));

				tantanlist.add(new tantandata(
					token.get(0),						//日付
					Integer.parseInt(token.get(1)),				//来客数
					Integer.parseInt(token.get(2)),				//売上
					Integer.parseInt(token.get(3)),				//平均単価
					Integer.parseInt(token.get(4)),				//リピート数
					Integer.parseInt(token.get(5)),				//新規数
					Double.parseDouble(token.get(6)),			//平均気温
					Double.parseDouble(token.get(7)),			//最高気温
					Double.parseDouble(token.get(8)),			//最低気温
					Double.parseDouble(token.get(9)),			//降水量
					Double.parseDouble(token.get(10)),			//日照時間
					Double.parseDouble(token.get(11)),			//平均風速
					Double.parseDouble(token.get(12)),			//最大風速
					token.get(13),						//風向き
					Double.parseDouble(token.get(14)),			//蒸気圧(hPa)
					token.get(15),						//昼天気
					token.get(16),						//夜天気
					token.get(17)));					//曜日

				i ++;
			}

			br.close();

		} catch (IOException ex){
			ex.printStackTrace();
		}
	}
}

class tantandata{
	String date; 		//日付
	int customer; 		//来客数
	int earnings;		//売上
	int price_ave; 		//平均単価
	int repeat;		//リピート数
	int customer_new;	//新規数
	double temperature_ave;	//平均気温
	double temperature_max;	//最高気温
	double temperature_min;	//最低気温
	double precipitation;	//降水量
	double day_length;	//日照時間
	double windspeed_ave;	//平均風速
	double windspeed_max;	//最大風速
	String wind_direction;	//風向き
	double vapor_pressure;	//蒸気圧(hPa)
	String weather_noon;	//昼天気
	String weather_night;	//夜天気
	String dow;		//曜日

	tantandata(	String date,
			int customer,
			int earnings,
			int price_ave,
			int repeat,
			int customer_new,
			double temperature_ave,
			double temperature_max,
			double temperature_min,
			double precipitation,
			double day_length,
			double windspeed_ave,
			double windspeed_max,
			String wind_direction,
			double vapor_pressure,
			String weather_noon,
			String weather_night,
			String dow ){
		this.date 		= date; 		//日付
		this.customer 		= customer; 		//来客数
		this.earnings 		= earnings;		//売上
		this.price_ave 		= price_ave; 		//平均単価
		this.repeat 		= repeat;		//リピート数
		this.customer_new 	= customer_new; 	//新規数
		this.temperature_ave	= temperature_ave; 	//平均気温
		this.temperature_max	= temperature_max; 	//最高気温
		this.temperature_min	= temperature_min;	//最低気温
		this.precipitation	= precipitation;	//降水量
		this.day_length		= day_length;		//日照時間
		this.windspeed_ave	= windspeed_ave; 	//平均風速
		this.windspeed_max	= windspeed_max; 	//最大風速
		this.wind_direction	= wind_direction;	//風向き
		this.vapor_pressure	= vapor_pressure;	//蒸気圧(hPa)
		this.weather_noon	= weather_noon;		//昼天気
		this.weather_night	= weather_night;	//夜天気
		this.dow		= dow;			//曜日

	}
	}

