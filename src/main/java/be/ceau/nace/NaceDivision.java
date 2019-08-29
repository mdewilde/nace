/*
 * Copyright 2019 Marceau Dewilde <m@ceau.be>
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
 * 2nd level in the Nace hierarchy.<br>
 * Next level up is toplevel {@link NaceSection}.<br>
 * Next level down is {@link NaceGroup}.
 */
public enum NaceDivision implements NaceCode {

	_01(NaceSection.A),
	_02(NaceSection.A),
	_03(NaceSection.A),
	_05(NaceSection.B),
	_06(NaceSection.B),
	_07(NaceSection.B),
	_08(NaceSection.B),
	_09(NaceSection.B),
	_10(NaceSection.C),
	_11(NaceSection.C),
	_12(NaceSection.C),
	_13(NaceSection.C),
	_14(NaceSection.C),
	_15(NaceSection.C),
	_16(NaceSection.C),
	_17(NaceSection.C),
	_18(NaceSection.C),
	_19(NaceSection.C),
	_20(NaceSection.C),
	_21(NaceSection.C),
	_22(NaceSection.C),
	_23(NaceSection.C),
	_24(NaceSection.C),
	_25(NaceSection.C),
	_26(NaceSection.C),
	_27(NaceSection.C),
	_28(NaceSection.C),
	_29(NaceSection.C),
	_30(NaceSection.C),
	_31(NaceSection.C),
	_32(NaceSection.C),
	_33(NaceSection.C),
	_35(NaceSection.D),
	_36(NaceSection.E),
	_37(NaceSection.E),
	_38(NaceSection.E),
	_39(NaceSection.E),
	_41(NaceSection.F),
	_42(NaceSection.F),
	_43(NaceSection.F),
	_45(NaceSection.G),
	_46(NaceSection.G),
	_47(NaceSection.G),
	_49(NaceSection.H),
	_50(NaceSection.H),
	_51(NaceSection.H),
	_52(NaceSection.H),
	_53(NaceSection.H),
	_55(NaceSection.I),
	_56(NaceSection.I),
	_58(NaceSection.J),
	_59(NaceSection.J),
	_60(NaceSection.J),
	_61(NaceSection.J),
	_62(NaceSection.J),
	_63(NaceSection.J),
	_64(NaceSection.K),
	_65(NaceSection.K),
	_66(NaceSection.K),
	_68(NaceSection.L),
	_69(NaceSection.M),
	_70(NaceSection.M),
	_71(NaceSection.M),
	_72(NaceSection.M),
	_73(NaceSection.M),
	_74(NaceSection.M),
	_75(NaceSection.M),
	_77(NaceSection.N),
	_78(NaceSection.N),
	_79(NaceSection.N),
	_80(NaceSection.N),
	_81(NaceSection.N),
	_82(NaceSection.N),
	_84(NaceSection.O),
	_85(NaceSection.P),
	_86(NaceSection.Q),
	_87(NaceSection.Q),
	_88(NaceSection.Q),
	_90(NaceSection.R),
	_91(NaceSection.R),
	_92(NaceSection.R),
	_93(NaceSection.R),
	_94(NaceSection.S),
	_95(NaceSection.S),
	_96(NaceSection.S),
	_97(NaceSection.T),
	_98(NaceSection.T),
	_99(NaceSection.U);

	private final NaceSection naceSection;
	private final String code;

	private NaceDivision(NaceSection naceSection) {
		this.naceSection = naceSection;
		this.code = name().substring(1);
	}

	/**
	 * @return {@link NaceSection} parent of this {@link NaceDivision}, never {@code null}
	 */
	public NaceSection getParent() {
		return naceSection;
	}
	
	/**
	 * @return {@link String} of the form dd (eg. {@code 02})
	 */
	public String getCode() {
		return code;
	}

	public int getLevel() {
		return 2;
	}

}
