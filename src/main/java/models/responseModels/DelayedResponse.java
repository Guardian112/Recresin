package models.responseModels;

public class DelayedResponse {
    private long page;
    private long perPage;
    private long total;
    private long totalPages;
    private DataResponse[] data;
    private SupportResponse support;

    public long getPage() { return page; }
    public void setPage(long value) { this.page = value; }

    public long getPerPage() { return perPage; }
    public void setPerPage(long value) { this.perPage = value; }

    public long getTotal() { return total; }
    public void setTotal(long value) { this.total = value; }

    public long getTotalPages() { return totalPages; }
    public void setTotalPages(long value) { this.totalPages = value; }

    public DataResponse[] getData() { return data; }
    public void setData(DataResponse[] value) { this.data = value; }

    public SupportResponse getSupport() { return support; }
    public void setSupport(SupportResponse value) { this.support = value; }
}
