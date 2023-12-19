package models.responseModels;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessfulAuthorizationResponse {
    private long id;
    private String token;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getToken() { return token; }
    public void setToken(String value) { this.token = value; }
}
