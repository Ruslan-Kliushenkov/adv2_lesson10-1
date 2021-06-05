package com.alevel;

public class AbstractReport {
      private String header;
      private String footer;

      public void setHeader(String header) {
            this.header = header;
      }

      public void setFooter(String footer) {
            this.footer = footer;
      }

      String getHeader(){return header;}
      String getFooter(){return footer;}

}
