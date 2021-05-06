package company.kakaobank.com.bookSearch.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RestResponse<T> {
    private int status;
    private String message;
    private T result;

    public RestResponse() {
        this(100, null, null);
    }

    public RestResponse(int status) {
        this(status, null, null);
    }

    public RestResponse(int status, String message) {
        this(status, null, message);
    }

    public RestResponse(int status, T result, String message) {
        this.status = status;
        this.result = result;
        this.message = message;
    }
}
