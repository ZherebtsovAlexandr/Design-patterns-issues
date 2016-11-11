package mansonheart.com.designpatternsissues.data

/**
 * Created by alexandr on 11.11.16.
 */
class Request(val type: RequestType? = null,
              val url: String? = null,
              val entityPath: String? = null,
              val params: Map<String, String>? = null,
              val header: Map<String, String>? = null,
              val entityClazz: String? = null) {

}