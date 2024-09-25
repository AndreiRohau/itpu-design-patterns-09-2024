module com.arohau.dip.service {
    requires com.arohau.dip.entity;
    requires com.arohau.dip.dao;
//    uses com.arohau.dip.dao.CustomerDao;
    provides com.arohau.dip.service.CustomerService with com.arohau.dip.service.CustomerService;
    exports com.arohau.dip.service;
}