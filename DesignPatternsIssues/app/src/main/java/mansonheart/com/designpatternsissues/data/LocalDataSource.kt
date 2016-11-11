package mansonheart.com.designpatternsissues.data

/**
 * Created by alexandr on 11.11.16.
 */
class LocalDataSource {
    fun getData(request: Request): Response {
        return Response(200, "Hello from LocalDataSource")
    }
}