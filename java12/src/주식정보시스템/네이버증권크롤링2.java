package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링2 {

	public static void main(String[] args) {

		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		Connection con2 = Jsoup.connect("https://finance.naver.com/item/main.naver?code=035720");
		Connection con3 = Jsoup.connect("https://finance.naver.com/item/main.naver?code=003120");

		Document doc = null; // 로컨변수 초기화! 수동으로!
		try {
			doc = con3.get();
			Elements codeList = doc.select(".code");
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
			//System.out.println("코드는 " + code);
			
			Elements name = doc.select(".wrap_company h2 ");
			Element nameTag = name.get(0);
			String nameText = nameTag.text();
			
			Elements list = doc.select("span.blind");
			//System.out.println(list.size());
			//System.out.println(list);
			Element tag2 = list.get(12);
			String today = tag2.text();
			System.out.println(nameText + " 현재가 : " + today);

			Element tag3 = list.get(16);
			String up = tag3.text();
			System.out.println(nameText + " 삼성전자 최고가 : " + up);
			
			Element tag4 = list.get(20);
			String low = tag4.text();
			System.out.println(nameText + " 삼성전자 최저가 : " + low);

		} catch (IOException e) {
			e.printStackTrace();
		} // html코드를 다 가지고 와서 doc변수에 넣어놨음.
			// System.out.println(doc);
	}

}
