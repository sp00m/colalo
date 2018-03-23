package com.github.sp00m.colalo;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import static java.lang.String.format;
import static java.util.Arrays.stream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toMap;

// http://www.oracle.com/technetwork/java/javase/java8locales-2095355.html
// in_ID --> id_ID
// iw_IL --> he_IL
public enum Locale {

    AR_AE(Language.Alpha2.AR, Country.Alpha2.AE),
    AR_BH(Language.Alpha2.AR, Country.Alpha2.BH),
    AR_DZ(Language.Alpha2.AR, Country.Alpha2.DZ),
    AR_EG(Language.Alpha2.AR, Country.Alpha2.EG),
    AR_IQ(Language.Alpha2.AR, Country.Alpha2.IQ),
    AR_JO(Language.Alpha2.AR, Country.Alpha2.JO),
    AR_KW(Language.Alpha2.AR, Country.Alpha2.KW),
    AR_LB(Language.Alpha2.AR, Country.Alpha2.LB),
    AR_LY(Language.Alpha2.AR, Country.Alpha2.LY),
    AR_MA(Language.Alpha2.AR, Country.Alpha2.MA),
    AR_OM(Language.Alpha2.AR, Country.Alpha2.OM),
    AR_QA(Language.Alpha2.AR, Country.Alpha2.QA),
    AR_SA(Language.Alpha2.AR, Country.Alpha2.SA),
    AR_SD(Language.Alpha2.AR, Country.Alpha2.SD),
    AR_SY(Language.Alpha2.AR, Country.Alpha2.SY),
    AR_TN(Language.Alpha2.AR, Country.Alpha2.TN),
    AR_YE(Language.Alpha2.AR, Country.Alpha2.YE),
    BE_BY(Language.Alpha2.BE, Country.Alpha2.BY),
    BG_BG(Language.Alpha2.BG, Country.Alpha2.BG),
    CA_ES(Language.Alpha2.CA, Country.Alpha2.ES),
    CS_CZ(Language.Alpha2.CS, Country.Alpha2.CZ),
    DA_DK(Language.Alpha2.DA, Country.Alpha2.DK),
    DE_AT(Language.Alpha2.DE, Country.Alpha2.AT),
    DE_CH(Language.Alpha2.DE, Country.Alpha2.CH),
    DE_DE(Language.Alpha2.DE, Country.Alpha2.DE),
    DE_LU(Language.Alpha2.DE, Country.Alpha2.LU),
    EL_CY(Language.Alpha2.EL, Country.Alpha2.CY),
    EL_GR(Language.Alpha2.EL, Country.Alpha2.GR),
    EN_AU(Language.Alpha2.EN, Country.Alpha2.AU),
    EN_CA(Language.Alpha2.EN, Country.Alpha2.CA),
    EN_GB(Language.Alpha2.EN, Country.Alpha2.GB),
    EN_IE(Language.Alpha2.EN, Country.Alpha2.IE),
    EN_IN(Language.Alpha2.EN, Country.Alpha2.IN),
    EN_MT(Language.Alpha2.EN, Country.Alpha2.MT),
    EN_NZ(Language.Alpha2.EN, Country.Alpha2.NZ),
    EN_PH(Language.Alpha2.EN, Country.Alpha2.PH),
    EN_SG(Language.Alpha2.EN, Country.Alpha2.SG),
    EN_US(Language.Alpha2.EN, Country.Alpha2.US),
    EN_ZA(Language.Alpha2.EN, Country.Alpha2.ZA),
    ES_AR(Language.Alpha2.ES, Country.Alpha2.AR),
    ES_BO(Language.Alpha2.ES, Country.Alpha2.BO),
    ES_CL(Language.Alpha2.ES, Country.Alpha2.CL),
    ES_CO(Language.Alpha2.ES, Country.Alpha2.CO),
    ES_CR(Language.Alpha2.ES, Country.Alpha2.CR),
    ES_DO(Language.Alpha2.ES, Country.Alpha2.DO),
    ES_EC(Language.Alpha2.ES, Country.Alpha2.EC),
    ES_ES(Language.Alpha2.ES, Country.Alpha2.ES),
    ES_GT(Language.Alpha2.ES, Country.Alpha2.GT),
    ES_HN(Language.Alpha2.ES, Country.Alpha2.HN),
    ES_MX(Language.Alpha2.ES, Country.Alpha2.MX),
    ES_NI(Language.Alpha2.ES, Country.Alpha2.NI),
    ES_PA(Language.Alpha2.ES, Country.Alpha2.PA),
    ES_PE(Language.Alpha2.ES, Country.Alpha2.PE),
    ES_PR(Language.Alpha2.ES, Country.Alpha2.PR),
    ES_PY(Language.Alpha2.ES, Country.Alpha2.PY),
    ES_SV(Language.Alpha2.ES, Country.Alpha2.SV),
    ES_US(Language.Alpha2.ES, Country.Alpha2.US),
    ES_UY(Language.Alpha2.ES, Country.Alpha2.UY),
    ES_VE(Language.Alpha2.ES, Country.Alpha2.VE),
    ET_EE(Language.Alpha2.ET, Country.Alpha2.EE),
    FI_FI(Language.Alpha2.FI, Country.Alpha2.FI),
    FR_BE(Language.Alpha2.FR, Country.Alpha2.BE),
    FR_CA(Language.Alpha2.FR, Country.Alpha2.CA),
    FR_CH(Language.Alpha2.FR, Country.Alpha2.CH),
    FR_FR(Language.Alpha2.FR, Country.Alpha2.FR),
    FR_LU(Language.Alpha2.FR, Country.Alpha2.LU),
    GA_IE(Language.Alpha2.GA, Country.Alpha2.IE),
    HI_IN(Language.Alpha2.HI, Country.Alpha2.IN),
    HR_HR(Language.Alpha2.HR, Country.Alpha2.HR),
    HU_HU(Language.Alpha2.HU, Country.Alpha2.HU),
    ID_ID(Language.Alpha2.ID, Country.Alpha2.ID),
    IS_IS(Language.Alpha2.IS, Country.Alpha2.IS),
    IT_CH(Language.Alpha2.IT, Country.Alpha2.CH),
    IT_IT(Language.Alpha2.IT, Country.Alpha2.IT),
    HE_IL(Language.Alpha2.HE, Country.Alpha2.IL),
    JA_JP(Language.Alpha2.JA, Country.Alpha2.JP),
    KO_KR(Language.Alpha2.KO, Country.Alpha2.KR),
    LT_LT(Language.Alpha2.LT, Country.Alpha2.LT),
    LV_LV(Language.Alpha2.LV, Country.Alpha2.LV),
    MK_MK(Language.Alpha2.MK, Country.Alpha2.MK),
    MS_MY(Language.Alpha2.MS, Country.Alpha2.MY),
    MT_MT(Language.Alpha2.MT, Country.Alpha2.MT),
    NB_NO(Language.Alpha2.NB, Country.Alpha2.NO),
    NL_BE(Language.Alpha2.NL, Country.Alpha2.BE),
    NL_NL(Language.Alpha2.NL, Country.Alpha2.NL),
    NN_NO(Language.Alpha2.NN, Country.Alpha2.NO),
    NO_NO(Language.Alpha2.NO, Country.Alpha2.NO),
    PL_PL(Language.Alpha2.PL, Country.Alpha2.PL),
    PT_BR(Language.Alpha2.PT, Country.Alpha2.BR),
    PT_PT(Language.Alpha2.PT, Country.Alpha2.PT),
    RO_RO(Language.Alpha2.RO, Country.Alpha2.RO),
    RU_RU(Language.Alpha2.RU, Country.Alpha2.RU),
    SK_SK(Language.Alpha2.SK, Country.Alpha2.SK),
    SL_SI(Language.Alpha2.SL, Country.Alpha2.SI),
    SQ_AL(Language.Alpha2.SQ, Country.Alpha2.AL),
    SR_BA(Language.Alpha2.SR, Country.Alpha2.BA),
    SR_ME(Language.Alpha2.SR, Country.Alpha2.ME),
    SR_RS(Language.Alpha2.SR, Country.Alpha2.RS),
    SV_SE(Language.Alpha2.SV, Country.Alpha2.SE),
    TH_TH(Language.Alpha2.TH, Country.Alpha2.TH),
    TR_TR(Language.Alpha2.TR, Country.Alpha2.TR),
    UK_UA(Language.Alpha2.UK, Country.Alpha2.UA),
    VI_VN(Language.Alpha2.VI, Country.Alpha2.VN),
    ZH_CN(Language.Alpha2.ZH, Country.Alpha2.CN),
    ZH_HK(Language.Alpha2.ZH, Country.Alpha2.HK),
    ZH_SG(Language.Alpha2.ZH, Country.Alpha2.SG),
    ZH_TW(Language.Alpha2.ZH, Country.Alpha2.TW);

    private static final String CODE_FORMAT = "%s_%s";

    private static final Map<String, Locale> BY_CODE = stream(values())
            .collect(collectingAndThen(toMap(locale -> locale.getCode().toUpperCase(), identity()), Collections::unmodifiableMap));

    private final String code;

    private final Language.Alpha2 languageAlpha2;

    private final Country.Alpha2 countryAlpha2;

    Locale(Language.Alpha2 languageAlpha2, Country.Alpha2 countryAlpha2) {
        this.code = format(CODE_FORMAT, languageAlpha2.getCode(), countryAlpha2.getCode());
        this.languageAlpha2 = languageAlpha2;
        this.countryAlpha2 = countryAlpha2;
    }

    public final String getCode() {
        return code;
    }

    public final Language.Alpha2 getLanguageAlpha2() {
        return languageAlpha2;
    }

    public final Country.Alpha2 getCountryAlpha2() {
        return countryAlpha2;
    }

    public static Optional<Locale> getByCode(String code) {
        return Optional.ofNullable(BY_CODE.get(code.toUpperCase()));
    }

    public static Optional<Locale> getByCode(Language.Alpha2 languageAlpha2, Country.Alpha2 countryAlpha2) {
        return getByCode(format(CODE_FORMAT, languageAlpha2.getCode(), countryAlpha2.getCode()));
    }

}
