-- Countries
INSERT INTO country (country_code, name) VALUES ('US', 'United States');
INSERT INTO country (country_code, name) VALUES ('IN', 'India');
INSERT INTO country (country_code, name) VALUES ('CA', 'Canada');
INSERT INTO country (country_code, name) VALUES ('AU', 'Australia');
INSERT INTO country (country_code, name) VALUES ('BR', 'Brazil');
INSERT INTO country (country_code, name) VALUES ('DE', 'Germany');
INSERT INTO country (country_code, name) VALUES ('GB', 'United Kingdom');
INSERT INTO country (country_code, name) VALUES ('JP', 'Japan');
INSERT INTO country (country_code, name) VALUES ('FR', 'France');
INSERT INTO country (country_code, name) VALUES ('MX', 'Mexico');

-- United States
INSERT INTO state (state_code, state_name, country_code) VALUES ('CA', 'California', 'US');
INSERT INTO state (state_code, state_name, country_code) VALUES ('TX', 'Texas', 'US');
INSERT INTO state (state_code, state_name, country_code) VALUES ('FL', 'Florida', 'US');
INSERT INTO state (state_code, state_name, country_code) VALUES ('NY', 'New York', 'US');
INSERT INTO state (state_code, state_name, country_code) VALUES ('IL', 'Illinois', 'US');
INSERT INTO state (state_code, state_name, country_code) VALUES ('PA', 'Pennsylvania', 'US');
INSERT INTO state (state_code, state_name, country_code) VALUES ('OH', 'Ohio', 'US');
INSERT INTO state (state_code, state_name, country_code) VALUES ('GA', 'Georgia', 'US');
INSERT INTO state (state_code, state_name, country_code) VALUES ('MI', 'Michigan', 'US');
INSERT INTO state (state_code, state_name, country_code) VALUES ('AZ', 'Arizona', 'US');

-- India
INSERT INTO state (state_code, state_name, country_code) VALUES ('MH', 'Maharashtra', 'IN');
INSERT INTO state (state_code, state_name, country_code) VALUES ('KA', 'Karnataka', 'IN');
INSERT INTO state (state_code, state_name, country_code) VALUES ('TN', 'Tamil Nadu', 'IN');
INSERT INTO state (state_code, state_name, country_code) VALUES ('UP', 'Uttar Pradesh', 'IN');
INSERT INTO state (state_code, state_name, country_code) VALUES ('GJ', 'Gujarat', 'IN');
INSERT INTO state (state_code, state_name, country_code) VALUES ('RJ', 'Rajasthan', 'IN');
INSERT INTO state (state_code, state_name, country_code) VALUES ('WB', 'West Bengal', 'IN');
INSERT INTO state (state_code, state_name, country_code) VALUES ('KL', 'Kerala', 'IN');
INSERT INTO state (state_code, state_name, country_code) VALUES ('TG', 'Telangana', 'IN');
INSERT INTO state (state_code, state_name, country_code) VALUES ('PB', 'Punjab', 'IN');

-- Canada
INSERT INTO state (state_code, state_name, country_code) VALUES ('ON', 'Ontario', 'CA');
INSERT INTO state (state_code, state_name, country_code) VALUES ('QC', 'Quebec', 'CA');
INSERT INTO state (state_code, state_name, country_code) VALUES ('BC', 'British Columbia', 'CA');
INSERT INTO state (state_code, state_name, country_code) VALUES ('AB', 'Alberta', 'CA');
INSERT INTO state (state_code, state_name, country_code) VALUES ('MB', 'Manitoba', 'CA');
INSERT INTO state (state_code, state_name, country_code) VALUES ('SK', 'Saskatchewan', 'CA');
INSERT INTO state (state_code, state_name, country_code) VALUES ('NS', 'Nova Scotia', 'CA');
INSERT INTO state (state_code, state_name, country_code) VALUES ('NB', 'New Brunswick', 'CA');
INSERT INTO state (state_code, state_name, country_code) VALUES ('NL', 'Newfoundland and Labrador', 'CA');
INSERT INTO state (state_code, state_name, country_code) VALUES ('PE', 'Prince Edward Island', 'CA');

-- Australia
INSERT INTO state (state_code, state_name, country_code) VALUES ('NSW', 'New South Wales', 'AU');
INSERT INTO state (state_code, state_name, country_code) VALUES ('VIC', 'Victoria', 'AU');
INSERT INTO state (state_code, state_name, country_code) VALUES ('QLD', 'Queensland', 'AU');
INSERT INTO state (state_code, state_name, country_code) VALUES ('WA', 'Western Australia', 'AU');
INSERT INTO state (state_code, state_name, country_code) VALUES ('SA', 'South Australia', 'AU');
INSERT INTO state (state_code, state_name, country_code) VALUES ('TAS', 'Tasmania', 'AU');
INSERT INTO state (state_code, state_name, country_code) VALUES ('NT', 'Northern Territory', 'AU');
INSERT INTO state (state_code, state_name, country_code) VALUES ('ACT', 'Australian Capital Territory', 'AU');
INSERT INTO state (state_code, state_name, country_code) VALUES ('JBT', 'Jervis Bay Territory', 'AU');
INSERT INTO state (state_code, state_name, country_code) VALUES ('NFK', 'Norfolk Island', 'AU');

-- Brazil
INSERT INTO state (state_code, state_name, country_code) VALUES ('SP', 'Sao Paulo', 'BR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('RJ', 'Rio de Janeiro', 'BR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('MG', 'Minas Gerais', 'BR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('BA', 'Bahia', 'BR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('PR', 'Parana', 'BR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('RS', 'Rio Grande do Sul', 'BR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('PE', 'Pernambuco', 'BR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('CE', 'Ceara', 'BR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('PA', 'Para', 'BR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('SC', 'Santa Catarina', 'BR');

-- Germany
INSERT INTO state (state_code, state_name, country_code) VALUES ('BY', 'Bavaria', 'DE');
INSERT INTO state (state_code, state_name, country_code) VALUES ('NW', 'North Rhine-Westphalia', 'DE');
INSERT INTO state (state_code, state_name, country_code) VALUES ('BW', 'Baden-Wurttemberg', 'DE');
INSERT INTO state (state_code, state_name, country_code) VALUES ('NI', 'Lower Saxony', 'DE');
INSERT INTO state (state_code, state_name, country_code) VALUES ('HE', 'Hesse', 'DE');
INSERT INTO state (state_code, state_name, country_code) VALUES ('SN', 'Saxony', 'DE');
INSERT INTO state (state_code, state_name, country_code) VALUES ('BE', 'Berlin', 'DE');
INSERT INTO state (state_code, state_name, country_code) VALUES ('SH', 'Schleswig-Holstein', 'DE');
INSERT INTO state (state_code, state_name, country_code) VALUES ('BB', 'Brandenburg', 'DE');
INSERT INTO state (state_code, state_name, country_code) VALUES ('TH', 'Thuringia', 'DE');

-- United Kingdom
INSERT INTO state (state_code, state_name, country_code) VALUES ('ENG', 'England', 'GB');
INSERT INTO state (state_code, state_name, country_code) VALUES ('SCT', 'Scotland', 'GB');
INSERT INTO state (state_code, state_name, country_code) VALUES ('WLS', 'Wales', 'GB');
INSERT INTO state (state_code, state_name, country_code) VALUES ('NIR', 'Northern Ireland', 'GB');
INSERT INTO state (state_code, state_name, country_code) VALUES ('LND', 'Greater London', 'GB');
INSERT INTO state (state_code, state_name, country_code) VALUES ('WMD', 'West Midlands', 'GB');
INSERT INTO state (state_code, state_name, country_code) VALUES ('SEE', 'South East', 'GB');
INSERT INTO state (state_code, state_name, country_code) VALUES ('NWE', 'North West', 'GB');
INSERT INTO state (state_code, state_name, country_code) VALUES ('YKS', 'Yorkshire', 'GB');
INSERT INTO state (state_code, state_name, country_code) VALUES ('EMD', 'East Midlands', 'GB');

-- Japan
INSERT INTO state (state_code, state_name, country_code) VALUES ('TK', 'Tokyo', 'JP');
INSERT INTO state (state_code, state_name, country_code) VALUES ('OS', 'Osaka', 'JP');
INSERT INTO state (state_code, state_name, country_code) VALUES ('HK', 'Hokkaido', 'JP');
INSERT INTO state (state_code, state_name, country_code) VALUES ('KY', 'Kyoto', 'JP');
INSERT INTO state (state_code, state_name, country_code) VALUES ('AI', 'Aichi', 'JP');
INSERT INTO state (state_code, state_name, country_code) VALUES ('FO', 'Fukuoka', 'JP');
INSERT INTO state (state_code, state_name, country_code) VALUES ('KN', 'Kanagawa', 'JP');
INSERT INTO state (state_code, state_name, country_code) VALUES ('ST', 'Saitama', 'JP');
INSERT INTO state (state_code, state_name, country_code) VALUES ('CB', 'Chiba', 'JP');
INSERT INTO state (state_code, state_name, country_code) VALUES ('HS', 'Hiroshima', 'JP');

-- France
INSERT INTO state (state_code, state_name, country_code) VALUES ('IDF', 'Ile-de-France', 'FR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('PAC', 'Provence-Alpes-Cote d Azur', 'FR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('ARA', 'Auvergne-Rhone-Alpes', 'FR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('OCC', 'Occitanie', 'FR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('NAQ', 'Nouvelle-Aquitaine', 'FR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('HDF', 'Hauts-de-France', 'FR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('GES', 'Grand Est', 'FR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('BRE', 'Brittany', 'FR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('NOR', 'Normandy', 'FR');
INSERT INTO state (state_code, state_name, country_code) VALUES ('PDL', 'Pays de la Loire', 'FR');

-- Mexico
INSERT INTO state (state_code, state_name, country_code) VALUES ('CMX', 'Mexico City', 'MX');
INSERT INTO state (state_code, state_name, country_code) VALUES ('JAL', 'Jalisco', 'MX');
INSERT INTO state (state_code, state_name, country_code) VALUES ('NLE', 'Nuevo Leon', 'MX');
INSERT INTO state (state_code, state_name, country_code) VALUES ('PUE', 'Puebla', 'MX');
INSERT INTO state (state_code, state_name, country_code) VALUES ('GUA', 'Guanajuato', 'MX');
INSERT INTO state (state_code, state_name, country_code) VALUES ('CHH', 'Chihuahua', 'MX');
INSERT INTO state (state_code, state_name, country_code) VALUES ('VER', 'Veracruz', 'MX');
INSERT INTO state (state_code, state_name, country_code) VALUES ('ROO', 'Quintana Roo', 'MX');
INSERT INTO state (state_code, state_name, country_code) VALUES ('YUC', 'Yucatan', 'MX');
INSERT INTO state (state_code, state_name, country_code) VALUES ('OAX', 'Oaxaca', 'MX');