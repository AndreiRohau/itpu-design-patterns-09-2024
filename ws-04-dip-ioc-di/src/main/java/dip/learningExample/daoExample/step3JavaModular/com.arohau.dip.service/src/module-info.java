module com.arohau.dip.service {
    requires com.arohau.dip.entity;
    requires com.arohau.dip.dao;
    uses com.arohau.dip.dao.CustomerDao;
    exports com.arohau.dip.service;
}