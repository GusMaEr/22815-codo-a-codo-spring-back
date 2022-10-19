
package ar.com.codoacodo.web.jerseyclient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "text"
})
public class Support {

    @JsonProperty("url")
    public String url;
    @JsonProperty("text")
    public String text;
	
    @Override
	public String toString() {
		return "Support [url=" + url + ", text=" + text + "]";
	}
    
}
