module com.arohau.dip.daov2impl {
    requires com.arohau.dip.entity;
    requires com.arohau.dip.dao;
    provides com.arohau.dip.dao.CustomerDao with com.arohau.dip.daov2impl.CustomV2DaoImpl;
    exports com.arohau.dip.daov2impl;
}