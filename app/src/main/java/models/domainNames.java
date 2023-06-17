package models;

public class domainNames {
    String title;
    Boolean Checked;
    String priority;

    public domainNames() {
    }

    public domainNames(String title, Boolean checked, String priority) {
        this.title = title;
        Checked = checked;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getChecked() {
        return Checked;
    }

    public void setChecked(Boolean checked) {
        Checked = checked;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
