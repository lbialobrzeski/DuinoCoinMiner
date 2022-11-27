package pl.lukaszbialobrzeski;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class HttpURLConnectionWrapper {

    public Node get(String adress) {
        Node node = new Node();
        try {
            URL url = new URL(adress);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            System.out.println(content);
            JSONObject jsonObj = new JSONObject(content.toString());

            node.setAdress(jsonObj.get("ip"));
            node.setPort(jsonObj.get("port"));
            in.close();
            con.disconnect();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return node;
    }

}
