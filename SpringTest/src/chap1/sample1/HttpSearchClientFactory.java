package chap1.sample1;

public class HttpSearchClientFactory implements SearchClientFactory {
   
   private String server;
   private String contentType;
   private String encoding;

   public HttpSearchClientFactory(String server, String contentType, String encoding) {
      this.server = server;
      this.contentType = contentType;
      this.encoding = encoding;
   }
   

   @Override
   public void init() {
      System.out.printf("HttpSearchClientFactory: �ʱ�ȭ�� - %s, %s, %s\n" , server, contentType, encoding);
   }

   @Override
   public SearchClient create() {
      return new HttpSearchClient();
   }


@Override
public String toString() {
	return "HttpSearchClientFactory [server=" + server + ", contentType=" + contentType + ", encoding=" + encoding
			+ "]";
}

}