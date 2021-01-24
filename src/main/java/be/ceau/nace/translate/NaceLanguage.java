/*
 * Copyright 2021 Marceau Dewilde <m@ceau.be>
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
package be.ceau.nace.translate;

import java.util.Locale;

/**
 * Enumeration of languages that have an official NACE translation.
 */
public enum NaceLanguage {

	BG("Български"),
	CS("Čeština"),
	DA("Dansk"),
	DE("Deutsch"),
	EL("Ελληνικά"),
	EN("English"),
	ES("Español"),
	ET("Eesti keel"),
	FI("Suomi"),
	FR("Français"),
	HR("Hrvatski"),
	HU("Magyar"),
	IT("Italiano"),
	LT("Lietuvių kalba"),
	LV("Latviešu valoda"),
	MT("Il-Malti"),
	NL("Nederlands"),
	NO("Norsk"),
	PL("Polski"),
	PT("Português"),
	RO("Romana"),
	RU("Русская версия"),
	SK("Slovenčina"),
	SL("Slovenščina"),
	SV("Svenska"),
	TR("Türkçe");

	private final String name;
	private final Locale locale;

	private NaceLanguage(String name) {
		this.name = name;
		this.locale = Locale.forLanguageTag(name().toLowerCase());
	}

	public String getName() {
		return name;
	}

	public Locale getLocale() {
		return locale;
	}

}
