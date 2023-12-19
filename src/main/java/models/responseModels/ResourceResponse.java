package models.responseModels;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResourceResponse {
    private UnknownDataResponse data;
    private SupportResponse support;

    public UnknownDataResponse getData() { return data; }
    public void setData(UnknownDataResponse value) { this.data = value; }

    public SupportResponse getSupport() { return support; }
    public void setSupport(SupportResponse value) { this.support = value; }
}
