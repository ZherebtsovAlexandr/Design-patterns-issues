package mansonheart.com.designpatternsissues.issue1

/**
 * Created by alexandr on 09.11.16.
 */
class RemoteDataSource {
    fun getData(type: RequestType,
                url: String,
                entityPath: String?,
                params: Map<String, String>?,
                header: Map<String, String>?): Response {
        return Response(200, "Hello from RemoteDataSource");
    }
}