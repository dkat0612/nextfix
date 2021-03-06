package kz.kase.fix;

public interface FixProtocol {

    String MESSAGE_HEARTBEAT = "0";
    String MESSAGE_TEST_REQUEST = "1";
    String MESSAGE_RESEND_REQUEST = "2";
    String MESSAGE_REJECT = "3";
    String MESSAGE_SEQUENCE_RESET = "4";
    String MESSAGE_LOGOUT = "5";
    String MESSAGE_EXEC_REPORT = "8";
    String MESSAGE_LOGON = "A";
    String MESSAGE_EMAIL = "C";
    String MESSAGE_USER_REQUEST = "BE";
    String MESSAGE_USER_RESP = "BF";

    String MESSAGE_ORDER_CANCEL_REPLACE_REQUEST = "G";
    String MESSAGE_POS_REQUEST = "AL";
    String MESSAGE_TRADE_CAPT_REP_REQ = "AD";
    String MESSAGE_POS_REPORT = "AP";
    String MESSAGE_ARC_POS_REQUEST = "ACP";
    String MESSAGE_DAY_POS_REPORT = "DP";
    String MESSAGE_POS_TRANSFER_INSTRUCTION = "DL";
    String MESSAGE_POS_TRANSFER_REPORT = "DN";
    String MESSAGE_NEW_ORDER_SINGLE = "D";
    String MESSAGE_ORDER_CANCEL_REQUEST = "F";
    String MESSAGE_BUSINESS_MESSAGE_REJECT = "j";
    String MESSAGE_SEC_LIST_REQUEST = "x";
    String MESSAGE_SEC_LIST = "y";
    String MESSAGE_SEC_STAT = "f";
    String MESSAGE_MARKET_DATA_REQUEST = "V";
    String MESSAGE_MARKET_DATA_REQUEST_REJECT = "Y";
    String MESSAGE_MD_INC_REFRESH = "X";
    String MESSAGE_MD_FULL_REFRESH = "W";
    String MESSAGE_CHART_LIST = "CL";
    String MESSAGE_CHART_LIST_REQUEST = "CR";
    String MESSAGE_MM_LIABILITY_REQUEST = "MR";
    String MESSAGE_MM_STAT_REQUEST = "MT";
    String MESSAGE_MM_LIABILITY = "ML";
    String MESSAGE_MM_STAT = "MS";
    String MESSAGE_INDICATIVE_QUOTE = "IQ";
    String MESSAGE_INDICATIVE_QUOTE_REQUEST = "IQR";
    String MESSAGE_INDICATIVE_QUOTE_INSERT = "IQI";
    String MESSAGE_INDICATIVE_QUOTE_CANCEL = "IQC";
    String MESSAGE_ORDER_STATUS_REQUEST = "H";


    int FIELD_ACCOUNT = 1;
    int FIELD_AVG_PRC = 6;
    int FIELD_BEGIN_SEQ_NO = 7;
    int FIELD_BEGIN_STRING = 8;
    int FIELD_BODY_LENGTH = 9;
    int FIELD_CHECKSUM = 10;
    int FIELD_REFERENCE = 11;
    int FIELD_CUM_QTY = 14;
    int FIELD_CURRENCY = 15;
    int FIELD_END_SEQ_NO = 16;
    int FIELD_EXEC_ID = 17;
    int FIELD_LAST_PX = 31;
    int FIELD_LAST_QTY = 32;
    int FIELD_MSG_SEQ_NUM = 34;
    int FIELD_MESSAGE_TYPE = 35;
    int FIELD_NEW_SEQ_NUM = 36;
    int FIELD_ORDER_ID = 37;
    int FIELD_ORDER_QTY = 38;
    int FIELD_ORDER_STATUS = 39;
    int FIELD_ORDER_TYPE = 40;
    int FIELD_ORIG_CLORDID = 41;
    int FIELD_ORIG_TIME = 42;
    int FIELD_POSS_DUP_FLAG = 43;
    int FIELD_PRICE = 44;
    int FIELD_REF_SEQ_NUM = 45;
    int FIELD_SECURITY_ID = 48;
    int FIELD_SENDER_COMP_ID = 49;
    int FIELD_SENDER_SUB_ID = 50;
    int FIELD_SENDING_TIME = 52;
    int FIELD_SIDE = 54;
    int FIELD_SYMBOL = 55;
    int FIELD_TARGET_COMP_ID = 56;
    int FIELD_TARGET_SUB_ID = 57;
    int FIELD_TEXT = 58;
    int FIELD_TIME_IN_FORCE = 59;
    int FIELD_TRANSACTION_TIME = 60;
    int FIELD_SETTLEMENT_TYPE = 63;
    int FIELD_SETTLEMENT_DATE = 64;
    int FIELD_TRADE_DATE = 75;
    int FIELD_SIGNATURE = 89;
    int FIELD_SECURE_DATA_LEN = 90;
    int FIELD_SECURE_DATA = 91;
    int FIELD_SIGNATURE_LEN = 93;
    int FIELD_RAW_DATA_LENGTH = 95;
    int FIELD_RAW_DATA = 96;
    int FIELD_POSS_RESEND = 97;
    int FIELD_ENCRYPT_METHOD = 98;
    int FIELD_STOP_PRICE = 99;
    int FIELD_ORDER_REJECT_REASON = 103;
    int FIELD_ISSUER = 106;
    int FIELD_SECURITY_DESC = 107;
    int FIELD_HEARTBEAT_INT = 108;
    int FIELD_MAX_FLOOR = 111;
    int FIELD_TEST_REQ_ID = 112;
    int FIELD_ON_BEHALF_ON_COMP_ID = 115;
    int FIELD_ON_BEHALF_ON_SUB_ID = 116;
    int FIELD_ORIG_SENDING_TIME = 122;
    int FIELD_GAP_FILL_FLAG = 123;
    int FIELD_EXPIRE_TIME = 126;
    int FIELD_DELIVER_TO_COMP_ID = 128;
    int FIELD_DELIVER_TO_SUB_ID = 129;
    int FIELD_RESET_SEQ_NUM = 141;
    int FIELD_SENDER_LOCATION_ID = 142;
    int FIELD_TARGET_LOCATION_ID = 143;
    int FIELD_ON_BEHALF_ON_LOCATION_ID = 144;
    int FIELD_DELIVER_TO_LOCATION_ID = 145;
    int FIELD_NO_RELATED_SYM = 146;
    int FIELD_SUBJECT = 147;
    int FIELD_EXEC_TYPE = 150;
    int FIELD_LEAVES_QTY = 151;
    int FIELD_CASH_QTY = 152;
    int FIELD_ACCRUED_INTEREST_RATE = 158;
    int FIELD_SECURITY_TYPE = 167;
    int FIELD_EFFECTIVE_TIME = 168;
    int FIELD_MATURITY_MONTH_YEAR = 200;
    int FILED_SPREAD = 218;
    int FIELD_COUPON_RATE = 223;
    int FIELD_COUPON_PAYMENT_DATE = 224;
    int FIELD_ISSUE_DATE = 225;
    int FIELD_REPURCHASE_TERM = 226;
    int FIELD_NO_STIPULATIONS = 232;
    int FIELD_STIPULATION_TYPE = 233;
    int FIELD_STIPULATION_VALUE = 234;

    int FIELD_YIELD_TYPE = 235;
    int FIELD_YIELD = 236;

    int FIELD_MD_REF = 262;
    int FIELD_SUBSCRIPTION_TYPE = 263;
    int FIELD_MARKET_DEPTH = 264;
    int FIELD_NO_MD_ENTRY_TYPES = 267;
    int FIELD_NO_MD_ENTRIES = 268;

    int FIELD_MD_ENTRY_TYPE = 269;
    int FIELD_MD_ENTRY_PRICE = 270;
    int FIELD_MD_ENTRY_SIZE = 271;
    int FIELD_MD_ENTRY_DATE = 272;
    int FIELD_MD_ENTRY_TIME = 273;
    int FIELD_TRADE_CONDITION = 277;
    int FIELD_MD_ENTRY_ID = 278;
    int FIELD_UPDATE_ACTION = 279;
    int FIELD_MD_ENTRY_POS = 290;
    int FIELD_QUOTE_ENTRY_ID = 299;

    int FIELD_UNDERLYING_SYMBOL = 311;
    int FIELD_SEC_REQ_ID = 320;
    int FIELD_SEC_RESP_ID = 322;
    int FIELD_SECURITY_TRADE_STATUS = 326;
    int FIELD_TRADE_SESSION_ID = 336;
    int FIELD_NUMBER_OF_ORDERS = 346;
    int FIELD_MESSAGE_ENCODING = 347;
    int FIELD_LAST_MSG_SEQ_NUM_PROCESSED = 369;
    int FIELD_ON_BEHALF_ON_SENDING_TIME = 370;
    int FIELD_REF_TAG_ID = 371;
    int FIELD_REF_MSG_TYPE = 372;
    int FIELD_SESSION_REJECT_REASON = 373;
    int FIELD_BUSINESS_REJECT_REASON = 380;
    int FIELD_TOT_NO_RELATED_SYM = 393;
    int FIELD_PRICE_TYPE = 423;
    int FIELD_EXPIRE_DATE = 432;

    int FIELD_PARTY_ID = 448;
    int FIELD_NET_CHG_PREV_DAY = 451;
    int FIELD_NO_PARTY_IDS = 453;
    int FIELD_PRODUCT = 460;
    int FIELD_CFI_CODE = 461;

    int FIELD_ORDER_RESTRICTIONS = 529;

    int FIELD_MATURITY_DATE = 541;
    int FIELD_SEC_LIST_REQ_TYPE = 559;
    int FIELD_SEC_REQ_RESULT = 560;


    int FIELD_USERNAME = 553;
    int FIELD_PASSWORD = 554;
    int FIELD_NO_LEGS = 555;

    int FIELD_ROUND_LOT = 561;
    int FIELD_MIN_TRADE_VOL = 562;

    int FIELD_TRADER_REQ_ID = 568;
    int FIELD_TRADER_RQ_TYPE = 569;

    int FIELD_MAX_TRADE_VOL = 1140;

    int FIELD_ACCOUNT_TYPE = 581;
    int FIELD_LEG_SYMBOL = 600;
    int FIELD_LEG_SECURITY_ID = 602;
    int FIELD_TRADE_SESSION_SUB_ID = 625;
    int FIELD_NO_HOOPS = 627;
    int FIELD_LEG_QTY = 687;

    int FIELD_YIELD_REDEMPTION_DATE = 696;

    int FIELD_YIELD_REDEMPTION_PRICE = 697;
    int FIELD_YIELD_REDEMPTION_PRICE_TYPE = 698;
    int FIELD_YIELD_CALC_DATE = 701;
    int FIELD_NO_POSITIONS = 702;
    int FIELD_POSITION_TYPE = 703;
    int FIELD_LONG_QTY = 704;
    int FIELD_SHORT_QTY = 705;
    int FIELD_POS_QTY_STATUS = 706;

    int FIELD_POSITION_TRANS_TYPE = 709;
    int FIELD_POSITION_REQ_ID = 710;
    int FIELD_NO_UNDERLYINGS = 711;
    int FIELD_POSITION_MAINT_ACTION = 712;

    int FIELD_CLEARING_BUSINESS_DATE = 715;
    int FIELD_POS_MAINT_RPT_ID = 721;
    int FIELD_POS_REQ_RESULT = 728;
    int FIELD_POS_SETTL_PRICE = 730;
    int FIELD_POS_SETTL_PRICE_TYPE = 731;

    int FIELD_POS_PRIOR_SETTL_PRICE = 734;

    int FIELD_ACCRUED_INTEREST_AMT = 742;
    int FIELD_DELIVERY_DATE = 743;

    int FIELD_NO_POS_AMOUNT = 753;

    int FIELD_PRICE_DELTA = 811;

    int FIELD_NO_INSTR_ATTRIB = 870;
    int FIELD_INSTR_ATTRIB_TYPE = 871;
    int FIELD_INSTR_ATTRIB_VALUE = 872;

    int FIELD_DATED_DATE = 873;
    int FIELD_TILL_DATE = 874;


    int FIELD_MARGIN_RATIO = 898;


    int FIELD_UNDERLYING_PX = 810;
    int FIELD_UNDERLYING_COUPON_RATE = 435;
    int FIELD_UNDERLYING_QTY = 879;

    int FIELD_LAST_FRAGMENT = 893;

    int FIELD_START_DATE = 916;
    int FIELD_END_DATE = 917;
    int FIELD_END_CASH = 922;
    int FIELD_USER_REQ_ID = 923;
    int FIELD_USER_REQ_TYPE = 924;
    int FIELD_NEW_PASSWORD = 925;
    int FIELD_USER_STATUS = 926;

    int FIELD_SECURITY_STATUS = 965;

    int FIELD_MIN_PRICE_INCREMENT = 969;

    int FIELD_QTY_DATE = 976;

    int FIELD_TRADE_VOLUME = 1020;
    int FIELD_MD_BOOK_TYPE = 1021;
    int FIELD_MD_FEED_TYPE = 1022;
    int FIELD_MD_PRICE_LEVEL = 1023;
    int FIELD_FIRST_PX = 1025;
    int FIELD_MD_ENTRY_SPOT_RATE = 1026;
    int FIELD_MD_QUOTE_TYPE = 1070;
    int FIELD_MD_SUBBOOK_TYPE = 1173;

    int FIELD_APP_VERSION_ID = 1128;
    int FIELD_CUSTOM_APP_VERSION_ID = 1129;
    int FIELD_DEFAULT_APP_VERSION_ID = 1137;

    int FIELD_MAX_PRICE_VARIATION = 1143;

    int FIELD_LOW_LIMIT_PRICE = 1148;

    int FIELD_HIGH_LIMIT_PRICE = 1149;

    int FIELD_TRADING_REFERENCE_PRICE = 1150;

    int FIELD_SECURITY_GROUP = 1151;

    int FIELD_NO_ORDER_TYPE_RULES = 1237;

    int FIELD_NO_TIME_IN_FORCE_RULES = 1239;

    int FIELD_TRADING_CURRENCY = 1245;

    int FIELD_NO_TRADING_SESSION_RULES = 1309;
    int FIELD_NO_TARGET_PARTIES = 1461;
    int FIELD_TARGET_PARTY_ID = 1462;
    int FIELD_TRANSFER_INSTRUCTION_ID = 2436;
    int FIELD_TRANSFER_ID = 2437;

    int FIELD_TRANSFER_STATUS = 2442;
//------------- Extended fields -----------------


    int FIELD_POS_UPDATE_ACTION = 5024;
    int FIELD_NO_POS_KEYS = 5025;
    int FIELD_POS_KEY_TYPE = 5026;
    int FIELD_POS_KEY_VALUE = 5027;
    int FIELD_NO_POS_ITEMS = 5028;
    int FIELD_POS_ITEM_TYPE = 5029;
    int FIELD_POS_ITEM_VALUE = 5030;

    int FIELD_LOT_VALUE = 5031;
    int FIELD_NIN_VALUE = 5032;
    int FIELD_NOMINAL_VALUE = 5033;
    int FIELD_MIN_QTY_VALUE = 5034;
    int FIELD_MAX_QTY_VALUE = 5035;
    int FIELD_CURRENT_SESSION_VALUE = 5036;
    int FIELD_SESSION_PERIOD_VALUE = 5037;
    int FIELD_DEV_LIMIT_AVG_PRICE_VALUE = 5038;
    int FIELD_DEV_LIMIT_LAST_DEAL_PRC_VALUE = 5039;
    int FIELD_DEV_LIM_MARKET_PRC_VALUE = 5040;
    int FIELD_DEV_WARN_AVG_PRC_VALUE = 5041;
    int FIELD_DEV_WARN_BEST_BUY_PRC_VALUE = 5042;
    int FIELD_DEV_WARN_BEST_SELL_PRC_VALUE = 5043;
    int FIELD_CROSS_CURRENCY = 5044;
    int FIELD_COUNTER_CURRENCY = 5045;
    int FIELD_PRICE_PRECISION = 5046;
    int FIELD_PRICE_STEP = 5047;

    int FIELD_TRADE_SESSION_OPEN_TIME = 5049;
    int FIELD_TRADE_SESSION_CLOSE_TIME = 5050;

    int FIELD_POS_MONEY_ITEM_VALUE = 5066;

    int FIELD_DEALS_COUNT = 5067;
    int FIELD_DEALS_VOLUME = 5068;
    int FIELD_DEALS_QTY_TOTAL = 5069;

    int FIELD_NO_NESTED_INSTR_ATTRIB = 1312;
    int FIELD_NESTED_INSTR_ATTRIB_TYPE = 1210;
    int FIELD_NESTED_INSTR_ATTRIB_VALUE = 1211;

    int FIELD_LAST_MD_POINT_ID = 31337;

    int FIELD_CHART_REQUEST_REF = 5089;
    int FIELD_CHART_INSTR_ID = 5090;
    int FIELD_CHART_FROM_DATE = 5091;
    int FIELD_CHART_TO_DATE = 5092;
    int FIELD_CHART_PERIOD = 5093;
    int FIELD_CHART_NO_ENTRIES = 5099;
    int FIELD_CHART_ENTRY_DATE = 5100;
    int FIELD_CHART_ENTRY_OPEN_PRICE = 5101;
    int FIELD_CHART_ENTRY_HIGH_PRICE = 5102;
    int FIELD_CHART_ENTRY_LOW_PRICE = 5103;
    int FIELD_CHART_ENTRY_CLOSE_PRICE = 5104;
    int FIELD_CHART_ENTRY_VOLUME = 5105;

    int FIELD_LAST_DEAL_BEFORE_TODAY_PRICE = 5106;
    int FIELD_LAST_DEAL_BEFORE_TODAY_VOLUME = 5107;

    int FIELD_VIEW_PRECISION = 5108;
    int FIELD_ORDER_TYPES = 5109;
    int FIELD_EXPECT_DATE_ALLOWED = 5111;
    int FIELD_MAX_EXPECT_DATE_IN_DAYS = 5112;

    int FIELD_TAGS = 5113;
    int FIELD_FULL_NAME = 5114;

    int FIELD_LAST_DEAL_BEFORE_TODAY_TIME = 5115;
    int FIELD_AVERAGE_WEIGHTED_PRICE = 5116;
    int FIELD_LAST_DEAL_BEFORE_TODAY_Volume = 5117;
    int FIELD_ORDERS_COUNT = 5118;
    int FIELD_MEMBERS_DEALS_QTY = 5119;
    int FIELD_MEMBERS_ORDERS_QTY = 5120;

    int FIELD_MM_MEMBER_ID = 5121;
    int FIELD_MM_INSTR_ID = 5122;
    int FIELD_MM_MAX_SPREAD = 5123;
    int FIELD_MM_MAX_SPREAD_PER = 5124;
    int FIELD_MM_MIN_QTY = 5125;
    int FIELD_MM_MIN_VOL = 5126;
    int FIELD_MM_MAX_LAST_DAY_PRC_DEV = 5127;
    int FIELD_MM_REQUEST_REF = 5128;
    int FIELD_MM_ENTRIES = 5129;

    int FIELD_MM_LIABILITY_ID = 5130;
    int FIELD_MM_SESSION_ID = 5131;
    int FIELD_MM_BUY_PRICE = 5132;
    int FIELD_MM_BUY_QTY = 5133;
    int FIELD_MM_BUY_VOL = 5134;
    int FIELD_MM_SELL_PRICE = 5135;
    int FIELD_MM_SELL_QTY = 5136;
    int FIELD_MM_SELL_VOL = 5137;
    int FIELD_MM_SPREAD = 5138;
    int FIELD_MM_SPREAD_PERC = 5139;
    int FIELD_MM_WARNING_ENTRIES = 5140;

    int FIELD_MM_WARN_TYPE = 5141;
    int FIELD_MM_WARN_START_TIME = 5142;
    int FIELD_MM_WARN_END_TIME = 5143;
    int FIELD_MM_WARN_CLOSE = 5144;
    int FIELD_MM_TYPE = 5145;

    int FIELD_DOUBLE_ORDER = 5146;

    int FIELD_CURRENCY_ID = 5147;
    int FIELD_BUY_POS = 5148;
    int FIELD_SELL_POS = 5149;
    int FIELD_NET_POS = 5150;
    int FIELD_BUY_BLOCKED_POS = 5151;
    int FIELD_SELL_BLOCKED_POS = 5152;
    int FIELD_T_PLUS_N = 5153;
    int FIELD_ACCOUNT_ID = 5154;
    int FIELD_SETTLEMENT_POS_DATE = 5155;
    int FIELD_DAY_POS_KEY = 5156;

    int FIELD_LAST_DAY_AVG_PRICE = 5157;

    int FIELD_CURRENCY_NAME = 5158;

    int FIELD_INDICATIVE_QUOTE_REF = 5159;
    int FIELD_INDICATIVE_QUOTE_ENTRIES = 5160;
    int FIELD_INDICATIVE_QUOTE_INSTR_SYMBOL = 5161;

    int FIELD_INDICATIVE_QUOTE_ID = 5162;
    int FIELD_INDICATIVE_QUOTE_MEMBER_NAME = 5163;
    int FIELD_INDICATIVE_QUOTE_BUY_PRICE = 5164;
    int FIELD_INDICATIVE_QUOTE_SELL_PRICE = 5165;
    int FIELD_INDICATIVE_QUOTE_BUY_VOLUME = 5166;
    int FIELD_INDICATIVE_QUOTE_SELL_VOLUME = 5167;
    int FIELD_INDICATIVE_QUOTE_STATUS = 5168;
    int FIELD_INDICATIVE_QUOTE_CREATION_TIME = 5169;
    int FIELD_INDICATIVE_QUOTE_COMMENT = 5170;

    int FIELD_INSERT_INDICATIVE_QUOTE_STATUS = 5171;
    int FIELD_CANCEL_INDICATIVE_QUOTE_STATUS = 5172;
    int FIELD_INDICATIVE_QUOTE_INSTR_ID = 5173;

    int FIELD_DAY_POS_ID = 5174;

    int FIELD_ARC_POS_DATE_FROM = 5175;
    int FIELD_ARC_POS_DATE_TO = 5176;

    int FIELD_REMOVED_TIME = 5177;

    int FIELD_SELL_USER_NAME = 5178;
    int FIELD_BUY_ACC = 5179;
    int FIELD_SELL_ACC = 5180;

    int FIELD_ORDER_SERIAL = 5181;
    int FIELD_SELL_ORDER_SERIAL = 5182;
    int FIELD_MEMBER_NAME = 5183;
    int FIELD_DEAL_SERIAL = 5185;

    int FIELD_NEXT_TIME_IN_FORCE = 5186;
    int FIELD_WHO_REMOVED = 5187;
    int FIELD_DEAL_TYPE = 5188;

    int FIELD_REF_SES_ID = 5189;

    int FIELD_IS_FUTURE = 5190;
    int FIELD_CONTRACT_MULTIPLIER = 5191;
    int FIELD_UNDERLYING_INSTR_ID = 5192;
    int FIELD_MAINTENANCE_MARGIN = 5194;

    int FIELD_ENCRYPTED_PASSWORD_METHOD = 5196;
    int FIELD_ENCRYPTED_PASSWORD_LEN = 5197;
    int FIELD_ENCRYPTED_PASSWORD = 5198;
    int FIELD_ENCRYPTED_NEW_PASSWORD_LEN = 5199;
    int FIELD_ENCRYPTED_NEW_PASSWORD = 5200;

    int FIELD_AVERAGE_PRC = 5201;
    int FIELD_AVG_PRC_PREV = 5202;
    int FIELD_OPENED_POS = 5203;

    int FIELD_MESSAGE = 5204;
    int FIELD_LAST_DEAL_DATE = 5205;
    int FIELD_TARGET_ACCOUNT = 5206;

    int FIELD_PAYMENT_STREAM_DISCOUNT_RATE_DAY_COUNT = 40746;
    int PAYMENT_STREAM_MARKET_RATE = 40739;
    String NOT_SET = "N/A";

}
