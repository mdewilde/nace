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

public enum Division {

	_01(Section.A, "Crop and animal production, hunting and related service activities"),
	_02(Section.A, "Forestry and logging"),
	_03(Section.A, "Fishing and aquaculture"),
	_05(Section.B, "Mining of coal and lignite"),
	_06(Section.B, "Extraction of crude petroleum and natural gas"),
	_07(Section.B, "Mining of metal ores"),
	_08(Section.B, "Other mining and quarrying"),
	_09(Section.B, "Mining support service activities"),
	_10(Section.C, "Manufacture of food products"),
	_11(Section.C, "Manufacture of beverages"),
	_12(Section.C, "Manufacture of tobacco products"),
	_13(Section.C, "Manufacture of textiles"),
	_14(Section.C, "Manufacture of wearing apparel"),
	_15(Section.C, "Manufacture of leather and related products"),
	_16(Section.C, "Manufacture of wood and of products of wood and cork, except furniture; manufacture of articles of straw and plaiting materials"),
	_17(Section.C, "Manufacture of paper and paper products"),
	_18(Section.C, "Printing and reproduction of recorded media"),
	_19(Section.C, "Manufacture of coke and refined petroleum products"),
	_20(Section.C, "Manufacture of chemicals and chemical products"),
	_21(Section.C, "Manufacture of basic pharmaceutical products and pharmaceutical preparations"),
	_22(Section.C, "Manufacture of rubber and plastic products"),
	_23(Section.C, "Manufacture of other non-metallic mineral products"),
	_24(Section.C, "Manufacture of basic metals"),
	_25(Section.C, "Manufacture of fabricated metal products, except machinery and equipment"),
	_26(Section.C, "Manufacture of computer, electronic and optical products"),
	_27(Section.C, "Manufacture of electrical equipment"),
	_28(Section.C, "Manufacture of machinery and equipment n.e.c."),
	_29(Section.C, "Manufacture of motor vehicles, trailers and semi-trailers"),
	_30(Section.C, "Manufacture of other transport equipment"),
	_31(Section.C, "Manufacture of furniture"),
	_32(Section.C, "Other manufacturing"),
	_33(Section.C, "Repair and installation of machinery and equipment"),
	_35(Section.D, "Electricity, gas, steam and air conditioning supply"),
	_36(Section.E, "Water collection, treatment and supply"),
	_37(Section.E, "Sewerage"),
	_38(Section.E, "Waste collection, treatment and disposal activities; materials recovery"),
	_39(Section.E, "Remediation activities and other waste management services"),
	_41(Section.F, "Construction of buildings"),
	_42(Section.F, "Civil engineering"),
	_43(Section.F, "Specialised construction activities"),
	_45(Section.G, "Wholesale and retail trade and repair of motor vehicles and motorcycles"),
	_46(Section.G, "Wholesale trade, except of motor vehicles and motorcycles"),
	_47(Section.G, "Retail trade, except of motor vehicles and motorcycles"),
	_49(Section.H, "Land transport and transport via pipelines"),
	_50(Section.H, "Water transport"),
	_51(Section.H, "Air transport"),
	_52(Section.H, "Warehousing and support activities for transportation"),
	_53(Section.H, "Postal and courier activities"),
	_55(Section.I, "Accommodation"),
	_56(Section.I, "Food and beverage service activities"),
	_58(Section.J, "Publishing activities"),
	_59(Section.J, "Motion picture, video and television programme production, sound recording and music publishing activities"),
	_60(Section.J, "Programming and broadcasting activities"),
	_61(Section.J, "Telecommunications"),
	_62(Section.J, "Computer programming, consultancy and related activities"),
	_63(Section.J, "Information service activities"),
	_64(Section.K, "Financial service activities, except insurance and pension funding"),
	_65(Section.K, "Insurance, reinsurance and pension funding, except compulsory social security"),
	_66(Section.K, "Activities auxiliary to financial services and insurance activities"),
	_68(Section.L, "Real estate activities"),
	_69(Section.M, "Legal and accounting activities"),
	_70(Section.M, "Activities of head offices; management consultancy activities"),
	_71(Section.M, "Architectural and engineering activities; technical testing and analysis"),
	_72(Section.M, "Scientific research and development "),
	_73(Section.M, "Advertising and market research"),
	_74(Section.M, "Other professional, scientific and technical activities"),
	_75(Section.M, "Veterinary activities"),
	_77(Section.N, "Rental and leasing activities"),
	_78(Section.N, "Employment activities"),
	_79(Section.N, "Travel agency, tour operator and other reservation service and related activities"),
	_80(Section.N, "Security and investigation activities"),
	_81(Section.N, "Services to buildings and landscape activities"),
	_82(Section.N, "Office administrative, office support and other business support activities"),
	_84(Section.O, "Public administration and defence; compulsory social security"),
	_85(Section.P, "Education"),
	_86(Section.Q, "Human health activities"),
	_87(Section.Q, "Residential care activities"),
	_88(Section.Q, "Social work activities without accommodation"),
	_90(Section.R, "Creative, arts and entertainment activities"),
	_91(Section.R, "Libraries, archives, museums and other cultural activities"),
	_92(Section.R, "Gambling and betting activities"),
	_93(Section.R, "Sports activities and amusement and recreation activities"),
	_94(Section.S, "Activities of membership organisations"),
	_95(Section.S, "Repair of computers and personal and household goods"),
	_96(Section.S, "Other personal service activities"),
	_97(Section.T, "Activities of households as employers of domestic personnel"),
	_98(Section.T, "Undifferentiated goods- and services-producing activities of private households for own use"),
	_99(Section.U, "Activities of extraterritorial organisations and bodies");

	private final Section section;
	private final String title;
	private Division(Section section, String title) {
		this.section = section;
		this.title = title;
	}
	
}
