/*
 * Copyright 2020 Marceau Dewilde <m@ceau.be>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package be.ceau.nace;

/**
 * 4th and deepest level in the Nace hierarchy.<br>
 * Next level up is {@link NaceGroup}.<br>
 * No level is below this one.
 */
public enum NaceClass implements NaceCode {

	_01_11(NaceGroup._01_1),
	_01_12(NaceGroup._01_1),
	_01_13(NaceGroup._01_1),
	_01_14(NaceGroup._01_1),
	_01_15(NaceGroup._01_1),
	_01_16(NaceGroup._01_1),
	_01_19(NaceGroup._01_1),
	_01_21(NaceGroup._01_2),
	_01_22(NaceGroup._01_2),
	_01_23(NaceGroup._01_2),
	_01_24(NaceGroup._01_2),
	_01_25(NaceGroup._01_2),
	_01_26(NaceGroup._01_2),
	_01_27(NaceGroup._01_2),
	_01_28(NaceGroup._01_2),
	_01_29(NaceGroup._01_2),
	_01_30(NaceGroup._01_3),
	_01_41(NaceGroup._01_4),
	_01_42(NaceGroup._01_4),
	_01_43(NaceGroup._01_4),
	_01_44(NaceGroup._01_4),
	_01_45(NaceGroup._01_4),
	_01_46(NaceGroup._01_4),
	_01_47(NaceGroup._01_4),
	_01_49(NaceGroup._01_4),
	_01_50(NaceGroup._01_5),
	_01_61(NaceGroup._01_6),
	_01_62(NaceGroup._01_6),
	_01_63(NaceGroup._01_6),
	_01_64(NaceGroup._01_6),
	_01_70(NaceGroup._01_7),
	_02_10(NaceGroup._02_1),
	_02_20(NaceGroup._02_2),
	_02_30(NaceGroup._02_3),
	_02_40(NaceGroup._02_4),
	_03_11(NaceGroup._03_1),
	_03_12(NaceGroup._03_1),
	_03_21(NaceGroup._03_2),
	_03_22(NaceGroup._03_2),
	_05_10(NaceGroup._05_1),
	_05_20(NaceGroup._05_2),
	_06_10(NaceGroup._06_1),
	_06_20(NaceGroup._06_2),
	_07_10(NaceGroup._07_1),
	_07_21(NaceGroup._07_2),
	_07_29(NaceGroup._07_2),
	_08_11(NaceGroup._08_1),
	_08_12(NaceGroup._08_1),
	_08_91(NaceGroup._08_9),
	_08_92(NaceGroup._08_9),
	_08_93(NaceGroup._08_9),
	_08_99(NaceGroup._08_9),
	_09_10(NaceGroup._09_1),
	_09_90(NaceGroup._09_9),
	_10_11(NaceGroup._10_1),
	_10_12(NaceGroup._10_1),
	_10_13(NaceGroup._10_1),
	_10_20(NaceGroup._10_2),
	_10_31(NaceGroup._10_3),
	_10_32(NaceGroup._10_3),
	_10_39(NaceGroup._10_3),
	_10_41(NaceGroup._10_4),
	_10_42(NaceGroup._10_4),
	_10_51(NaceGroup._10_5),
	_10_52(NaceGroup._10_5),
	_10_61(NaceGroup._10_6),
	_10_62(NaceGroup._10_6),
	_10_71(NaceGroup._10_7),
	_10_72(NaceGroup._10_7),
	_10_73(NaceGroup._10_7),
	_10_81(NaceGroup._10_8),
	_10_82(NaceGroup._10_8),
	_10_83(NaceGroup._10_8),
	_10_84(NaceGroup._10_8),
	_10_85(NaceGroup._10_8),
	_10_86(NaceGroup._10_8),
	_10_89(NaceGroup._10_8),
	_10_91(NaceGroup._10_9),
	_10_92(NaceGroup._10_9),
	_11_01(NaceGroup._11_0),
	_11_02(NaceGroup._11_0),
	_11_03(NaceGroup._11_0),
	_11_04(NaceGroup._11_0),
	_11_05(NaceGroup._11_0),
	_11_06(NaceGroup._11_0),
	_11_07(NaceGroup._11_0),
	_12_00(NaceGroup._12_0),
	_13_10(NaceGroup._13_1),
	_13_20(NaceGroup._13_2),
	_13_30(NaceGroup._13_3),
	_13_91(NaceGroup._13_9),
	_13_92(NaceGroup._13_9),
	_13_93(NaceGroup._13_9),
	_13_94(NaceGroup._13_9),
	_13_95(NaceGroup._13_9),
	_13_96(NaceGroup._13_9),
	_13_99(NaceGroup._13_9),
	_14_11(NaceGroup._14_1),
	_14_12(NaceGroup._14_1),
	_14_13(NaceGroup._14_1),
	_14_14(NaceGroup._14_1),
	_14_19(NaceGroup._14_1),
	_14_20(NaceGroup._14_2),
	_14_31(NaceGroup._14_3),
	_14_39(NaceGroup._14_3),
	_15_11(NaceGroup._15_1),
	_15_12(NaceGroup._15_1),
	_15_20(NaceGroup._15_2),
	_16_10(NaceGroup._16_1),
	_16_21(NaceGroup._16_2),
	_16_22(NaceGroup._16_2),
	_16_23(NaceGroup._16_2),
	_16_24(NaceGroup._16_2),
	_16_29(NaceGroup._16_2),
	_17_11(NaceGroup._17_1),
	_17_12(NaceGroup._17_1),
	_17_21(NaceGroup._17_2),
	_17_22(NaceGroup._17_2),
	_17_23(NaceGroup._17_2),
	_17_24(NaceGroup._17_2),
	_17_29(NaceGroup._17_2),
	_18_11(NaceGroup._18_1),
	_18_12(NaceGroup._18_1),
	_18_13(NaceGroup._18_1),
	_18_14(NaceGroup._18_1),
	_18_20(NaceGroup._18_2),
	_19_10(NaceGroup._19_1),
	_19_20(NaceGroup._19_2),
	_20_11(NaceGroup._20_1),
	_20_12(NaceGroup._20_1),
	_20_13(NaceGroup._20_1),
	_20_14(NaceGroup._20_1),
	_20_15(NaceGroup._20_1),
	_20_16(NaceGroup._20_1),
	_20_17(NaceGroup._20_1),
	_20_20(NaceGroup._20_2),
	_20_30(NaceGroup._20_3),
	_20_41(NaceGroup._20_4),
	_20_42(NaceGroup._20_4),
	_20_51(NaceGroup._20_5),
	_20_52(NaceGroup._20_5),
	_20_53(NaceGroup._20_5),
	_20_59(NaceGroup._20_5),
	_20_60(NaceGroup._20_6),
	_21_10(NaceGroup._21_1),
	_21_20(NaceGroup._21_2),
	_22_11(NaceGroup._22_1),
	_22_19(NaceGroup._22_1),
	_22_21(NaceGroup._22_2),
	_22_22(NaceGroup._22_2),
	_22_23(NaceGroup._22_2),
	_22_29(NaceGroup._22_2),
	_23_11(NaceGroup._23_1),
	_23_12(NaceGroup._23_1),
	_23_13(NaceGroup._23_1),
	_23_14(NaceGroup._23_1),
	_23_19(NaceGroup._23_1),
	_23_20(NaceGroup._23_2),
	_23_31(NaceGroup._23_3),
	_23_32(NaceGroup._23_3),
	_23_41(NaceGroup._23_4),
	_23_42(NaceGroup._23_4),
	_23_43(NaceGroup._23_4),
	_23_44(NaceGroup._23_4),
	_23_49(NaceGroup._23_4),
	_23_51(NaceGroup._23_5),
	_23_52(NaceGroup._23_5),
	_23_61(NaceGroup._23_6),
	_23_62(NaceGroup._23_6),
	_23_63(NaceGroup._23_6),
	_23_64(NaceGroup._23_6),
	_23_65(NaceGroup._23_6),
	_23_69(NaceGroup._23_6),
	_23_70(NaceGroup._23_7),
	_23_91(NaceGroup._23_9),
	_23_99(NaceGroup._23_9),
	_24_10(NaceGroup._24_1),
	_24_20(NaceGroup._24_2),
	_24_31(NaceGroup._24_3),
	_24_32(NaceGroup._24_3),
	_24_33(NaceGroup._24_3),
	_24_34(NaceGroup._24_3),
	_24_41(NaceGroup._24_4),
	_24_42(NaceGroup._24_4),
	_24_43(NaceGroup._24_4),
	_24_44(NaceGroup._24_4),
	_24_45(NaceGroup._24_4),
	_24_46(NaceGroup._24_4),
	_24_51(NaceGroup._24_5),
	_24_52(NaceGroup._24_5),
	_24_53(NaceGroup._24_5),
	_24_54(NaceGroup._24_5),
	_25_11(NaceGroup._25_1),
	_25_12(NaceGroup._25_1),
	_25_21(NaceGroup._25_2),
	_25_29(NaceGroup._25_2),
	_25_30(NaceGroup._25_3),
	_25_40(NaceGroup._25_4),
	_25_50(NaceGroup._25_5),
	_25_61(NaceGroup._25_6),
	_25_62(NaceGroup._25_6),
	_25_71(NaceGroup._25_7),
	_25_72(NaceGroup._25_7),
	_25_73(NaceGroup._25_7),
	_25_91(NaceGroup._25_9),
	_25_92(NaceGroup._25_9),
	_25_93(NaceGroup._25_9),
	_25_94(NaceGroup._25_9),
	_25_99(NaceGroup._25_9),
	_26_11(NaceGroup._26_1),
	_26_12(NaceGroup._26_1),
	_26_20(NaceGroup._26_2),
	_26_30(NaceGroup._26_3),
	_26_40(NaceGroup._26_4),
	_26_51(NaceGroup._26_5),
	_26_52(NaceGroup._26_5),
	_26_60(NaceGroup._26_6),
	_26_70(NaceGroup._26_7),
	_26_80(NaceGroup._26_8),
	_27_11(NaceGroup._27_1),
	_27_12(NaceGroup._27_1),
	_27_20(NaceGroup._27_2),
	_27_31(NaceGroup._27_3),
	_27_32(NaceGroup._27_3),
	_27_33(NaceGroup._27_3),
	_27_40(NaceGroup._27_4),
	_27_51(NaceGroup._27_5),
	_27_52(NaceGroup._27_5),
	_27_90(NaceGroup._27_9),
	_28_11(NaceGroup._28_1),
	_28_12(NaceGroup._28_1),
	_28_13(NaceGroup._28_1),
	_28_14(NaceGroup._28_1),
	_28_15(NaceGroup._28_1),
	_28_21(NaceGroup._28_2),
	_28_22(NaceGroup._28_2),
	_28_23(NaceGroup._28_2),
	_28_24(NaceGroup._28_2),
	_28_25(NaceGroup._28_2),
	_28_29(NaceGroup._28_2),
	_28_30(NaceGroup._28_3),
	_28_41(NaceGroup._28_4),
	_28_49(NaceGroup._28_4),
	_28_91(NaceGroup._28_9),
	_28_92(NaceGroup._28_9),
	_28_93(NaceGroup._28_9),
	_28_94(NaceGroup._28_9),
	_28_95(NaceGroup._28_9),
	_28_96(NaceGroup._28_9),
	_28_99(NaceGroup._28_9),
	_29_10(NaceGroup._29_1),
	_29_20(NaceGroup._29_2),
	_29_31(NaceGroup._29_3),
	_29_32(NaceGroup._29_3),
	_30_11(NaceGroup._30_1),
	_30_12(NaceGroup._30_1),
	_30_20(NaceGroup._30_2),
	_30_30(NaceGroup._30_3),
	_30_40(NaceGroup._30_4),
	_30_91(NaceGroup._30_9),
	_30_92(NaceGroup._30_9),
	_30_99(NaceGroup._30_9),
	_31_01(NaceGroup._31_0),
	_31_02(NaceGroup._31_0),
	_31_03(NaceGroup._31_0),
	_31_09(NaceGroup._31_0),
	_32_11(NaceGroup._32_1),
	_32_12(NaceGroup._32_1),
	_32_13(NaceGroup._32_1),
	_32_20(NaceGroup._32_2),
	_32_30(NaceGroup._32_3),
	_32_40(NaceGroup._32_4),
	_32_50(NaceGroup._32_5),
	_32_91(NaceGroup._32_9),
	_32_99(NaceGroup._32_9),
	_33_11(NaceGroup._33_1),
	_33_12(NaceGroup._33_1),
	_33_13(NaceGroup._33_1),
	_33_14(NaceGroup._33_1),
	_33_15(NaceGroup._33_1),
	_33_16(NaceGroup._33_1),
	_33_17(NaceGroup._33_1),
	_33_19(NaceGroup._33_1),
	_33_20(NaceGroup._33_2),
	_35_11(NaceGroup._35_1),
	_35_12(NaceGroup._35_1),
	_35_13(NaceGroup._35_1),
	_35_14(NaceGroup._35_1),
	_35_21(NaceGroup._35_2),
	_35_22(NaceGroup._35_2),
	_35_23(NaceGroup._35_2),
	_35_30(NaceGroup._35_3),
	_36_00(NaceGroup._36_0),
	_37_00(NaceGroup._37_0),
	_38_11(NaceGroup._38_1),
	_38_12(NaceGroup._38_1),
	_38_21(NaceGroup._38_2),
	_38_22(NaceGroup._38_2),
	_38_31(NaceGroup._38_3),
	_38_32(NaceGroup._38_3),
	_39_00(NaceGroup._39_0),
	_41_10(NaceGroup._41_1),
	_41_20(NaceGroup._41_2),
	_42_11(NaceGroup._42_1),
	_42_12(NaceGroup._42_1),
	_42_13(NaceGroup._42_1),
	_42_21(NaceGroup._42_2),
	_42_22(NaceGroup._42_2),
	_42_91(NaceGroup._42_9),
	_42_99(NaceGroup._42_9),
	_43_11(NaceGroup._43_1),
	_43_12(NaceGroup._43_1),
	_43_13(NaceGroup._43_1),
	_43_21(NaceGroup._43_2),
	_43_22(NaceGroup._43_2),
	_43_29(NaceGroup._43_2),
	_43_31(NaceGroup._43_3),
	_43_32(NaceGroup._43_3),
	_43_33(NaceGroup._43_3),
	_43_34(NaceGroup._43_3),
	_43_39(NaceGroup._43_3),
	_43_91(NaceGroup._43_9),
	_43_99(NaceGroup._43_9),
	_45_11(NaceGroup._45_1),
	_45_19(NaceGroup._45_1),
	_45_20(NaceGroup._45_2),
	_45_31(NaceGroup._45_3),
	_45_32(NaceGroup._45_3),
	_45_40(NaceGroup._45_4),
	_46_11(NaceGroup._46_1),
	_46_12(NaceGroup._46_1),
	_46_13(NaceGroup._46_1),
	_46_14(NaceGroup._46_1),
	_46_15(NaceGroup._46_1),
	_46_16(NaceGroup._46_1),
	_46_17(NaceGroup._46_1),
	_46_18(NaceGroup._46_1),
	_46_19(NaceGroup._46_1),
	_46_21(NaceGroup._46_2),
	_46_22(NaceGroup._46_2),
	_46_23(NaceGroup._46_2),
	_46_24(NaceGroup._46_2),
	_46_31(NaceGroup._46_3),
	_46_32(NaceGroup._46_3),
	_46_33(NaceGroup._46_3),
	_46_34(NaceGroup._46_3),
	_46_35(NaceGroup._46_3),
	_46_36(NaceGroup._46_3),
	_46_37(NaceGroup._46_3),
	_46_38(NaceGroup._46_3),
	_46_39(NaceGroup._46_3),
	_46_41(NaceGroup._46_4),
	_46_42(NaceGroup._46_4),
	_46_43(NaceGroup._46_4),
	_46_44(NaceGroup._46_4),
	_46_45(NaceGroup._46_4),
	_46_46(NaceGroup._46_4),
	_46_47(NaceGroup._46_4),
	_46_48(NaceGroup._46_4),
	_46_49(NaceGroup._46_4),
	_46_51(NaceGroup._46_5),
	_46_52(NaceGroup._46_5),
	_46_61(NaceGroup._46_6),
	_46_62(NaceGroup._46_6),
	_46_63(NaceGroup._46_6),
	_46_64(NaceGroup._46_6),
	_46_65(NaceGroup._46_6),
	_46_66(NaceGroup._46_6),
	_46_69(NaceGroup._46_6),
	_46_71(NaceGroup._46_7),
	_46_72(NaceGroup._46_7),
	_46_73(NaceGroup._46_7),
	_46_74(NaceGroup._46_7),
	_46_75(NaceGroup._46_7),
	_46_76(NaceGroup._46_7),
	_46_77(NaceGroup._46_7),
	_46_90(NaceGroup._46_9),
	_47_11(NaceGroup._47_1),
	_47_19(NaceGroup._47_1),
	_47_21(NaceGroup._47_2),
	_47_22(NaceGroup._47_2),
	_47_23(NaceGroup._47_2),
	_47_24(NaceGroup._47_2),
	_47_25(NaceGroup._47_2),
	_47_26(NaceGroup._47_2),
	_47_29(NaceGroup._47_2),
	_47_30(NaceGroup._47_3),
	_47_41(NaceGroup._47_4),
	_47_42(NaceGroup._47_4),
	_47_43(NaceGroup._47_4),
	_47_51(NaceGroup._47_5),
	_47_52(NaceGroup._47_5),
	_47_53(NaceGroup._47_5),
	_47_54(NaceGroup._47_5),
	_47_59(NaceGroup._47_5),
	_47_61(NaceGroup._47_6),
	_47_62(NaceGroup._47_6),
	_47_63(NaceGroup._47_6),
	_47_64(NaceGroup._47_6),
	_47_65(NaceGroup._47_6),
	_47_71(NaceGroup._47_7),
	_47_72(NaceGroup._47_7),
	_47_73(NaceGroup._47_7),
	_47_74(NaceGroup._47_7),
	_47_75(NaceGroup._47_7),
	_47_76(NaceGroup._47_7),
	_47_77(NaceGroup._47_7),
	_47_78(NaceGroup._47_7),
	_47_79(NaceGroup._47_7),
	_47_81(NaceGroup._47_8),
	_47_82(NaceGroup._47_8),
	_47_89(NaceGroup._47_8),
	_47_91(NaceGroup._47_9),
	_47_99(NaceGroup._47_9),
	_49_10(NaceGroup._49_1),
	_49_20(NaceGroup._49_2),
	_49_31(NaceGroup._49_3),
	_49_32(NaceGroup._49_3),
	_49_39(NaceGroup._49_3),
	_49_41(NaceGroup._49_4),
	_49_42(NaceGroup._49_4),
	_49_50(NaceGroup._49_5),
	_50_10(NaceGroup._50_1),
	_50_20(NaceGroup._50_2),
	_50_30(NaceGroup._50_3),
	_50_40(NaceGroup._50_4),
	_51_10(NaceGroup._51_1),
	_51_21(NaceGroup._51_2),
	_51_22(NaceGroup._51_2),
	_52_10(NaceGroup._52_1),
	_52_21(NaceGroup._52_2),
	_52_22(NaceGroup._52_2),
	_52_23(NaceGroup._52_2),
	_52_24(NaceGroup._52_2),
	_52_29(NaceGroup._52_2),
	_53_10(NaceGroup._53_1),
	_53_20(NaceGroup._53_2),
	_55_10(NaceGroup._55_1),
	_55_20(NaceGroup._55_2),
	_55_30(NaceGroup._55_3),
	_55_90(NaceGroup._55_9),
	_56_10(NaceGroup._56_1),
	_56_21(NaceGroup._56_2),
	_56_29(NaceGroup._56_2),
	_56_30(NaceGroup._56_3),
	_58_11(NaceGroup._58_1),
	_58_12(NaceGroup._58_1),
	_58_13(NaceGroup._58_1),
	_58_14(NaceGroup._58_1),
	_58_19(NaceGroup._58_1),
	_58_21(NaceGroup._58_2),
	_58_29(NaceGroup._58_2),
	_59_11(NaceGroup._59_1),
	_59_12(NaceGroup._59_1),
	_59_13(NaceGroup._59_1),
	_59_14(NaceGroup._59_1),
	_59_20(NaceGroup._59_2),
	_60_10(NaceGroup._60_1),
	_60_20(NaceGroup._60_2),
	_61_10(NaceGroup._61_1),
	_61_20(NaceGroup._61_2),
	_61_30(NaceGroup._61_3),
	_61_90(NaceGroup._61_9),
	_62_01(NaceGroup._62_0),
	_62_02(NaceGroup._62_0),
	_62_03(NaceGroup._62_0),
	_62_09(NaceGroup._62_0),
	_63_11(NaceGroup._63_1),
	_63_12(NaceGroup._63_1),
	_63_91(NaceGroup._63_9),
	_63_99(NaceGroup._63_9),
	_64_11(NaceGroup._64_1),
	_64_19(NaceGroup._64_1),
	_64_20(NaceGroup._64_2),
	_64_30(NaceGroup._64_3),
	_64_91(NaceGroup._64_9),
	_64_92(NaceGroup._64_9),
	_64_99(NaceGroup._64_9),
	_65_11(NaceGroup._65_1),
	_65_12(NaceGroup._65_1),
	_65_20(NaceGroup._65_2),
	_65_30(NaceGroup._65_3),
	_66_11(NaceGroup._66_1),
	_66_12(NaceGroup._66_1),
	_66_19(NaceGroup._66_1),
	_66_21(NaceGroup._66_2),
	_66_22(NaceGroup._66_2),
	_66_29(NaceGroup._66_2),
	_66_30(NaceGroup._66_3),
	_68_10(NaceGroup._68_1),
	_68_20(NaceGroup._68_2),
	_68_31(NaceGroup._68_3),
	_68_32(NaceGroup._68_3),
	_69_10(NaceGroup._69_1),
	_69_20(NaceGroup._69_2),
	_70_10(NaceGroup._70_1),
	_70_21(NaceGroup._70_2),
	_70_22(NaceGroup._70_2),
	_71_11(NaceGroup._71_1),
	_71_12(NaceGroup._71_1),
	_71_20(NaceGroup._71_2),
	_72_11(NaceGroup._72_1),
	_72_19(NaceGroup._72_1),
	_72_20(NaceGroup._72_2),
	_73_11(NaceGroup._73_1),
	_73_12(NaceGroup._73_1),
	_73_20(NaceGroup._73_2),
	_74_10(NaceGroup._74_1),
	_74_20(NaceGroup._74_2),
	_74_30(NaceGroup._74_3),
	_74_90(NaceGroup._74_9),
	_75_00(NaceGroup._75_0),
	_77_11(NaceGroup._77_1),
	_77_12(NaceGroup._77_1),
	_77_21(NaceGroup._77_2),
	_77_22(NaceGroup._77_2),
	_77_29(NaceGroup._77_2),
	_77_31(NaceGroup._77_3),
	_77_32(NaceGroup._77_3),
	_77_33(NaceGroup._77_3),
	_77_34(NaceGroup._77_3),
	_77_35(NaceGroup._77_3),
	_77_39(NaceGroup._77_3),
	_77_40(NaceGroup._77_4),
	_78_10(NaceGroup._78_1),
	_78_20(NaceGroup._78_2),
	_78_30(NaceGroup._78_3),
	_79_11(NaceGroup._79_1),
	_79_12(NaceGroup._79_1),
	_79_90(NaceGroup._79_9),
	_80_10(NaceGroup._80_1),
	_80_20(NaceGroup._80_2),
	_80_30(NaceGroup._80_3),
	_81_10(NaceGroup._81_1),
	_81_21(NaceGroup._81_2),
	_81_22(NaceGroup._81_2),
	_81_29(NaceGroup._81_2),
	_81_30(NaceGroup._81_3),
	_82_11(NaceGroup._82_1),
	_82_19(NaceGroup._82_1),
	_82_20(NaceGroup._82_2),
	_82_30(NaceGroup._82_3),
	_82_91(NaceGroup._82_9),
	_82_92(NaceGroup._82_9),
	_82_99(NaceGroup._82_9),
	_84_11(NaceGroup._84_1),
	_84_12(NaceGroup._84_1),
	_84_13(NaceGroup._84_1),
	_84_21(NaceGroup._84_2),
	_84_22(NaceGroup._84_2),
	_84_23(NaceGroup._84_2),
	_84_24(NaceGroup._84_2),
	_84_25(NaceGroup._84_2),
	_84_30(NaceGroup._84_3),
	_85_10(NaceGroup._85_1),
	_85_20(NaceGroup._85_2),
	_85_31(NaceGroup._85_3),
	_85_32(NaceGroup._85_3),
	_85_41(NaceGroup._85_4),
	_85_42(NaceGroup._85_4),
	_85_51(NaceGroup._85_5),
	_85_52(NaceGroup._85_5),
	_85_53(NaceGroup._85_5),
	_85_59(NaceGroup._85_5),
	_85_60(NaceGroup._85_6),
	_86_10(NaceGroup._86_1),
	_86_21(NaceGroup._86_2),
	_86_22(NaceGroup._86_2),
	_86_23(NaceGroup._86_2),
	_86_90(NaceGroup._86_9),
	_87_10(NaceGroup._87_1),
	_87_20(NaceGroup._87_2),
	_87_30(NaceGroup._87_3),
	_87_90(NaceGroup._87_9),
	_88_10(NaceGroup._88_1),
	_88_91(NaceGroup._88_9),
	_88_99(NaceGroup._88_9),
	_90_01(NaceGroup._90_0),
	_90_02(NaceGroup._90_0),
	_90_03(NaceGroup._90_0),
	_90_04(NaceGroup._90_0),
	_91_01(NaceGroup._91_0),
	_91_02(NaceGroup._91_0),
	_91_03(NaceGroup._91_0),
	_91_04(NaceGroup._91_0),
	_92_00(NaceGroup._92_0),
	_93_11(NaceGroup._93_1),
	_93_12(NaceGroup._93_1),
	_93_13(NaceGroup._93_1),
	_93_19(NaceGroup._93_1),
	_93_21(NaceGroup._93_2),
	_93_29(NaceGroup._93_2),
	_94_11(NaceGroup._94_1),
	_94_12(NaceGroup._94_1),
	_94_20(NaceGroup._94_2),
	_94_91(NaceGroup._94_9),
	_94_92(NaceGroup._94_9),
	_94_99(NaceGroup._94_9),
	_95_11(NaceGroup._95_1),
	_95_12(NaceGroup._95_1),
	_95_21(NaceGroup._95_2),
	_95_22(NaceGroup._95_2),
	_95_23(NaceGroup._95_2),
	_95_24(NaceGroup._95_2),
	_95_25(NaceGroup._95_2),
	_95_29(NaceGroup._95_2),
	_96_01(NaceGroup._96_0),
	_96_02(NaceGroup._96_0),
	_96_03(NaceGroup._96_0),
	_96_04(NaceGroup._96_0),
	_96_09(NaceGroup._96_0),
	_97_00(NaceGroup._97_0),
	_98_10(NaceGroup._98_1),
	_98_20(NaceGroup._98_2),
	_99_00(NaceGroup._99_0);

	private final NaceGroup naceGroup;
	private final String code;

	private NaceClass(NaceGroup naceGroup) {
		this.naceGroup = naceGroup;
		this.code = name().substring(1).replace('_', '.');
	}

	/**
	 * @return {@link NaceGroup} parent of this {@link NaceClass}, never {@code null}
	 */
	public NaceGroup getParent() {
		return naceGroup;
	}

	/**
	 * @return {@link String} of the form dd.dd (eg. {@code 92.28})
	 */
	public String getCode() {
		return code;
	}

	public int getLevel() {
		return 4;
	}

}
