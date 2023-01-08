package WebServices;


import org.json.JSONException;

public abstract class Asynchtask {
    /**
     * ESta funcion retorna los datos devueltos por el ws
     * @param result
     */
    public abstract void processFinish(String result) throws JSONException;

}
