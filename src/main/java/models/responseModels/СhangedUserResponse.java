package models.responseModels;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class СhangedUserResponse {
    private String name;
    private String job;
    private Date updatedAt;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getJob() { return job; }
    public void setJob(String value) { this.job = value; }

    public Date getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Date value) { this.updatedAt = value; }
}
