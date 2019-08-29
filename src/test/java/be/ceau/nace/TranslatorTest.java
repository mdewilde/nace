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

import org.junit.Assert;
import org.junit.Test;

import be.ceau.nace.translate.NaceLanguage;
import be.ceau.nace.translate.ResourceBundleNaceTranslator;

public class TranslatorTest {

	@Test
	public void testSection() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.BG).translate(NaceSection.S);
		Assert.assertEquals("ДРУГИ ДЕЙНОСТИ", value);
	}
	
	@Test
	public void testDivision() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.ET).translate(NaceDivision._35);
		Assert.assertEquals("Elektrienergia, gaasi, auru ja konditsioneeritud õhuga varustamine", value);
	}
	
	@Test
	public void testGroup() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.NL).translate(NaceGroup._86_2);
		Assert.assertEquals("Praktijken van artsen en tandartsen", value);
	}

	@Test
	public void testClass() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.EL).translate(NaceClass._06_10);
		Assert.assertEquals("Άντληση αργού πετρελαίου", value);
	}

	@Test
	public void testBG() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.BG).translate(NaceClass._06_10);
		Assert.assertEquals("Добив на нефт", value);
	
	}

	@Test
	public void testCS() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.CS).translate(NaceClass._06_10);
		Assert.assertEquals("Těžba ropy", value);
	}

	@Test
	public void testDA() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.DA).translate(NaceClass._06_10);
		Assert.assertEquals("Indvinding af råolie", value);
	}

	@Test
	public void testDE() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.DE).translate(NaceClass._06_10);
		Assert.assertEquals("Gewinnung von Erdöl", value);
	}

	@Test
	public void testEL() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.EL).translate(NaceClass._06_10);
		Assert.assertEquals("Άντληση αργού πετρελαίου", value);
	}

	@Test
	public void testEN() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.EN).translate(NaceClass._06_10);
		Assert.assertEquals("Extraction of crude petroleum", value);
	}

	@Test
	public void testES() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.ES).translate(NaceClass._06_10);
		Assert.assertEquals("Extracción de crudo de petróleo,,,,", value);
	}

	@Test
	public void testET() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.ET).translate(NaceClass._06_10);
		Assert.assertEquals("Toornafta tootmine", value);
	}

	@Test
	public void testFI() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.FI).translate(NaceClass._06_10);
		Assert.assertEquals("Raakaöljyn tuotanto", value);
	}

	@Test
	public void testFR() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.FR).translate(NaceClass._06_10);
		Assert.assertEquals("Extraction de pétrole brut", value);
	}

	@Test
	public void testHR() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.HR).translate(NaceClass._06_10);
		Assert.assertEquals("Vađenje sirove nafte ", value);
	}

	@Test
	public void testHU() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.HU).translate(NaceClass._06_10);
		Assert.assertEquals("Kőolaj-kitermelés", value);
	}

	@Test
	public void testIT() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.IT).translate(NaceClass._06_10);
		Assert.assertEquals("Estrazione di petrolio greggio", value);
	}

	@Test
	public void testLT() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.LT).translate(NaceClass._06_10);
		Assert.assertEquals("Žalios naftos gavyba", value);
	}

	@Test
	public void testLV() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.LV).translate(NaceClass._06_10);
		Assert.assertEquals("Jēlnaftas ieguve", value);
	}

	@Test
	public void testMT() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.MT).translate(NaceClass._06_10);
		Assert.assertEquals("Estrazzjoni ta' żejt mhux irraffinat", value);
	}

	@Test
	public void testNL() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.NL).translate(NaceClass._06_10);
		Assert.assertEquals("Winning van aardolie", value);
	}

	@Test
	public void testNO() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.NO).translate(NaceClass._06_10);
		Assert.assertEquals("Utvinning av råolje", value);
	}

	@Test
	public void testPL() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.PL).translate(NaceClass._06_10);
		Assert.assertEquals("Górnictwo ropy naftowej", value);
	}

	@Test
	public void testPT() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.PT).translate(NaceClass._06_10);
		Assert.assertEquals("Extracção de petróleo bruto", value);
	}

	@Test
	public void testRO() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.RO).translate(NaceClass._06_10);
		Assert.assertEquals("Extracţia petrolului brut ", value);
	}

	@Test
	public void testRU() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.RU).translate(NaceClass._06_10);
		Assert.assertEquals("Добыча сырой нефти", value);
	}

	@Test
	public void testSK() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.SK).translate(NaceClass._06_10);
		Assert.assertEquals("Ťažba ropy", value);
	}

	@Test
	public void testSL() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.SL).translate(NaceClass._06_10);
		Assert.assertEquals("Pridobivanje surove nafte", value);
	}

	@Test
	public void testSV() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.SV).translate(NaceClass._06_10);
		Assert.assertEquals("Utvinning av råpetroleum", value);
	}

	@Test
	public void testTR() {
		String value = new ResourceBundleNaceTranslator(NaceLanguage.TR).translate(NaceClass._06_10);
		Assert.assertEquals("Ham petrol çıkarımı", value);
	}

	@Test(expected = NullPointerException.class)
	public void nullArgument() {
		new ResourceBundleNaceTranslator(NaceLanguage.EL).translate(null);
	}

}