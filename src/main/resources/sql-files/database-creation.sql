create database backpacking;
use backpacking;
create table parks(
   seq_id VARCHAR(255) NOT NULL,
   park_name VARCHAR(255) NOT NULL,
   park_state VARCHAR(40) NOT NULL,
   park_type VARCHAR(255) NOT NULL,
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


INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Acadia', 'Maine', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'American Samoa', 'American Samoa', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Arches', 'Utah', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Badlands', 'South Dakota', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Big Bend', 'Texas', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Biscayne', 'Florida', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Black Canyon of the Gunnison', 'Colorado', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Bryce Canyon', 'Utah', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Canyonlands', 'Utah', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Capitol Reef', 'Utah', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Carlsbad Caverns', 'New Mexico', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Channel Islands', 'California', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Congaree', 'South Carolina', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Crater Lake', 'Oregon', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Cuyahoga Valley', 'Ohio', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Death Valley', 'California', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Death Valley', 'Nevada', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Denali', 'Alaska', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Dry Tortugas', 'Florida', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Everglades', 'Florida', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Gates of the Arctic', 'Alaska', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Gateway Arch', 'Missouri', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Glacier', 'Montana', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Glacier Bay', 'Alaska', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Grand Canyon', 'Arizona', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Grand Teton', 'Wyoming', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Great Basin', 'Nevada', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Great Sand Dunes', 'Colorado', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Great Smokey Mountains', 'Tennessee', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Great Smokey Mountains', 'North Carolina', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Haleakala', 'Hawaii', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Guadalupe Mountains', 'Texas', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Hawaii Volcanos', 'Hawaii', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Hot Springs', 'Arkansas', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Indiana Dunes', 'Indiana', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Isle Royale', 'Michigan', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Joshua Tree', 'California', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Katmai', 'Alaska', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Kenai Fjords', 'Alaska', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Kings Canyon', 'California', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Kobuk Valley', 'Alaska', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Lake Clark', 'Alaska', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Lassen Volcanic', 'California', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Mammoth Cave', 'Kentucky', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Mesa Verde', 'Colorado', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Mount Rainier', 'Washington', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'New River Gorge', 'West Virginia', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'North Cascades', 'Washington', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Olympic', 'Washington', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Petrified Forest', 'Arizona', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Pinnacles', 'California', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Redwood', 'California', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Rocky Mountain', 'Colorado', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Saguaro', 'Arizona', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Sequoia', 'California', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Shennandoah', 'Virginia', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Theodore Roosevelt', 'North Dakota', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Virgin Islands', 'U.S. Virgin Islands', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Voyageurs', 'Minnesota', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'White Sands', 'New Mexico', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Wind Cave', 'South Dakota', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Wrangell–St. Elias', 'Alaska', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Yellowstone', 'Wyoming', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Yellowstone', 'Montana', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Yellowstone', 'Idaho', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Yosemite', 'California', 'National Park');
INSERT INTO parks (seq_id, park_name, park_state, park_type) VALUES (UUID_SHORT(), 'Zion', 'Utah', 'National Park');
