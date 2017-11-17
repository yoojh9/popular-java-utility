package yjh.utility.apache.http.client.utils.URLEncodedUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class Format {

	public static void main(String[] args) throws URISyntaxException, ClientProtocolException, IOException {
		URI uri = new URI("https://search.daum.net/search");
		
		HttpClient httpClient = HttpClientBuilder.create().build();
		
		HttpResponse response = httpClient.execute(new HttpGet(uri+"?"+URLEncodedUtils.format(convertParam(), "UTF-8")));
		HttpEntity entity = response.getEntity();
		
		String content = EntityUtils.toString(entity);
		System.out.println(content);
		
	}
	
	private static List<NameValuePair> convertParam(){
		List<NameValuePair> paramList = new ArrayList<NameValuePair>();
		paramList.add(new BasicNameValuePair("w", "tot"));
		paramList.add(new BasicNameValuePair("q", "신서유기"));
		return paramList;
	}

}
