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
 * 3rd level in the Nace hierarchy.<br>
 * Next level up is {@link NaceDivision}.<br>
 * Next level down is lowest level {@link NaceClass}.
 */
public enum NaceGroup implements NaceCode {

	_01_1(NaceDivision._01),
	_01_2(NaceDivision._01),
	_01_3(NaceDivision._01),
	_01_4(NaceDivision._01),
	_01_5(NaceDivision._01),
	_01_6(NaceDivision._01),
	_01_7(NaceDivision._01),
	_02_1(NaceDivision._02),
	_02_2(NaceDivision._02),
	_02_3(NaceDivision._02),
	_02_4(NaceDivision._02),
	_03_1(NaceDivision._03),
	_03_2(NaceDivision._03),
	_05_1(NaceDivision._05),
	_05_2(NaceDivision._05),
	_06_1(NaceDivision._06),
	_06_2(NaceDivision._06),
	_07_1(NaceDivision._07),
	_07_2(NaceDivision._07),
	_08_1(NaceDivision._08),
	_08_9(NaceDivision._08),
	_09_1(NaceDivision._09),
	_09_9(NaceDivision._09),
	_10_1(NaceDivision._10),
	_10_2(NaceDivision._10),
	_10_3(NaceDivision._10),
	_10_4(NaceDivision._10),
	_10_5(NaceDivision._10),
	_10_6(NaceDivision._10),
	_10_7(NaceDivision._10),
	_10_8(NaceDivision._10),
	_10_9(NaceDivision._10),
	_11_0(NaceDivision._11),
	_12_0(NaceDivision._12),
	_13_1(NaceDivision._13),
	_13_2(NaceDivision._13),
	_13_3(NaceDivision._13),
	_13_9(NaceDivision._13),
	_14_1(NaceDivision._14),
	_14_2(NaceDivision._14),
	_14_3(NaceDivision._14),
	_15_1(NaceDivision._15),
	_15_2(NaceDivision._15),
	_16_1(NaceDivision._16),
	_16_2(NaceDivision._16),
	_17_1(NaceDivision._17),
	_17_2(NaceDivision._17),
	_18_1(NaceDivision._18),
	_18_2(NaceDivision._18),
	_19_1(NaceDivision._19),
	_19_2(NaceDivision._19),
	_20_1(NaceDivision._20),
	_20_2(NaceDivision._20),
	_20_3(NaceDivision._20),
	_20_4(NaceDivision._20),
	_20_5(NaceDivision._20),
	_20_6(NaceDivision._20),
	_21_1(NaceDivision._21),
	_21_2(NaceDivision._21),
	_22_1(NaceDivision._22),
	_22_2(NaceDivision._22),
	_23_1(NaceDivision._23),
	_23_2(NaceDivision._23),
	_23_3(NaceDivision._23),
	_23_4(NaceDivision._23),
	_23_5(NaceDivision._23),
	_23_6(NaceDivision._23),
	_23_7(NaceDivision._23),
	_23_9(NaceDivision._23),
	_24_1(NaceDivision._24),
	_24_2(NaceDivision._24),
	_24_3(NaceDivision._24),
	_24_4(NaceDivision._24),
	_24_5(NaceDivision._24),
	_25_1(NaceDivision._25),
	_25_2(NaceDivision._25),
	_25_3(NaceDivision._25),
	_25_4(NaceDivision._25),
	_25_5(NaceDivision._25),
	_25_6(NaceDivision._25),
	_25_7(NaceDivision._25),
	_25_9(NaceDivision._25),
	_26_1(NaceDivision._26),
	_26_2(NaceDivision._26),
	_26_3(NaceDivision._26),
	_26_4(NaceDivision._26),
	_26_5(NaceDivision._26),
	_26_6(NaceDivision._26),
	_26_7(NaceDivision._26),
	_26_8(NaceDivision._26),
	_27_1(NaceDivision._27),
	_27_2(NaceDivision._27),
	_27_3(NaceDivision._27),
	_27_4(NaceDivision._27),
	_27_5(NaceDivision._27),
	_27_9(NaceDivision._27),
	_28_1(NaceDivision._28),
	_28_2(NaceDivision._28),
	_28_3(NaceDivision._28),
	_28_4(NaceDivision._28),
	_28_9(NaceDivision._28),
	_29_1(NaceDivision._29),
	_29_2(NaceDivision._29),
	_29_3(NaceDivision._29),
	_30_1(NaceDivision._30),
	_30_2(NaceDivision._30),
	_30_3(NaceDivision._30),
	_30_4(NaceDivision._30),
	_30_9(NaceDivision._30),
	_31_0(NaceDivision._31),
	_32_1(NaceDivision._32),
	_32_2(NaceDivision._32),
	_32_3(NaceDivision._32),
	_32_4(NaceDivision._32),
	_32_5(NaceDivision._32),
	_32_9(NaceDivision._32),
	_33_1(NaceDivision._33),
	_33_2(NaceDivision._33),
	_35_1(NaceDivision._35),
	_35_2(NaceDivision._35),
	_35_3(NaceDivision._35),
	_36_0(NaceDivision._36),
	_37_0(NaceDivision._37),
	_38_1(NaceDivision._38),
	_38_2(NaceDivision._38),
	_38_3(NaceDivision._38),
	_39_0(NaceDivision._39),
	_41_1(NaceDivision._41),
	_41_2(NaceDivision._41),
	_42_1(NaceDivision._42),
	_42_2(NaceDivision._42),
	_42_9(NaceDivision._42),
	_43_1(NaceDivision._43),
	_43_2(NaceDivision._43),
	_43_3(NaceDivision._43),
	_43_9(NaceDivision._43),
	_45_1(NaceDivision._45),
	_45_2(NaceDivision._45),
	_45_3(NaceDivision._45),
	_45_4(NaceDivision._45),
	_46_1(NaceDivision._46),
	_46_2(NaceDivision._46),
	_46_3(NaceDivision._46),
	_46_4(NaceDivision._46),
	_46_5(NaceDivision._46),
	_46_6(NaceDivision._46),
	_46_7(NaceDivision._46),
	_46_9(NaceDivision._46),
	_47_1(NaceDivision._47),
	_47_2(NaceDivision._47),
	_47_3(NaceDivision._47),
	_47_4(NaceDivision._47),
	_47_5(NaceDivision._47),
	_47_6(NaceDivision._47),
	_47_7(NaceDivision._47),
	_47_8(NaceDivision._47),
	_47_9(NaceDivision._47),
	_49_1(NaceDivision._49),
	_49_2(NaceDivision._49),
	_49_3(NaceDivision._49),
	_49_4(NaceDivision._49),
	_49_5(NaceDivision._49),
	_50_1(NaceDivision._50),
	_50_2(NaceDivision._50),
	_50_3(NaceDivision._50),
	_50_4(NaceDivision._50),
	_51_1(NaceDivision._51),
	_51_2(NaceDivision._51),
	_52_1(NaceDivision._52),
	_52_2(NaceDivision._52),
	_53_1(NaceDivision._53),
	_53_2(NaceDivision._53),
	_55_1(NaceDivision._55),
	_55_2(NaceDivision._55),
	_55_3(NaceDivision._55),
	_55_9(NaceDivision._55),
	_56_1(NaceDivision._56),
	_56_2(NaceDivision._56),
	_56_3(NaceDivision._56),
	_58_1(NaceDivision._58),
	_58_2(NaceDivision._58),
	_59_1(NaceDivision._59),
	_59_2(NaceDivision._59),
	_60_1(NaceDivision._60),
	_60_2(NaceDivision._60),
	_61_1(NaceDivision._61),
	_61_2(NaceDivision._61),
	_61_3(NaceDivision._61),
	_61_9(NaceDivision._61),
	_62_0(NaceDivision._62),
	_63_1(NaceDivision._63),
	_63_9(NaceDivision._63),
	_64_1(NaceDivision._64),
	_64_2(NaceDivision._64),
	_64_3(NaceDivision._64),
	_64_9(NaceDivision._64),
	_65_1(NaceDivision._65),
	_65_2(NaceDivision._65),
	_65_3(NaceDivision._65),
	_66_1(NaceDivision._66),
	_66_2(NaceDivision._66),
	_66_3(NaceDivision._66),
	_68_1(NaceDivision._68),
	_68_2(NaceDivision._68),
	_68_3(NaceDivision._68),
	_69_1(NaceDivision._69),
	_69_2(NaceDivision._69),
	_70_1(NaceDivision._70),
	_70_2(NaceDivision._70),
	_71_1(NaceDivision._71),
	_71_2(NaceDivision._71),
	_72_1(NaceDivision._72),
	_72_2(NaceDivision._72),
	_73_1(NaceDivision._73),
	_73_2(NaceDivision._73),
	_74_1(NaceDivision._74),
	_74_2(NaceDivision._74),
	_74_3(NaceDivision._74),
	_74_9(NaceDivision._74),
	_75_0(NaceDivision._75),
	_77_1(NaceDivision._77),
	_77_2(NaceDivision._77),
	_77_3(NaceDivision._77),
	_77_4(NaceDivision._77),
	_78_1(NaceDivision._78),
	_78_2(NaceDivision._78),
	_78_3(NaceDivision._78),
	_79_1(NaceDivision._79),
	_79_9(NaceDivision._79),
	_80_1(NaceDivision._80),
	_80_2(NaceDivision._80),
	_80_3(NaceDivision._80),
	_81_1(NaceDivision._81),
	_81_2(NaceDivision._81),
	_81_3(NaceDivision._81),
	_82_1(NaceDivision._82),
	_82_2(NaceDivision._82),
	_82_3(NaceDivision._82),
	_82_9(NaceDivision._82),
	_84_1(NaceDivision._84),
	_84_2(NaceDivision._84),
	_84_3(NaceDivision._84),
	_85_1(NaceDivision._85),
	_85_2(NaceDivision._85),
	_85_3(NaceDivision._85),
	_85_4(NaceDivision._85),
	_85_5(NaceDivision._85),
	_85_6(NaceDivision._85),
	_86_1(NaceDivision._86),
	_86_2(NaceDivision._86),
	_86_9(NaceDivision._86),
	_87_1(NaceDivision._87),
	_87_2(NaceDivision._87),
	_87_3(NaceDivision._87),
	_87_9(NaceDivision._87),
	_88_1(NaceDivision._88),
	_88_9(NaceDivision._88),
	_90_0(NaceDivision._90),
	_91_0(NaceDivision._91),
	_92_0(NaceDivision._92),
	_93_1(NaceDivision._93),
	_93_2(NaceDivision._93),
	_94_1(NaceDivision._94),
	_94_2(NaceDivision._94),
	_94_9(NaceDivision._94),
	_95_1(NaceDivision._95),
	_95_2(NaceDivision._95),
	_96_0(NaceDivision._96),
	_97_0(NaceDivision._97),
	_98_1(NaceDivision._98),
	_98_2(NaceDivision._98),
	_99_0(NaceDivision._99);

	private final NaceDivision naceDivision;
	private final String code;

	private NaceGroup(NaceDivision naceDivision) {
		this.naceDivision = naceDivision;
		this.code = name().substring(1).replace('_', '.');
	}

	/**
	 * @return {@link NaceDivision} parent of this {@link NaceGroup}, never {@code null}
	 */
	public NaceDivision getParent() {
		return naceDivision;
	}

	/**
	 * @return {@link String} of the form dd.d (eg. {@code 73.1})
	 */
	public String getCode() {
		return code;
	}

	public int getLevel() {
		return 3;
	}

}
