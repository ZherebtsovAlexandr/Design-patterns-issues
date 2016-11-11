package mansonheart.com.designpatternsissues.data

/**
 * Created by alexandr on 11.11.16.
 *
 * Issue 2: https://github.com/ZherebtsovAlexandr/Design-patterns-issues/issues/2
 *
 */

class Repository(val localDataSource: LocalDataSource = LocalDataSource(),
                 val remoteDataSource: RemoteDataSource = RemoteDataSource()) {

    fun getData(request: Request, dataSourceType: DataSourceType): Response {
        var response: Response
        if (dataSourceType == DataSourceType.LOCAL) {
            response = localDataSource.getData(request)
        } else {
            response = remoteDataSource.getData(request)
        }
        return response
    }
}