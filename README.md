# popular-java-utility
유용한 자바 utility class에 대한 설명
개인적인 소장용으로 뭐가 있는지만 기억하기 위해 작성했기 때문에 정확한 사용법은 레퍼런스를 참조해야함.


1. <a href="/src/main/java/yjh/utility/apache/commons/io/IOUtils/"> org.apache.commons.io.IOUtils </a>
 - 일반적인 IO 스트림 조작 유틸리티
 	- closeQuietly() : null 및 예외를 무시하고 스트림을 close 함.
	- copy() : 하나의 스트림에 있는 데이터를 다른 스트림으로 복사.
	- write() : 데이터를 stream에 write
	- read() : stream으로부터 데이터를 읽어옴.