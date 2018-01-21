/*
	Copyright 2018 Marceau Dewilde <m@ceau.be>
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
		https://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.nace;

public enum Section {

	A("Agriculture, forestry and fishing"),
	B("Mining and quarrying"),
	C("Manufacturing"),
	D("Electricity, gas, steam and air conditioning supply"),
	E("Water supply; sewerage, waste management and remediation activities"),
	F("Construction"),
	G("Wholesale and retail trade; repair of motor vehicles and motorcycles"),
	H("Transportation and storage"),
	I("Accommodation and food service activities"),
	J("Information and communication"),
	K("Financial and insurance activities"),
	L("Real estate activities"),
	M("Professional, scientific and technical activities"),
	N("Administrative and support service activities"),
	O("Public administration and defence; compulsory social security"),
	P("Education"),
	Q("Human health and social work activities"),
	R("Arts, entertainment and recreation"),
	S("Other service activities"),
	T("Activities of households as employers; undifferentiated goods- and services-producing activities of households for own use"),
	U("Activities of extraterritorial organisations and bodies");

	private final String title;
	private Section(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
}
