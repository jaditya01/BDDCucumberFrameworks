package POJO;

public class Student {

    public Student() {

    }

    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    public data  datas;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public data getDatas() {
        return datas;
    }

    public void setDatas(data datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "Student{" +
                "page=" + page +
                ", per_page=" + per_page +
                ", total=" + total +
                ", total_pages=" + total_pages +
                ", datas=" + datas +
                '}';
    }
}
