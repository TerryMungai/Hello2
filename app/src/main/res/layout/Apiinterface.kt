package layout

import android.telecom.Call


interface ApiInterface {
        @POST("register")
        fun registerStudent(@Body requestBody: RequestBody)
    abstract fun loginStudent(body: Any): Any
}

class RequestBody {

}

annotation class POST(val value: String)

annotation class Body
