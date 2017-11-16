# org.apache.http.util.EntityUtils

보다 자세한 사용법은 아래 docs를 참고
https://hc.apache.org/httpcomponents-core-ga/httpcore/apidocs/org/apache/http/util/EntityUtils.html


<b> <a href="ToString.java"> 1. toString() </a> </b>
 - http 요청 후 내용을 받아오기 위해 response.getEntity().getContent()를 사용하게 되면 InputStream을 반환
 - EntityUtils.toString(response.getEntity()) 와 같이 사용하게 되면 String으로 바로 받을 수 있다.
<br>

