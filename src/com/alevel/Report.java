package com.alevel;

public class Report extends AbstractReport {

    private String body;

    private Report(String header, String body, String footer) {
        setHeader(header);
        this.body = body;
        setFooter(footer);
    }

    public static ReportBuilder builder() {
        return new ReportBuilder();
    }

    public ReportBuilder toBuilder() {
        return new ReportBuilder(this.getHeader(), this.body, this.getFooter());
    }

    public static class ReportBuilder {
        private String header;
        private String body;
        private String footer;

        public ReportBuilder() {
        }

        public ReportBuilder(String header, String body, String footer) {
            this.header = header;
            this.body = body;
            this.footer = footer;
        }

        public ReportBuilder header(String header) {
            this.header = header;
            return this;
        }

        public ReportBuilder body(String body) {
            this.body = body;
            return this;
        }

        public ReportBuilder footer(String footer) {
            this.footer = footer;
            return this;
        }

        public Report build() {
            return new Report(this.header, this.body, this.footer);
        }

        @Override
        public String toString() {
            return "ReportBuilder{" +
                    "header='" + header + '\'' +
                    ", body='" + body + '\'' +
                    ", footer='" + footer + '\'' +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        Report report = (Report) o;
        if (!this.getHeader().equals(report.getHeader())) return false;
        if (!this.getFooter().equals(report.getFooter())) return false;
        return this.body.equals(report.body);
    }

    @Override
    public int hashCode() {
        int result = getHeader() == null ? 0 : 31 * getHeader().hashCode();
        result = getHeader() == null ? 0 : 31 * result * getHeader().hashCode();
        result = getHeader() == null ? 0 : 31 * result * getHeader().hashCode();

        return result;
    }

    @Override
    public String toString() {
        return "Report{" +
                "header='" + getHeader() + '\'' +
                ", body='" + body + '\'' +
                ", footer='" + getFooter() + '\'' +
                '}';
    }
}
