# org.apache.http.util.EntityUtils

보다 자세한 사용법은 아래 docs를 참고
https://hc.apache.org/httpcomponents-core-ga/httpcore/apidocs/org/apache/http/util/EntityUtils.html


<b> <a href="ToString.java"> 1. toString() </a> </b>
 - http 요청 후 내용을 받아오기 위해 response.getEntity().getContent()를 사용하게 되면 InputStream을 반환
 - EntityUtils.toString(response.getEntity()) 와 같이 사용하게 되면 String으로 바로 받을 수 있다.
<br>

<b> 2. consume() </b>
 - entity content가 완전히 사용되었는지, 만약 content 스트림이 있다면 닫혔는지 확인
<br>

<b> 3. consumeQuietly() </b>
 - entity content가 완전히 사용되었는지, 만약 content 스트림이 있다면 닫혔는지 확인
 - IOException을 발생시키지 않고 프로세스를 완료시킴.
<br>

<b> 4. toByteArray() </b>
 - entity content를 읽어 byte 배열로 반환
<br>

