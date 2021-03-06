package mansonheart.com.designpatternsissues.data

/**
 * Created by alexandr on 09.11.16.
 */
class Response(val status : Int, val message: String) {
    override fun toString(): String {
        return "Message ${this.message} with status code ${this.status}"
    }
}