import java.io.FileReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class fileread{

	public static void main(String args[]){

		try{

			FileReader fr = new FileReader("/home/mimirin/tantantigerdata.csv");
			BufferedReader br = new BufferedReader(fr);

			String line;
			StringTokenizer token;
			br.readLine();
			int i=0;

			tantandata[] data;
			while((line = br.readLine())!=null){
					token = new StringTokenizer(line,",");
//				token.nextToken();
//							System.out.println(token.nextToken());
							data[i] = tantandata(token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken(),token.nextToken());
					i ++;
					System.out.println("*********");
				}

				br.close();

		} catch (IOException ex){
						ex.printStackTrace();
		}
	}
}

class tantandata{
	String date; 						//日付
	String customer; 					//来客数
	String earnings;						//売上
	String price_ave; 					//平均単価
	String repeat;							//リピート数
	String customer_new; 			//新規数
	String temperature_ave; 		//平均気温
	String temperature_max; 		//最高気温
	String temperature_min;		//最低気温
	String precipitation;			//降水量
	String day_length;					//日照時間
	String windspeed_ave;			//平均風速
	String windspeed_max;			//最大風速
	String wind_direction;	//風向き
	String vapor_pressure;			//蒸気圧(hPa)
	String weather_noon;		//昼天気
	String weather_night;		//夜天気
	String dow;							//曜日
	
//	tantandata(	String date, int customer, int earnings, int price_ave, int repeat, int customer_new, int temperature_ave, int temperature_max, int temperature_min, int precipitation, int day_length, int windspeed_ave, int windspeed_max, String wind_direction, int vapor_pressure, String weather_noon, String weather_night, String dow ){
	tantandata(	String date, String customer, String earnings, String price_ave, String repeat, String customer_new, String temperature_ave, String temperature_max, String temperature_min, String precipitation, String day_length, String windspeed_ave, String windspeed_max, String wind_direction, String vapor_pressure, String weather_noon, String weather_night, String dow ){
	this.date 						= date; 						//日付
	this.customer 				= customer; 					//来客数
	this.earnings 				= earnings;						//売上
	this.price_ave 				= price_ave; 					//平均単価
	this.repeat 					= repeat;							//リピート数
	this.customer_new 		= customer_new; 			//新規数
	this.temperature_ave	= temperature_ave; 		//平均気温
	this.temperature_max	= temperature_max; 		//最高気温
	this.temperature_min	= temperature_min;		//最低気温
	this.precipitation		= precipitation;			//降水量
	this.day_length				= day_length;					//日照時間
	this.windspeed_ave		= windspeed_ave;			//平均風速
	this.windspeed_max		= windspeed_max;			//最大風速
	this.wind_direction		= wind_direction;			//風向き
	this.vapor_pressure		= vapor_pressure;			//蒸気圧(hPa)
	this.weather_noon			= weather_noon;//昼天気
	this.weather_night		= weather_night;//夜天気
	this.dow							= dow;							//曜日
	
	}
}

