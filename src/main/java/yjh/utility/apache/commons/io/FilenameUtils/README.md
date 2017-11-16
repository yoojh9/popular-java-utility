# org.apache.commons.io.FilenameUtils

보다 자세한 사용법은 아래 docs를 참고
https://commons.apache.org/proper/commons-io/javadocs/api-2.5/org/apache/commons/io/FilenameUtils.html


<b> <a href="GetName.java"> 1. getName() </a> </b>
 - 전체 파일 경로에서 파일 이름을 반환
 - a/b/c.txt -> c.txt
<br>

<b> <a href="GetBaseName.java"> 2. getBaseName() </a> </b>
 - 전체 파일 경로에서 확장자를 뺀 파일 이름을 반환
 - a/b/c.txt -> c
<br>

<b> <a href="GetExtension.java"> 3. getExtension() </a> </b>
 - 파일 이름에서 확장자를 반환
 - a/b/c.txt -> txt
<br>

<b> <a href="RemoveExtension.java"> 4. removeExtension() </a> </b>
 - 파일 이름에서 확장자를 제거하고 반환
 - foo.txt	-> foo
 - a/b/c.jpg -> a/b/c
<br>

<b> 5. concat() </b>
 - 파일 이름을 기본 경로에 추가
 - /foo/ + bar		-> /foo/bar
 - /foo + bar		-> /foo/bar
 - /foo + /bar		-> /foo/bar
 - /foo + bar/c.txt	-> /foo/bar/c.txt
<br>

<b> 6. normalize() </b>
 - 유효한 경로로 변경해줌
 - /foo//		->	/foo
 - /foo/./		->	/foo
 - /foo/../bar	->	/bar
 - /foo/../bar/	->	/bar/
<br>

<b> <a href="WildCardMatch.java"> 7. wildCardMatch() </a> </b>
 - 파일 이름을 검사하여 지정된 와일드 카드와 일치하는지 체크. 대소문자를 구분한다
 -  wildcardMatch("c.txt", "*.txt")      --> true
 -  wildcardMatch("c.txt", "*.jpg")      --> false
 -  wildcardMatch("a/b/c.txt", "a/b/*")  --> true
<br>

<b> <a href="SeparatorsToUnix.java"> 8. separatorsToUnix() </a> </b>
 - 모든 구분 기호(/)를 UNIX 슬래시 구분 기호로 변경해줌
<br>

<b> <a href="GetFullPath.java"> 9. getFullPath() </a> </b>
 - 전체 파일 이름에서 파일 경로를 가져옴
 - 유닉스 또는 윈도우 포맷 둘다 다룰 수 있음
 - C:\a\b\c.txt --> C:\a\b\
 - a.txt        --> ""
 - a/b/c        --> a/b/
 - a/b/c/       --> a/b/c/
<br>

<b> <a href="IsExtension.java"> 10. isExtension(filename, extension) </a> </b>
 - filename의 확장자가 extension이 맞는지 확인
 - 대소문자를 구분함
<br>