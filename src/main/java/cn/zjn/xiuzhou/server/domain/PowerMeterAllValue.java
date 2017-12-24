package cn.zjn.xiuzhou.server.domain;

import org.springframework.cglib.core.GeneratorStrategy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: qiao
 * @Description:
 * @Date: Created in 2017-12-23 16:37
 * @Modified By:
 * @Email: qiaokekeshu@163.com
 */
@Entity
@Table(name = "tbl_power_info_v2")
public class PowerMeterAllValue {

    @Id
    @GeneratedValue
    private Long P_ID;

    private int P_CODE;
    private String P_TIME;

    private float P_A_DIANYA;
    private float P_B_DIANYA;
    private float P_C_DIANYA;
    private float P_UAB_XIANDIANYA;
    private  float P_UBC_XIANDIANYA;
    private float P_UCA_XIANDIANYA;
    private float P_A_DIANLIU;
    private float P_B_DIANLIU;
    private float P_C_DIANLIU;
    private float P_A_YGGL;
    private float P_B_YGGL;
    private float P_C_YGGL;
    private float P_HXYGGL;
    private float P_A_WGGL;
    private float P_B_WGGL;
    private float P_C_WGGL;
    private float P_HXWGGL;
    private float P_A_SZGL;
    private float P_B_SZGL;
    private float P_C_SZGL;
    private float P_HXSZGL;
    private float P_A_GLYS;
    private float P_B_GLYS;
    private float P_C_GLYS;
    private float P_HXGLYS;
    private float P_DWPL;

    private float   P_BY_KwhZ;
    private float   P_BY_KwhJ;
    private float   P_BY_KwhF;
    private float   P_BY_KwhP;
    private float   P_BY_KwhG;
    private float   P_BY_HKwhZ;
    private float   P_BY_HKwhJ;
    private float   P_BY_HKwhF;
    private float   P_BY_HKwhP;
    private float   P_BY_HKwhG;
    private float   P_BY_KvarhZ;
    private float   P_BY_KvarhJ;
    private float   P_BY_KvarhF;
    private float   P_BY_KvarhP;
    private float   P_BY_KvarhG;
    private float   P_BY_HKvarhZ;
    private float   P_BY_HKvarhJ;
    private float   P_BY_HKvarhF;
    private float   P_BY_HKvarhP;
    private float   P_BY_HKvarhG;
    private float   P_SY_KwhZ;
    private float   P_SY_KwhJ;
    private float   P_SY_KwhF;
    private float   P_SY_KwhP;
    private float   P_SY_KwhG;
    private float   P_SY_HKwhZ;
    private float   P_SY_HKwhJ;
    private float   P_SY_HKwhF;
    private float   P_SY_HKwhP;
    private float   P_SY_HKwhG;
    private float   P_SY_KvarhZ;
    private float   P_SY_KvarhJ;
    private float   P_SY_KvarhF;
    private float   P_SY_KvarhP;
    private float   P_SY_KvarhG;
    private float   P_SY_HKvarhZ;
    private float   P_SY_HKvarhJ;
    private float   P_SY_HKvarhF;
    private float   P_SY_HKvarhP;
    private float   P_SY_HKvarhG;
    private float   P_SSY_KwhZ;
    private float   P_SSY_KwhJ;
    private float   P_SSY_KwhF;
    private float   P_SSY_KwhP;
    private float   P_SSY_KwhG;
    private float   P_SSY_HKwhZ;
    private float   P_SSY_HKwhJ;
    private float   P_SSY_HKwhF;
    private float   P_SSY_HKwhP;
    private float   P_SSY_HKwhG;
    private float   P_SSY_KvarhZ;
    private float   P_SSY_KvarhJ;
    private float   P_SSY_KvarhF;
    private float   P_SSY_KvarhP;
    private float   P_SSY_KvarhG;
    private float   P_SSY_HKvarhZ;
    private float   P_SSY_HKvarhJ;
    private float   P_SSY_HKvarhF;
    private float   P_SSY_HKvarhP;
    private float   P_SSY_HKvarhG;

    private float   P_ZXYGDN;
    private float   P_ZXWGDN;
    private float   P_FXYGDN;
    private float   P_FXWGDN;


    public PowerMeterAllValue() {
    }

    public PowerMeterAllValue(int p_CODE, String p_TIME, float p_A_DIANYA, float p_B_DIANYA, float p_C_DIANYA, float p_UAB_XIANDIANYA, float p_UBC_XIANDIANYA, float p_UCA_XIANDIANYA, float p_A_DIANLIU, float p_B_DIANLIU, float p_C_DIANLIU, float p_A_YGGL, float p_B_YGGL, float p_C_YGGL, float p_HXYGGL, float p_A_WGGL, float p_B_WGGL, float p_C_WGGL, float p_HXWGGL, float p_A_SZGL, float p_B_SZGL, float p_C_SZGL, float p_HXSZGL, float p_A_GLYS, float p_B_GLYS, float p_C_GLYS, float p_HXGLYS, float p_DWPL, float p_BY_KwhZ, float p_BY_KwhJ, float p_BY_KwhF, float p_BY_KwhP, float p_BY_KwhG, float p_BY_HKwhZ, float p_BY_HKwhJ, float p_BY_HKwhF, float p_BY_HKwhP, float p_BY_HKwhG, float p_BY_KvarhZ, float p_BY_KvarhJ, float p_BY_KvarhF, float p_BY_KvarhP, float p_BY_KvarhG, float p_BY_HKvarhZ, float p_BY_HKvarhJ, float p_BY_HKvarhF, float p_BY_HKvarhP, float p_BY_HKvarhG, float p_SY_KwhZ, float p_SY_KwhJ, float p_SY_KwhF, float p_SY_KwhP, float p_SY_KwhG, float p_SY_HKwhZ, float p_SY_HKwhJ, float p_SY_HKwhF, float p_SY_HKwhP, float p_SY_HKwhG, float p_SY_KvarhZ, float p_SY_KvarhJ, float p_SY_KvarhF, float p_SY_KvarhP, float p_SY_KvarhG, float p_SY_HKvarhZ, float p_SY_HKvarhJ, float p_SY_HKvarhF, float p_SY_HKvarhP, float p_SY_HKvarhG, float p_SSY_KwhZ, float p_SSY_KwhJ, float p_SSY_KwhF, float p_SSY_KwhP, float p_SSY_KwhG, float p_SSY_HKwhZ, float p_SSY_HKwhJ, float p_SSY_HKwhF, float p_SSY_HKwhP, float p_SSY_HKwhG, float p_SSY_KvarhZ, float p_SSY_KvarhJ, float p_SSY_KvarhF, float p_SSY_KvarhP, float p_SSY_KvarhG, float p_SSY_HKvarhZ, float p_SSY_HKvarhJ, float p_SSY_HKvarhF, float p_SSY_HKvarhP, float p_SSY_HKvarhG, float p_ZXYGDN, float p_ZXWGDN, float p_FXYGDN, float p_FXWGDN) {
        P_CODE = p_CODE;
        P_TIME = p_TIME;
        P_A_DIANYA = p_A_DIANYA;
        P_B_DIANYA = p_B_DIANYA;
        P_C_DIANYA = p_C_DIANYA;
        P_UAB_XIANDIANYA = p_UAB_XIANDIANYA;
        P_UBC_XIANDIANYA = p_UBC_XIANDIANYA;
        P_UCA_XIANDIANYA = p_UCA_XIANDIANYA;
        P_A_DIANLIU = p_A_DIANLIU;
        P_B_DIANLIU = p_B_DIANLIU;
        P_C_DIANLIU = p_C_DIANLIU;
        P_A_YGGL = p_A_YGGL;
        P_B_YGGL = p_B_YGGL;
        P_C_YGGL = p_C_YGGL;
        P_HXYGGL = p_HXYGGL;
        P_A_WGGL = p_A_WGGL;
        P_B_WGGL = p_B_WGGL;
        P_C_WGGL = p_C_WGGL;
        P_HXWGGL = p_HXWGGL;
        P_A_SZGL = p_A_SZGL;
        P_B_SZGL = p_B_SZGL;
        P_C_SZGL = p_C_SZGL;
        P_HXSZGL = p_HXSZGL;
        P_A_GLYS = p_A_GLYS;
        P_B_GLYS = p_B_GLYS;
        P_C_GLYS = p_C_GLYS;
        P_HXGLYS = p_HXGLYS;
        P_DWPL = p_DWPL;
        P_BY_KwhZ = p_BY_KwhZ;
        P_BY_KwhJ = p_BY_KwhJ;
        P_BY_KwhF = p_BY_KwhF;
        P_BY_KwhP = p_BY_KwhP;
        P_BY_KwhG = p_BY_KwhG;
        P_BY_HKwhZ = p_BY_HKwhZ;
        P_BY_HKwhJ = p_BY_HKwhJ;
        P_BY_HKwhF = p_BY_HKwhF;
        P_BY_HKwhP = p_BY_HKwhP;
        P_BY_HKwhG = p_BY_HKwhG;
        P_BY_KvarhZ = p_BY_KvarhZ;
        P_BY_KvarhJ = p_BY_KvarhJ;
        P_BY_KvarhF = p_BY_KvarhF;
        P_BY_KvarhP = p_BY_KvarhP;
        P_BY_KvarhG = p_BY_KvarhG;
        P_BY_HKvarhZ = p_BY_HKvarhZ;
        P_BY_HKvarhJ = p_BY_HKvarhJ;
        P_BY_HKvarhF = p_BY_HKvarhF;
        P_BY_HKvarhP = p_BY_HKvarhP;
        P_BY_HKvarhG = p_BY_HKvarhG;
        P_SY_KwhZ = p_SY_KwhZ;
        P_SY_KwhJ = p_SY_KwhJ;
        P_SY_KwhF = p_SY_KwhF;
        P_SY_KwhP = p_SY_KwhP;
        P_SY_KwhG = p_SY_KwhG;
        P_SY_HKwhZ = p_SY_HKwhZ;
        P_SY_HKwhJ = p_SY_HKwhJ;
        P_SY_HKwhF = p_SY_HKwhF;
        P_SY_HKwhP = p_SY_HKwhP;
        P_SY_HKwhG = p_SY_HKwhG;
        P_SY_KvarhZ = p_SY_KvarhZ;
        P_SY_KvarhJ = p_SY_KvarhJ;
        P_SY_KvarhF = p_SY_KvarhF;
        P_SY_KvarhP = p_SY_KvarhP;
        P_SY_KvarhG = p_SY_KvarhG;
        P_SY_HKvarhZ = p_SY_HKvarhZ;
        P_SY_HKvarhJ = p_SY_HKvarhJ;
        P_SY_HKvarhF = p_SY_HKvarhF;
        P_SY_HKvarhP = p_SY_HKvarhP;
        P_SY_HKvarhG = p_SY_HKvarhG;
        P_SSY_KwhZ = p_SSY_KwhZ;
        P_SSY_KwhJ = p_SSY_KwhJ;
        P_SSY_KwhF = p_SSY_KwhF;
        P_SSY_KwhP = p_SSY_KwhP;
        P_SSY_KwhG = p_SSY_KwhG;
        P_SSY_HKwhZ = p_SSY_HKwhZ;
        P_SSY_HKwhJ = p_SSY_HKwhJ;
        P_SSY_HKwhF = p_SSY_HKwhF;
        P_SSY_HKwhP = p_SSY_HKwhP;
        P_SSY_HKwhG = p_SSY_HKwhG;
        P_SSY_KvarhZ = p_SSY_KvarhZ;
        P_SSY_KvarhJ = p_SSY_KvarhJ;
        P_SSY_KvarhF = p_SSY_KvarhF;
        P_SSY_KvarhP = p_SSY_KvarhP;
        P_SSY_KvarhG = p_SSY_KvarhG;
        P_SSY_HKvarhZ = p_SSY_HKvarhZ;
        P_SSY_HKvarhJ = p_SSY_HKvarhJ;
        P_SSY_HKvarhF = p_SSY_HKvarhF;
        P_SSY_HKvarhP = p_SSY_HKvarhP;
        P_SSY_HKvarhG = p_SSY_HKvarhG;
        P_ZXYGDN = p_ZXYGDN;
        P_ZXWGDN = p_ZXWGDN;
        P_FXYGDN = p_FXYGDN;
        P_FXWGDN = p_FXWGDN;
    }

    @Override
    public String toString() {
        return "PowerMeterAllValue{" +
                "P_CODE=" + P_CODE +
                ", P_TIME='" + P_TIME + '\'' +
                ", P_A_DIANYA=" + P_A_DIANYA +
                ", P_B_DIANYA=" + P_B_DIANYA +
                ", P_C_DIANYA=" + P_C_DIANYA +
                ", P_UAB_XIANDIANYA=" + P_UAB_XIANDIANYA +
                ", P_UBC_XIANDIANYA=" + P_UBC_XIANDIANYA +
                ", P_UCA_XIANDIANYA=" + P_UCA_XIANDIANYA +
                ", P_A_DIANLIU=" + P_A_DIANLIU +
                ", P_B_DIANLIU=" + P_B_DIANLIU +
                ", P_C_DIANLIU=" + P_C_DIANLIU +
                ", P_A_YGGL=" + P_A_YGGL +
                ", P_B_YGGL=" + P_B_YGGL +
                ", P_C_YGGL=" + P_C_YGGL +
                ", P_HXYGGL=" + P_HXYGGL +
                ", P_A_WGGL=" + P_A_WGGL +
                ", P_B_WGGL=" + P_B_WGGL +
                ", P_C_WGGL=" + P_C_WGGL +
                ", P_HXWGGL=" + P_HXWGGL +
                ", P_A_SZGL=" + P_A_SZGL +
                ", P_B_SZGL=" + P_B_SZGL +
                ", P_C_SZGL=" + P_C_SZGL +
                ", P_HXSZGL=" + P_HXSZGL +
                ", P_A_GLYS=" + P_A_GLYS +
                ", P_B_GLYS=" + P_B_GLYS +
                ", P_C_GLYS=" + P_C_GLYS +
                ", P_HXGLYS=" + P_HXGLYS +
                ", P_DWPL=" + P_DWPL +
                ", P_BY_KwhZ=" + P_BY_KwhZ +
                ", P_BY_KwhJ=" + P_BY_KwhJ +
                ", P_BY_KwhF=" + P_BY_KwhF +
                ", P_BY_KwhP=" + P_BY_KwhP +
                ", P_BY_KwhG=" + P_BY_KwhG +
                ", P_BY_HKwhZ=" + P_BY_HKwhZ +
                ", P_BY_HKwhJ=" + P_BY_HKwhJ +
                ", P_BY_HKwhF=" + P_BY_HKwhF +
                ", P_BY_HKwhP=" + P_BY_HKwhP +
                ", P_BY_HKwhG=" + P_BY_HKwhG +
                ", P_BY_KvarhZ=" + P_BY_KvarhZ +
                ", P_BY_KvarhJ=" + P_BY_KvarhJ +
                ", P_BY_KvarhF=" + P_BY_KvarhF +
                ", P_BY_KvarhP=" + P_BY_KvarhP +
                ", P_BY_KvarhG=" + P_BY_KvarhG +
                ", P_BY_HKvarhZ=" + P_BY_HKvarhZ +
                ", P_BY_HKvarhJ=" + P_BY_HKvarhJ +
                ", P_BY_HKvarhF=" + P_BY_HKvarhF +
                ", P_BY_HKvarhP=" + P_BY_HKvarhP +
                ", P_BY_HKvarhG=" + P_BY_HKvarhG +
                ", P_SY_KwhZ=" + P_SY_KwhZ +
                ", P_SY_KwhJ=" + P_SY_KwhJ +
                ", P_SY_KwhF=" + P_SY_KwhF +
                ", P_SY_KwhP=" + P_SY_KwhP +
                ", P_SY_KwhG=" + P_SY_KwhG +
                ", P_SY_HKwhZ=" + P_SY_HKwhZ +
                ", P_SY_HKwhJ=" + P_SY_HKwhJ +
                ", P_SY_HKwhF=" + P_SY_HKwhF +
                ", P_SY_HKwhP=" + P_SY_HKwhP +
                ", P_SY_HKwhG=" + P_SY_HKwhG +
                ", P_SY_KvarhZ=" + P_SY_KvarhZ +
                ", P_SY_KvarhJ=" + P_SY_KvarhJ +
                ", P_SY_KvarhF=" + P_SY_KvarhF +
                ", P_SY_KvarhP=" + P_SY_KvarhP +
                ", P_SY_KvarhG=" + P_SY_KvarhG +
                ", P_SY_HKvarhZ=" + P_SY_HKvarhZ +
                ", P_SY_HKvarhJ=" + P_SY_HKvarhJ +
                ", P_SY_HKvarhF=" + P_SY_HKvarhF +
                ", P_SY_HKvarhP=" + P_SY_HKvarhP +
                ", P_SY_HKvarhG=" + P_SY_HKvarhG +
                ", P_SSY_KwhZ=" + P_SSY_KwhZ +
                ", P_SSY_KwhJ=" + P_SSY_KwhJ +
                ", P_SSY_KwhF=" + P_SSY_KwhF +
                ", P_SSY_KwhP=" + P_SSY_KwhP +
                ", P_SSY_KwhG=" + P_SSY_KwhG +
                ", P_SSY_HKwhZ=" + P_SSY_HKwhZ +
                ", P_SSY_HKwhJ=" + P_SSY_HKwhJ +
                ", P_SSY_HKwhF=" + P_SSY_HKwhF +
                ", P_SSY_HKwhP=" + P_SSY_HKwhP +
                ", P_SSY_HKwhG=" + P_SSY_HKwhG +
                ", P_SSY_KvarhZ=" + P_SSY_KvarhZ +
                ", P_SSY_KvarhJ=" + P_SSY_KvarhJ +
                ", P_SSY_KvarhF=" + P_SSY_KvarhF +
                ", P_SSY_KvarhP=" + P_SSY_KvarhP +
                ", P_SSY_KvarhG=" + P_SSY_KvarhG +
                ", P_SSY_HKvarhZ=" + P_SSY_HKvarhZ +
                ", P_SSY_HKvarhJ=" + P_SSY_HKvarhJ +
                ", P_SSY_HKvarhF=" + P_SSY_HKvarhF +
                ", P_SSY_HKvarhP=" + P_SSY_HKvarhP +
                ", P_SSY_HKvarhG=" + P_SSY_HKvarhG +
                ", P_ZXYGDN=" + P_ZXYGDN +
                ", P_ZXWGDN=" + P_ZXWGDN +
                ", P_FXYGDN=" + P_FXYGDN +
                ", P_FXWGDN=" + P_FXWGDN +
                '}';
    }


    public int getP_CODE() {
        return P_CODE;
    }

    public void setP_CODE(int p_CODE) {
        P_CODE = p_CODE;
    }

    public String getP_TIME() {
        return P_TIME;
    }

    public void setP_TIME(String p_TIME) {
        P_TIME = p_TIME;
    }

    public float getP_A_DIANYA() {
        return P_A_DIANYA;
    }

    public void setP_A_DIANYA(float p_A_DIANYA) {
        P_A_DIANYA = p_A_DIANYA;
    }

    public float getP_B_DIANYA() {
        return P_B_DIANYA;
    }

    public void setP_B_DIANYA(float p_B_DIANYA) {
        P_B_DIANYA = p_B_DIANYA;
    }

    public float getP_C_DIANYA() {
        return P_C_DIANYA;
    }

    public void setP_C_DIANYA(float p_C_DIANYA) {
        P_C_DIANYA = p_C_DIANYA;
    }

    public float getP_UAB_XIANDIANYA() {
        return P_UAB_XIANDIANYA;
    }

    public void setP_UAB_XIANDIANYA(float p_UAB_XIANDIANYA) {
        P_UAB_XIANDIANYA = p_UAB_XIANDIANYA;
    }

    public float getP_UBC_XIANDIANYA() {
        return P_UBC_XIANDIANYA;
    }

    public void setP_UBC_XIANDIANYA(float p_UBC_XIANDIANYA) {
        P_UBC_XIANDIANYA = p_UBC_XIANDIANYA;
    }

    public float getP_UCA_XIANDIANYA() {
        return P_UCA_XIANDIANYA;
    }

    public void setP_UCA_XIANDIANYA(float p_UCA_XIANDIANYA) {
        P_UCA_XIANDIANYA = p_UCA_XIANDIANYA;
    }

    public float getP_A_DIANLIU() {
        return P_A_DIANLIU;
    }

    public void setP_A_DIANLIU(float p_A_DIANLIU) {
        P_A_DIANLIU = p_A_DIANLIU;
    }

    public float getP_B_DIANLIU() {
        return P_B_DIANLIU;
    }

    public void setP_B_DIANLIU(float p_B_DIANLIU) {
        P_B_DIANLIU = p_B_DIANLIU;
    }

    public float getP_C_DIANLIU() {
        return P_C_DIANLIU;
    }

    public void setP_C_DIANLIU(float p_C_DIANLIU) {
        P_C_DIANLIU = p_C_DIANLIU;
    }

    public float getP_A_YGGL() {
        return P_A_YGGL;
    }

    public void setP_A_YGGL(float p_A_YGGL) {
        P_A_YGGL = p_A_YGGL;
    }

    public float getP_B_YGGL() {
        return P_B_YGGL;
    }

    public void setP_B_YGGL(float p_B_YGGL) {
        P_B_YGGL = p_B_YGGL;
    }

    public float getP_C_YGGL() {
        return P_C_YGGL;
    }

    public void setP_C_YGGL(float p_C_YGGL) {
        P_C_YGGL = p_C_YGGL;
    }

    public float getP_HXYGGL() {
        return P_HXYGGL;
    }

    public void setP_HXYGGL(float p_HXYGGL) {
        P_HXYGGL = p_HXYGGL;
    }

    public float getP_A_WGGL() {
        return P_A_WGGL;
    }

    public void setP_A_WGGL(float p_A_WGGL) {
        P_A_WGGL = p_A_WGGL;
    }

    public float getP_B_WGGL() {
        return P_B_WGGL;
    }

    public void setP_B_WGGL(float p_B_WGGL) {
        P_B_WGGL = p_B_WGGL;
    }

    public float getP_C_WGGL() {
        return P_C_WGGL;
    }

    public void setP_C_WGGL(float p_C_WGGL) {
        P_C_WGGL = p_C_WGGL;
    }

    public float getP_HXWGGL() {
        return P_HXWGGL;
    }

    public void setP_HXWGGL(float p_HXWGGL) {
        P_HXWGGL = p_HXWGGL;
    }

    public float getP_A_SZGL() {
        return P_A_SZGL;
    }

    public void setP_A_SZGL(float p_A_SZGL) {
        P_A_SZGL = p_A_SZGL;
    }

    public float getP_B_SZGL() {
        return P_B_SZGL;
    }

    public void setP_B_SZGL(float p_B_SZGL) {
        P_B_SZGL = p_B_SZGL;
    }

    public float getP_C_SZGL() {
        return P_C_SZGL;
    }

    public void setP_C_SZGL(float p_C_SZGL) {
        P_C_SZGL = p_C_SZGL;
    }

    public float getP_HXSZGL() {
        return P_HXSZGL;
    }

    public void setP_HXSZGL(float p_HXSZGL) {
        P_HXSZGL = p_HXSZGL;
    }

    public float getP_A_GLYS() {
        return P_A_GLYS;
    }

    public void setP_A_GLYS(float p_A_GLYS) {
        P_A_GLYS = p_A_GLYS;
    }

    public float getP_B_GLYS() {
        return P_B_GLYS;
    }

    public void setP_B_GLYS(float p_B_GLYS) {
        P_B_GLYS = p_B_GLYS;
    }

    public float getP_C_GLYS() {
        return P_C_GLYS;
    }

    public void setP_C_GLYS(float p_C_GLYS) {
        P_C_GLYS = p_C_GLYS;
    }

    public float getP_HXGLYS() {
        return P_HXGLYS;
    }

    public void setP_HXGLYS(float p_HXGLYS) {
        P_HXGLYS = p_HXGLYS;
    }

    public float getP_DWPL() {
        return P_DWPL;
    }

    public void setP_DWPL(float p_DWPL) {
        P_DWPL = p_DWPL;
    }

    public float getP_BY_KwhZ() {
        return P_BY_KwhZ;
    }

    public void setP_BY_KwhZ(float p_BY_KwhZ) {
        P_BY_KwhZ = p_BY_KwhZ;
    }

    public float getP_BY_KwhJ() {
        return P_BY_KwhJ;
    }

    public void setP_BY_KwhJ(float p_BY_KwhJ) {
        P_BY_KwhJ = p_BY_KwhJ;
    }

    public float getP_BY_KwhF() {
        return P_BY_KwhF;
    }

    public void setP_BY_KwhF(float p_BY_KwhF) {
        P_BY_KwhF = p_BY_KwhF;
    }

    public float getP_BY_KwhP() {
        return P_BY_KwhP;
    }

    public void setP_BY_KwhP(float p_BY_KwhP) {
        P_BY_KwhP = p_BY_KwhP;
    }

    public float getP_BY_KwhG() {
        return P_BY_KwhG;
    }

    public void setP_BY_KwhG(float p_BY_KwhG) {
        P_BY_KwhG = p_BY_KwhG;
    }

    public float getP_BY_HKwhZ() {
        return P_BY_HKwhZ;
    }

    public void setP_BY_HKwhZ(float p_BY_HKwhZ) {
        P_BY_HKwhZ = p_BY_HKwhZ;
    }

    public float getP_BY_HKwhJ() {
        return P_BY_HKwhJ;
    }

    public void setP_BY_HKwhJ(float p_BY_HKwhJ) {
        P_BY_HKwhJ = p_BY_HKwhJ;
    }

    public float getP_BY_HKwhF() {
        return P_BY_HKwhF;
    }

    public void setP_BY_HKwhF(float p_BY_HKwhF) {
        P_BY_HKwhF = p_BY_HKwhF;
    }

    public float getP_BY_HKwhP() {
        return P_BY_HKwhP;
    }

    public void setP_BY_HKwhP(float p_BY_HKwhP) {
        P_BY_HKwhP = p_BY_HKwhP;
    }

    public float getP_BY_HKwhG() {
        return P_BY_HKwhG;
    }

    public void setP_BY_HKwhG(float p_BY_HKwhG) {
        P_BY_HKwhG = p_BY_HKwhG;
    }

    public float getP_BY_KvarhZ() {
        return P_BY_KvarhZ;
    }

    public void setP_BY_KvarhZ(float p_BY_KvarhZ) {
        P_BY_KvarhZ = p_BY_KvarhZ;
    }

    public float getP_BY_KvarhJ() {
        return P_BY_KvarhJ;
    }

    public void setP_BY_KvarhJ(float p_BY_KvarhJ) {
        P_BY_KvarhJ = p_BY_KvarhJ;
    }

    public float getP_BY_KvarhF() {
        return P_BY_KvarhF;
    }

    public void setP_BY_KvarhF(float p_BY_KvarhF) {
        P_BY_KvarhF = p_BY_KvarhF;
    }

    public float getP_BY_KvarhP() {
        return P_BY_KvarhP;
    }

    public void setP_BY_KvarhP(float p_BY_KvarhP) {
        P_BY_KvarhP = p_BY_KvarhP;
    }

    public float getP_BY_KvarhG() {
        return P_BY_KvarhG;
    }

    public void setP_BY_KvarhG(float p_BY_KvarhG) {
        P_BY_KvarhG = p_BY_KvarhG;
    }

    public float getP_BY_HKvarhZ() {
        return P_BY_HKvarhZ;
    }

    public void setP_BY_HKvarhZ(float p_BY_HKvarhZ) {
        P_BY_HKvarhZ = p_BY_HKvarhZ;
    }

    public float getP_BY_HKvarhJ() {
        return P_BY_HKvarhJ;
    }

    public void setP_BY_HKvarhJ(float p_BY_HKvarhJ) {
        P_BY_HKvarhJ = p_BY_HKvarhJ;
    }

    public float getP_BY_HKvarhF() {
        return P_BY_HKvarhF;
    }

    public void setP_BY_HKvarhF(float p_BY_HKvarhF) {
        P_BY_HKvarhF = p_BY_HKvarhF;
    }

    public float getP_BY_HKvarhP() {
        return P_BY_HKvarhP;
    }

    public void setP_BY_HKvarhP(float p_BY_HKvarhP) {
        P_BY_HKvarhP = p_BY_HKvarhP;
    }

    public float getP_BY_HKvarhG() {
        return P_BY_HKvarhG;
    }

    public void setP_BY_HKvarhG(float p_BY_HKvarhG) {
        P_BY_HKvarhG = p_BY_HKvarhG;
    }

    public float getP_SY_KwhZ() {
        return P_SY_KwhZ;
    }

    public void setP_SY_KwhZ(float p_SY_KwhZ) {
        P_SY_KwhZ = p_SY_KwhZ;
    }

    public float getP_SY_KwhJ() {
        return P_SY_KwhJ;
    }

    public void setP_SY_KwhJ(float p_SY_KwhJ) {
        P_SY_KwhJ = p_SY_KwhJ;
    }

    public float getP_SY_KwhF() {
        return P_SY_KwhF;
    }

    public void setP_SY_KwhF(float p_SY_KwhF) {
        P_SY_KwhF = p_SY_KwhF;
    }

    public float getP_SY_KwhP() {
        return P_SY_KwhP;
    }

    public void setP_SY_KwhP(float p_SY_KwhP) {
        P_SY_KwhP = p_SY_KwhP;
    }

    public float getP_SY_KwhG() {
        return P_SY_KwhG;
    }

    public void setP_SY_KwhG(float p_SY_KwhG) {
        P_SY_KwhG = p_SY_KwhG;
    }

    public float getP_SY_HKwhZ() {
        return P_SY_HKwhZ;
    }

    public void setP_SY_HKwhZ(float p_SY_HKwhZ) {
        P_SY_HKwhZ = p_SY_HKwhZ;
    }

    public float getP_SY_HKwhJ() {
        return P_SY_HKwhJ;
    }

    public void setP_SY_HKwhJ(float p_SY_HKwhJ) {
        P_SY_HKwhJ = p_SY_HKwhJ;
    }

    public float getP_SY_HKwhF() {
        return P_SY_HKwhF;
    }

    public void setP_SY_HKwhF(float p_SY_HKwhF) {
        P_SY_HKwhF = p_SY_HKwhF;
    }

    public float getP_SY_HKwhP() {
        return P_SY_HKwhP;
    }

    public void setP_SY_HKwhP(float p_SY_HKwhP) {
        P_SY_HKwhP = p_SY_HKwhP;
    }

    public float getP_SY_HKwhG() {
        return P_SY_HKwhG;
    }

    public void setP_SY_HKwhG(float p_SY_HKwhG) {
        P_SY_HKwhG = p_SY_HKwhG;
    }

    public float getP_SY_KvarhZ() {
        return P_SY_KvarhZ;
    }

    public void setP_SY_KvarhZ(float p_SY_KvarhZ) {
        P_SY_KvarhZ = p_SY_KvarhZ;
    }

    public float getP_SY_KvarhJ() {
        return P_SY_KvarhJ;
    }

    public void setP_SY_KvarhJ(float p_SY_KvarhJ) {
        P_SY_KvarhJ = p_SY_KvarhJ;
    }

    public float getP_SY_KvarhF() {
        return P_SY_KvarhF;
    }

    public void setP_SY_KvarhF(float p_SY_KvarhF) {
        P_SY_KvarhF = p_SY_KvarhF;
    }

    public float getP_SY_KvarhP() {
        return P_SY_KvarhP;
    }

    public void setP_SY_KvarhP(float p_SY_KvarhP) {
        P_SY_KvarhP = p_SY_KvarhP;
    }

    public float getP_SY_KvarhG() {
        return P_SY_KvarhG;
    }

    public void setP_SY_KvarhG(float p_SY_KvarhG) {
        P_SY_KvarhG = p_SY_KvarhG;
    }

    public float getP_SY_HKvarhZ() {
        return P_SY_HKvarhZ;
    }

    public void setP_SY_HKvarhZ(float p_SY_HKvarhZ) {
        P_SY_HKvarhZ = p_SY_HKvarhZ;
    }

    public float getP_SY_HKvarhJ() {
        return P_SY_HKvarhJ;
    }

    public void setP_SY_HKvarhJ(float p_SY_HKvarhJ) {
        P_SY_HKvarhJ = p_SY_HKvarhJ;
    }

    public float getP_SY_HKvarhF() {
        return P_SY_HKvarhF;
    }

    public void setP_SY_HKvarhF(float p_SY_HKvarhF) {
        P_SY_HKvarhF = p_SY_HKvarhF;
    }

    public float getP_SY_HKvarhP() {
        return P_SY_HKvarhP;
    }

    public void setP_SY_HKvarhP(float p_SY_HKvarhP) {
        P_SY_HKvarhP = p_SY_HKvarhP;
    }

    public float getP_SY_HKvarhG() {
        return P_SY_HKvarhG;
    }

    public void setP_SY_HKvarhG(float p_SY_HKvarhG) {
        P_SY_HKvarhG = p_SY_HKvarhG;
    }

    public float getP_SSY_KwhZ() {
        return P_SSY_KwhZ;
    }

    public void setP_SSY_KwhZ(float p_SSY_KwhZ) {
        P_SSY_KwhZ = p_SSY_KwhZ;
    }

    public float getP_SSY_KwhJ() {
        return P_SSY_KwhJ;
    }

    public void setP_SSY_KwhJ(float p_SSY_KwhJ) {
        P_SSY_KwhJ = p_SSY_KwhJ;
    }

    public float getP_SSY_KwhF() {
        return P_SSY_KwhF;
    }

    public void setP_SSY_KwhF(float p_SSY_KwhF) {
        P_SSY_KwhF = p_SSY_KwhF;
    }

    public float getP_SSY_KwhP() {
        return P_SSY_KwhP;
    }

    public void setP_SSY_KwhP(float p_SSY_KwhP) {
        P_SSY_KwhP = p_SSY_KwhP;
    }

    public float getP_SSY_KwhG() {
        return P_SSY_KwhG;
    }

    public void setP_SSY_KwhG(float p_SSY_KwhG) {
        P_SSY_KwhG = p_SSY_KwhG;
    }

    public float getP_SSY_HKwhZ() {
        return P_SSY_HKwhZ;
    }

    public void setP_SSY_HKwhZ(float p_SSY_HKwhZ) {
        P_SSY_HKwhZ = p_SSY_HKwhZ;
    }

    public float getP_SSY_HKwhJ() {
        return P_SSY_HKwhJ;
    }

    public void setP_SSY_HKwhJ(float p_SSY_HKwhJ) {
        P_SSY_HKwhJ = p_SSY_HKwhJ;
    }

    public float getP_SSY_HKwhF() {
        return P_SSY_HKwhF;
    }

    public void setP_SSY_HKwhF(float p_SSY_HKwhF) {
        P_SSY_HKwhF = p_SSY_HKwhF;
    }

    public float getP_SSY_HKwhP() {
        return P_SSY_HKwhP;
    }

    public void setP_SSY_HKwhP(float p_SSY_HKwhP) {
        P_SSY_HKwhP = p_SSY_HKwhP;
    }

    public float getP_SSY_HKwhG() {
        return P_SSY_HKwhG;
    }

    public void setP_SSY_HKwhG(float p_SSY_HKwhG) {
        P_SSY_HKwhG = p_SSY_HKwhG;
    }

    public float getP_SSY_KvarhZ() {
        return P_SSY_KvarhZ;
    }

    public void setP_SSY_KvarhZ(float p_SSY_KvarhZ) {
        P_SSY_KvarhZ = p_SSY_KvarhZ;
    }

    public float getP_SSY_KvarhJ() {
        return P_SSY_KvarhJ;
    }

    public void setP_SSY_KvarhJ(float p_SSY_KvarhJ) {
        P_SSY_KvarhJ = p_SSY_KvarhJ;
    }

    public float getP_SSY_KvarhF() {
        return P_SSY_KvarhF;
    }

    public void setP_SSY_KvarhF(float p_SSY_KvarhF) {
        P_SSY_KvarhF = p_SSY_KvarhF;
    }

    public float getP_SSY_KvarhP() {
        return P_SSY_KvarhP;
    }

    public void setP_SSY_KvarhP(float p_SSY_KvarhP) {
        P_SSY_KvarhP = p_SSY_KvarhP;
    }

    public float getP_SSY_KvarhG() {
        return P_SSY_KvarhG;
    }

    public void setP_SSY_KvarhG(float p_SSY_KvarhG) {
        P_SSY_KvarhG = p_SSY_KvarhG;
    }

    public float getP_SSY_HKvarhZ() {
        return P_SSY_HKvarhZ;
    }

    public void setP_SSY_HKvarhZ(float p_SSY_HKvarhZ) {
        P_SSY_HKvarhZ = p_SSY_HKvarhZ;
    }

    public float getP_SSY_HKvarhJ() {
        return P_SSY_HKvarhJ;
    }

    public void setP_SSY_HKvarhJ(float p_SSY_HKvarhJ) {
        P_SSY_HKvarhJ = p_SSY_HKvarhJ;
    }

    public float getP_SSY_HKvarhF() {
        return P_SSY_HKvarhF;
    }

    public void setP_SSY_HKvarhF(float p_SSY_HKvarhF) {
        P_SSY_HKvarhF = p_SSY_HKvarhF;
    }

    public float getP_SSY_HKvarhP() {
        return P_SSY_HKvarhP;
    }

    public void setP_SSY_HKvarhP(float p_SSY_HKvarhP) {
        P_SSY_HKvarhP = p_SSY_HKvarhP;
    }

    public float getP_SSY_HKvarhG() {
        return P_SSY_HKvarhG;
    }

    public void setP_SSY_HKvarhG(float p_SSY_HKvarhG) {
        P_SSY_HKvarhG = p_SSY_HKvarhG;
    }

    public float getP_ZXYGDN() {
        return P_ZXYGDN;
    }

    public void setP_ZXYGDN(float p_ZXYGDN) {
        P_ZXYGDN = p_ZXYGDN;
    }

    public float getP_ZXWGDN() {
        return P_ZXWGDN;
    }

    public void setP_ZXWGDN(float p_ZXWGDN) {
        P_ZXWGDN = p_ZXWGDN;
    }

    public float getP_FXYGDN() {
        return P_FXYGDN;
    }

    public void setP_FXYGDN(float p_FXYGDN) {
        P_FXYGDN = p_FXYGDN;
    }

    public float getP_FXWGDN() {
        return P_FXWGDN;
    }

    public void setP_FXWGDN(float p_FXWGDN) {
        P_FXWGDN = p_FXWGDN;
    }
}
