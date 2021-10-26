create database backpacking;
use backpacking;
create table parks(
   seq_id VARCHAR(255) NOT NULL,
   park_name VARCHAR(255) NOT NULL,
   park_state VARCHAR(40) NOT NULL,
   PRIMARY KEY ( seq_id )
);
create table park_areas(
   seq_id VARCHAR(255) NOT NULL,
   park_seq_id VARCHAR(255) NOT NULL,
   park_area VARCHAR(255) NOT NULL,
   PRIMARY KEY ( seq_id )
);
CREATE TABLE users(
   seq_id VARCHAR(255) NOT NULL,
   first_name VARCHAR(255) NOT NULL,
   last_name VARCHAR(255),
   email_address VARCHAR(255) NOT NULL,
   password VARCHAR(255) NOT NULL,
   PRIMARY KEY(seq_id)
);

ALTER TABLE park_areas ADD FOREIGN KEY (park_seq_id) REFERENCES parks(seq_id);



INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Acadia National Park', 'Maine');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'American Samoa National Park', 'American Samoa');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Arches National Park', 'Utah');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Badlands National Park', 'South Dakota');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Big Bend National Park', 'Texas');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Biscayne National Park', 'Florida');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Black Canyon of the Gunnison National Park', 'Colorado');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Bryce Canyon National Park', 'Utah');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Canyonlands National Park', 'Utah');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Capitol Reef National Park', 'Utah');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Carlsbad Caverns National Park', 'New Mexico');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Channel Islands National Park', 'California');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Congaree National Park', 'South Carolina');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Crater Lake National Park', 'Oregon');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Cuyahoga Valley National Park', 'Ohio');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Death Valley National Park', 'California');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Death Valley National Park', 'Nevada');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Denali National Park', 'Alaska');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Dry Tortugas National Park', 'Florida');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Everglades National Park', 'Florida');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Gates of the Arctic National Park', 'Alaska');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Gateway Arch National Park', 'Missouri');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Glacier National Park', 'Montana');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Glacier Bay National Park', 'Alaska');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Grand Canyon National Park', 'Arizona');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Grand Teton National Park', 'Wyoming');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Great Basin National Park', 'Nevada');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Great Sand Dunes National Park', 'Colorado');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Great Smokey Mountains National Park', 'Tennessee');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Great Smokey Mountains National Park', 'North Carolina');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Haleakala National Park', 'Hawaii');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Guadalupe Mountains National Park', 'Texas');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Hawaii Volcanos National Park', 'Hawaii');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Hot Springs National Park', 'Arkansas');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Indiana Dunes National Park', 'Indiana');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Isle Royale National Park', 'Michigan');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Joshua Tree National Park', 'California');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Katmai National Park', 'Alaska');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Kenai Fjords National Park', 'Alaska');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Kings Canyon National Park', 'California');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Kobuk Valley National Park', 'Alaska');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Lake Clark National Park', 'Alaska');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Lassen Volcanic National Park', 'California');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Mammoth Cave National Park', 'Kentucky');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Mesa Verde National Park', 'Colorado');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Mount Rainier National Park', 'Washington');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'New River Gorge National Park', 'West Virginia');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'North Cascades National Park', 'Washington');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Olympic National Park', 'Washington');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Petrified Forest National Park', 'Arizona');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Pinnacles National Park', 'California');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Redwood National Park', 'California');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Rocky Mountain National Park', 'Colorado');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Saguaro National Park', 'Arizona');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Sequoia National Park', 'California');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Shennandoah National Park', 'Virginia');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Theodore Roosevelt National Park', 'North Dakota');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Virgin Islands National Park', 'U.S. Virgin Islands');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Voyageurs National Park', 'Minnesota');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'White Sands National Park', 'New Mexico');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Wind Cave National Park', 'South Dakota');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Wrangell–St. Elias National Park', 'Alaska');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Yellowstone National Park', 'Wyoming');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Yellowstone National Park', 'Montana');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Yellowstone National Park', 'Idaho');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Yosemite National Park', 'California');
INSERT INTO parks (seq_id, park_name, park_state) VALUES (UUID(), 'Zion National Park', 'Utah');

