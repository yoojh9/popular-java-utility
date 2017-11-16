# org.apache.commons.lang3.StringUtils

보다 자세한 사용법은 아래 docs를 참고
https://commons.apache.org/proper/commons-lang/javadocs/api-3.6/org/apache/commons/lang3/StringUtils.html


<b> <a href="IsBlank.java"> 1. isBlank() </a> </b>
 - 문자열이 empty(""), null 또는 공백 상태(" ")인지 체크
<br>

<b> 2. isNotBlank() </b>
 - 문자열이 empty(""), null 또는 공백 상태(" ")가 아닌지 체크
<br>

<b><a href="IsEmpty.java"> 3. isEmpty() </a> </b>
 - 문자열이 empty(""), null 인지 체크
<br>

<b> 4. isNotEmpty() </b>
 - 문자열이 empty(""), null이 아닌지 체크
<br>

<b> <a href="Equals.java"> 5. equals() </a> </b>
 - 두 문자열이 같은지 비교
 - null 일 떄도 예외없이 처리할 수 있음. 대소문자 역시 체크
<br>

<b> <a href="Join.java"> 6. join() </a> </b>
 - array를 구분자를 기준으로 단일 문자열로 만들어줌
 - null일 경우 ""로 처리
<br>