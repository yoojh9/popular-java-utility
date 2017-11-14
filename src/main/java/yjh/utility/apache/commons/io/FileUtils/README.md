# org.apache.commons.io.FileUtils

보다 자세한 사용법은 아래 docs를 참고
https://commons.apache.org/proper/commons-io/javadocs/api-2.5/org/apache/commons/io/FileUtils.html


<b> 1. deleteDirectory() </b>
 - 해당 폴더 삭제 시, 재귀를 돌며 하위 폴더 및 파일도 모두 삭제
 
<br>

<b><a href="ReadFileToString.java"> 2.  readFileToString() </a> </b>
 - file의 내용을 읽어 String으로 얻음. file은 항상 close 됨.
<br>

<b> 3. deleteQuietly() </b>
 - 예외를 발생시키지 않고 file을 삭제 함. 만약 디렉토리일 경우 모든 하위 디렉토리까지 삭제
 - File.delete()와 차이점
 	- 비어있지 않은 디렉토리도 삭제할 수 있음
 	- 파일이나 디렉토리 삭제 시 exception throw 시키지 않음
<br>

<b> <a href="CopyFile.java"> 4. copyFile() </a> </b>
 - file date를 보존한 채 새로운 위치에 file을 copy
<br>

<b> <a href="WriteStringToFile.java"> 5. writeStringToFile() </a> </b>
 - String 데이터를 file에 write한다
 - file이 존재하지 않을 경우 생성한다.
<br>

<b> <a href="ForceMkdir.java"> 6. forceMkdir() </a> </b>
 - 필요하지만 존재하지 않는 부모 디렉토리까지 포함하여 생성. 
<br>

<b> <a href="Write.java"> 7. write() </a> </b>
 - CharSequence를 file에 write 함.
 - file이 없을 경우 새로 생성
<br>

<b> <a href="ListFiles.java"> 8. listFiles(File directory, String[] extension, boolean recursive) </a> </b>
 - 주어진 디렉토리 내에 확장자 array에 매칭되는 files를 리턴
 - extension: {"java", "xml"}, null일 경우 모든 file 리턴
 - recursive : 하위 디렉토리까지 search 하고 싶을 경우 true
<br>

<b> <a href="CopyDirectory.java"> 9. copyDirectory() </a> </b>
 - 전체 디렉토리 복사
<br>

<b> 10. forceDelete() </a> </b>
 - 파일 삭제. 만약 디렉토리라면 해당 디렉토리 삭제 후 모든 하위 디렉토리도 삭제
 - File.delete() 와의 차이점
 	- empty가 아닌 디렉토리도 삭제 가능
 	- 파일이나 디렉토리를 삭제할 수 없는 경우 예외가 발생 (java.io.File은 boolean을 리턴)
<br>