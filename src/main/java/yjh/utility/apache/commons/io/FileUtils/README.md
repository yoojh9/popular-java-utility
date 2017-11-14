# org.apache.commons.io.FileUtils

보다 자세한 사용법은 아래 docs를 참고
https://commons.apache.org/proper/commons-io/javadocs/api-2.5/org/apache/commons/io/FileUtils.html


<b> 1. deleteDirectory() </b>
 - 해당 폴더 삭제 시, 재귀를 돌며 하위 폴더 및 파일도 모두 삭제
 
<br>

<b> 2. <a href="ReadFileToString.java"> readFileToString() </a> </b>
 - file의 내용을 읽어 String으로 얻음. file은 항상 close 됨.
<br>

<b> 3. deleteQuietly() </b>
 - 예외를 발생시키지 않고 file을 삭제 함. 만약 디렉토리일 경우 모든 하위 디렉토리까지 삭제
 - File.delete()와 차이점
 	- 비어있지 않은 디렉토리도 삭제할 수 있음
 	- 파일이나 디렉토리 삭제 시 exception throw 시키지 않음
<br>


<b> <a href="CopyFile"> 3. copyFile() </a> </b>
 - file date를 보존한 채 새로운 위치에 file을 copy
<br>
