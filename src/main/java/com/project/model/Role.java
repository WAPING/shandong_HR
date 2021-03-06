package com.project.model;

/**
 * Created by 未来人类 on 2017/5/7.
 */
public class Role {
    private String roleName;
    private int e_notification;
    private int e_enterpriseBasicInformation;
    private int e_data;
    private int e_pastData;
    private int enterpriseBasicInformation;
    private int dataManagement;
    private int dataSummary;
    private int samplingAnalysis;
    private int diagramAnalysis;
    private int dataInqueryAndExpert;
    private int notificationPublishing;
    private int systemManagement;


    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getE_notification() {
        return e_notification;
    }

    public void setE_notification(int e_notification) {
        this.e_notification = e_notification;
    }

    public int getE_enterpriseBasicInformation() {
        return e_enterpriseBasicInformation;
    }

    public void setE_enterpriseBasicInformation(int e_enterpriseBasicInformation) {
        this.e_enterpriseBasicInformation = e_enterpriseBasicInformation;
    }

    public int getE_data() {
        return e_data;
    }

    public void setE_data(int e_data) {
        this.e_data = e_data;
    }

    public int getE_pastData() {
        return e_pastData;
    }

    public void setE_pastData(int e_pastData) {
        this.e_pastData = e_pastData;
    }

    public int getEnterpriseBasicInformation() {
        return enterpriseBasicInformation;
    }

    public void setEnterpriseBasicInformation(int enterpriseBasicInformation) {
        this.enterpriseBasicInformation = enterpriseBasicInformation;
    }

    public int getDataManagement() {
        return dataManagement;
    }

    public void setDataManagement(int dataManagement) {
        this.dataManagement = dataManagement;
    }

    public int getDataSummary() {
        return dataSummary;
    }

    public void setDataSummary(int dataSummary) {
        this.dataSummary = dataSummary;
    }

    public int getSamplingAnalysis() {
        return samplingAnalysis;
    }

    public void setSamplingAnalysis(int samplingAnalysis) {
        this.samplingAnalysis = samplingAnalysis;
    }

    public int getDiagramAnalysis() {
        return diagramAnalysis;
    }

    public void setDiagramAnalysis(int diagramAnalysis) {
        this.diagramAnalysis = diagramAnalysis;
    }

    public int getDataInqueryAndExpert() {
        return dataInqueryAndExpert;
    }

    public void setDataInqueryAndExpert(int dataInqueryAndExpert) {
        this.dataInqueryAndExpert = dataInqueryAndExpert;
    }

    public int getNotificationPublishing() {
        return notificationPublishing;
    }

    public void setNotificationPublishing(int notificationPublishing) {
        this.notificationPublishing = notificationPublishing;
    }

    public int getSystemManagement() {
        return systemManagement;
    }

    public void setSystemManagement(int systemManagement) {
        this.systemManagement = systemManagement;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleName='" + roleName + '\'' +
                ", e_notification=" + e_notification +
                ", e_enterpriseBasicInformation=" + e_enterpriseBasicInformation +
                ", e_data=" + e_data +
                ", e_pastData=" + e_pastData +
                ", enterpriseBasicInfomation=" + enterpriseBasicInformation +
                ", dataManagement=" + dataManagement +
                ", dataSummary=" + dataSummary +
                ", samplingAnalysis=" + samplingAnalysis +
                ", diagramAnalysis=" + diagramAnalysis +
                ", dataInqueryAndExpert=" + dataInqueryAndExpert +
                ", notificationPublishing=" + notificationPublishing +
                ", systemManagment=" + systemManagement +
                '}';
    }

    public void setAll(String roleName,int e_notification,int e_enterpriseBasicInformation,int e_data,
                       int e_pastData,int enterpriseBasicInformation,int dataManagement,int dataSummary,
                       int samplingAnalysis,
                       int dataInqueryAndExpert,
                       int diagramAnalysis,
                       int notificationPublishing,
                       int systemManagement)
    {
        setRoleName(roleName);
        setE_notification(e_notification);
        setE_enterpriseBasicInformation(e_enterpriseBasicInformation);
        setE_data(e_data);
        setE_pastData(e_pastData);
        setEnterpriseBasicInformation( enterpriseBasicInformation);
        setDataManagement( dataManagement);
        setDataSummary(dataSummary);
        setSamplingAnalysis( samplingAnalysis);
        setDiagramAnalysis(diagramAnalysis);
        setDataInqueryAndExpert(dataInqueryAndExpert);
        setNotificationPublishing( notificationPublishing);
        setSystemManagement(systemManagement);
    }

}
