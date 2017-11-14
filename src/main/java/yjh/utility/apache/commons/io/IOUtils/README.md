# org.apache.commons.io.IOUtils

보다 자세한 사용법은 아래 docs를 참고
https://commons.apache.org/proper/commons-io/javadocs/api-2.5/org/apache/commons/io/IOUtils.html


<b> 1. <a href="CloseQuietly.java"> closeQuietly() </a> </b>
 - 일반적으로 finally 블록에 사용된다. 일반적인 close 구문에 도달하기 전에 예외가 발생하더라도 close 시켜준다. 예외가 발생하지 않았을 때 일반적으로 사용하는 close()를 대체하여 사용해서는 안된다.
<br>

<b> 2. <a href="ToString.java"> toString() </a> </b>
 - InputStream, Reader, URI로 주어진 contents 등을 String으로 얻을 수 있다.
<br>

<b> 3. <a href="Copy.java"> copy() </a> </b>
 - InputStream으로부터 OutputStream에 바이트를 복사한다.
 - 큰 스트림일 경우에는 copyLarge()를 사용하기를 권고.
<br>

<b> 4. <a href="ToByteArray.java"> toByteArray() </a> </b>
 - Stream의 contents를 byte[]로 얻음.
<br>

<b> 5. <a href="Write.java"> write(data, output) </a> </b>
 - data를 output에 쓸 수 있음
<br>

<b> 6. <a href="ToInputStream.java"> toInputStream() </a> </b>
 - 특정 CharSequence를 InputStream으로 변환.
<br>

<b> 7. <a href="ReadLines.java"> readLines() </a> </b>
 - InputStream을 한 줄 단위로 String List 형식으로 읽어옴.
<br>