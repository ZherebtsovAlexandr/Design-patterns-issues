package mansonheart.com.designpatternsissues.data

/**
 * Created by alexandr on 09.11.16.
 */
class RemoteDataSource {
    fun getData(request: Request): Response {
        return Response(200, "Hello from RemoteDataSource")
    }
}