package chap1.sample1;

public class HttpSearchClient implements SearchClient {
	
@Override
public void addDocument(SearchDocument searchDocument) {
	System.out.println("�����߰���");
}
@Override
public void checkLive(){
	System.out.println("����Ȯ��");
}
}
