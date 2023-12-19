package models.responseModels;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnSuccessfulLoginResponse {
    private String error;

    public String getError() { return error; }
    public void setError(String value) { this.error = value; }
}
