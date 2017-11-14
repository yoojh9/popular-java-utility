# org.apache.commons.io.IOUtils

https://commons.apache.org/proper/commons-io/javadocs/api-2.5/org/apache/commons/io/IOUtils.html

1. <a href="./CloseQuietly.java"> closeQuietly() </a>
 - 일반적으로 finally 블록에 사용된다. 일반적인 close 구문에 도달하기 전에 예외가 발생하더라도 close 시켜준다. 예외가 발생하지 않았을 때 일반적으로 사용하는 close()를 대체하여 사용해서는 안된다.
 
2. <a href="./ToString.java"> toString() </a>
 - InputStream, Reader, URI로 주어진 contents 등을 String으로 얻을 수 있다.
 - Reader 타입일 경우 내부적으로 buffer를 지원하므로 BufferedReader를 따로 사용할 필요는 없다.