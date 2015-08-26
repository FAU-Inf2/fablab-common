package de.fau.cs.mad.fablab.rest.core;


public class MailAddresses {

    private String feedbackMail;
    private String fabLabMail;

    public MailAddresses() {
    }

    public MailAddresses(String feedbackMail, String fabLabMail) {
        this.feedbackMail = feedbackMail;
        this.fabLabMail = fabLabMail;
    }

    public String getFabLabMail() {
        return fabLabMail;
    }

    public void setFabLabMail(String fabLabMail) {
        this.fabLabMail = fabLabMail;
    }

    public String getFeedbackMail() {
        return feedbackMail;
    }

    public void setFeedbackMail(String feedbackMail) {
        this.feedbackMail = feedbackMail;
    }
}
