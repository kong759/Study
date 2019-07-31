package chap1.sample1;

public class HttpSearchClient implements SearchClient {
	
@Override
public void addDocument(SearchDocument searchDocument) {
	System.out.println("문서추가함");
}
@Override
public void checkLive(){
	System.out.println("상태확인");
}
}
