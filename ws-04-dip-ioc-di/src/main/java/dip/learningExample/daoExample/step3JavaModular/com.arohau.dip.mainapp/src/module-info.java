module com.arohau.dip.mainapp {
    requires com.arohau.dip.entity;
    requires com.arohau.dip.dao;
    requires com.arohau.dip.service;
    uses com.arohau.dip.service.CustomerService;
    uses com.arohau.dip.dao.CustomerDao;
    exports com.arohau.dip.mainapp;
}