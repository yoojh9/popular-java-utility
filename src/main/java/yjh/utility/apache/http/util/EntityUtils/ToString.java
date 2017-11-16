package yjh.utility.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class ToString {

	public static void main(String[] args) throws URISyntaxException, ClientProtocolException, IOException {
		URI uri = new URI("http://weather.naver.com/flash/naverRgnTownFcast.nhn");
		uri = new URIBuilder(uri).addParameter("m", "jsonResult").addParameter("naverRgnCd", "02135109").build();
		System.out.println(uri);	//  http://weather.naver.com/flash/naverRgnTownFcast.nhn?m=jsonResult&naverRgnCd=02135109
		
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpResponse response = httpClient.execute(new HttpGet(uri));
		HttpEntity entity = response.getEntity();
		
		String content = EntityUtils.toString(entity);
		System.out.println(content);
		
	}

}
