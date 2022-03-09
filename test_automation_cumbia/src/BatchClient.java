public class BatchClient {
    public static void main(String[] args) {
        AWSBatch client = AWSBatchClientBuilder.standard().withRegion("us-east-1").build();
        SubmitJobRequest request = new SubmitJobRequest().withJobName("example").withJobQueue("new-queue").withJobDefinition("sleep30:4");
        SubmitJobResult response = client.submitJob(request);
        System.out.println(response);
    }
}